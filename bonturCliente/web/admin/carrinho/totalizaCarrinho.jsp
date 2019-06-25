<%@page import="java.text.DecimalFormat"%>
<%@page import="persistencia.CarrinhoDAO"%>
<%@page import="persistencia.ClienteDAO"%>
<%@page import="dominio.Cliente"%>
<%@page import="dominio.Carrinho"%>
<%@page import="org.json.JSONArray"%>
<%@page import="org.json.JSONObject"%>
<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    response.setContentType("application/json");

    String clienteID = request.getParameter("clienteID");

    Cliente cliente = ClienteDAO.getIDCliente(Integer.parseInt(clienteID));

    Carrinho carrinho;
    carrinho = CarrinhoDAO.existeCarrinho(cliente.getId());

    JSONObject json = new JSONObject();
    JSONObject car = new JSONObject();
    JSONArray cars = new JSONArray();

    if (carrinho != null) {
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");
        double total = ItemCarrinhoDAO.totalizarCarrinho(carrinho.getId());
        car.put("total", df.format(total));
    } 

    cars.put(car);
    json.put("carrinho", car);

    response.getWriter().write(json.toString());

%>
