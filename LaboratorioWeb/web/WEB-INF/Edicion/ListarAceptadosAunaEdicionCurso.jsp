<%-- 
    Document   : ListarAceptadosAunaEdicionCurso
    Created on : 20-oct-2020, 21:09:03
    Author     : Alex2
--%>

<%@page import="Datatypes.DTEdicion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
        <% DTEdicion Edit = (DTEdicion) request.getAttribute("usuario"); %>
         <div class="col-sm">  
                             
                    <div class="form-group">
                        <label >Nombre: </label> 
                        <h1 name="Nombre"><%= Edit.getNombre() %></h1>
                    </div>
                     <div class="form-group">
                        <label >Apellido: </label>
                        <h1 name="Inscript"><%= Edit.getInscripciones() %></h1>
                    </div>
                    <div class="form-group">
                        <label >Correo:</label>                 
                          <h1 name="FechaPub"><%= Edit.getFechaPub() %></h1>
                    </div>
                    <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="fechaInicio"><%= Edit.getFechaIni() %></h1>
                    </div>
                     <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="fechaFin"><%= Edit.getFechaFin() %></h1>
                    </div>
                     <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="Cupos"><%= Edit.getCuposMax() %></h1>
                        
                    </div>
                          <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="Docente"><%= Edit.getDocentes() %></h1>
                    </div>


                  
                </div>
                        
            </div>
        </div>
    </body>
</html>
