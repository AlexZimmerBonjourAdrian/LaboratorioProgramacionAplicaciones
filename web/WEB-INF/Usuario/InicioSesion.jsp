<%-- 
    Document   : InicioSesion
    Created on : 10/10/2020, 03:37:11 PM
    Author     : arena
--%>

<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="Clases.Usuario"%>
<%@page import="LOGICA.Singleton"%>
<%@page import="DATABASE.Persistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>  
        <meta charset="utf-8">
        <title>Login </title>
    </head>
    <body class="left-menu">

        <div class="menu-wrapper">     
         <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">        
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">         
                            <h1 class="titulo">Inicio de Sesión</h1>
                            <form>
                            <div class="form-group">
                                <label for="username">Nick</label><br>
                                <input type="text" placeholder="Enter Username" name="login" id="login">
                            </div>
                            <!-- PASSWORD INPUT -->
                            <div class="form-group">
                                <label for="password">Contrasena</label><br>
                                <input type="password" placeholder="Enter Password" name="password" id="password"><br><br>
                                <input type="submit" value="Log In" href="http://localhost:8080/LaboratorioWeb/Home">
                                <a href="Usuario">¿No tienes una cuenta?</a>
                            </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
