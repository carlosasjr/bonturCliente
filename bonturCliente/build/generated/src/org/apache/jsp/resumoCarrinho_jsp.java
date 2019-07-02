package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import persistencia.ItemCarrinhoDAO;
import dominio.ItemCarrinho;
import persistencia.ProdutoDAO;
import dominio.Produto;
import java.util.ArrayList;
import persistencia.CategoriaDAO;
import dominio.Categoria;
import dominio.Cliente;

public final class resumoCarrinho_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <!--input invisivel com o id do cliente  --> \r\n");
      out.write("        <input type=\"hidden\" id=\"clienteID\" value=\"");
      out.print( (cli != null) ? cli.getId() : "");
      out.write("\"> \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");

        //CRIA ARRAY VAZIO   
        ArrayList<ItemCarrinho> lista = new ArrayList<>();

        //BUSCA TODAS OS ITENS PARA DO CARRINHO    
        lista = ItemCarrinhoDAO.itemsCarrinhoByCliente(cli.getId());
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <section class=\"col-12 col-sm-8\">\r\n");
      out.write("            <div class=\"card border-white\">\r\n");
      out.write("                <div class=\"card-header bg-white\">\r\n");
      out.write("                    <div class=\"card-title cortitle\">SEUS ITENS DO CARRINHO</div> \r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body\">               \r\n");
      out.write("\r\n");
      out.write("                    <table class=\"table table-hover\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                        <th>Ingresso</th>\r\n");
      out.write("                        <th>Quantidade</th>\r\n");
      out.write("                        <th>Preço</th>\r\n");
      out.write("                        <th>Ação</th>\r\n");
      out.write("                        </thead>\r\n");
      out.write("\r\n");
      out.write("                        <tbody>\r\n");
      out.write("\r\n");
      out.write("                            ");
 for (ItemCarrinho item : lista) {

                                    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
                                    double preco = item.getPreco();
                                    String precoF;
                                    precoF = df.format(preco);
                            
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <tr id=\"");
      out.print( item.getId());
      out.write("\">\r\n");
      out.write("                                <td>");
      out.print( item.getProduto().getDescricao());
      out.write(" <br>\r\n");
      out.write("                                    <small>");
      out.print( item.getProduto().getDetalhes());
      out.write("</small> </td>\r\n");
      out.write("                                <td><input data-id=\"");
      out.print( item.getId());
      out.write("\" style=\"width: 50px;\" min=\"1\" type=\"number\" name=\"quantidade\" class=\"quantidade\" value=\"");
      out.print( item.getQuantidade());
      out.write("\"> </td>\r\n");
      out.write("                                <td>");
      out.print( precoF);
      out.write("</td>\r\n");
      out.write("                                <td><a class=\"btn btn-danger j_excluir_item rounded\" href=\"javascript:;\" rel=\"");
      out.print( item.getId());
      out.write("\" >Excluir</a></td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");
}
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("\r\n");
      out.write("                    </table>\r\n");
      out.write("                            \r\n");
      out.write("                    <a href=\"index.jsp\" class=\"btn btn-primary text-white rounded\">                       \r\n");
      out.write("                        Continuar comprando...\r\n");
      out.write("                    </a>                           \r\n");
      out.write("                </div>                          \r\n");
      out.write("                             \r\n");
      out.write("            </div>\r\n");
      out.write("        </section> \r\n");
      out.write("\r\n");
      out.write("        <section class=\"col-12 col-sm-4\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-header cortitle bg-white\">\r\n");
      out.write("                    TOTAL\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-table table-responsive\">\r\n");
      out.write("                    <table class=\"table table-hover align-middle\">\r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"text-right\">\r\n");
      out.write("                                    <strong>Sub-Total:</strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"text-right subtotal\">R$ 0,00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"text-right\">\r\n");
      out.write("                                    <strong>Desconto:</strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"text-right desconto\">R$ 0,00</td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"text-right\">\r\n");
      out.write("                                    <strong>Total:</strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                                <td class=\"text-right\">\r\n");
      out.write("                                    <strong class=\"subtotal\">R$ 0,00</strong>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-body pt-0\">\r\n");
      out.write("                    <a class=\"btn btn-primary btn-lg btn-block float-right rounded\" href=\"finalizarCarrinho.jsp\">\r\n");
      out.write("                        Finalizar Compra                      \r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
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
