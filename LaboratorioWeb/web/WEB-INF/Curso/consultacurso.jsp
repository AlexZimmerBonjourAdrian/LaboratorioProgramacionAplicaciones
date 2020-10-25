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
                        $('#edi').html(result.result1);
                        $('#prog').html(result.result2);
                       
                        
                        
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
        
    </head>
    <body>
        <h1>Consulta de curso</h1>
        
         <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Edicion" method="get">          
                        <div class="form-group">  
                        <p>Buscar por Instituto:<p>
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
                        <p>Buscar por Categoria:<p>
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
                        <p>Curso</p>
                        <select id="cur" name="cur">
                          
                        </select>
                        </div>
                        <div class="form-group">
                           Nombre: <h7 name="nombre" id="nombre"></h7>
                        </div>
                        <div class="form-group">
                          Descripción:  <h7 name="descripcion" id="descripcion"></h7>
                        </div>
                        <div class="form-group">
                           Duración: <h7 name="duracion" id="duracion"></h7>
                        </div>
                        <div class="form-group">
                          Horas:  <h7 name="horas" id="horas"></h7>
                        </div>
                        <div class="form-group">
                          Créditos:  <h7 name="creditos" id="creditos"></h7>
                        </div>
                        <div class="form-group">
                          Fecha Registro:  <h7 name="fechaReg" id="fechaReg"></h7>
                        </div>
                        <div class="form-group" name="result" id="result">
                          URL:  <a name="url" id="url"></a>
                        </div>
                        
                        Ediciones: 
                          <div id="edi" name="edi" >
                           
                          </div>
                        
                        Programas: 
                          <div id="prog" name="prog" >
                           
                          </div>
                        
                    </form>
                </div>
                        
            </div>
        </div>

        
    </body>
</html>
