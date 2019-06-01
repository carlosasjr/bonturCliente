

<%
  String  clienteID =  request.getParameter("clienteID") ;
  String  produtoID = request.getParameter("produtoID");
  String  qtd = request.getParameter("qtd") ;
  
  out.println(clienteID);
  out.println(produtoID);
  out.println(qtd);    
%>