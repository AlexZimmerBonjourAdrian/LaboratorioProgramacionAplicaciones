<%-- 
    Document   : InscripcionProg
    Created on : Oct 18, 2020, 5:12:29 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Inscripción a programa</title>
        <script type="text/javascript">
            $(document).ready(function(){
              $('#prog').on("click", function(){
                  var prog = $('#prog').val();
                  //var cur = $('#cur').val();
                  //var inst = $('#inst').val();
                  //console.log("El instituto seleccionado es: " + cur);
                  $.ajax({
                      type:'POST',
                      data:{prog: prog},
                      url:'InscripcionProg',
                      success:function(result){
                        console.log(result);
                        $('#mensaje').html(result.mensaje);
                      }
                  });
                  
              });  
            });
            
        </script>
    </head>
    <body>
        <h1>Inscripción a programa de formación</h1>
        <div class="container mt-5">
            <div class="row">
                <div class="col-sm">
                    <form action="InscripcionProg" method="get">
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
                                <p>Mensaje:</p> <h2 name="mensaje" id="mensaje"></h2>
                            </div>            
                            <input type="submit" class="btn btn-primary" value="Inscribirse"></input>
                            <a href="index_estudiante.jsp"><input type="button" class="btn btn-primary" value="Cancelar"></a>
                    </form>
                 </div>
            </div>
        </div>
    </body>
</html>
