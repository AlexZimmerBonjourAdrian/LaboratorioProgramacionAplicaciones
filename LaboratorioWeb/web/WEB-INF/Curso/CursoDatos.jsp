<%-- 
    Document   : consultacurso
    Created on : oct 16, 2020, 4:19:29 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTCurso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Consulta de curso</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        
    </head>
    <body class="left-menu">
        
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">           
                <h1>Consulta de curso</h1>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">      
                            <% DTCurso curso1 = (DTCurso)request.getAttribute("curso"); %>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                   <h3 class=\"panel-title\">Curso</h3>
                                </div>
                              
                                <div class="panel-body">
                                    <h3 class="titulo">Nombre:</h3><h3>&nbsp;&nbsp; <%= curso1.getNombre() %></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Descripcion:</h3><h3> &nbsp;&nbsp;<%= curso1.getDescripcion()%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Duracion:</h3><h3>&nbsp;&nbsp; <%= curso1.getDuracion()%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Horas:</h3><h3>&nbsp;&nbsp; <%= curso1.getHoras()%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Creditos:</h3><h3>&nbsp;&nbsp; <%= curso1.getCreditos()%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Registro: </h3><h3>&nbsp;&nbsp;<%= curso1.getFechaReg()%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">URL: </h3><h3>&nbsp;&nbsp;<%= curso1.getUrl() %></h3>
                                </div>
                            </div>
                        </div>
                    </div>                     
                </div>
            </div>
        </div>
        
    </body>
</html>
