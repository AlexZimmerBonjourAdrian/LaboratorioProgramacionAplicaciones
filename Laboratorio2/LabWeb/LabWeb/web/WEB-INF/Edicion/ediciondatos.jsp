<%-- 
    Document   : ediciondatos
    Created on : oct 24, 2020, 11:06:07 p.m.
    Author     : admin
--%>

<%@page import="servidor.DtEdicion"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            .tab {
                overflow: hidden;
                border: 1px solid #ccc;
                background-color: #f1f1f1;
            }

                /* Style the buttons that are used to open the tab content */
            .tab button {
                background-color: inherit;
                float: left;
                border: none;
                outline: none;
                cursor: pointer;
                padding: 14px 16px;
                transition: 0.3s;
            }

                /* Change background color of buttons on hover */
            .tab button:hover {
                background-color: #ddd;
            }

                /* Create an active/current tablink class */
            .tab button.active {
                background-color: #ccc;
            }

                /* Style the tab content */
            .tabcontent {
                display: none;
                padding: 6px 12px;
                border: 1px solid #ccc;
                border-top: none;
            }

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Datos de edicion</title>
    </head>
    <body class="left-menu">
      
        <%
            DtEdicion ed1 = (DtEdicion)request.getAttribute("ed");
            if(ed1!=null){
        %>
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
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
                            cupos=ed1.getCupoMax();
                            fechaini=ed1.getFechaIni().toString();
                            fechafin=ed1.getFechaFin().toString();
                            fechapub=ed1.getFechaPub().toString();
                        }
                    %>      
                            <div class="tab">
                                <button class="tablinks" onclick="pestana(event, 'general')" id="defaultOpen" name="defaultOpen">General</button>
                                <button class="tablinks" onclick="pestana(event, 'docentes')">Docentes</button>
                            </div>
                            <div id="general" class="tabcontent">
                                <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp; <%=nombre %></h3>
                                <h3 class="titulo">Cupos:</h3><h3 id="cuposmax"> &nbsp;&nbsp;<%=cupos%></h3>
                                <h3 class="titulo">Fecha inicio:</h3><h3 id="fechaini">&nbsp;&nbsp; <%=fechaini%></h3>
                                <h3 class="titulo">Fecha fin:</h3><h3 id="fechafin">&nbsp;&nbsp; <%=fechafin%></h3>
                                <h3 class="titulo">Fecha de publicacion:</h3><h3 id="fechapub">&nbsp;&nbsp; <%=fechapub%></h3>
                            </div>
                            <div id="docentes" class="tabcontent">
                                <div id="doc" name="doc">
                                    <%
                                        ArrayList<String> docentes=(ArrayList)request.getAttribute("doc");
                                        if(docentes!=null){
                                            for(String doc : docentes){
                                                System.out.println(doc);
                                    %>
                                                <a href="consultausuario?nick=<%=doc%>"><%=doc%></a>
                                    <%
                                            }
                                        }

                                    %>
                    
                                </div>
                            </div>
                        <% if(ed1!=null){ %>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%};%>
        <script>
        
        function pestana(evt, cityName) {
            // Declare all variables
            var i, tabcontent, tablinks;

            // Get all elements with class="tabcontent" and hide them
            tabcontent = document.getElementsByClassName("tabcontent");
            for (i = 0; i < tabcontent.length; i++) {
                tabcontent[i].style.display = "none";
            }

            // Get all elements with class="tablinks" and remove the class "active"
            tablinks = document.getElementsByClassName("tablinks");
            for (i = 0; i < tablinks.length; i++) {
                tablinks[i].className = tablinks[i].className.replace(" active", "");
            }

            // Show the current tab, and add an "active" class to the button that opened the tab
            document.getElementById(cityName).style.display = "block";
            evt.currentTarget.className += " active";
        }
        document.getElementById("defaultOpen").click();
        
        </script>
    </body>
</html>