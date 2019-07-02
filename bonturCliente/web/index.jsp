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
                            <img class="card-img-top" src="assets/images/ingresso/<%= n%>.jpg">
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
    
    
   
</div>




    
    
</div>




<jsp:include page="footer.jsp"></jsp:include>       


