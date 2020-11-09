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
                        $('#result').html(result.result3);
                       
                        
                        
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
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <h1 class="titulo">Consulta de curso</h1>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full"> 
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <div class="form-group">  
                                <label>Buscar por Instituto:</label><br>
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
                                <label>Buscar por Categoria:</label><br>
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
                                  <label>Curso</label><br>
                                  <select id="cur" name="cur">
                                  </select>
                            </div>
                            <jsp:include page="/WEB-INF/Curso/CursoDatos.jsp"/>
                        </div>
                    </div>
                </div>
            </div>
        </div> 
    </body>
</html>
