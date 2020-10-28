<%-- 
    Document   : consultacurso
    Created on : oct 16, 2020, 4:19:29 p.m.
    Author     : admin
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Datatypes.DTPrograma"%>
<%@page import="Datatypes.DTCurso"%>
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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Consulta de curso</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>

    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        
        <%
            DTPrograma prog = (DTPrograma)request.getAttribute("programa");
            if(prog!=null){
        %>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">  
                <h1 class="titulo">Consulta de Programa</h1>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
                <%};%>
                
                        <%  
                        String nombre="";
                        String descripcion="";
                        String fechaini="";
                        String fechafin="";
                        String fechaalta="";
                        if(prog!=null){
                            nombre=prog.getNombre();
                            descripcion=prog.getDescripcion();
                            fechaini=prog.getFechaInicial().toString();
                            fechafin=prog.getFechaFinal().toString();
                            fechaalta=prog.getFechaAlta().toString();
                        }
                    %>    
                            <div class="form-group">  
                            <% 
                                
                                 
                                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        
                            %>
                            </div>
                            <div class="tab">
                                <button class="tablinks" onclick="pestana(event, 'general')" id="defaultOpen" name="defaultOpen">General</button>
                                <button class="tablinks" onclick="pestana(event, 'cursos')">Cursos</button>
                            </div>
                            <div id="general" class="tabcontent">
                                    <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp; <%= nombre %></h3>
                                    <h3 class="titulo">Descripcion:</h3><h3 id="descripcion"> &nbsp;&nbsp;<%= descripcion%></h3>
                                    <h3 class="titulo">Fecha inicial:</h3><h3 id="fechaini">&nbsp;&nbsp; <%= fechaini%></h3>
                                    <h3 class="titulo">Fecha final:</h3><h3 id="fechafin">&nbsp;&nbsp; <%= fechafin %></h3>
                                    <h3 class="titulo">Fecha de alta:</h3><h3 id="fechaalta">&nbsp;&nbsp; <%= fechaalta %></h3>
                            </div>
                            <div id="cursos" class="tabcontent">
                                <div id="cur" name="cur">
                                    <ul class="list-group">
                                    <%
                                            ArrayList<String> cursos=(ArrayList)request.getAttribute("cursos");
                                            if(cursos!=null){
                                                for(String c : cursos){
                                                    System.out.println(c);
                                        %>
                                        <li class="list-group-item"><h2><a href="cursodatos?cur=<%=c%>"><%=c%></a></h2></li><br>
                                        <%
                                                }
                                            }

                                    %>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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
