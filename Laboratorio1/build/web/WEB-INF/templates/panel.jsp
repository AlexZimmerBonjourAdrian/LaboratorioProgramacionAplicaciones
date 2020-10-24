<%-- 
    Document   : panel
    Created on : oct 14, 2020, 9:59:21 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.EstadoSesion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    
    <head>
        
        <!-- Site Icons -->
    <link rel="shortcut icon" href="images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="images/apple-touch-icon.png">

	<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

	<!-- Custom & Default Styles -->
    <link rel="stylesheet" href="./css/bootstrap.min.css">
    <link rel="stylesheet" href="./css/font-awesome.min.css">
    <link rel="stylesheet" href="./css/carousel.css">
    <link rel="stylesheet" href="./style.css">
    <style>
        h1 {
            text-align: center;
        }
    </style>
    </head>
    
    <body>
       <% 
       EstadoSesion est = (EstadoSesion)request.getSession().getAttribute("estado_sesion");
       switch(est){
            case NO_LOGIN:
            %>    
                <jsp:include page="/WEB-INF/templates/panel_visitante.jsp"/>
            <%    break;
            
            case LOGIN_INCORRECTO:
            %>
            <jsp:include page="/WEB-INF/templates/panel_visitante.jsp"/>
            <%
            case LOGIN_ESTUDIANTE:
            %>   <jsp:include page="/WEB-INF/templates/panel_estudiante.jsp"/>     
            <% break;
            
            case LOGIN_DOCENTE:
                %>
                  <jsp:include page="/WEB-INF/templates/panel_docente.jsp"/>
              <% break;
        }
        %>
        
    </body>
    
    
</html>
 