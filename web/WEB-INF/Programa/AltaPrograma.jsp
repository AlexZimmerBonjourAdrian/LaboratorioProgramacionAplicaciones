<%-- 
    Document   : AltaPrograma
    Created on : 09/10/2020, 04:50:00 PM
    Author     : arena
--%>

<%@page import="Datatypes.DTPrograma"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alta Programa</title>
    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">    
                <h1 class="titulo">Ingrese los datos:</h1>     
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <form action="Programa" method="post">
                                <div class="form-group">
                                    <label >Escriba el nombre del Programa:</label>
                                    <input type="text" class="form-control" name="nombrep" placeholder="Nombrep">
                                </div>
                                <div class="form-group">
                                    <label >Escriba su descripción:</label>
                                    <input type="text" class="form-control" name="descripcion" placeholder="Descripcion">
                                </div>
                                <div class="form-group">
                                    <label >Inicio del programa:</label>
                                    <input type="date" class="form-control" name="fechaini">
                                </div>
                                <div class="form-group">
                                    <label >Fin del programa:</label>
                                    <input type="date" class="form-control" name="fechafin">
                                </div>
                                <button type="submit" class="btn btn-primary">Enviar</button>
                                <a href="http://localhost:8080/LaboratorioWeb" id="cancel" name="cancel" class="btn btn-default">Cancel</a> 
                            </form>
                        </div>
                    </div>
                </div>
            </div>   
        </div>
    </body>
</html>
