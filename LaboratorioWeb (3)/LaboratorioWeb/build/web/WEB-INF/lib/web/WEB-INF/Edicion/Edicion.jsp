<%-- 
    Document   : Edicion
    Created on : oct 9, 2020, 11:08:01 a.m.
    Author     : admin
--%>

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
                          $('#cur').html(result);
                      }
                  });
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
                    <form action="Edicion" method="post">          
                        <div class="form-group">  
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
                        <select id="cur" name="cur">
                         <c:forEach items="${cursos}" var="cur" varStatus="loop">
                           <option>
                               ${cur}
                           </option>
                         </c:forEach>   
                        </select>
                        </div>
                        
                        <input type="button" value = "Hello" class="btn btn-primary"></input>
                        
                        
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