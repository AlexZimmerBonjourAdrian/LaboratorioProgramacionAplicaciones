<%-- 
    Document   : Instituto
    Created on : oct 8, 2020, 11:46:15 p.m.
    Author     : admin
--%>


<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Instituto</title>
    </head>
    <body>
        
          <h1>Ingrese los datos:</h1>
        
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Instituto" method="post">
                            <label >Escriba el nombre del instituto:</label>
                            <input type="text" class="form-control" name="nombre" placeholder="Nombre">
                           
                           <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>        
                </div>
                
                        
                </div>
            <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                      
                    </div>
            </div>
          
       
        
      
    </body>
</html>
