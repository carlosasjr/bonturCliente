<%@page import="persistencia.ClienteDAO"%>
<%@page import="dominio.Cliente"%>
<%
    String formRegistro = request.getParameter("formRegistro");

    if (formRegistro != null) {

        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Cliente cli = new Cliente();

        cli.setNome(nome);
        cli.setEmail(email);
        cli.setSenha(senha);
        cli.setIp("192.168.0.1");
        
        if (!ClienteDAO.usuarioExiste(cli)) {
            ClienteDAO.inserir(cli);
            response.sendRedirect("../login.jsp?registro=true");
        } else {
             response.sendRedirect("../login.jsp?registro=false");
        }
    }
%>