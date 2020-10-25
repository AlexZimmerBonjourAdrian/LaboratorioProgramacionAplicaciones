<%-- 
    Document   : consultausuario
    Created on : oct 17, 2020, 3:02:08 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Usuarios</title>
    </head>
    <body>
        <% DTUsuario usr = (DTUsuario) request.getAttribute("usuario"); %>
        <div class="container mt-5">
            <div class="form-group">
                <label >Nombre: </label> 
                <p name="nomUsr"><%= usr.getNombre() %></p>
            </div>
             <div class="form-group">
                <label >Apellido: </label>
                <h1 name="apUsr"><%= usr.getApellido() %></h1>
            </div>
            <div class="form-group">
                <label >Correo:</label>                 
                  <h1 name="emailUsr"><%= usr.getCorreo() %></h1>
            </div>
            <div class="form-group">    
                <label >Fecha de nacimiento: </label>   
                 <h1 name="fechaUsr"><%= usr.getFecha() %></h1>
            </div>
        </div>
    </body>
</html>
