<%-- 
    Document   : consultacurso
    Created on : oct 16, 2020, 4:19:29 p.m.
    Author     : admin
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Datatypes.DTPrograma"%>
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
        
        <h1 class="titulo">Consulta de Programa</h1>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">    
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <div class="form-group">  
                            <% 
                                DTPrograma prog = (DTPrograma)request.getAttribute("programa"); 
                                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
                            %>
                            </div>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h3 class=\"panel-title\">Programa</h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Nombre:</h3><h3>&nbsp;&nbsp; <%= prog.getNombre() %></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Descripcion:</h3><h3> &nbsp;&nbsp;<%= prog.getDescripcion()%></h3>
                                </div>
                                 <div class="panel-body">
                                    <h3 class="titulo">Fecha inicial:</h3><h3>&nbsp;&nbsp; <%= formatter.format(prog.getFechaInicial())%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Fecha final:</h3><h3>&nbsp;&nbsp; <%= formatter.format(prog.getFechaFinal()) %></h3>
                                </div>
                                 <div class="panel-body">
                                    <h3 class="titulo">Fecha de alta:</h3><h3>&nbsp;&nbsp; <%= formatter.format(prog.getFechaAlta()) %></h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        
    </body>
</html>
