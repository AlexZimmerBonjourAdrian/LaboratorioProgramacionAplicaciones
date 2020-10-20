<%-- 
    Document   : ListarEdicionCurso
    Created on : 20-oct-2020, 17:30:12
    Author     : Alex2
--%>


<%@page import="LOGICA.Singleton"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="Clases.Edicion"%>
<%@page import="Clases.Instituto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
  <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Edicion" method="get">          
                        <div class="form-group">  
                        <p>Instituto<p>
                        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                        <select id="inst" name="inst" >
                         <c:forEach items="${institutos}" var="inst" varStatus="loop">
                           <option>
                               ${inst}
                           </option>
                         </c:forEach>
                        </select>
                        </div>
          
                        <div class="form-group">  
                        <p>Curso</p>
                        <select id="cur" name="cur">
                          
                        </select>
                        </div>
                        <div class="form-group">
                            <label >Nombre de la edicion:</label>
                            <input type="text" class="form-control" name="nombreEd" placeholder="Nombre">
                        </div>
                        
                        
                      
                      
                        <input type="submit" class="btn btn-primary"></input>
                        
                    </form>
                </div>
                        
            </div>
        </div>
        <script type="text/javascript">
          
    (document).ready(function(){
              $('#inst').on("click", function(){
                  var inst = $('#inst').val();
                  console.log("Seleccionaste Instituto" + inst);
                 // var Est = $('$Est').val();
                 // console.log("Ingrese el Instituto")
                  $.ajax({
                      type:'POST',
                      data:{inst: inst},
                     // url:'Edicion',
                      
                      success:function(result){
                          
                          
                          
                      }
                      
                  });
                  
              });  
            });
     
      
            
        </script>
        <script type='text/javascript'>
            /*
            $(document).ready(function(){
                
                $('#No').on("click",function(){
                   
                    $('#cuposEd').css("display", "none");
                });
                $('#Si').on("click",function(){
                   
                    $('#cuposEd').css("display", "block");
                });
                
               
            });
     * 
     */
             
        </script>
        <title>Edicion</title>
       
    </head>
     <body>

    <div class="login-box">
  
      <h1>Inicio de Sesión</h1>
      <form>
        <!-- USERNAME INPUT -->
        <label for="Inst">Instituto</label>
        <input type="text" placeholder="Instituto" name="ogin" id="Inst">
        <!-- PASSWORD INPUT -->
        <label for="Edit">Edicion</label>
        <input type="text" placeholder="Enter" name="Edit" id="Edit
               ">
        <input type="search" value="Serch" href="http://localhost:8080/LaboratorioWeb/Home">
        <a href="http://localhost:8080/LaboratorioWeb/AgregarEdicion">¿Agregar una edicion?</a>
      </form>
    </div>
     <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                        <% 
                            
                            /*
                            Persistencia p = Persistencia.getInstance();
                            p.inicializarBaseDeDatos();
                            FabricaLab fabrica = FabricaLab.getInstance();
                            ISistema ICE = fabrica.getISistema();
                            String Inst = request.getParameter("Inst");
                            String Edit=request.getParameter("Edit");
                            
                            
                            Singleton sm = Singleton.getInstance();
                            Instituto Ins = sm.obtenerInstituto(Inst);
                            */
                            /*
                            if (Ins == null){
     //                           String frase="El usuario no existe";
       //                         out.print(frase);
                            }
                            */
                            /*
                            else{
                                if(usr.getContrasena().equals(pass)){
                  //                  System.out.println("Usuario logueado con éxito");
                                    
                                }
                                else{
                  //                  String frase="Contrasena incorrecta";
                 //                    out.print(frase);
                                }
                            }
*/
                            
                        %>
                    </div>
                </div>
            </div>
         
      
  </body>
</html>
