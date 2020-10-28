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
        <title>Listar inscripciones</title>      
    </head>
    <body class="left-menu">        
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">      
                <h1 class="titulo">Listar resultados de inscripciones a ediciones de curso </h1><br><br>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">
                            <div>
                                <table name="filas" id ="filas" class="table table-bordered">
                                    <tr>
                                        <th>Curso</th>
                                        <th>Edicion</th>
                                        <th>Fecha insc</th>
                                        <th>Estado</th>
                                    </tr>
                                    <%
                                        ArrayList<DTInscripcionE> datos = (ArrayList)request.getAttribute("inscripciones");
                                        if(datos!=null){
                                            for(DTInscripcionE insc : datos){
                                    %>
                                    <tr>
                                        <td name="cur" id="cur"><%= insc.getNombreCurso() %></td> 
                                        <td name="edi" id="edi"><%= insc.getNombreEdicion() %></td>
                                        <td name="fech" id="fech"><%= insc.getFecha() %></td>
                                        <td name="estado" id="estado"><%= insc.getEstado() %></td> 
                                    </tr>
                                        <% 
                                            }
                                        }
                                        %>  
                                </table>    
                            </div>    

                            <div>  
                                <br><br>
                                <a href="Home"><input type="button" class="btn btn-primary" value="Volver"></a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
