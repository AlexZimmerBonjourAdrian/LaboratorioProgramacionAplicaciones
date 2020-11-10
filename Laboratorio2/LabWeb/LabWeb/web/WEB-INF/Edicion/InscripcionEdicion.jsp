<%-- 
    Document   : InscripcionEdicion
    Created on : Oct 16, 2020, 3:59:54 PM
    Author     : Surface
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page="/WEB-INF/Scripts/Pestana.jsp"/>
        <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        <jsp:include page="/WEB-INF/Scripts/cargarCursos.jsp"/>
        <jsp:include page="/WEB-INF/Scripts/cargarEdiciones.jsp"/>
        <jsp:include page="/WEB-INF/Scripts/cargarCursosCat.jsp"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.0/jquery.min.js"></script>
        <title>Inscripción a edición</title>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#inst').on("click", cargarCursos);  
            });
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#cat').on("click", cargarCursosCat);  
            });
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#cur').on("click", cargarEdiciones);  
            });
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $('#edi').on("click", function(){
                    var edi = $('#edi').val();
                    var cur = $('#cur').val();
                    $.ajax({
                        type:'POST',
                        data:{edi: edi, cur: cur},
                        url:'ediciondatos',
                        success:function(result){
                            console.log(result);
                            $('#nombre').html(result.nombre);
                            $('#fechaini').html(result.fechaini);
                            $('#fechafin').html(result.fechafin);
                            $('#cuposmax').html(result.cuposmax);
                            $('#fechapub').html(result.fechapub);
                            $('#doc').html(result.result1);
                            var msg = result.mensaje;
                            if(msg=="Ya esta inscripto"){
                                $('#res').css("display", "inline");
                                $('#res').html("Ya esta inscripto");
                                $('#boton').css("display", "none");
                            }
                            else{
                                $('#res').html("");
                                $('#boton').css("display", "inline");
                            }
                            $('#mensaje').html(result.mensaje);
                        }
                    });
                });  
            });
        </script>
    </head>
    <body class="left-menu">
        <div class="menu-wrapper">
            <jsp:include page="/WEB-INF/templates/panel.jsp"/>
        </div>
        <div id="wrapper">
            <div id="home" class="video-section js-height-full">
                <h1 class="titulo">Inscripción a edición de curso</h1>
                <div class="container mt-5">
                    <div class="row">
                        <div class="col-sm">
                            <form action="InscripcionEdicion" method="get" id="insc">
                                <div class="form-group">
                                    <p>Institutos:</p>               
                                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="inst" name="inst">
                                        <c:forEach items="${institutos}" var="inst" varStatus="loop">
                                            <option>
                                                ${inst}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>
                                <div class="form-group">  
                                    <p>Categoria:<p>
                                    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
                                    <select id="cat" name="cat" >
                                        <c:forEach items="${categorias}" var="cat" varStatus="loop">
                                            <option>
                                                ${cat}
                                            </option>
                                        </c:forEach>
                                    </select>
                                </div>     
                                <div class="form-group">  
                                    <p>Curso:</p>
                                    <select id="cur" name="cur">
                                    </select>
                                </div>
                                <div class="form-group">  
                                    <p>Edicion:</p>
                                    <select id="edi" name="edi">
                                    </select>
                                </div>
                                <div class="tab">
                                    <button class="tablinks" onclick="pestana(event, 'general')" id="defaultOpen" name="defaultOpen">General</button>
                                    <button class="tablinks" onclick="pestana(event, 'docentes')">Docentes</button>
                                </div>
                                <div id="general" class="tabcontent">
                                    <h3 class="titulo">Nombre:</h3><h3 id="nombre">&nbsp;&nbsp; </h3>
                                    <h3 class="titulo">Cupos:</h3><h3 id="cuposmax"> &nbsp;&nbsp;</h3>
                                    <h3 class="titulo">Fecha inicio:</h3><h3 id="fechaini">&nbsp;&nbsp; </h3>
                                    <h3 class="titulo">Fecha fin:</h3><h3 id="fechafin">&nbsp;&nbsp; </h3>
                                    <h3 class="titulo">Fecha de publicacion:</h3><h3 id="fechapub">&nbsp;&nbsp;</h3>
                                </div>
                                <div id="docentes" class="tabcontent">
                                    <div id="doc" name="doc">
                                        <a href="consultausuario?nick="></a>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <span style="color:red" id="res"></span>
                                </div>
                                <div class="form-group">
                                    <input type="submit" class="btn btn-primary" value="Inscribirse" form="insc" id="boton"></input>
                                    <a href="Home"><input type="button" class="btn btn-default" value="Cancelar"></a>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </body>
</html>
