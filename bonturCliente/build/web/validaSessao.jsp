<%@page import="dominio.Cliente"%>
<%
    //VERIFICA SE EXISTE UMA SESS�O
    //SE SIM, RETORNA UM OBJETO CLIENTE
    //SEN�O REDIRECIONA PARA O LOGIN
    Cliente cli = null;

    if (session.getAttribute("cliente") != null) {
        cli = (Cliente) session.getAttribute("cliente");
    } else {
        response.sendRedirect("login.jsp");
    }

%>