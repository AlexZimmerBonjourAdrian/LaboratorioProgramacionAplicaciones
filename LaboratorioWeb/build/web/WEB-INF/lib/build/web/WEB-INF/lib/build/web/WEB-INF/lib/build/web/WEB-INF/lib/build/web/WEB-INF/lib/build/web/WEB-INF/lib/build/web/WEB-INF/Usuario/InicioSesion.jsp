<%-- 
    Document   : InicioSesion
    Created on : 10/10/2020, 03:37:11 PM
    Author     : arena
--%>

<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="Clases.Usuario"%>
<%@page import="LOGICA.Singleton"%>
<%@page import="DATABASE.Persistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Login </title>
     <meta http-equiv="X-UA-Compatible" content="IE=edge">
    
    <!-- Mobile Meta -->
    <meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    
    <!-- Site Icons -->
    <link rel="shortcut icon" href="../images/favicon.ico" type="image/x-icon" />
    <link rel="apple-touch-icon" href="../images/apple-touch-icon.png">

	<!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700" rel="stylesheet"> 
    <link href="https://fonts.googleapis.com/css?family=Montserrat:300,400,500,600,700" rel="stylesheet"> 

	<!-- Custom & Default Styles -->
	<link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/carousel.css">
    <link rel="stylesheet" href="../style.css">
  </head>
  <body>

    <div class="login-box">
  
      <h1>Inicio de Sesión</h1>
      <form>
        <!-- USERNAME INPUT -->
        <label for="username">Nick</label>
        <input type="text" placeholder="Enter Username" name="login" id="login">
        <!-- PASSWORD INPUT -->
        <label for="password">Contrasena</label>
        <input type="password" placeholder="Enter Password" name="password" id="password">
        <input type="submit" value="Log In" href="http://localhost:8080/LaboratorioWeb/Home">
        <a href="http://localhost:8080/LaboratorioWeb/Usuario">¿No tienes una cuenta?</a>
      </form>
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
                            String pass=request.getParameter("contrasena");
                            
                            
                            Singleton sm = Singleton.getInstance();
                            Usuario usr = sm.obtenerUsuario(nick);
                            if (usr == null){
     //                           String frase="El usuario no existe";
       //                         out.print(frase);
                            }
                            else{
                                if(usr.getContrasena().equals(pass)){
                  //                  System.out.println("Usuario logueado con éxito");
                                    
                                }
                                else{
                  //                  String frase="Contrasena incorrecta";
                 //                    out.print(frase);
                                }
                            }
                            
                        %>
                    </div>
                </div>
            </div>
         
      
  </body>
</html>
