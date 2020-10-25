<%-- 
    Document   : index
    Created on : sep 22, 2020, 4:44:33 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTUsuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="Clases.Usuario"%>
<%@page import="Clases.Docente"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"&amp;gt;>

        
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <script>
            $(document).ready(function(){
                 $('#res').css("display", "none");
                 $('#res2').css("display", "none");
            })
        </script>
        
        <%--<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        --%>
        <title>Regístrate</title>
        <script type="text/javascript">
            $(document).ready(function(){ 
                $("#nick").on("keyup", function(){ 
                    var nick = $("#nick").val();
                    $.ajax({
                      type:'POST',
                      data:{nick: nick},
                      url:'checkusuario',
                      success:function(result){
                          console.log(result);
                          var res = result.result1;
                          if(res=="true"){
                              $('#res').css("display", "block");
                              $('#res').html("Ya existe el usuario");
                              $('#boton').css("display", "none");
                              
                          }
                          else{
                              $('#res').html("");
                              $('#boton').css("display", "block");
                          }
                          
                         
                          
                      }
                  });
                });
            });
        
        
        </script>
        
        <script type="text/javascript">
            $(document).ready(function(){ 
                $("#password").on("keyup", function(){ 
                    var pass = $("#password").val();
                    var pass2 = $("#password2").val();
                    if(pass!=pass2){
                        $('#res2').html("Las contrasenias no coinciden");
                        $('#boton').css("display", "none");
                    }
                    else{
                        $('#res2').html("");
                        $('#boton').css("display", "block");
                    }
                });
            });
            
        
        
        </script>
        
        <script type="text/javascript">
            $(document).ready(function(){ 
                $("#Docente").on("keyup", function(){ 
                    
                   $('#inst').css("display", "block");
                });
                $("#Estudiante").on("keyup", function(){ 
                    
                   $('#inst').css("display", "none");
                });
                
            });
            
        
        
        </script>
        
        <script type="text/javascript">
        $(document).ready(function(){ 
            $("#password2").on("keyup", function(){ 
                var pass = $("#password").val();
                var pass2 = $("#password2").val();
                if(pass!=pass2){
                    $('#res2').html("Las contrasenias no coinciden");
                    $('#boton').css("display", "none");
                }
                else{
                    $('#res2').html("");
                    $('#boton').css("display", "block");
                }
            });
        });



        </script>
        
        
        <style>
           
        </style>
    </head>
    <body class="left-menu">
        <h1>Ingrese los datos:</h1>
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        
        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <form action="Usuario" method="post">
                                <div class="form-group">
                                    <label >Escriba su nick:</label>
                                    <input type="text" class="form-control" name="nick" placeholder="Nick" id="nick">
                                </div>
                                <div class="form-group">
                                    <span style="color:red" id="res"></span>

                                </div>

                                <div class="form-group">
                                    <label >Escriba su nombre:</label>
                                    <input type="text" class="form-control" name="nombre" placeholder="Nombre">
                                </div>
                                <div class="form-group">
                                    <label >Escriba su apellido:</label>
                                    <input type="text" class="form-control" name="apellido" placeholder="Apellido">
                                </div>
                                <div class="form-group">
                                    <label >Escriba su correo:</label>
                                    <input type="text" class="form-control" name="correo" placeholder="Correo">
                                </div>
                                <div class="form-group">
                                    <label >Ingrese su fecha de nacimiento:</label>
                                    <input type="date" class="form-control" name="fecha">
                                </div>

                                <div class="form-group">
                                    <label >Ingrese su contrasenia:</label>
                                    <input type="password" class="form-control" name="password" id="password">
                                </div>
                                <div class="form-group">
                                    <span style="color:red" id="res2"></span>

                                </div>
                                <div class="form-group">
                                    <label >Repita su contrasenia:</label>
                                    <input type="password" class="form-control" name="password2" id="password2">
                                </div>
                                <div class="form-group">


                                    <input type="radio" name="Radio" value="Docente" id='Docente'>Docente<br>
                                    <input type="radio" name="Radio" value="Estudiante" id='Estudiante'>Estudiante<br>


                                </div>
                                <div class="form-group">

                                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                <select id="inst" multiple name="inst">
                                 <c:forEach items="${institutos}" var="inst" varStatus="loop">
                                   <option>
                                       ${inst}
                                   </option>
                                 </c:forEach>
                                </select>
                                </div>

                                <button type="submit" class="btn btn-primary" id="boton">Enviar</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    
            
       
    </body>
</html>
