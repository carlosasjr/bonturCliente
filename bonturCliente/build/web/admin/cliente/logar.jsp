<%@page import="dominio.Cliente"%>
<%@page import="persistencia.ClienteDAO"%>
<%
    String formLogin = request.getParameter("formLogin");
    
   //VERIFICA SE FORMULARIO DE LOGIN FOI ENVIADO
    if (formLogin != null) {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
       //VERIFICA SE O EMAIL E SENHA S�O VALIDOS     
        Cliente cliente = ClienteDAO.fazerLogin(email, senha);
        
        //SE RETORNAR UM CLIENTE VALIDO CRIA UMA SESS�O E REDIRECIONA PARA 
        //A AREA RESTRITA
        //SEN�O RETORNA PARA O LOGIN COM ERRO
        if (cliente != null) {
            session.setAttribute("cliente", cliente);
            
            response.sendRedirect("../../index.jsp");
        } else {
           response.sendRedirect("../../login.jsp?login=false"); 
        }
    }
%>