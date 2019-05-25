package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dominio.Cliente;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");

    //VERIFICA SE EXISTE UMA SESSÃO
    //SE SIM, RETORNA UM OBJETO CLIENTE
    //SENÃO REDIRECIONA PARA O LOGIN
    Cliente cli = null;

    if (session.getAttribute("cliente") != null) {
        cli = (Cliente) session.getAttribute("cliente");
    } else {
        response.sendRedirect("login.jsp");
    }


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Área do Cliente</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/themify-icons/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/selectFX/css/cs-skin-elastic.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/jqvmap/dist/jqvmap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/assets/css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/admin.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/alertify.core.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"assets/css/alertify.default.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"right-panel\" class=\"right-panel\">\n");
      out.write("            <!-- Right Panel -->\n");
      out.write("            <!-- Header-->\n");
      out.write("            <header id=\"header\" class=\"header\">\n");
      out.write("                <div class=\"header-menu\">\n");
      out.write("                    <div class=\"col-2 col-sm-2\">\n");
      out.write("                        <div class=\"header-left\">\n");
      out.write("                            <div class=\"dropdown for-notification\">\n");
      out.write("                                <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"notification\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <i class=\"fa fa-bell\"></i>\n");
      out.write("                                    <span class=\"count bg-danger\">5</span>\n");
      out.write("                                </button>\n");
      out.write("                                <div class=\"dropdown-menu\" aria-labelledby=\"notification\">\n");
      out.write("                                    <p class=\"red\">Notificações</p>\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-1\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-check\"></i>\n");
      out.write("                                        <p>Texto de exemplo</p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-4\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-info\"></i>\n");
      out.write("                                        <p>Texto de exemplo</p>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a class=\"dropdown-item media bg-flat-color-5\" href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-warning\"></i>\n");
      out.write("                                        <p>Texto de exemplo</p>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-12 col-sm-5\">\n");
      out.write("                        Área do Cliente\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-10 col-sm-5\">\n");
      out.write("                        <div class=\"user-area dropdown float-right\">\n");
      out.write("                            <div class=\"col-sm-5 float-right\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <img class=\"user-avatar rounded-circle\" src=\"assets/images/admin.jpg\" alt=\"User Avatar\">\n");
      out.write("                                </a>\n");
      out.write("\n");
      out.write("                                <div class=\"user-menu dropdown-menu\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"index.php?exe=usuarios/profile\"><i class=\"fa fa-user\"></i> Minha Conta</a>\n");
      out.write("\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-user\"></i> Notificações <span class=\"count\">13</span></a>\n");
      out.write("\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\"><i class=\"fa fa-cog\"></i> Configurações</a>\n");
      out.write("\n");
      out.write("                                    <a class=\"nav-link\" href=\"sair.php\"><i class=\"fa fa-power-off\"></i> Logout</a>\n");
      out.write("                                </div>     \n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"col-sm-7 float-right\">\n");
      out.write("                                <a href=\"#\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    <img class=\"user-avatar rounded-circle\" src=\"assets/images/iconfinder_shopping-cart_216477.png\" alt=\"User Avatar\">\n");
      out.write("                                    <span class=\"count bg-danger\">5</span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header><!-- /header -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("       .....\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"public/vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("        <script src=\"public/vendors/popper.js/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"public/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"public/assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"public/vendors/chart.js/dist/Chart.bundle.min.js\"></script>\n");
      out.write("        <script src=\"public/assets/js/dashboard.js\"></script>\n");
      out.write("        <script src=\"public/assets/js/widgets.js\"></script>\n");
      out.write("        <script src=\"public/vendors/jqvmap/dist/jquery.vmap.min.js\"></script>\n");
      out.write("        <script src=\"public/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js\"></script>\n");
      out.write("        <script src=\"public/vendors/jqvmap/dist/maps/jquery.vmap.world.js\"></script>\n");
      out.write("        <script src=\"assets/js/alertify.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"assets/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/additional-methods.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/localization/messages_pt_BR.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.mask.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"assets/js/jquery.maskMoney.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            (function ($) {\n");
      out.write("                \"use strict\";\n");
      out.write("\n");
      out.write("                jQuery('#vmap').vectorMap({\n");
      out.write("                    map: 'world_en',\n");
      out.write("                    backgroundColor: null,\n");
      out.write("                    color: '#ffffff',\n");
      out.write("                    hoverOpacity: 0.7,\n");
      out.write("                    selectedColor: '#1de9b6',\n");
      out.write("                    enableZoom: true,\n");
      out.write("                    showTooltip: true,\n");
      out.write("                    values: sample_data,\n");
      out.write("                    scaleColors: ['#1de9b6', '#03a9f5'],\n");
      out.write("                    normalizeFunction: 'polynomial'\n");
      out.write("                });\n");
      out.write("\n");
      out.write("\n");
      out.write("            })(jQuery);\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </script>    \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
