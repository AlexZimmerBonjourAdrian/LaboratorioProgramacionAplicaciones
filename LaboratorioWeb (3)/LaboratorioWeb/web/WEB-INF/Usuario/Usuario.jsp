<%-- 
    Document   : index
    Created on : sep 22, 2020, 4:44:33 p.m.
    Author     : admin
--%>

<%@page import="Datatypes.DTUsuario"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="Clases.Usuario"%>
<%@page import="Clases.Docente"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Regístrate</title>
    </head>
    <body>
        <h1>Ingrese los datos:</h1>
        
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Usuario" method="post">
                        <div class="form-group">
                            <label >Escriba su nick:</label>
                            <input type="text" class="form-control" name="nick" placeholder="Nick">
                        </div>
                        <div class="form-group">
                            <label >Escriba su nombre:</label>
                            <input type="text" class="form-control" name="nombre" placeholder="Nombre">
                        </div>
                        <div class="form-group">
                            <label >Escriba su apellido:</label>
                            <input type="text" class="form-control" name="apellido" placeholder="Apellido">
                        </div>
                        <div class="form-group">
                            <label >Escriba su correo:</label>
                            <input type="text" class="form-control" name="correo" placeholder="Correo">
                        </div>
                        <div class="form-group">
                            <label >Ingrese su fecha de nacimiento:</label>
                            <input type="date" class="form-control" name="fecha">
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                    </form>
                </div>
            </div>
            <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                        <%
                            Persistencia p = Persistencia.getInstance();
                            p.inicializarBaseDeDatos();
                            FabricaLab fabrica = FabricaLab.getInstance();
                            ISistema ICU = fabrica.getISistema();
                            String nick = request.getParameter("nick");
                            String nombre=request.getParameter("nombre");
                            String apellido=request.getParameter("apellido");
                            String fecha = request.getParameter("fecha");
                            String correo = request.getParameter("correo");
                            Date fechaDate = null;
                            if(fecha!=null){
                               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                               fechaDate = formato.parse(fecha);
                            }
             
                            
                            DTUsuario datos = new DTUsuario(nick, nombre, apellido, correo, fechaDate,"1234");
                            ICU.altaUsuario(datos, true, new ArrayList());

                            
                            
                            if(fecha != null && nombre!=null && apellido!=null){
                                String frase="El usuario es "+nombre+" " +apellido + " y nacio en " + fecha;
                                out.print(frase);
                            }
                           
                        %>
                    </div>
                </div>
            </div>
       
    </body>
</html>
