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
                        $('#img').html(result.result2);
                        
                        
                    }
                });

            });  
          });

      </script>
        
        <title>ConsultaEdicionCurso</title>
    </head>
    <body class="left-menu">
       
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">       
                <h1 class="titulo"> Consulta de Edición de Curso</h1>  
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
                            <div class="form-group">  
                                <label>Edición:</label><br>
                                <select id="edi" name="edi">
                                </select>
                            </div>
                            <jsp:include page="/WEB-INF/Edicion/ediciondatos.jsp"/>
                        </div>
                    </div>
                </div>
            </div>
        </div>
       
                            
        
        <div class="form-group" name="result" id="result">
            <h7 name="inscripciones" id="inscripciones"></h7>
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
