<%-- 
    Document   : InscripcionEdicion
    Created on : Oct 16, 2020, 3:59:54 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Inscripción a edición</title>
        <script type="text/javascript">
            $(document).ready(function(){
              $('#inst').on("click", function(){
                  var inst = $('#inst').val();
                  //console.log("El instituto seleccionado es: " + inst);
                  $.ajax({
                      type:'POST',
                      data:{inst: inst},
                      url:'InscripcionEdicion',
                      success:function(result){
                          console.log(result);
                          $('#cur').html(result.result1);
                          //$('#ed').html(result.result2);
                      }
                  });
                  
              });  
            });
            
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
              $('#cat').on("click", function(){
                  var cat = $('#cat').val();
                  console.log("la categoria seleccionada es: " + cat);
                  $.ajax({
                      type:'POST',
                      data:{cat: cat},
                      url:'cursosCategoria',
                      success:function(result){
                          console.log(result);
                          $('#cur').html(result.result1);
                          //$('#ed').html(result.result2);
                      }
                  });
                  
              });  
            });
            
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
              $('#cur').on("click", function(){
                  var cur = $('#cur').val();
                  //var inst = $('#inst').val();
                  console.log("El instituto seleccionado es: " + cur);
                  $.ajax({
                      type:'POST',
                      data:{cur: cur},
                      url:'edicionCurso',
                      success:function(result){
                          console.log(result);
                          $('#edi').html(result.result1);
                          //$('#ed').html(result.result2);
                      }
                  });
                  
              });  
            });
            
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
              $('#edi').on("click", function(){
                  var edi = $('#edi').val();
                  var cur = $('#cur').val();
                  //var inst = $('#inst').val();
                  //console.log("El instituto seleccionado es: " + cur);
                  $.ajax({
                      type:'POST',
                       data:{edi: edi, cur: cur},
                      url:'ediciondatos',
                      success:function(result){
                        console.log(result);
                        $('#nombre').html(result.nombre);
                        $('#fechaini').html(result.fechaini);
                        $('#fechafin').html(result.fechafin);
                        $('#cuposmax').html(result.cuposmax);
                        $('#fechapub').html(result.fechapub);
                        $('#mensaje').html(result.mensaje);
                      }
                  });
                  
              });  
            });
            
        </script>
    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">
                <h1>Inscripción a edición de curso</h1>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">
                            <form action="InscripcionEdicion" method="get">
                                <div class="form-group">
                                <p>Institutos:</p>               
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
                                <p>Categoria:<p>
                                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                <select id="cat" name="cat" >
                                 <c:forEach items="${categorias}" var="cat" varStatus="loop">
                                   <option>
                                       ${cat}
                                   </option>
                                 </c:forEach>
                                </select>
                                </div>     

                                <div class="form-group">  
                                    <p>Curso:</p>
                                    <select id="cur" name="cur">

                                    </select>
                                </div>
                                <div class="form-group">  
                                    <p>Edicion:</p>
                                    <select id="edi" name="edi">

                                    </select>
                                </div>
                                  <div class="form-group">
                                      <p>Nombre</p>: <h7 name="nombre" id="nombre"></h7>
                                </div>
                                <div class="form-group">
                                    <p>Fecha inicio:</p> <h7 name="fechaini" id="fechaini"></h7>
                                </div>
                                <div class="form-group">
                                    <p>Fecha fin:</p> <h7 name="fechafin" id="fechafin"></h7>
                                </div>
                                <div class="form-group">
                                    <p>Cupos maximos:</p> <h7 name="cuposmax" id="cuposmax"></h7>
                                </div>
                                <div class="form-group">
                                    <p>Fecha de publicación:</p> <h7 name="fechapub" id="fechapub"></h7>
                                </div>
                                <div class="form-group">
                                    <p>Mensaje:</p>
                                    <font color = "red">
                                     <h2 name="mensaje" id="mensaje"></h2>
                                    </font>
                                </div>
                                <input type="submit" class="btn btn-primary" value="Inscribirse"></input>
                                <a href="index_estudiante.jsp"><input type="button" class="btn btn-primary" value="Cancelar"></a>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
