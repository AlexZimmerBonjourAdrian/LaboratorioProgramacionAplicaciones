<%-- 
    Document   : AgregarCursoProg
    Created on : Oct 17, 2020, 10:12:18 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>Agregar curso a programa</title>
    </head>
    <body>
        <h1>Agregar curso a programa</h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">                    
                    <form action="AgregarCursoProg" method="get">
                                <div class="form-group">
                                <p>Programas:</p>               
                                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="prog" name="prog">
                                        <c:forEach items="${programas}" var="prog" varStatus="loop">
                                            <option>
                                                ${prog}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">
                                <p>Cursos:</p>               
                                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="cur" name="cur">
                                        <c:forEach items="${cursos}" var="cur" varStatus="loop">
                                            <option>
                                                ${cur}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <input type="submit" class="btn btn-primary"></input> 
                            </form>
                </div>
            </div>
        </div>
    </body>
</html>
