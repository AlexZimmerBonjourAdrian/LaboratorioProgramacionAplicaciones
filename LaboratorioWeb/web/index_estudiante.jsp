<%-- 
    Document   : index
    Created on : 09/10/2020, 03:38:20 PM
    Author     : arena
--%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.Out"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<!--[if IE 9]> <html class="no-js ie9 fixed-layout" lang="en"> <![endif]-->
<!--[if gt IE 9]><!--> <html class="no-js " lang="en"> <!--<![endif]-->
<head>

    <!-- Basic -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <!-- Mobile Meta -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    
    <!-- Site Meta -->
    <title>edEXT</title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

	<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

	<!-- Custom & Default Styles -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/carousel.css">
    <link rel="stylesheet" href="style.css">

	<!--[if lt IE 9]>
		<script src="js/vendor/html5shiv.min.js"></script>
		<script src="js/vendor/respond.min.js"></script>
	<![endif]-->

</head>
<body class="left-menu">  
    
    <div class="menu-wrapper">
        <div class="mobile-menu">
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="index.jsp"><img src="images/logo-normal.png" alt=""></a>
                    </div>
                    <div id="navbar" class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Usuario <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <% String user = (String) request.getSession().getAttribute("usuario_logueado"); %>
                                    <%= user %>
                                    <li><a href="consultausuario?<%= user %>">Consulta de usuario</a></li>
                                    <li><a href="#">Modificar datos de usuario</a></li>
                                  
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Pages <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Portfolio <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Shop <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Blog <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#">Menu Example 01</a></li>
                                    <li><a href="#">Menu Example 02</a></li>
                                    <li><a href="#">Menu Example 03</a></li>
                                    <li><a href="#">Menu Example 04</a></li>
                                    <li><a href="#">Menu Example 05</a></li>
                                    <li><a href="#">Menu Example 06</a></li>
                                </ul>
                            </li> 
                        </ul> 
                    </div><!--/.nav-collapse -->
                </div><!--/.container-fluid -->
            </nav>
        </div><!-- end mobile-menu -->

        <jsp:include page="/WEB-INF/templates/panel_estudiante.jsp"/>
    </div><!-- end menu-wrapper -->

    <div id="wrapper">

        <div id="home" class="video-section js-height-full">
            <div class="overlay"></div>
            <div class="home-text-wrapper relative container">
                <div class="home-message">
                    <img src="images/biglogo.png" alt="">
                    <p>edEXT</p>
                    
                        <% String user2 = (String) request.getSession().getAttribute("usuario_logueado"); %>
                        <p>Bienvenido <%= user2 %></p>
                    </p>
                    
                    <div class="btn-wrapper">
                        <div class="text-center">
                             <a href="http://localhost:8080/LaboratorioWeb/logout" class="btn btn-primary">LOGOUT</a> 
                        </div>
                    </div><!-- end row -->
                </div>
            </div>
        </div>

        <footer class="section footer">
         
        </footer><!-- end footer -->

        <div class="section copyrights">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-3">
                        <div class="cop-logo">
                            <img src="images/logo-normal.png" alt="">
                        </div>
                    </div>
                 
                </div>
            </div>
        </div>
    </div><!-- end wrapper -->

    <!-- jQuery Files -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/carousel.js"></script>
    <script src="js/parallax.js"></script>
    <script src="js/rotate.js"></script>
    <script src="js/custom.js"></script>
    <script src="js/masonry.js"></script>
    <script src="js/masonry-4-col.js"></script>
    <!-- VIDEO BG PLUGINS -->
    <script src="videos/libs/swfobject.js"></script> 
    <script src="videos/libs/modernizr.video.js"></script> 
    <script src="videos/libs/video_background.js"></script> 
    <script>
        jQuery(document).ready(function($) {
            var Video_back = new video_background($("#home"), { 
                "position": "absolute", //Follow page scroll
                "z-index": "-1",        //Behind everything
                "loop": true,           //Loop when it reaches the end
                "autoplay": true,       //Autoplay at start
                "muted": true,          //Muted at start
                "mp4":"videos/video.mp4" ,     //Path to video mp4 format
                "video_ratio": 1.7778,              // width/height -> If none provided sizing of the video is set to adjust
                "fallback_image": "images/dummy.png",   //Fallback image path
                "priority": "html5"             //Priority for html5 (if set to flash and tested locally will give a flash security error)
            });
        });
    </script>

</body>
</html>
