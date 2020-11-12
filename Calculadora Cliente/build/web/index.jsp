<%-- 
    Document   : index
    Created on : 05-nov-2020, 16:18:46
    Author     : nico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <style>
        body {
            padding-top: 50px;
            padding-right: 30px;
            padding-bottom: 50px;
            padding-left: 80px;
        }
    </style>
    
    <body>
        <h1>Consumir un servicio</h1>
       
        <form  action="InfoServlet" ACTION="POST">
            
            <div class="form-group">
                
                <input class="form-control" id="nroi" type="text" name="nroi" aria-describedby="help" placeholder="Ingresar i">
                <small id="help" class="form-text text-muted">No nos responsabilizamos que sus datos sean hackeados.</small>
            </div>
            <div class="form-group">
                
                <input class="form-control" id="nroj" type="text" name="nroj" placeholder="Ingrese j">
                <%session.setAttribute("procedencia","index");%>
            </div>
            
            
            <input class="btn btn-primary" type="submit" value="suma" name="operador" />
            
            
           
        </form>
    </body>
</html>
