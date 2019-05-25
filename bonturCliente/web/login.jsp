<%@page import="persistencia.ClienteDAO"%>
<%@page import="dominio.Cliente"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>   




<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta id="viewport" name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no"/>
        <title>Sistema de Login - Bontur Bondinhos Aéreos</title>
        <link type="text/css" rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link type="text/css" rel="stylesheet" href="assets/css/styleLogin.css">
    </head>
    <body>
        <section class="login-block">
            <div class="container">
                <div class="row">

                    <!--FORMULÁRIO DE LOGIN -->
                    <div class="col-md-5 login-sec" id="login">
                        <h2 class="text-center">Login</h2>                       


                        <%

                            String registro = request.getParameter("registro");

                            if (registro != null) {
                                if (registro.equals("true")) {
                                    out.println("Cadastrado com sucesso!");
                                } else {
                                    out.println("E-mail já foi cadastrado!");
                                }
                            }

                            String login = request.getParameter("login");

                            if (login != null) {
                                if (login.equals("false")) {
                                    out.println("Email e/ou Senha inválidos!");
                                }

                            }


                        %>                        

                        <form class="login-form" id="formLogin" name="formLogin" method="post" action="admin/cliente/logar.jsp">

                            <div class="form-group">
                                <label for="email">E-mail</label>
                                <input type="email" class="form-control" placeholder="E-mail" autofocus id="email"
                                       name="email">
                            </div>

                            <div class="form-group">
                                <label for="senha">Senha</label>
                                <input type="password" class="form-control" placeholder="Senha" id="senha" name="senha">
                            </div>

                            <div class="form-check">
                                <a id="registrarSe" class="btn btn-primary float-right text-white">Registrar-se</a>
                                <input type="submit" class="btn btn-login float-right" name="formLogin" value="Entrar">
                            </div>

                        </form>
                        <a id="esqueciaSenha" class="btn btn-link float-left">
                            <small>Esqueci a senha</small>
                        </a>
                    </div>  <!--FORMULÁRIO DE LOGIN -->



                    <!--FORMULÁRIO DE REGISTRO -->
                    <div class="col-md-5 login-sec" id="registro" style="display: none">
                        <form class="login-form" id="formRegisto" name="formRegisto" method="post" action="admin/cliente/registro.jsp">
                            <h2 class="text-center">Registro</h2>
                            <div class="form-group">
                                <label for="nomeRegistro">Nome</label>
                                <input type="text" name="nome" class="form-control" id="nomeRegistro"
                                       placeholder="Nome" autofocus>
                            </div>

                            <div class="form-group">
                                <label for="emailRegistro">E-mail</label>
                                <input type="email" name="email" class="form-control" id="emailRegistro"
                                       placeholder="email@examplo.com" autofocus>
                            </div>

                            <div class="form-group">
                                <label for="senhaRegistro">Senha</label>
                                <input type="password" name="senha" class="form-control" id="senhaRegistro"
                                       placeholder="Senha">
                            </div>

                            <div class="form-check">
                                <a id="jaRegistro" class="btn btn-primary float-right text-white">Já possuo registro</a>

                                <input type="submit" class="btn btn-login float-right" name="formRegistro"
                                       value="Registrar">
                            </div>

                        </form>
                    </div> <!--FORMULÁRIO DE REGISTRO -->


                    <!--FORMULÁRIO DE ESQUECI A SENHA -->
                    <div class="col-md-5 login-sec" id="esqueci" style="display: none">
                        <h2 class="text-center">Esqueci a senha</h2>
                        <form class="login-form" id="formLogin" name="formEsqueci" method="post">
                            <div class="form-group">
                                <label for="email">E-mail</label>
                                <input type="email" class="form-control" placeholder="E-mail" autofocus id="emailEsqueci"
                                       name="email">
                            </div>

                            <div class="form-check">
                                <input type="submit" class="btn btn-login float-right" name="formEsqueci" value="Enviar">
                                <a href="login.jsp" id="voltar" class="btn btn-primary float-right text-white">Fazer
                                    Login</a>

                            </div>
                        </form>
                    </div> <!--FORMULÁRIO DE REGISTRO -->



                    <!--CAROUSEL DE IMAGENS -->
                    <div class="col-md-7 banner-sec">
                        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                            <ol class="carousel-indicators">
                                <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                                <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                            </ol>
                            <div class="carousel-inner" role="listbox">
                                <div class="carousel-item active">
                                    <img class="d-block img-fluid"
                                         src="assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-1121.jpg"
                                         alt="First slide">
                                    <div class="carousel-caption d-none d-md-block">
                                        <div class="banner-text">
                                            <h2>This is Heaven</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                                                tempor
                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
                                                nostrud exercitation</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img class="d-block img-fluid"
                                         src="assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-59.jpg"
                                         alt="First slide">
                                    <div class="carousel-caption d-none d-md-block">
                                        <div class="banner-text">
                                            <h2>This is Heaven</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                                                tempor
                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
                                                nostrud exercitation</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="carousel-item">
                                    <img class="d-block img-fluid"
                                         src="assets/images/Bontur-Bondinhos-Aereos-Aparecida-SP-168.jpg"
                                         alt="First slide">
                                    <div class="carousel-caption d-none d-md-block">
                                        <div class="banner-text">
                                            <h2>This is Heaven</h2>
                                            <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod
                                                tempor
                                                incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis
                                                nostrud exercitation</p>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div> <!--CAROUSEL DE IMAGENS -->                   


                </div>
            </div>
        </section>


        <script type="text/javascript" src="assets/js/jquery-3.3.1.min.js"></script>
        <script type="text/javascript" src="assets/js/additional-methods.js"></script>
        <script type="text/javascript" src="assets/js/jquery.validate.min.js"></script>
        <script type="text/javascript" src="assets/js/jquery.mask.min.js"></script>
        <script type="text/javascript" src="assets/js/bootstrap.bundle.js"></script>
        <script src="assets/js/localization/messages_pt_BR.min.js" type="text/javascript"></script>
        <script type="text/javascript" rel="script" src="assets/js/scriptLogin.js"></script>
    </body>
</html>

