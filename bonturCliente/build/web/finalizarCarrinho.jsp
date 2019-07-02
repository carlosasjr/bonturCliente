<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="dominio.ItemCarrinho"%>
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
        <section class="col-12 col-sm-12">
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
                                <td><%= item.getQuantidade()%> </td>
                                <td><%= precoF%></td>
                            </tr>

                            <%}%>

                            <tr>
                                <td></td>
                                <td class="text-right">
                                    <strong>Sub-Total:</strong>
                                </td>
                                <td class="text-left subtotal">R$ 0,00</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td class="text-right">
                                    <strong>Desconto:</strong>
                                </td>
                                <td class="text-left desconto">R$ 0,00</td>
                            </tr>
                            <tr>
                                <td></td>
                                <td class="text-right">
                                    <strong class="text-left">Total:</strong>
                                </td>
                                <td class="text-left">
                                    <strong class="text-left subtotal">R$ 0,00</strong>
                                </td>
                            </tr>


                        </tbody>

                    </table>


                </div>                          

            </div>
        </section>


    </div>




</div>



<jsp:include page="footer.jsp"></jsp:include>
