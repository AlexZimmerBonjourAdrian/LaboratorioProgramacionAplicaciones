<%-- 
    Document   : Edicion
    Created on : oct 9, 2020, 11:08:01 a.m.
    Author     : admin
--%>

<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@page import="Datatypes.DTEdicion"%>
<%@page import="DATABASE.Persistencia"%>
<%@page import="java.util.ArrayList"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        
        <script type="text/javascript">
            $(document).ready(function(){
              $('#inst').on("click", function(){
                  var inst = $('#inst').val();
                  console.log("El instituto seleccionado es: " + inst);
                  $.ajax({
                      type:'POST',
                      data:{inst: inst},
                      url:'Edicion',
                      success:function(result){
                          console.log(result);
                          $('#cur').html(result.result1);
                          $('#docentes').html(result.result2);
                      }
                  });
                  
              });  
            });
            
        </script>
        <script type='text/javascript'>
            $(document).ready(function(){
                
                $('#No').on("click",function(){
                   
                    $('#cuposEd').css("display", "none");
                });
                $('#Si').on("click",function(){
                   
                    $('#cuposEd').css("display", "block");
                });
                
               
            });
        </script>
        <title>Edicion</title>
    </head>
    <body>
        
         <h1>Ingrese los datos:</h1>
        
        
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
                         <div class="form-group">
                            <label >Ingrese la fecha de inicio:</label>
                            <input type="date" class="form-control" name="fechaIni">
                        </div>
                         <div class="form-group">
                            <label >Ingrese la fecha de fin:</label>
                            <input type="date" class="form-control" name="fechaFin">
                        </div>
                         <div class="form-group">
                            <label >Cupos:</label><br>
                            
                            <input type="radio" name="Radio" value="Si" id='Si'>SI<br>
                            <input type="radio" name="Radio" value="No" id='No'>NO<br>
                            <input type="text" class="form-control" name="cuposEd" placeholder="Cupos" id='cuposEd'>
                            
                        </div>
                        <div class="form-group">
                            <label >Ingrese la fecha de publicacion:</label>
                            <input type="date" class="form-control" name="fechaPub">
                        </div>
                        <div class="form-group">
                            <select name="docentes" multiple id="docentes" >
                                
                            </select>
                        </div>
                        <input type="submit" class="btn btn-primary"></input>
                        
                    </form>
                </div>
                        
            </div>
        </div>
            <span id="result1"> </span>
            <br>
            <br>
        <div class="row">
            <div class="col-sm">
                <div class="alert alert-primary" role="alert">
                    <%
                        Persistencia p = Persistencia.getInstance();
                        p.inicializarBaseDeDatos();
                        FabricaLab fabrica = FabricaLab.getInstance();
                        ISistema ICU = fabrica.getISistema();  
                        String nombreEd = request.getParameter("nombreEd");
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        Date fechaIniDate = null;
                        Date fechaFinDate = null;
                        Date fechaPubDate = null;
                        String fechaIni = request.getParameter("fechaIni");
                        String fechaFin = request.getParameter("fechaFin");
                        String fechaPub = request.getParameter("fechaPub");
                        String llevaCupos = request.getParameter("Radio");
                        String nombreCurso = request.getParameter("cur");
                        int cupos = 0;
                        if(llevaCupos!=null && llevaCupos.equals("Si")){
                            cupos = Integer.parseInt(request.getParameter("cuposEd"));
                        }
                        else{ 
                            cupos = 10000;
                        }
                        if(fechaIni!=null){
                            fechaIniDate = formato.parse(fechaIni);
                        }
                        if(fechaFin!=null){
                            fechaFinDate = formato.parse(fechaFin);
                        }
                        if(fechaPub!=null){
                            fechaPubDate = formato.parse(fechaPub);
                        }
                        String[] doc = request.getParameterValues("docentes");
                        DTEdicion ed = new DTEdicion(nombreEd, fechaIniDate, fechaFinDate, cupos,fechaPubDate);
                        List lista = new ArrayList();
                        if(doc!=null){
                            lista = Arrays.asList(doc);
                        }
                        if(nombreEd!=null){
                            ICU.altaEdicionCurso(nombreCurso, ed, lista);
                        }
                        
                    %>
                </div>
            </div>
        </div>
       
        
        
    </body>
</html>

   <%--
                        Persistencia p = Persistencia.getInstance();
                        p.inicializarBaseDeDatos();
                        FabricaLab fabrica = FabricaLab.getInstance();
                        ISistema ICU = fabrica.getISistema();  
                        String inst = request.getParameter("inst");
                        if(inst!=null){
                         ArrayList<String> cursos = ICU.cursosInstituto(inst);
                         for(Object curso : cursos){
                            %>
                                <option ><%=curso%></option>
                            <%
                          }
                              
                        }
                        --%>

   <%--c:forEach items="${cursos}" var="cur" varStatus="loop">
                           <option>
                               ${cursos}
                           </option>
              </c:forEach --%>
   
   
                <%-- 
                        <script>
                            $(document).ready(function() {
                                $("#inst").on("change", function() {
                                    var inst = $("#inst").val();
                                    $.ajax({
                                       
                                        data: {inst: inst},
                                        method: "POST",
                                        success: function(data)
                                        {
                                            $("#cur").html(data);  
                                        }
                                    });
                                });
                            });
                            
                        </script>
       --%>