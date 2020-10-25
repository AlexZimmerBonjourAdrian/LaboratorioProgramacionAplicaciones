<%-- 
    Document   : ConsultaEdiCurso
    Created on : 17/10/2020, 03:16:10 PM
    Author     : german
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Datatypes.DTEdicion"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="Clases.Edicion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
         <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        
        <script type="text/javascript">
            $(document).ready(function(){
              $('#inst').on("click", function(){
                  var inst = $('#inst').val();
                  console.log("El instituto seleccionado es: " + inst);
                  $.ajax({
                      type:'POST',
                      data:{inst: inst},
                      url:'consultaediciondecurso',
                      success:function(result){
                          console.log(result);
                          $('#cur').html(result.result1);
                 //         $('#edi').html(result.result2);
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
        
  <!--      <script type='text/javascript'>
            $(document).ready(function(){
                
                $('#categ').on("click",function(){
                   
                    $('#inst').css("display", "none");
                });
                $('#insti').on("click",function(){
                   
                    $('#cat').css("display", "none");
                });
                
               
            });
        </script> -->
        
         <script type="text/javascript">
          $(document).ready(function(){
            $('#edi').on("click", function(){
                var edi = $('#edi').val();
                var cur = $('#cur').val();
                console.log("La edicion seleccionada es: " + edi);
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
                        $('#doc').html(result.result1);
                        $('#inscripciones').html(result.inscripciones);
                        
                        
                    }
                });

            });  
          });

      </script>
        
        <title>ConsultaEdicionCurso</title>
    </head>
    <body>
       <h1> Consulta de Edición de Curso</h1>
        
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">   
                    <form action="ConsultaEdicionCurso" method="get"> 
      <!--                  <div class="form-group">
                            <label >Buscar por:</label><br>
                            <input type="radio" name="Radio" value="Categoria" id='categ'> Categoria<br>
                            <input type="radio" name="Radio" value="Instituto" id='insti'> Instituto<br>

                        </div> -->
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
                        <p>Edición:</p>
                        <select id="edi" name="edi">
                          
                        </select>
                        </div>
                        
                          <div class="form-group">
                           Nombre: <h7 name="nombre" id="nombre"></h7>
                        </div>
                        <div class="form-group">
                           Fecha inicio: <h7 name="fechaini" id="fechaini"></h7>
                        </div>
                        <div class="form-group">
                           Fecha fin: <h7 name="fechafin" id="fechafin"></h7>
                        </div>
                        <div class="form-group">
                          Cupos máximos:  <h7 name="cuposmax" id="cuposmax"></h7>
                        </div>
                        <div class="form-group">
                           Fecha publicación: <h7 name="fechapub" id="fechapub"></h7>
                        </div>
                        <div class="form-group">  
                            <p>Docentes:</p>
                            <select id="doc" name="doc">

                            </select>
                        </div>
                        <div class="form-group" name="result" id="result">
                            <h7 name="inscripciones" id="inscripciones"></h7>
                        </div>
                        
                    </form>
                </div>
                        
            </div>
        </div>
            <span id="result1"> </span>
            <br>
            <br>
        <div class="row">
            <div class="col-sm">
                <div class="alert alert-primary" role="alert">
               
                </div>
            </div>
        </div>

    </body>
</html>
