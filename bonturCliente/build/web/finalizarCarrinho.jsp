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
        
        
<div  class="row">
        <section class="col-6">

        </section>

        <section class="col-6">
            <div class="card">
                <div class="card-header">
                     Entre com o Numero do seu Cartão
                </div>
                <div class="card-body">
                    <form method="post" id="formCartao" name="formCartao">
                        <div class="form-group">
                            <label for="nome-do-cartao">Nome do Titular do Cartão</label>
                            <input type="text" class="form-control" id="nomecartao" name="nomecartao" placeholder="Nome do cartão">
                        </div>
                        <img class="img-fluid" src="assets/images/payment-logo.jpg" />
                        <div class="row">
                            <div class="col-md-8">
                                <div class="form-group">
                                    <label for="cartao-de-credito">Numero do Cartão de Crédito </label>
                                    <input type="text" class="form-control" id="cartaocredito" name="cartaocredito" placeholder="0000-0000-0000-0000">
                                </div>
                            </div>
                            <div class="col-md-4">
                                <div class="form-group">
                                    <label for="cvv">CVV</label>
                                    <input type="password" class="form-control" id="cvv" name="cvv"  placeholder="CVV" >
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="validade-mes">Validade Mês</label>
                                    <select class="form-control" id="validade-mes" name="validade=mes">
                                        <option>01</option>
                                        <option>02</option>
                                        <option>03</option>
                                        <option>04</option>
                                        <option>05</option>
                                        <option>06</option>
                                        <option>07</option>
                                        <option>08</option>
                                        <option>09</option>
                                        <option>10</option>
                                        <option>11</option>
                                        <option>12</option>
                                    </select>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="validade-ano">Validade Ano</label>
                                    <select class="form-control" id="validade-ano" nome="validade-ano">
                                        <option>2017</option>
                                        <option>2018</option>
                                        <option>2019</option>
                                        <option>2020</option>
                                    </select>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-12">
                                
                                <input type="submit" value="Finalizar Pagamento" class="btn btn-primary btn-gradient btn-block btn-lg float-right">                                    
                                
                            </div>
                        </div>
                    </form>
                </div>
        </section>
    </div>
        




</div>



<jsp:include page="footer.jsp"></jsp:include>
