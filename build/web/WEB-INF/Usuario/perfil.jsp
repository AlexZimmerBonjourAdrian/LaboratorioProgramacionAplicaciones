<%@page import="java.util.ArrayList"%>
<%@page import="Datatypes.DTUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.text.SimpleDateFormat"%>

<!doctype html>
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
                            <div class="tab">
                                <button class="tablinks" onclick="pestana(event, 'general')" id="defaultOpen" name="defaultOpen">General</button>
                                <button class="tablinks" onclick="pestana(event, 'ediciones')">Ediciones</button>
                                <button class="tablinks" onclick="pestana(event, 'programas')">Programas</button>
                            </div>
                            <div id="general" class="tabcontent">
                                <div class="form-group">
                                    <h2  class="titulo" style="color: red"><%=usr.getNick()%></h2>
                                    <img src="<%= usr.getImagenDir() %>" >
                                </div>
                                
                                <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp;<%=usr.getNombre()%></h3>
                                <h3 class="titulo">Apellido:</h3><h3 id="descripcion">&nbsp;&nbsp;<%=usr.getApellido()%> </h3>
                                <h3 class="titulo">Correo:</h3><h3 id="fechaini">&nbsp;&nbsp;<%=usr.getCorreo()%> </h3>
                                <h3 class="titulo">Fecha de nacimiento:</h3><h3 id="fechafin">&nbsp;&nbsp;<%=usr.getFecha()%></h3>
                            </div>
                            <div id="ediciones" class="tabcontent">
                                <%
                                    String nick2 = (String) request.getSession().getAttribute("usuario_logueado");
                                    ArrayList<String> edi = (ArrayList)request.getAttribute("ediciones");
                                    if(edi!=null){
                                        for(String ed : edi){
                                            
                                %>
                                <a href="consultaediciondecurso"><%=ed%></a>&nbsp;&nbsp;<%if(nick2!=null && nick2.equals(usr.getNick())){%><a href="listarInscripEdic">Ver inscripciones</a><%};%><br>
                                <%
                                        }
                                    }
                                %>
                            </div>
                            <div id="programas" class="tabcontent">
                                <%
                                    ArrayList<String> prog = (ArrayList)request.getAttribute("programas");
                                    if(prog!=null){
                                        for(String pr : prog){
                                %>
                                            <a href="programadatos?prog=<%=pr%>"><%=pr%></a><br>
                                <%
                                        }
                                    }
                                %>
                            </div>
                        </div>
                        <div class="form-group">    
                            
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