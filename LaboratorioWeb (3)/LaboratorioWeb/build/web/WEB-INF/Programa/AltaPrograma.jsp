<%-- 
    Document   : AltaPrograma
    Created on : 09/10/2020, 04:50:00 PM
    Author     : arena
--%>

<%@page import="Datatypes.DTPrograma"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="DATABASE.Persistencia"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Alta Programa</title>
    </head>
    <body>
        <h1>Ingrese los datos:</h1>
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Programa" method="post">
                        <div class="form-group">
                            <label >Escriba el nombre del Programa:</label>
                            <input type="text" class="form-control" name="nombrep" placeholder="Nombrep">
                        </div>
                        <div class="form-group">
                            <label >Escriba su descripción:</label>
                            <input type="text" class="form-control" name="descripcion" placeholder="Descripcion">
                        </div>
                        
                        <div class="form-group">
                            <label >Inicio del programa:</label>
                            <input type="date" class="form-control" name="fechaini">
                        </div>
                        <div class="form-group">
                            <label >Fin del programa:</label>
                            <input type="date" class="form-control" name="fechafin">
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar</button>
                         <a href="http://localhost:8080/LaboratorioWeb" id="cancel" name="cancel" class="btn btn-default">Cancel</a> 

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
                            String nombrep = request.getParameter("nombrep");
                            String desc = request.getParameter("descripcion"); 
                            String fechaDate = request.getParameter("fechaini");
                            String fechaDate2 = request.getParameter("fechafin");
                            
                            Date fechaini = null;
                                Date fechafin = null;
                                if(fechaDate!=null){
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    fechaini = formato.parse(fechaDate);
                                }
                                if(fechaDate2!=null){
                                    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                                    fechafin = formato.parse(fechaDate2);
                                }
                            DTPrograma datos = new DTPrograma(nombrep,desc,fechaini,fechafin,new Date());
                            
                            if (ICU.obtenerPrograma(nombrep) == null){
                               
                                ICU.crearPrograma(datos);
                                
                            
    //                            String frase="Se creo el programa: " + nombrep;
     //                           out.print(frase);
                            }else{
                                ICU.modificarDatosPrograma(datos);
              //                   String frase="Se modificó el programa: " + nombrep;
               //                 out.print(frase);
                            } 
                         
                           
                        %>
                    </div>
                </div>
            </div>
            
    </body>
</html>
