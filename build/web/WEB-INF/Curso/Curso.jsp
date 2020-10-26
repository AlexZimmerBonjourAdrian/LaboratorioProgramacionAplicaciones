<%-- 
    Document   : Curso
    Created on : oct 9, 2020, 12:04:22 a.m.
    Author     : admin
--%>

<%@page import="java.text.Format.Field"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Datatypes.DTCurso"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Curso</title>
        
        <script type="text/javascript">
            $(document).ready(function(){
              $('#inst').on("click", function(){
                  var inst = $('#inst').val();
                  console.log("El instituto seleccionado es: " + inst);
                  $.ajax({
                      type:'POST',
                      data:{inst: inst},
                      url:'Edicion',
                      success:function(result){
                          console.log(result);
                          $('#previas').html(result.result1);
                         
                      }
                  });
                  
              });  
            });
            
        </script>
        <style type="text/css">
            label { color: dimgray }
         </style>
        
    </head>
    <body class="left-menu">
        
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        
        <h1 style="text-align: center">Ingrese los datos:</h1>
        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <form action="Curso" method="get">          
                                <div class="form-group">
                                    <label>Escriba el nombre del curso:</label>
                                    <input type="text" class="form-control" name="nomCur" placeholder="Nombre">
                                </div>
                                 <div class="form-group">
                                    <label >Escriba la descripcion del curso:</label>
                                    <input type="text" class="form-control" name="desCur" placeholder="Descripcion">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la duracion del curso:</label>
                                    <input type="text" class="form-control" name="durCur" placeholder="Duracion">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la cantidad de horas del curso:</label>
                                    <input type="text" class="form-control" name="horasCur" placeholder="Horas">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la cantidad de creditos del curso:</label>
                                    <input type="text" class="form-control" name="credCur" placeholder="Creditos">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la fecha de registro:</label>
                                    <input type="date" class="form-control" name="fecha">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese la URL del curso:</label>
                                    <input type="text" class="form-control" name="url">
                                </div>
                                <div class="form-group">
                                    <label>Institutos</label><br>
                                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="inst" name="inst">
                                     <c:forEach items="${institutos}" var="inst" varStatus="loop">
                                       <option>
                                           ${inst}
                                       </option>
                                     </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Previas</label><br>
                                    <select id="previas" multiple name="previas">
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label>Categorias</label><br>
                                    <select id="cat" multiple name="cat">
                                        <c:forEach items="${categorias}" var="cat" varStatus="loop">
                                           <option>
                                               ${cat}
                                           </option>
                                         </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label >Seleccione su imagen:</label>
                                    <input type="file" name="txtDireccion" value="" size="50"/>
                                </div>
                                <input type="submit" class="btn btn-primary"></input>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
            <br>
            <br>
           
       
        
        
    </body>
</html>
