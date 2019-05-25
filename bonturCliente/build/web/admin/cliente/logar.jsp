<%@page import="dominio.Cliente"%>
<%@page import="persistencia.ClienteDAO"%>
<%
    String formLogin = request.getParameter("formLogin");
    
   //VERIFICA SE FORMULARIO DE LOGIN FOI ENVIADO
    if (formLogin != null) {
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");
        
       //VERIFICA SE O EMAIL E SENHA SÃO VALIDOS     
        Cliente cliente = ClienteDAO.fazerLogin(email, senha);
        
        //SE RETORNAR UM CLIENTE VALIDO CRIA UMA SESSÃO E REDIRECIONA PARA 
        //A AREA RESTRITA
        //SENÃO RETORNA PARA O LOGIN COM ERRO
        if (cliente != null) {
            session.setAttribute("cliente", cliente);
            
            response.sendRedirect("../../index.jsp");
        } else {
           response.sendRedirect("../../login.jsp?login=false"); 
        }
    }
%>