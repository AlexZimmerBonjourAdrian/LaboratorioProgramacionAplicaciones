<%-- 
    Document   : listarInscripEdic
    Created on : Oct 22, 2020, 10:10:18 AM
    Author     : Surface
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Set"%>
<%@page import="Datatypes.DTInscripcionE"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Listar inscripciones</title>
        <style>
            table, td{
                border: 1px solid black;
            }
        </style>
    </head>
    <body>
        <h1>Listar resultados de inscripciones a ediciones de curso </h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <div>
                            <table name="filas" id ="filas" class="egt">

                                <tr>
                                  
                                  <th>Curso</th>
                                  
                                  <th>Edicion</th>

                                  <th>Fecha insc</th>

                                  <th>Estado</th>

                                </tr>

                    
                    
                    <%
                        ArrayList<DTInscripcionE> datos = (ArrayList)request.getAttribute("inscripciones");
                    
                        for(DTInscripcionE insc : datos){
                    
                    %>
                        
                                 <tr>

                                     <td name="cur" id="cur"><%= insc.getNombreCurso() %></td> 
                                 
                                 <td name="edi" id="edi"><%= insc.getNombreEdicion() %></td>
                                  
                                 <td name="fech" id="fech"><%= insc.getFecha() %></td>

                                 <td name="estado" id="estado"><%= insc.getEstado() %></td> 

                                </tr>
                                <% } %>  
                            </table>    
                    
                        </div>    
                                   
                            <div>  
              
                        <a href="index_estudiante.jsp"><input type="button" class="btn btn-primary" value="Volver"></a>
                        </div>
                </div>
            </div>
        </div>
    </body>
</html>
