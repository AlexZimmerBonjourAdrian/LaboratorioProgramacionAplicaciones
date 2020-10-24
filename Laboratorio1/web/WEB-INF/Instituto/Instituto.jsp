<%-- 
    Document   : Instituto
    Created on : oct 8, 2020, 11:46:15 p.m.
    Author     : admin
--%>


<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
                            <br>
                            <input type="submit" class="btn btn-primary"></input>
                        </div>
                        
                </div>
            </div>
            <br>
            <br>
           
       
        
      
    </body>
</html>
