<%-- 
    Document   : consultacurso
    Created on : oct 16, 2020, 4:19:29 p.m.
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Consulta de curso</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <script type="text/javascript">
          $(document).ready(function(){
            $('#inst').on("click", function(){
                var inst = $('#inst').val();
                console.log("El instituto seleccionado es: " + inst);
                $.ajax({
                    type:'POST',
                    data:{inst: inst},
                    url:'concultacurso',
                    success:function(result){
                        console.log(result);
                        $('#cur').html(result.result1);
                    }
                });

            });  
          });

      </script>
      <script type="text/javascript">
          $(document).ready(function(){
            $('#cur').on("click", function(){
                var cur = $('#cur').val();
                console.log("El curso seleccionado es: " + cur);
                $.ajax({
                    type:'POST',
                    data:{cur: cur},
                    url:'cursodatos',
                    success:function(result){
                        console.log(result);
                        $('#nombre').html(result.nombre);
                        $('#descripcion').html(result.descripcion);
                        $('#duracion').html(result.duracion);
                        $('#horas').html(result.horas);
                        $('#creditos').html(result.creditos);
                        $('#fechaReg').html(result.fechaReg);
                        $('#url').html(result.url);
                        
                        
                    }
                });

            });  
          });

      </script>
        
        
    </head>
    <body>
        <h1>Consulta de curso</h1>
        
         <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Edicion" method="get">          
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
                            <h3 name="nombre" id="nombre"></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="descripcion" id="descripcion"></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="duracion" id="duracion"></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="horas" id="horas"></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="creditos" id="creditos"></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="fechaReg" id="fechaReg"></h3>
                        </div>
                        <div class="form-group" name="result" id="result">
                            <h3 name="url" id="url"></h3>
                        </div>
          
                      
                    </form>
                </div>
                        
            </div>
        </div>

        
    </body>
</html>
