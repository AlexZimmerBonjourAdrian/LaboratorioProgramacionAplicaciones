<%-- 
    Document   : ListarEdicionCurso
    Created on : 20-oct-2020, 17:30:12
    Author     : Alex2
--%>


<%@page import="java.util.Set"%>
<%@page import="Datatypes.DTEdicion"%>
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
       <meta charset="utf-8">
       <title>Listar Edicion De Curso </title>
       <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="../css/font-awesome.min.css">
    <link rel="stylesheet" href="../css/carousel.css">
    <link rel="stylesheet" href="../style.css">
    
                       
     
        <script type="text/javascript">
         /* 
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
     
      */
            
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
      
         <body>
        <% DTEdicion Edit = (DTEdicion) request.getAttribute("Edicion"); %>
         <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                          <form action="Usuario" method="post">    
                    
                        <label >Nombre: </label> 
                        <h1 name="Nombre"><%= Edit.getNombre() %></h1>
                    </div>
                     <div class="form-group">
                        <label >Apellido: </label>
                        <h1 name="Inscript"><%= Edit.getInscripciones() %></h1>
                    </div>
                    <div class="form-group">
                        <label >Correo:</label>                 
                          <h1 name="FechaPub"><%= Edit.getFechaPub() %></h1>
                    </div>
                    <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="fechaInicio"><%= Edit.getFechaIni() %></h1>
                    </div>
                     <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="fechaFin"><%= Edit.getFechaFin() %></h1>
                    </div>
                     <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="Cupos"><%= Edit.getCuposMax() %></h1>
                        
                    </div>
                          <div class="form-group">    
                        <label >Fecha de nacimiento: </label>   
                         <h1 name="Docente"><%= Edit.getDocentes() %></h1>
                    </div>
                </div>
                        
            </div>
        </div>
    </body>
                        <% 
                            
                            
                            Persistencia p = Persistencia.getInstance();
                            p.inicializarBaseDeDatos();
                            FabricaLab fabrica = FabricaLab.getInstance();
                            ISistema ICE = fabrica.getISistema();
                            String Inst = request.getParameter("Inst");
                            //String Edit=request.getParameter("Edit");
                            
                            
                            Singleton sm = Singleton.getInstance();
                            Instituto Ins = sm.obtenerInstituto(Inst);
                            Set<DTEdicion> Editcion = (Set)request.getAttribute("Cursos");
                            
                            for(DTEdicion edicion: Editcion){
                                
                            
                            
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
                        <div class="form-group">
		
                            <a class="nombre" href="?nick=<%= edicion.getNombre()  %>">
                                Nombre:&nbsp; <%= edicion.getNombre() %>
                            </a>
                        </div>
                        <div class="form-group">
                            <span class="Insciptos">
                                 Inscripciones:&nbsp;  <%= edicion.getInscripciones() %>
                            </span>
				
			</div>		
			<% } %>
                    </div>
                </div>
            </div>
         
      
  </body>
</html>
