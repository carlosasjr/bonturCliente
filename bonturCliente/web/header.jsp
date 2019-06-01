<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Área do Cliente</title>

        <link rel="stylesheet" href="public/vendors/bootstrap/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="public/vendors/font-awesome/css/font-awesome.min.css">
        <link rel="stylesheet" href="public/vendors/themify-icons/css/themify-icons.css">
        <link rel="stylesheet" href="public/vendors/flag-icon-css/css/flag-icon.min.css">
        <link rel="stylesheet" href="public/vendors/selectFX/css/cs-skin-elastic.css">
        <link rel="stylesheet" href="public/vendors/jqvmap/dist/jqvmap.min.css">


        <link rel="stylesheet" href="public/assets/css/style.css" type="text/css">
        <link rel="stylesheet" href="assets/css/admin.css" type="text/css">
        <link rel="stylesheet" href="assets/css/alertify.core.css" type="text/css">
        <link rel="stylesheet" href="assets/css/alertify.default.css" type="text/css">

        <link href='https://fonts.googleapis.com/css?family=Open+Sans:400,600,700,800' rel='stylesheet' type='text/css'>
    </head>
    <body>
        <div id="right-panel" class="right-panel">
            <!-- Right Panel -->
            <!-- Header-->
            <header id="header" class="header">
                <div class="header-menu">
                    <div class="col-2 col-sm-2">
                        <div class="header-left">
                            <div class="dropdown for-notification">
                                <button class="btn btn-secondary dropdown-toggle" type="button" id="notification" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <i class="fa fa-bell"></i>
                                    <span class="count bg-danger">5</span>
                                </button>
                                <div class="dropdown-menu" aria-labelledby="notification">
                                    <p class="red">Notificações</p>
                                    <a class="dropdown-item media bg-flat-color-1" href="#">
                                        <i class="fa fa-check"></i>
                                        <p>Texto de exemplo</p>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-4" href="#">
                                        <i class="fa fa-info"></i>
                                        <p>Texto de exemplo</p>
                                    </a>
                                    <a class="dropdown-item media bg-flat-color-5" href="#">
                                        <i class="fa fa-warning"></i>
                                        <p>Texto de exemplo</p>
                                    </a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="col-12 col-sm-5">
 
                    </div>



                    <div class="col-10 col-sm-5">
                        <div class="user-area dropdown float-right">
                            <div class="col-sm-5 float-right">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                    <img class="user-avatar rounded-circle" src="assets/images/admin.jpg" alt="User Avatar">
                                </a>

                                <div class="user-menu dropdown-menu">
                                    <a class="nav-link" href="index.php?exe=usuarios/profile"><i class="fa fa-user"></i> Minha Conta</a>

                                    <a class="nav-link" href="#"><i class="fa fa-user"></i> Notificações <span class="count">13</span></a>

                                    <a class="nav-link" href="#"><i class="fa fa-cog"></i> Configurações</a>

                                    <a class="nav-link" href="sair.php"><i class="fa fa-power-off"></i> Logout</a>
                                </div>     
                            </div>


                            <div class="col-sm-7 float-right">
                                <a href="#" aria-haspopup="true" aria-expanded="false">
                                    <img class="user-avatar rounded-circle" src="assets/images/iconfinder_shopping-cart_216477.png" alt="User Avatar">
                                    <span class="count bg-danger">0</span>
                                </a>
                            </div>
                        </div> 
                    </div>
                </div>
            </header><!-- /header -->