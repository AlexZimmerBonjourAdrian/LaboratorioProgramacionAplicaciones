<%-- 
    Document   : panel_docente
    Created on : oct 22, 2020, 11:24:43 a.m.
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        
        <header class="vertical-header">
            <div class="vertical-header-wrapper">
                <nav class="nav-menu">
                    <div class="logo">
                        <a href="index.jsp"><img src="images/logo.png" alt=""></a>
                    </div><!-- end logo -->

                    <div class="margin-block"></div>

                    <ul class="primary-menu">
                        <li class="child-menu"><a href="#">Usuario <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <% String user = (String)request.getSession().getAttribute("usuario_logueado");%>
                                    <li><a href="consultausuario?nick=<%= user %>">Consulta de usuario</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/modificardatos">Modificar datos de usuario</a></li>
                                    
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Cursos <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="http://localhost:8080/LaboratorioWeb/Curso">Alta de curso</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/concultacurso">Consulta de curso</a></li>
                                     <li><a href="http://localhost:8080/LaboratorioWeb/Edicion">Alta edición de curso</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/consultaediciondecurso">Consulta de edición de curso</a></li>
                                   
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Programas <i class="fa fa-angle-right"></i></a>
                             <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="http://localhost:8080/LaboratorioWeb/Programa">Crear programa de formación</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/AgregarCursoProg">Agregar curso a programa de formación</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/consultaPrograma">Consulta programa de formación</a></li>
                                    
                                </ul>
                            </div>
                        </li>
                        <li class="child-menu"><a href="#">Edición <i class="fa fa-angle-right"></i></a>
                            <div class="sub-menu-wrapper">
                                <ul class="sub-menu center-content">
                                    <li><a href="http://localhost:8080/LaboratorioWeb/SelecEstuEdic">Seleccion estudiante para edición de curso</a></li>
                                    <li><a href="http://localhost:8080/LaboratorioWeb/aceptadosedicion">Listar aceptados a edición de curso</a></li>
                               
                                </ul>
                            </div>
                    </ul>
                    
                    <div class="margin-block"></div>
                    <jsp:include page="/WEB-INF/Busqueda/search.jsp"/>
                    

                   
                </nav><!-- end nav-menu -->
            </div><!-- end vertical-header-wrapper -->
        </header><!-- end header -->
    </body>
</html>
