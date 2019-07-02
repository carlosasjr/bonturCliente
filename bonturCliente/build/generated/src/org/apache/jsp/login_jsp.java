package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import persistencia.ClienteDAO;
import dominio.Cliente;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"pt-br\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta id=\"viewport\" name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\r\n");
      out.write("        <title>Sistema de Login - Bontur Bondinhos Aéreos</title>\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\">\r\n");
      out.write("        <link type=\"text/css\" rel=\"stylesheet\" href=\"assets/css/styleLogin.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section class=\"login-block\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <!--FORMULÁRIO DE LOGIN -->\r\n");
      out.write("                    <div class=\"col-md-5 login-sec\" id=\"login\">\r\n");
      out.write("                        <h2 class=\"text-center\">Login</h2>                       \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        ");


                            String registro = request.getParameter("registro");

                            if (registro != null) {
                                if (registro.equals("true")) {
                                    out.println("Cadastrado com sucesso!");
                                } else {
                                    out.println("E-mail já foi cadastrado!");
                                }
                            }

                            String login = request.getParameter("login");

                            if (login != null) {
                                if (login.equals("false")) {
                                    out.println("Email e/ou Senha inválidos!");
                                }

                            }


                        
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("                        <form class=\"login-form\" id=\"formLogin\" name=\"formLogin\" method=\"post\" action=\"admin/cliente/logar.jsp\">\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email\">E-mail</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" placeholder=\"E-mail\" autofocus id=\"email\"\r\n");
      out.write("                                       name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"senha\">Senha</label>\r\n");
      out.write("                                <input type=\"password\" class=\"form-control\" placeholder=\"Senha\" id=\"senha\" name=\"senha\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-check\">\r\n");
      out.write("                                <a id=\"registrarSe\" class=\"btn btn-primary float-right text-white\">Registrar-se</a>\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-login float-right\" name=\"formLogin\" value=\"Entrar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <a id=\"esqueciaSenha\" class=\"btn btn-link float-left\">\r\n");
      out.write("                            <small>Esqueci a senha</small>\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>  <!--FORMULÁRIO DE LOGIN -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--FORMULÁRIO DE REGISTRO -->\r\n");
      out.write("                    <div class=\"col-md-5 login-sec\" id=\"registro\" style=\"display: none\">\r\n");
      out.write("                        <form class=\"login-form\" id=\"formRegisto\" name=\"formRegisto\" method=\"post\" action=\"admin/cliente/registro.jsp\">\r\n");
      out.write("                            <h2 class=\"text-center\">Registro</h2>\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"nomeRegistro\">Nome</label>\r\n");
      out.write("                                <input type=\"text\" name=\"nome\" class=\"form-control\" id=\"nomeRegistro\"\r\n");
      out.write("                                       placeholder=\"Nome\" autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"emailRegistro\">E-mail</label>\r\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"form-control\" id=\"emailRegistro\"\r\n");
      out.write("                                       placeholder=\"email@examplo.com\" autofocus>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"senhaRegistro\">Senha</label>\r\n");
      out.write("                                <input type=\"password\" name=\"senha\" class=\"form-control\" id=\"senhaRegistro\"\r\n");
      out.write("                                       placeholder=\"Senha\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-check\">\r\n");
      out.write("                                <a id=\"jaRegistro\" class=\"btn btn-primary float-right text-white\">Já possuo registro</a>\r\n");
      out.write("\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-login float-right\" name=\"formRegistro\"\r\n");
      out.write("                                       value=\"Registrar\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div> <!--FORMULÁRIO DE REGISTRO -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--FORMULÁRIO DE ESQUECI A SENHA -->\r\n");
      out.write("                    <div class=\"col-md-5 login-sec\" id=\"esqueci\" style=\"display: none\">\r\n");
      out.write("                        <h2 class=\"text-center\">Esqueci a senha</h2>\r\n");
      out.write("                        <form class=\"login-form\" id=\"formLogin\" name=\"formEsqueci\" method=\"post\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <label for=\"email\">E-mail</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" placeholder=\"E-mail\" autofocus id=\"emailEsqueci\"\r\n");
      out.write("                                       name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-check\">\r\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-login float-right\" name=\"formEsqueci\" value=\"Enviar\">\r\n");
      out.write("                                <a href=\"login.jsp\" id=\"voltar\" class=\"btn btn-primary float-right text-white\">Fazer\r\n");
      out.write("                                    Login</a>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div> <!--FORMULÁRIO DE REGISTRO -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <!--CAROUSEL DE IMAGENS -->\r\n");
      out.write("                    <div class=\"col-md-7 banner-sec\">\r\n");
      out.write("                        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                            <ol class=\"carousel-indicators\">\r\n");
      out.write("                                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                            </ol>\r\n");
      out.write("                            <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                                <div class=\"carousel-item active\">\r\n");
      out.write("                                    <img class=\"d-block img-fluid\"\r\n");
      out.write("                                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-1121.jpg\"\r\n");
      out.write("                                         alt=\"First slide\">\r\n");
      out.write("                                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                        <div class=\"banner-text\">\r\n");
      out.write("                                            <h2>This is Heaven</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\r\n");
      out.write("                                                tempor\r\n");
      out.write("                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\r\n");
      out.write("                                                nostrud exercitation</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"carousel-item\">\r\n");
      out.write("                                    <img class=\"d-block img-fluid\"\r\n");
      out.write("                                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-59.jpg\"\r\n");
      out.write("                                         alt=\"First slide\">\r\n");
      out.write("                                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                        <div class=\"banner-text\">\r\n");
      out.write("                                            <h2>This is Heaven</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\r\n");
      out.write("                                                tempor\r\n");
      out.write("                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\r\n");
      out.write("                                                nostrud exercitation</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"carousel-item\">\r\n");
      out.write("                                    <img class=\"d-block img-fluid\"\r\n");
      out.write("                                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-168.jpg\"\r\n");
      out.write("                                         alt=\"First slide\">\r\n");
      out.write("                                    <div class=\"carousel-caption d-none d-md-block\">\r\n");
      out.write("                                        <div class=\"banner-text\">\r\n");
      out.write("                                            <h2>This is Heaven</h2>\r\n");
      out.write("                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod\r\n");
      out.write("                                                tempor\r\n");
      out.write("                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis\r\n");
      out.write("                                                nostrud exercitation</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div> <!--CAROUSEL DE IMAGENS -->                   \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/additional-methods.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.validate.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.mask.min.js\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("        <script src=\"assets/js/localization/messages_pt_BR.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script type=\"text/javascript\" rel=\"script\" src=\"assets/js/scriptLogin.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
