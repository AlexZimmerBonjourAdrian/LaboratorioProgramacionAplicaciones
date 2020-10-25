<%@page import="Datatypes.DTUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.text.SimpleDateFormat"%>

<!doctype html>
<html>
    <head>
	<title>Perfil </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body class="left-menu">
        <% DTUsuario usr = (DTUsuario) request.getAttribute("usuario"); %>
        <div class="menu-wrapper">     
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div> 
        <div id="wrapper">
            <div id="home" class="video-section js-height-full"> 
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h2 style="font-size: xx-large" class="panel-title"><%=usr.getNick()%></h2>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Nombre:</h3><h3 id="nombre"><%=usr.getNombre()%>&nbsp;&nbsp;</h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Apellido:</h3><h3 id="descripcion"><%=usr.getApellido()%> &nbsp;&nbsp;</h3>
                                </div>
                                 <div class="panel-body">
                                    <h3 class="titulo">Correo:</h3><h3 id="fechaini">&nbsp;&nbsp;<%=usr.getCorreo()%> </h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Fecha final:</h3><h3 id="fechafin">&nbsp;&nbsp;<%=usr.getFecha()%></h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>