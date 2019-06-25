<%@page import="persistencia.ItemCarrinhoDAO"%>

<%
    String idItem = request.getParameter("idItem");
    String qtd = request.getParameter("qtd");    
   
    ItemCarrinhoDAO.alterarQuantidade(Integer.parseInt(idItem), Integer.parseInt(qtd));
%>