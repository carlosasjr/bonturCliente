<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@page import="persistencia.ProdutoDAO"%>
<%@page import="dominio.Produto"%>
<%@page import="dominio.ItemCarrinho"%>
<%@page import="persistencia.ClienteDAO"%>
<%@page import="dominio.Cliente"%>
<%@page import="persistencia.CarrinhoDAO"%>
<%@page import="dominio.Carrinho"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>


<%
    response.setContentType("application/json");

    String clienteID = request.getParameter("clienteID");
    String produtoID = request.getParameter("produtoID");
    String qtd = request.getParameter("qtd");

    if (clienteID != null && produtoID != null && qtd != null) {

        Carrinho carrinho;

        //Verifica se existe um carrinho para o cliente
        Cliente cliente = ClienteDAO.getIDCliente(Integer.parseInt(clienteID));
        carrinho = CarrinhoDAO.existeCarrinho(cliente.getId());

        if (carrinho == null) {
            carrinho = new Carrinho();

            carrinho.setClienteId(Integer.parseInt(clienteID));
            carrinho.setCliente(cliente);

            int idCarrinho = CarrinhoDAO.criarCarrinho(carrinho);
            carrinho.setId(idCarrinho);
        }

        ItemCarrinho item = new ItemCarrinho();

        item.setCarrinho(carrinho);

        Produto produto = ProdutoDAO.getIDProduto(Integer.parseInt(produtoID));
        item.setProduto(produto);
        item.setQuantidade(Integer.parseInt(qtd));

        ItemCarrinhoDAO.adicionarItem(item);

        JSONObject json = new JSONObject();
        JSONObject car = new JSONObject();
        JSONArray cars = new JSONArray();

        //car.put("codCarrinho", carrinho.getId());
        car.put("carrinho", carrinho.getId());
        cars.put(car);

        car.put("produto", produto.getDescricao());
        cars.put(car);

        car.put("qtd", qtd);
        cars.put(car);

        json.put("carrinho", car);

        response.getWriter().write(json.toString());

    }
%>