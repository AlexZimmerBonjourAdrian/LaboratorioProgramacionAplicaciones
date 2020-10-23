<%@page import="Datatypes.DTUsuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@page import="java.text.SimpleDateFormat"%>

<!doctype html>
<html>
   <head>
	   
	<title>Perfil </title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
      

	<% DTUsuario usr = (DTUsuario) request.getAttribute("usuario"); %>
	 <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                             
                    <div class="form-group">
                        <label >Nombre: </label> 
                        <h1 name="nomUsr"><%= usr.getNombre() %></h1>
                    </div>
                     <div class="form-group">
                        <label >Apellido: </label>
                        <h1 name="apUsr"><%= usr.getApellido() %></h1>
                    </div>
                    <div class="form-group">
                        <label >Correo:</label>                 
                          <h1 name="emailUsr"><%= usr.getCorreo() %></h1>
                    </div>
                    <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="fechaUsr"><%= usr.getFecha() %></h1>
                    </div>


                  
                </div>
                        
            </div>
        </div>
	
</body>
</html>