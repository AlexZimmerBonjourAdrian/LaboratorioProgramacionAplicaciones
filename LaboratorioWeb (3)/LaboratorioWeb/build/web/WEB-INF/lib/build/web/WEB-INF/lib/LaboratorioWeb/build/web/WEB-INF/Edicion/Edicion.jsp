<%-- 
    Document   : Edicion
    Created on : oct 9, 2020, 11:08:01 a.m.
    Author     : admin
--%>

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
        <title>JSP Page</title>
    </head>
    <body>
        
         <h1>Ingrese los datos:</h1>
        
        
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">  
                    <form action="Curso" method="post">          
                        <div class="form-group">  
                        <%-- taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                        <select id="inst" name="inst">
                         <c:forEach items="${institutos}" var="inst" varStatus="loop">
                           <option>
                               ${inst}
                           </option>
                         </c:forEach>
                        </select>
                        </div>
                        <%-- 
                            FabricaLab fabrica = FabricaLab.getInstance();
                            ISistema ICU = fabrica.getISistema();
                            String inst = request.getParameter("inst");
                            ArrayList<String> cursos = ICU.cursosInstituto(inst);
                        
                        %>
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
                        --%>
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
                            
                         

                           
                        %>
                    </div>
                </div>
            </div>
       
        
        
    </body>
</html>
