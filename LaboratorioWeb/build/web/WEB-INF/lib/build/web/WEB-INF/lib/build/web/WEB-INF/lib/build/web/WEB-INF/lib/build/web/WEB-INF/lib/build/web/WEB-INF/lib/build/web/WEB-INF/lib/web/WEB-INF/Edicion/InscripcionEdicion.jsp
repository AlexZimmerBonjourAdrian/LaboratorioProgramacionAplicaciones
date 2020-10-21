<%-- 
    Document   : InscripcionEdicion
    Created on : Oct 16, 2020, 3:59:54 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
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
                          $('#ed').html(result.result1);
                          //$('#ed').html(result.result2);
                      }
                  });
                  
              });  
            });
            
        </script>
    </head>
    <body>
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
                            <select id="ed" name="ed">

                            </select>
                        </div>    
                        <input type="submit" class="btn btn-primary"></input>    
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
