package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<div class=\"row\">\r\n");
      out.write("    <ul\tclass=\"social\">\r\n");
      out.write("        <li><a <img src=\"assets/images/facebook.png\" href=\"https://www.facebook.com/bondinhosaparecida\">Facebook</a></li>\r\n");
      out.write("        <li><a href=\"https://www.google.com/maps/place/Bontur+Bondinhos+A%C3%A9reos/@-22.8513357,-45.2327996,15z/data=!4m5!3m4!1s0x0:0x547d6d5da6a18bb7!8m2!3d-22.8513357!4d-45.2327996\"><img src=\"assets/images/placeholder.png\"> </a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script src=\"public/vendors/jquery/dist/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"public/assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"public/vendors/popper.js/dist/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"public/vendors/bootstrap/dist/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"public/vendors/jqvmap/dist/jquery.vmap.min.js\"></script>\r\n");
      out.write("<script src=\"public/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js\"></script>\r\n");
      out.write("<script src=\"public/vendors/jqvmap/dist/maps/jquery.vmap.world.js\"></script>\r\n");
      out.write("<script src=\"assets/js/alertify.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"assets/js/jquery.validate.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/additional-methods.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/localization/messages_pt_BR.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.mask.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"assets/js/jquery.maskMoney.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
