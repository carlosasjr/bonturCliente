package org.apache.jsp.assets;

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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Área do Cliente</title>\n");
      out.write("        \n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/bootstrap/dist/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/font-awesome/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/themify-icons/css/themify-icons.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/selectFX/css/cs-skin-elastic.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/vendors/jqvmap/dist/jqvmap.min.css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"public/assets/css/style.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/admin.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/alertify.core.css\" type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/alertify.default.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <h1>Bem vindo a área do cliente</h1>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    <script src=\"public/vendors/jquery/dist/jquery.min.js\"></script>\n");
      out.write("    <script src=\"public/vendors/popper.js/dist/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"public/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"public/assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"public/vendors/chart.js/dist/Chart.bundle.min.js\"></script>\n");
      out.write("    <script src=\"public/assets/js/dashboard.js\"></script>\n");
      out.write("    <script src=\"public/assets/js/widgets.js\"></script>\n");
      out.write("    <script src=\"public/vendors/jqvmap/dist/jquery.vmap.min.js\"></script>\n");
      out.write("    <script src=\"public/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js\"></script>\n");
      out.write("    <script src=\"public/vendors/jqvmap/dist/maps/jquery.vmap.world.js\"></script>\n");
      out.write("    <script src=\"js/alertify.min.js\"></script>\n");
      out.write("\n");
      out.write("    <script src=\"js/jquery.validate.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/additional-methods.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/localization/messages_pt_BR.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery.mask.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script src=\"js/jquery.maskMoney.js\" type=\"text/javascript\"></script>        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
