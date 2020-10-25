<%-- 
    Document   : modificardatos
    Created on : oct 16, 2020, 3:26:04 p.m.
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar datos de usuario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body class="left-menu">    
        <div class="menu-wrapper">     
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>   
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full"> 
                <h1>Ingrese los datos a modificar en el usuario: <c:out value="${user}"/></h1>  
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <form action="modificardatos" method="post">          
                                <div class="form-group">
                                    <label >Escriba el nombre:</label>
                                    <input type="text" class="form-control" name="nomUsr" placeholder="Nombre" id="nomUsr">
                                </div>
                                <div class="form-group">
                                    <label >Escriba el apellido:</label>
                                    <input type="text" class="form-control" name="apUsr" placeholder="Apellido" id="apUsr">
                                </div>
                                <div class="form-group">
                                    <label>Ingrese la fecha de nacimiento:</label>
                                    <input type="date" class="form-control" name="fechaNac" placeholder="Fecha" id="fechaNac">
                                </div>
                                <input type="submit" class="btn btn-primary"></input> 
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
