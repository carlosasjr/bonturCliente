<%@page import="persistencia.ItemCarrinhoDAO"%>
<%
   String idItem = request.getParameter("idItem");
   ItemCarrinhoDAO.excluirItem(Integer.parseInt(idItem));
%>