<%-- 
    Document   : ediciondatos
    Created on : oct 24, 2020, 11:06:07 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTEdicion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Datos de edicion</title>
    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <%
            DTEdicion ed1 = (DTEdicion)request.getAttribute("ed");
            if(ed1!=null){
        %>
        
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">                  
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">    
            <%};%>       
                    <%  
                        String nombre="";
                        int cupos=0;
                        String fechaini="";
                        String fechafin="";
                        String fechapub="";
                        if(ed1!=null){
                            nombre=ed1.getNombre();
                            cupos=ed1.getCuposMax();
                            fechaini=ed1.getFechaIni().toString();
                            fechafin=ed1.getFechaFin().toString();
                            fechapub=ed1.getFechaPub().toString();
                        }
                    %>
                            <div class="panel panel-default">
                                <div class="panel-heading">
                                    <h2 class="panel-title" style="font-size: 40px" >Edicion</h2>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp; <%=nombre %></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Cupos:</h3><h3 id="cuposmax"> &nbsp;&nbsp;<%=cupos%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Fecha inicio:</h3><h3 id="fechaini">&nbsp;&nbsp; <%=fechaini%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Fecha fin:</h3><h3 id="fechafin">&nbsp;&nbsp; <%=fechafin%></h3>
                                </div>
                                <div class="panel-body">
                                    <h3 class="titulo">Fecha de publicacion:</h3><h3 id="fechapub">&nbsp;&nbsp; <%=fechapub%></h3>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
