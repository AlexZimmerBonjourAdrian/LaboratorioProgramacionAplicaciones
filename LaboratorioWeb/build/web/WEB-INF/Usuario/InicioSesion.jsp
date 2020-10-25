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
    
    <jsp:include page="/WEB-INF/templates/panel.jsp"/>
  </head>
  <body>

    <div class="container mt-5">
  
      <h1>Inicio de Sesión</h1>
      <form>
        <div class="form-group">
            <label for="username">Nick</label><br>
            <input type="text" placeholder="Enter Username" name="login" id="login">
        </div>
        <!-- PASSWORD INPUT -->
        <div class="form-group">
            <label for="password">Contrasena</label><br>
            <input type="password" placeholder="Enter Password" name="password" id="password"><br><br>
            <input type="submit" value="Log In" href="http://localhost:8080/LaboratorioWeb/Home">
            <a href="Usuario">¿No tienes una cuenta?</a>
        </div>
      </form>
    </div>
  
                    
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
               
  
         
      
  </body>
</html>
