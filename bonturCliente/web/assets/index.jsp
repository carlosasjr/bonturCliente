<%-- 
    Document   : index
    Created on : 18/05/2019, 11:51:50
    Author     : Carlos-TP
--%>

<%@page import="dominio.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
   //VERIFICA SE EXISTE UMA SESSÃO
   //SE SIM, RETORNA UM OBJETO CLIENTE
   //SENÃO REDIRECIONA PARA O LOGIN
    Cliente cli = null;

    if (session.getAttribute("cliente") != null) {
        cli = (Cliente) session.getAttribute("cliente");
    } else {
        response.sendRedirect("login.jsp");
    }

%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Área do Cliente</title>
    </head>
    <body>
        <h1>Bem vindo a área do cliente</h1>
    </body>
</html>
