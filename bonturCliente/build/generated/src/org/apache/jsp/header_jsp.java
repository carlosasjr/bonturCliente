package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Área do Cliente</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/bootstrap/dist/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/themify-icons/css/themify-icons.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/flag-icon-css/css/flag-icon.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/selectFX/css/cs-skin-elastic.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/jqvmap/dist/jqvmap.min.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/assets/css/style.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/admin.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/alertify.core.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/alertify.default.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"right-panel\" class=\"right-panel\">\r\n");
      out.write("            <!-- Right Panel -->\r\n");
      out.write("            <!-- Header-->\r\n");
      out.write("            <header id=\"header\" class=\"header\">\r\n");
      out.write("                <div class=\"header-menu\">\r\n");
      out.write("                    <div class=\"col-2 col-sm-2\">\r\n");
      out.write("                        <div class=\"header-left\">\r\n");
      out.write("                            <div class=\"dropdown for-notification\">\r\n");
      out.write("                                <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"notification\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <i class=\"fa fa-bell\"></i>\r\n");
      out.write("                                    <span class=\"count bg-danger\">0</span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"notification\">\r\n");
      out.write("                                    <p class=\"red\">Notificações</p>\r\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-1\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-check\"></i>\r\n");
      out.write("                                        <p>Texto de exemplo</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-4\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-info\"></i>\r\n");
      out.write("                                        <p>Texto de exemplo</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-5\" href=\"#\">\r\n");
      out.write("                                        <i class=\"fa fa-warning\"></i>\r\n");
      out.write("                                        <p>Texto de exemplo</p>\r\n");
      out.write("                                    </a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-12 col-sm-5\">\r\n");
      out.write(" \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-10 col-sm-5\">\r\n");
      out.write("                        <div class=\"user-area dropdown float-right\">\r\n");
      out.write("                            <div class=\"col-sm-5 float-right\">\r\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <img class=\"user-avatar rounded-circle\" src=\"assets/images/admin.jpg\" alt=\"User Avatar\">\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"user-menu dropdown-menu\">\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"index.php?exe=usuarios/profile\"><i class=\"fa fa-user\"></i> Minha Conta</a>\r\n");
      out.write("\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-user\"></i> Notificações <span class=\"count\">13</span></a>\r\n");
      out.write("\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-cog\"></i> Configurações</a>\r\n");
      out.write("\r\n");
      out.write("                                    <a class=\"nav-link\" href=\"sair.php\"><i class=\"fa fa-power-off\"></i> Logout</a>\r\n");
      out.write("                                </div>     \r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"col-sm-7 float-right\">\r\n");
      out.write("                                <a href=\"resumoCarrinho.jsp\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                    <img class=\"user-avatar rounded-circle\" src=\"assets/images/iconfinder_shopping-cart_216477.png\" alt=\"User Avatar\">\r\n");
      out.write("                                    <span id=\"countItens\" class=\"count bg-danger\">0</span>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </header><!-- /header -->");
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
