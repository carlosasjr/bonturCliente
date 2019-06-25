<%@page import="java.text.DecimalFormat"%>
<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@page import="dominio.ItemCarrinho"%>
<%@page import="persistencia.ProdutoDAO"%>
<%@page import="dominio.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="persistencia.CategoriaDAO"%>
<%@page import="dominio.Categoria"%>
<%@include file="validaSessao.jsp"%>
<jsp:include page="header.jsp"></jsp:include>



    <div class="container-fluid">

        <!--input invisivel com o id do cliente  --> 
        <input type="hidden" id="clienteID" value="<%= (cli != null) ? cli.getId() : ""%>"> 



    <%
        //CRIA ARRAY VAZIO   
        ArrayList<ItemCarrinho> lista = new ArrayList<>();

        //BUSCA TODAS OS ITENS PARA DO CARRINHO    
        lista = ItemCarrinhoDAO.itemsCarrinhoByCliente(cli.getId());
    %>





    <div class="row">
        <section class="col-12 col-sm-8">
            <div class="card border-white">
                <div class="card-header bg-white">
                    <div class="card-title cortitle">SEUS ITENS DO CARRINHO</div> 
                </div>
                <div class="card-body">               

                    <table class="table table-hover">
                        <thead>
                        <th>Ingresso</th>
                        <th>Quantidade</th>
                        <th>Preço</th>
                        <th>Ação</th>
                        </thead>

                        <tbody>

                            <% for (ItemCarrinho item : lista) {

                                    DecimalFormat df = new DecimalFormat("R$ #,##0.00");
                                    double preco = item.getPreco();
                                    String precoF;
                                    precoF = df.format(preco);
                            %>

                            <tr id="<%= item.getId()%>">
                                <td><%= item.getProduto().getDescricao()%> <br>
                                    <small><%= item.getProduto().getDetalhes()%></small> </td>
                                <td><input data-id="<%= item.getId()%>" style="width: 50px;" min="1" type="number" name="quantidade" class="quantidade" value="<%= item.getQuantidade()%>"> </td>
                                <td><%= precoF%></td>
                                <td><a class="btn btn-danger j_excluir_item rounded" href="javascript:;" rel="<%= item.getId()%>" >Excluir</a></td>
                            </tr>

                            <%}%>



                        </tbody>

                    </table>
                            
                    <a href="index.jsp" class="btn btn-primary text-white rounded">                       
                        Continuar comprando...
                    </a>                           
                </div>                          
                             
            </div>
        </section> 

        <section class="col-12 col-sm-4">
            <div class="card">
                <div class="card-header cortitle bg-white">
                    TOTAL
                </div>
                <div class="card-table table-responsive">
                    <table class="table table-hover align-middle">
                        <tbody>
                            <tr>
                                <td class="text-right">
                                    <strong>Sub-Total:</strong>
                                </td>
                                <td class="text-right subtotal">R$ 0,00</td>
                            </tr>
                            <tr>
                                <td class="text-right">
                                    <strong>Desconto:</strong>
                                </td>
                                <td class="text-right desconto">R$ 0,00</td>
                            </tr>
                            <tr>
                                <td class="text-right">
                                    <strong>Total:</strong>
                                </td>
                                <td class="text-right">
                                    <strong class="subtotal">R$ 0,00</strong>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="card-body pt-0">
                    <a class="btn btn-primary btn-lg btn-block float-right rounded" href="finalizarCarrinho.jsp">
                        Finalizar Compra                      
                    </a>
                </div>
            </div>




        </section>
    </div>




</div>




</div>


<jsp:include page="footer.jsp"></jsp:include>       


