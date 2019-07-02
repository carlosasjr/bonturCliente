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

<footer id="footer"  class="row">
    <div class="col-12">

        
        <nav class="social">
            
                
                <a   href="https://bondinhoaparecida.com.br/">Nosso Site</a>
                <a  href="https://www.google.com/maps/place/Bontur+Bondinhos+A%C3%A9reos/@-22.8513307,-45.2349883,17z/data=!3m1!4b1!4m5!3m4!1s0x94ccc3687d0c4c65:0x547d6d5da6a18bb7!8m2!3d-22.8513357!4d-45.2327996"><img src="assets/images/facebook-placeholder-para-localizar-lugares-em-mapas.png"  height="30px" width="30px" alt=""/></a>
                <a  href="https://www.facebook.com/bondinhosaparecida"><img src="assets/images/facebook.png"  height="30px" width="30px" alt=""  margin-right: 30px; /></a>
                
                
        </nav>
        <div id="bonturbnd"> <img  src="assets/images/WhatsApp Image 2019-07-02 at 15.54.15.jpeg"  height="50px" width="50px" alt=""/> &copy; Copyright Bontur Bondinhos Aéreos </div>
        
    </div>
</footer>

<jsp:include page="footer.jsp"></jsp:include>
