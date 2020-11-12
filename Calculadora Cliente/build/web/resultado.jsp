<%-- 
    Document   : resultado
    Created on : 05-nov-2020, 16:19:56
    Author     : nico
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        

        <title>JSP Page</title>
    </head>
    <body>
        <% int resultado = (Integer) session.getAttribute("res");%>
        <h1>Resultado de la suma: <%=resultado%></h1>
    </body>
</html>
