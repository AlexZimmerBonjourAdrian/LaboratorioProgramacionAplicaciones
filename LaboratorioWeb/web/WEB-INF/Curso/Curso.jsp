<%-- 
    Document   : Curso
    Created on : oct 9, 2020, 12:04:22 a.m.
    Author     : admin
--%>

<%@page import="java.text.Format.Field"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="Datatypes.DTCurso"%>
<%@page import="LOGICA.ISistema"%>
<%@page import="LOGICA.FabricaLab"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Curso</title>
    </head>
    <body>
        
         <h1>Ingrese los datos:</h1>
        
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Curso" method="post">          
                        <div class="form-group">
                            <label >Escriba el nombre del curso:</label>
                            <input type="text" class="form-control" name="nomCur" placeholder="Nombre">
                        </div>
                         <div class="form-group">
                            <label >Escriba la descripcion del curso:</label>
                            <input type="text" class="form-control" name="desCur" placeholder="Descripcion">
                        </div>
                        <div class="form-group">
                            <label >Ingrese la duracion del curso:</label>
                            <input type="text" class="form-control" name="durCur" placeholder="Duracion">
                        </div>
                        <div class="form-group">
                            <label >Ingrese la cantidad de horas del curso:</label>
                            <input type="text" class="form-control" name="horasCur" placeholder="Horas">
                        </div>
                        <div class="form-group">
                            <label >Ingrese la cantidad de creditos del curso:</label>
                            <input type="text" class="form-control" name="credCur" placeholder="Creditos">
                        </div>
                        <div class="form-group">
                            <label >Ingrese la fecha de registro:</label>
                            <input type="date" class="form-control" name="fecha">
                        </div>
                        <div class="form-group">
                            <label >Ingrese la URL del curso:</label>
                            <input type="text" class="form-control" name="url">
                        </div>
                        <div class="form-group">
                           
                        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                        <select id="inst" name="inst">
                         <c:forEach items="${institutos}" var="inst" varStatus="loop">
                           <option>
                               ${inst}
                           </option>
                         </c:forEach>
                        </select>
                        </div>
                        <input type="submit" class="btn btn-primary"></input>
                        
                        
                    </form>
                </div>
                        
            </div>
        </div>
            <br>
            <br>
            <div class="row">
                <div class="col-sm">
                    <div class="alert alert-primary" role="alert">
                        <%
                            
                            FabricaLab fabrica = FabricaLab.getInstance();
                            ISistema ICU = fabrica.getISistema();
                            String nomCur=request.getParameter("nomCur");
                            String desCur=request.getParameter("desCur");
                            String durCur=request.getParameter("durCur");
                            String horasCur=request.getParameter("horasCur");
                            String credCur=request.getParameter("credCur");
                            String urlCur=request.getParameter("url");
                            String fecha = request.getParameter("fecha");
                            String inst = request.getParameter("inst");
                            out.print(inst);
                            Date fechaDate=null;
                            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                            if(fecha!=null){
                                fechaDate = formato.parse(fecha);
                            }
                            if(nomCur!=null){
                                DTCurso datoscurso = new DTCurso(nomCur,desCur,durCur,Double.parseDouble(horasCur),Double.parseDouble(credCur),fechaDate,urlCur);
                                ICU.registrarCurso(inst, datoscurso, null, null);
                            }
                            
                            

                           
                        %>
                    </div>
                </div>
            </div>
       
        
        
    </body>
</html>
