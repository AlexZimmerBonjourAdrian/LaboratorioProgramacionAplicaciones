<%-- 
    Document   : listar
    Author     : Igui
--%>


<%@page import="java.util.Set"%>
<%@page import="Datatypes.DTUsuario"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!doctype html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
	<title>Usuarios</title>
    </head>
    <body>
      

		<div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
			<% 
				Set<DTUsuario> usuarios = (Set)request.getAttribute("usuarios");
						

				for(DTUsuario usuario: usuarios){
			%>
			<div class="form-group">
		
                            <a class="nombre" href="?nick=<%= usuario.getNick()  %>">
                                Nombre:&nbsp; <%= usuario.getNombre() %>
                            </a>
                        </div>
                        <div class="form-group">
                            <span class="email">
                                 Correo:&nbsp;  <%= usuario.getCorreo() %>
                            </span>
				
			</div>		
			<% } %>
                    </div>
                </div>
            </div>
    
		
</body>
</html>