<%-- 
    Document   : SelecEstuEdic
    Created on : Oct 21, 2020, 11:18:32 AM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Seleccionar Estudiante para una Edicion</title>
        <style>
            table, td{
                border: 1px solid black;
            }
        </style>
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
                        //$('#mensaje').html(result.mensaje);
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
                      url:'SelecEstuEdic',
                      success:function(result){
                        console.log(result);
                        $('#filas').html(result.result1);
                        //$('#fech').html(result.result2);
                        //$('#estado').html(result.result3);
                      }
                  });
                  
              });  
            });
            
        </script>
    </head>
    <body>
        <h1>Seleccionar Estudiantes para una Edicion de Curso</h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="SelecEstuEdic" method="get">
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
                            <p>Nombre:</p> <h7 name="nombre" id="nombre"></h7>
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
                 <%--       <div class="form-group">
                            <ol id="est" id="est">
                               
                            </ol>
                            <ol id="fech" id="fech">
                               
                            </ol>
                             <ol id="estado" id="estado">
                               
                            </ol>
       
                        </div> --%>
                            
                            
                        <div>
                                
                            <table name="filas" id ="filas" class="egt">

                            <%--    <tr>
                                  
                                  <th>Nombre</th>

                                  <th>Fecha insc</th>

                                  <th>Estado</th>

                                </tr>

                                 <tr >

                                 <td name="est" id="est"></td> 

                                  <td name="fech" id="fech"></td>

                                  <td name="estado" id="estado"></td> 

                                </tr>--%>

                          </table>    
                        
                        
                        </div>    
                            
                            
                        <input type="submit" class="btn btn-primary" value="Aceptar"></input>
                        <a href="index_docente.jsp"><input type="button" class="btn btn-primary" value="Cancelar"></a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
