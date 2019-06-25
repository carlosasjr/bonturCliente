<%@page import="persistencia.ItemCarrinhoDAO"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.Random"%>
<%@page import="persistencia.ProdutoDAO"%>
<%@page import="dominio.Produto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="persistencia.CategoriaDAO"%>
<%@page import="dominio.Categoria"%>
<%@include file="validaSessao.jsp"%>
<jsp:include page="header.jsp"></jsp:include>


    <div class="container-fluid painel" >
        <!--CAROUSEL DE IMAGENS -->
       <!-- <div class="col-12">
            <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner" role="listbox">
                    <div class="carousel-item active">
                        <img class="d-block img-fluid"
                             src="assets/images/banner1.jpg"
                             alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid"
                             src="assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-59.jpg"
                             alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block img-fluid"
                             src="assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-168.jpg"
                             alt="First slide">
                    </div>
                </div>
            </div>
        </div> <!--CAROUSEL DE IMAGENS -->       
    </div> <!--CONTEINER FLUID --> 


    <div class="container-fluid">

        <!--input invisivel com o id do cliente  --> 
        <input type="hidden" id="clienteID" value="<%= (cli != null) ? cli.getId() : ""%>"> 


    <%        //CRIA ARRAY VAZIO   
        ArrayList<Categoria> lista = new ArrayList<>();

        //BUSCA TODAS AS CATEGORIAS PARA O ARRAY lista    
        lista = CategoriaDAO.listarCategorias();

        //PERCORRE TODAS AS CATEGORIAS 
        for (Categoria categoria : lista) {
    %>


    <section class="col-12">
        <div class="card border-white">
            <div class="breadcrumbs">
                <div class="col-sm-4">
                    <div class="page-header float-left">
                        <div class="page-title">
                            <h1><%= categoria.getDescricao()%></h1>
                        </div>
                    </div>
                </div>

            </div>

            <div class="card-body">
                <div class="row">                  
                    <%
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
                    %>

                    <article class="col-12 col-sm-4 ingresso rounded">
                        <div class="card border-0">
                            <img class="card-img-top" src="assets/images/ingresso/<%= n %>.jpg">
                            <div class="card-body">
                                <h4 class="card-title"><%= produto.getDescricao()%></h4>
                                <p class="card-text"><%= produto.getDetalhes()%></p>


                                <div class="row">
                                    <div class="col-6">
                                        <small for="id_ingresso">Quantidade: </small><br>
                                        <input type="number" name="quantidade" id="<%= produto.getId()%>" min="0" value="0" style="width: 30%">

                                        <a class="j_add" href="#" rel="<%= produto.getId()%>"  aria-haspopup="true" aria-expanded="false">

                                            <img src="assets/images/iconfinder_shopping-cart_216477.png" alt="Adicionar"  height="30">
                                            Adicionar                                                                                     
                                        </a>
                                    </div>

                                    <div class="col-6">
                                        <div class="d-flex justify-content-center">
                                            <h5><%= precoF%></h5>
                                        </div>
                                    </div>
                                </div>                                
                            </div>                           

                        </div>
                    </article>

                    <%}%> <!-- FINALIZA FOR DOS PRODUTOS -->


                </div>
            </div>
        </div>
    </section>    


    <% }%> <!-- FINALIZA FOR DAS CATEGORIAS -->


</div>




</div>


<jsp:include page="footer.jsp"></jsp:include>       


