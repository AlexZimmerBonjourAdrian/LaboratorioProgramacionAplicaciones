<%-- 
    Document   : ConsultaPrograma
    Created on : 20/10/2020, 03:18:10 PM
    Author     : arena
--%>

<%@page import="java.util.Set"%>
<%@page import="Datatypes.DTCurso"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Consulta de Programa</title>
         <link rel="stylesheet" href="C:\Users\arena\OneDrive\Escritorio\LW\LW\LW\LW\style.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
         
       
        
        <script type="text/javascript">
          $(document).ready(function(){
            $('#prog').on("click", function(){
                var prog = $('#prog').val();
                console.log("El programa seleccionado es: " + prog);
                $.ajax({
                    type:'POST',
                    data:{prog: prog},
                    url:'programadatos',
                    success:function(result){
                        console.log(result);
                        $('#nombre').html(result.nombre);
                        $('#descripcion').html(result.descripcion);
                        $('#fechaini').html(result.fechaini);
                        $('#fechafin').html(result.fechafin);
                        $('#fechaalta').html(result.fechaalta);
                        $('#cat').html(result.result1);
                        $('#cur').html(result.result2);    
                   
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
                <h1 class="titulo">Consulta de Programa</h1>        
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <form action="programadatos" method="post">          
                                <div class="form-group">  
                                    <label>Programas:</label><br>
                                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="prog" name="prog" >
                                        <c:forEach items="${programas}" var="prog" varStatus="loop">
                                            <option>
                                                ${prog}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="panel panel-default">
                                    <div class="panel-heading">
                                        <h3 class="panel-title">Programa</h3>
                                    </div>
                                    <div class="panel-body">
                                        <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp;</h3>
                                    </div>
                                    <div class="panel-body">
                                        <h3 class="titulo">Descripcion:</h3><h3 id="descripcion"> &nbsp;&nbsp;</h3>
                                    </div>
                                     <div class="panel-body">
                                        <h3 class="titulo">Fecha inicial:</h3><h3 id="fechaini">&nbsp;&nbsp; </h3>
                                    </div>
                                    <div class="panel-body">
                                        <h3 class="titulo">Fecha final:</h3><h3 id="fechafin">&nbsp;&nbsp;</h3>
                                    </div>
                                    <div class="panel-body">
                                        <h3 class="titulo">Fecha de alta:</h3><h3 id="fechaalta">&nbsp;&nbsp; </h3>
                                    </div>
                                </div>
                            </form>
                            <label>Cursos:</label>
                            <div id="cur" name="cur" >                                                    
                            </div>                                           			                   
                        </div>                       
                    </div>
                </div>  
            </div>
        </div>
    </body>
</html>
