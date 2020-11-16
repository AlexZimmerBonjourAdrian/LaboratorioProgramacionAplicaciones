<%-- 
    Document   : panel_docente
    Created on : oct 22, 2020, 11:24:43 a.m.
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
            <!-- Google Fonts -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
        <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

            <!-- Custom & Default Styles -->
        <link rel="stylesheet" href="./css/bootstrap.min.css">
        <link rel="stylesheet" href="./css/font-awesome.min.css">
        <link rel="stylesheet" href="./css/carousel.css">
        <link rel="stylesheet" href="./style.css">
    </head>
    <body>
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
                                    <li><a href="consultausuario?<%= user %>">Consulta de usuario</a></li>
                                    <li><a href="consultausuario">Usuarios</a></li>
                                    <li><a href="modificardatos">Modificar datos de usuario</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Cursos<span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="Curso">Alta de curso</a></li>
                                    <li><a href="concultacurso">Consulta de curso</a></li>
                                    <li><a href="Edicion">Alta edicion de curso</a></li>
                                    <li><a href="consultaediciondecurso">Consulta de edicion de curso</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Programas <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="Programa">Crear programa de formacion</a></li>
                                    <li><a href="AgregarCursoProg">Agregar curso a programa de formacion</a></li>
                                    <li><a href="consultaPrograma">Consulta de programa de formacion</a></li>
                                </ul>
                            </li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Edicion <span class="fa fa-angle-down"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="aceptadosedicion">Listar aceptados a Ediciones De Cursos</a></li>
                                    <li><a href="SelecEstuEdic">Seleccionar estudiante para edicion de curso</a></li>
                                </ul>
                            </li>
                        </ul> 
                    </div><!--/.nav-collapse -->
                </div><!--/.container-fluid -->
            </nav>
        </div><!-- end mobile-menu -->

        <header class="vertical-header">
            <div class="vertical-header-wrapper">
                <nav class="nav-menu">
                    <div class="logo">
                        <a href="Home"><img src="images/logo.png" alt=""></a>
                    </div><!-- end logo -->

                    <div class="margin-block"></div>

                    <ul class="primary-menu">
                        <li class="child-menu"><a href="#">Usuario <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="consultausuario?nick=<%= user %>">Consulta de usuario</a></li>
                                    <li><a href="consultausuario">Usuarios</a></li>
                                    <li><a href="modificardatos">Modificar datos de usuario</a></li>
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Cursos <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="Curso">Alta de curso</a></li>
                                    <li><a href="concultacurso">Consulta de curso</a></li>
                                     <li><a href="Edicion">Alta edición de curso</a></li>
                                    <li><a href="consultaediciondecurso">Consulta de edición de curso</a></li>
                                   
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Programas <i class="fa fa-angle-right"></i></a>
                             <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="Programa">Crear programa de formación</a></li>
                                    <li><a href="AgregarCursoProg">Agregar curso a programa de formación</a></li>
                                    <li><a href="consultaPrograma">Consulta programa de formación</a></li>
                                    
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Edición <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="SelecEstuEdic">Seleccion estudiante para edición de curso</a></li>
                                    <li><a href="aceptadosedicion">Listar aceptados a edición de curso</a></li>
                               
                                </ul>
                            </div>
                    </ul>
                    
                    <div class="margin-block"></div>
                    <jsp:include page="/WEB-INF/Busqueda/search.jsp"/>
                    

                   
                </nav><!-- end nav-menu -->
            </div><!-- end vertical-header-wrapper -->
        </header><!-- end header -->
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
    </body>
</html>
