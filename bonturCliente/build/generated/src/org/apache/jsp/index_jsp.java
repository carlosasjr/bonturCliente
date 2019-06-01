package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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


      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid painel\" >\n");
      out.write("    <!--CAROUSEL DE IMAGENS -->\n");
      out.write("    <div class=\"col-12\">\n");
      out.write("        <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#carouselExampleIndicators\" data-slide-to=\"2\"></li>\n");
      out.write("            </ol>\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                    <img class=\"d-block img-fluid\"\n");
      out.write("                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-1121.jpg\"\n");
      out.write("                         alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block img-fluid\"\n");
      out.write("                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-59.jpg\"\n");
      out.write("                         alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                    <img class=\"d-block img-fluid\"\n");
      out.write("                         src=\"assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-168.jpg\"\n");
      out.write("                         alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div> <!--CAROUSEL DE IMAGENS -->       \n");
      out.write("</div> <!--CONTEINER FLUID --> \n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("    \n");
      out.write("    <!--input invisivel com o id do cliente  --> \n");
      out.write("    <input type=\"hidden\" id=\"clienteID\" value=\"");
      out.print( (cli != null) ? cli.getId() : "" );
      out.write("\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
        //CRIA ARRAY VAZIO   
        ArrayList<Categoria> lista = new ArrayList<>();

        //BUSCA TODAS AS CATEGORIAS PARA O ARRAY lista    
        lista = CategoriaDAO.listarCategorias();

        //PERCORRE TODAS AS CATEGORIAS 
        for (Categoria categoria : lista) {
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    <section class=\"col-12\">\n");
      out.write("        <div class=\"card border-white\">\n");
      out.write("            <div class=\"breadcrumbs\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <div class=\"page-header float-left\">\n");
      out.write("                        <div class=\"page-title\">\n");
      out.write("                            <h1>");
      out.print( categoria.getDescricao());
      out.write("</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <div class=\"row\">                  \n");
      out.write("                    ");

                        //CRIA ARRAY VAZIO   
                        ArrayList<Produto> listaProduto = new ArrayList<>();

                        //BUSCA TODAS OS PRODUTOS PARA O ARRAY listaProduto POR id DA CATEGORIA    
                        listaProduto = ProdutoDAO.listarProdutos(categoria.getId());

                        for (Produto produto : listaProduto) {
                    
      out.write("\n");
      out.write("\n");
      out.write("                    <article class=\"col-12 col-sm-4 ingresso\">\n");
      out.write("                        <div class=\"card bg-flat-color-1 text-light\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12\">\n");
      out.write("                                        <div class=\"h4 m-0\">");
      out.print( produto.getDescricao());
      out.write("</div>\n");
      out.write("                                        <div>");
      out.print( produto.getDetalhes());
      out.write("</div>\n");
      out.write("                                        <div class=\"progress-bar bg-light mt-2 mb-2\" role=\"progressbar\" style=\"width: 20%; height: 5px;\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <small for=\"id_ingresso\" class=\"text-light\">Quantidade: </small><br>\n");
      out.write("                                        <input type=\"number\" name=\"quantidade\" id=\"");
      out.print( produto.getId());
      out.write("\" min=\"0\" value=\"0\" style=\"width: 30%\">\n");
      out.write("\n");
      out.write("                                        <a class=\"j_add\" href=\"#\" rel=\"");
      out.print( produto.getId());
      out.write("\"  aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                            <img src=\"assets/images/iconfinder_shopping-cart_216477.png\" alt=\"Adicionar\" width=\"30\" height=\"30\">                                        \n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"col-6\">\n");
      out.write("                                        <div class=\"d-flex justify-content-center\">\n");
      out.write("                                            <h5>");
      out.print( produto.getPreco());
      out.write("</h5>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </article>\n");
      out.write("\n");
      out.write("                    ");
}
      out.write(" <!-- FINALIZA FOR DOS PRODUTOS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </section>    \n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
 }
      out.write(" <!-- FINALIZA FOR DAS CATEGORIAS -->\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("       \n");
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
