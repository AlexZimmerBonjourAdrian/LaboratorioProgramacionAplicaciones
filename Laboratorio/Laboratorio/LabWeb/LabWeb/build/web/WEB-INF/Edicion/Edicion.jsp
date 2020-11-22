<%-- 
    Document   : Edicion
    Created on : oct 9, 2020, 11:08:01 a.m.
    Author     : admin
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <jsp:include page="/WEB-INF/Scripts/cargarCursos.jsp"/>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#inst').on("click", cargarCursos);  
            });
        </script>
        <script type='text/javascript'>
            $(document).ready(function(){
                $('#No').on("click",function(){
                    $('#cuposEd').css("display", "none");
                });
                $('#Si').on("click",function(){
                    $('#cuposEd').css("display", "block");
                });
            });
        </script>
        <script>
            function validacion(){
                var nombreEd = document.getElementById('nombreEd').value;
                var fechaIni = document.getElementById('fechaIni').value;
                var fechaFin = document.getElementById('fechaFin').value;
                var cuposEd = document.getElementById('cuposEd').value;
                var fechaPub = document.getElementById('fechaPub').value;
                if(!nombreEd || !fechaIni || !fechaFin || cuposEd<0 || !fechaPub){
                    alert("INGRESE TODOS LOS DATOS");
                    return false;
                } 
                else{
                    return true;
                }
            }
        </script>
        <title>Edicion</title>
    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <h1>Ingrese los datos:</h1>
            <div id="home" class="video-section js-height-full">                  
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">    
                            <form action="Edicion" method="get" onsubmit="return validacion()">          
                                <div class="form-group">  
                                    <p>Instituto<p>
                                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="inst" name="inst" >
                                        <c:forEach items="${institutos}" var="inst" varStatus="loop">
                                            <option>
                                                ${inst}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">  
                                    <p>Curso</p>
                                    <select id="cur" name="cur">
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label >Nombre de la edicion:</label>
                                    <input type="text" class="form-control" name="nombreEd" placeholder="Nombre" id="nombreEd">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la fecha de inicio:</label>
                                    <input type="date" class="form-control" name="fechaIni" id="fechaIni">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la fecha de fin:</label>
                                    <input type="date" class="form-control" name="fechaFin" id="fechaFin">
                                </div>
                                <div class="form-group">
                                    <label >Cupos:</label><br>
                                    <input type="radio" name="Radio" value="Si" id='Si'>SI<br>
                                    <input type="radio" name="Radio" value="No" id='No'>NO<br>
                                    <input type="number" class="form-control" name="cuposEd" placeholder="Cupos" id='cuposEd'>
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la fecha de publicacion:</label>
                                    <input type="date" class="form-control" name="fechaPub" id="fechaPub">
                                </div>
                                <div class="form-group">
                                    <select name="docentes" multiple id="docentes" >
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label >Seleccione su imagen:</label>
                                    <input type="file" name="txtDireccion" value="" size="50"/>
                                </div>
                                <input type="submit" class="btn btn-primary"></input>
                                <a href="Home" id="cancel" name="cancel" class="btn btn-default">Cancel</a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>                       
        </div>    
        <span id="result1"> </span>
        <br>
        <br>             
    </body>
</html>

   