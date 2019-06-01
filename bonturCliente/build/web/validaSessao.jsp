<%@page import="dominio.Cliente"%>
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