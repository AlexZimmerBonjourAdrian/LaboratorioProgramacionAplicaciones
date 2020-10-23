<%-- 
    Document   : consultacurso
    Created on : oct 16, 2020, 4:19:29 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTCurso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Consulta de curso</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

    </head>
    <body>
        <h1>Consulta de curso</h1>
        
         <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
              
                        <div class="form-group">  
                        <p>Curso</p>
                        <% DTCurso curso1 = (DTCurso)request.getAttribute("curso"); %>
                        </div>
                        <div class="form-group">
                            <h3 name="nombre"  id="nombre"><%= curso1.getNombre() %></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="descripcion" id="descripcion"><%= curso1.getDescripcion()%></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="duracion" id="duracion"><%= curso1.getDuracion()%></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="horas" id="horas"><%= curso1.getHoras()%></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="creditos" id="creditos"><%= curso1.getCreditos()%></h3>
                        </div>
                        <div class="form-group">
                            <h3 name="fechaReg" id="fechaReg"><%= curso1.getFechaReg()%></h3>
                        </div>
                        <div class="form-group" name="result" id="result">
                            <h3 name="url" id="url"></h3>
                        </div>

                   
                </div>
                        
            </div>
        </div>

        
    </body>
</html>
