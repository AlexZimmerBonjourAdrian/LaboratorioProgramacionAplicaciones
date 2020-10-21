<%-- 
    Document   : List
    Created on : 20-oct-2020, 18:08:32
    Author     : Alex2
--%>

<%@page import="java.util.Set"%>
<%@page import="Datatypes.DTEdicion"%>
<%@page import="java.util.ArrayList"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      <div class="container mt-5">
                    <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">  
			<% 
				 Set<DTEdicion> Editcion = (Set)request.getAttribute("Cursos");
                            
                            for(DTEdicion edicion: Editcion){
                               
                                %>
			<div class="form-group">
		
                            <a class="nombre" href="?nick=<%= edicion.getNombre()  %>">
                                Nombre:&nbsp; <%= edicion.getNombre() %>
                            </a>
                        </div>
                        <div class="form-group">
                            <span class="Insciptos">
                                 Inscripciones:&nbsp;  <%= edicion.getInscripciones()%>
                            </span>
				
			</div>		
			<% } %>
                    </div>
                 </div>
    
    </body>
</html>
