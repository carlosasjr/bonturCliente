package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import persistencia.ItemCarrinhoDAO;
import java.text.DecimalFormat;
import java.util.Random;
import persistencia.ProdutoDAO;
import dominio.Produto;
import java.util.ArrayList;
import persistencia.CategoriaDAO;
import dominio.Categoria;
import dominio.Cliente;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/validaSessao.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');

    //VERIFICA SE EXISTE UMA SESSÃO
    //SE SIM, RETORNA UM OBJETO CLIENTE
    //SENÃO REDIRECIONA PARA O LOGIN
    Cliente cli = null;

    if (session.getAttribute("cliente") != null) {
        cli = (Cliente) session.getAttribute("cliente");
    } else {
        response.sendRedirect("login.jsp");
    }


      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid painel\" >\r\n");
      out.write("        <!--CAROUSEL DE IMAGENS -->\r\n");
      out.write("        <!-- <div class=\"col-12\">\r\n");
      out.write("             <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("                 <ol class=\"carousel-indicators\">\r\n");
      out.write("                     <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("                     <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\r\n");
      out.write("                     <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\r\n");
      out.write("                 </ol>\r\n");
      out.write("                 <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("                     <div class=\"carousel-item active\">\r\n");
      out.write("                         <img class=\"d-block img-fluid\"\r\n");
      out.write("                              src=\"assets/images/banner1.jpg\"\r\n");
      out.write("                              alt=\"First slide\">\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"carousel-item\">\r\n");
      out.write("                         <img class=\"d-block img-fluid\"\r\n");
      out.write("                              src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-59.jpg\"\r\n");
      out.write("                              alt=\"First slide\">\r\n");
      out.write("                     </div>\r\n");
      out.write("                     <div class=\"carousel-item\">\r\n");
      out.write("                         <img class=\"d-block img-fluid\"\r\n");
      out.write("                              src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-168.jpg\"\r\n");
      out.write("                              alt=\"First slide\">\r\n");
      out.write("                     </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div> <!--CAROUSEL DE IMAGENS -->       \r\n");
      out.write("    </div> <!--CONTEINER FLUID --> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <!--input invisivel com o id do cliente  --> \r\n");
      out.write("        <input type=\"hidden\" id=\"clienteID\" value=\"");
      out.print( (cli != null) ? cli.getId() : "");
      out.write("\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
        //CRIA ARRAY VAZIO   
        ArrayList<Categoria> lista = new ArrayList<>();

        //BUSCA TODAS AS CATEGORIAS PARA O ARRAY lista    
        lista = CategoriaDAO.listarCategorias();

        //PERCORRE TODAS AS CATEGORIAS 
        for (Categoria categoria : lista) {
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <section class=\"col-12\">\r\n");
      out.write("        <div class=\"card border-white\">\r\n");
      out.write("            <div class=\"breadcrumbs\">\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <div class=\"page-header float-left\">\r\n");
      out.write("                        <div class=\"page-title\">\r\n");
      out.write("                            <h1>");
      out.print( categoria.getDescricao());
      out.write("</h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("                <div class=\"row\">                  \r\n");
      out.write("                    ");

                        //CRIA ARRAY VAZIO   
                        ArrayList<Produto> listaProduto = new ArrayList<>();

                        //BUSCA TODAS OS PRODUTOS PARA O ARRAY listaProduto POR id DA CATEGORIA    
                        listaProduto = ProdutoDAO.listarProdutos(categoria.getId());

                        for (Produto produto : listaProduto) {
                            DecimalFormat df = new DecimalFormat("R$ #,##0.00");
                            double preco = Double.parseDouble(produto.getPreco());
                            String precoF;
                            precoF = df.format(preco);

                            Random rand = new Random();
                            int n = rand.nextInt(4);
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <article class=\"col-12 col-sm-4 ingresso rounded\">\r\n");
      out.write("                        <div class=\"card border-0\">\r\n");
      out.write("                            <img class=\"card-img-top\" src=\"assets/images/ingresso/");
      out.print( n);
      out.write(".jpg\">\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                <h4 class=\"card-title\">");
      out.print( produto.getDescricao());
      out.write("</h4>\r\n");
      out.write("                                <p class=\"card-text\">");
      out.print( produto.getDetalhes());
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"row\">\r\n");
      out.write("                                    <div class=\"col-6\">\r\n");
      out.write("                                        <small for=\"id_ingresso\">Quantidade: </small><br>\r\n");
      out.write("                                        <input type=\"number\" name=\"quantidade\" id=\"");
      out.print( produto.getId());
      out.write("\" min=\"0\" value=\"0\" style=\"width: 30%\">\r\n");
      out.write("\r\n");
      out.write("                                        <a class=\"j_add\" href=\"#\" rel=\"");
      out.print( produto.getId());
      out.write("\"  aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("\r\n");
      out.write("                                            <img src=\"assets/images/iconfinder_shopping-cart_216477.png\" alt=\"Adicionar\"  height=\"30\">\r\n");
      out.write("                                            Adicionar                                                                                     \r\n");
      out.write("                                        </a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("\r\n");
      out.write("                                    <div class=\"col-6\">\r\n");
      out.write("                                        <div class=\"d-flex justify-content-center\">\r\n");
      out.write("                                            <h5>");
      out.print( precoF);
      out.write("</h5>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>                                \r\n");
      out.write("                            </div>                           \r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </article>\r\n");
      out.write("\r\n");
      out.write("                    ");
}
      out.write(" <!-- FINALIZA FOR DOS PRODUTOS -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
 }
      out.write(" <!-- FINALIZA FOR DAS CATEGORIAS -->\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <footer id=\"footer\"  class=\"row\">\r\n");
      out.write("    <div class=\"col-12\">\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <nav class=\"social\">\r\n");
      out.write("            \r\n");
      out.write("                \r\n");
      out.write("                <a   href=\"https://bondinhoaparecida.com.br/\">Nosso Site</a>\r\n");
      out.write("                <a  href=\"https://www.google.com/maps/place/Bontur+Bondinhos+A%C3%A9reos/@-22.8513307,-45.2349883,17z/data=!3m1!4b1!4m5!3m4!1s0x94ccc3687d0c4c65:0x547d6d5da6a18bb7!8m2!3d-22.8513357!4d-45.2327996\"><img src=\"assets/images/facebook-placeholder-para-localizar-lugares-em-mapas.png\"  height=\"30px\" width=\"30px\" alt=\"\"/></a>\r\n");
      out.write("                <a  href=\"https://www.facebook.com/bondinhosaparecida\"><img src=\"assets/images/facebook.png\"  height=\"30px\" width=\"30px\" alt=\"\"  margin-right: 30px; /></a>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("        </nav>\r\n");
      out.write("        <div id=\"bonturbnd\"> <img  src=\"assets/images/WhatsApp Image 2019-07-02 at 15.54.15.jpeg\"  height=\"50px\" width=\"50px\" alt=\"\"/> &copy; Copyright Bontur Bondinhos Aéreos </div>\r\n");
      out.write("        \r\n");
      out.write("    </div>\r\n");
      out.write("</footer>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("   \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("       \r\n");
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
