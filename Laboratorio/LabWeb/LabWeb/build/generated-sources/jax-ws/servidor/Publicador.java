
package servidor;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Publicador", targetNamespace = "http://PRESENTACION/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Publicador {


    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "modificarDatosPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarDatosPrograma")
    @ResponseWrapper(localName = "modificarDatosProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarDatosProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/modificarDatosProgramaRequest", output = "http://PRESENTACION/Publicador/modificarDatosProgramaResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/modificarDatosPrograma/Fault/ParseException")
    })
    public void modificarDatosPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cursosInstituto", targetNamespace = "http://PRESENTACION/", className = "servidor.CursosInstituto")
    @ResponseWrapper(localName = "cursosInstitutoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CursosInstitutoResponse")
    @Action(input = "http://PRESENTACION/Publicador/cursosInstitutoRequest", output = "http://PRESENTACION/Publicador/cursosInstitutoResponse")
    public List<String> cursosInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "EdicionesCurso")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "EdicionesCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.EdicionesCurso")
    @ResponseWrapper(localName = "EdicionesCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.EdicionesCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/EdicionesCursoRequest", output = "http://PRESENTACION/Publicador/EdicionesCursoResponse")
    public List<String> edicionesCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarInstitutos", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarInstitutos")
    @ResponseWrapper(localName = "listarInstitutosResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarInstitutosResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarInstitutosRequest", output = "http://PRESENTACION/Publicador/listarInstitutosResponse")
    public List<String> listarInstitutos();

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCategorias", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarCategorias")
    @ResponseWrapper(localName = "listarCategoriasResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarCategoriasResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarCategoriasRequest", output = "http://PRESENTACION/Publicador/listarCategoriasResponse")
    public List<String> listarCategorias();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg4
     * @param arg1
     * @param arg0
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "crearPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.CrearPrograma")
    @ResponseWrapper(localName = "crearProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CrearProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/crearProgramaRequest", output = "http://PRESENTACION/Publicador/crearProgramaResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/crearPrograma/Fault/ParseException")
    })
    public void crearPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns servidor.DtCurso
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerCurso")
    @ResponseWrapper(localName = "obtenerCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/obtenerCursoRequest", output = "http://PRESENTACION/Publicador/obtenerCursoResponse")
    public DtCurso obtenerCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "altaInstituto", targetNamespace = "http://PRESENTACION/", className = "servidor.AltaInstituto")
    @ResponseWrapper(localName = "altaInstitutoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.AltaInstitutoResponse")
    @Action(input = "http://PRESENTACION/Publicador/altaInstitutoRequest", output = "http://PRESENTACION/Publicador/altaInstitutoResponse")
    public void altaInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns servidor.DtPrograma
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerPrograma")
    @ResponseWrapper(localName = "obtenerProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/obtenerProgramaRequest", output = "http://PRESENTACION/Publicador/obtenerProgramaResponse")
    public DtPrograma obtenerPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckCurso")
    @ResponseWrapper(localName = "checkCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/checkCursoRequest", output = "http://PRESENTACION/Publicador/checkCursoResponse")
    public boolean checkCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns servidor.DtUsuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuario", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerUsuario")
    @ResponseWrapper(localName = "obtenerUsuarioResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerUsuarioResponse")
    @Action(input = "http://PRESENTACION/Publicador/obtenerUsuarioRequest", output = "http://PRESENTACION/Publicador/obtenerUsuarioResponse")
    public DtUsuario obtenerUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chekusuario", targetNamespace = "http://PRESENTACION/", className = "servidor.Chekusuario")
    @ResponseWrapper(localName = "chekusuarioResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ChekusuarioResponse")
    @Action(input = "http://PRESENTACION/Publicador/chekusuarioRequest", output = "http://PRESENTACION/Publicador/chekusuarioResponse")
    public boolean chekusuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "ProgramasCursos")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProgramasCursos", targetNamespace = "http://PRESENTACION/", className = "servidor.ProgramasCursos")
    @ResponseWrapper(localName = "ProgramasCursosResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ProgramasCursosResponse")
    @Action(input = "http://PRESENTACION/Publicador/ProgramasCursosRequest", output = "http://PRESENTACION/Publicador/ProgramasCursosResponse")
    public List<String> programasCursos(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg10
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "registrarCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.RegistrarCurso")
    @ResponseWrapper(localName = "registrarCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.RegistrarCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/registrarCursoRequest", output = "http://PRESENTACION/Publicador/registrarCursoResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/registrarCurso/Fault/ParseException")
    })
    public void registrarCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        double arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        double arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        String arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        List<Object> arg9,
        @WebParam(name = "arg10", targetNamespace = "")
        List<Object> arg10)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckPrograma")
    @ResponseWrapper(localName = "checkProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/checkProgramaRequest", output = "http://PRESENTACION/Publicador/checkProgramaResponse")
    public boolean checkPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "cursosPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.CursosPrograma")
    @ResponseWrapper(localName = "cursosProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CursosProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/cursosProgramaRequest", output = "http://PRESENTACION/Publicador/cursosProgramaResponse")
    public List<String> cursosPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "altaEdicionCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.AltaEdicionCurso")
    @ResponseWrapper(localName = "altaEdicionCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.AltaEdicionCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/altaEdicionCursoRequest", output = "http://PRESENTACION/Publicador/altaEdicionCursoResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/altaEdicionCurso/Fault/ParseException")
    })
    public void altaEdicionCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        List<Object> arg7)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod(operationName = "ExisteRegistroInscripcionE")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ExisteRegistroInscripcionE", targetNamespace = "http://PRESENTACION/", className = "servidor.ExisteRegistroInscripcionE")
    @ResponseWrapper(localName = "ExisteRegistroInscripcionEResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ExisteRegistroInscripcionEResponse")
    @Action(input = "http://PRESENTACION/Publicador/ExisteRegistroInscripcionERequest", output = "http://PRESENTACION/Publicador/ExisteRegistroInscripcionEResponse")
    public boolean existeRegistroInscripcionE(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarNombreProgramas", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarNombreProgramas")
    @ResponseWrapper(localName = "listarNombreProgramasResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarNombreProgramasResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarNombreProgramasRequest", output = "http://PRESENTACION/Publicador/listarNombreProgramasResponse")
    public List<String> listarNombreProgramas();

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "crearInscripcionEstudiante", targetNamespace = "http://PRESENTACION/", className = "servidor.CrearInscripcionEstudiante")
    @ResponseWrapper(localName = "crearInscripcionEstudianteResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CrearInscripcionEstudianteResponse")
    @Action(input = "http://PRESENTACION/Publicador/crearInscripcionEstudianteRequest", output = "http://PRESENTACION/Publicador/crearInscripcionEstudianteResponse")
    public void crearInscripcionEstudiante(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarProgramasUsuario", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarProgramasUsuario")
    @ResponseWrapper(localName = "mostrarProgramasUsuarioResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarProgramasUsuarioResponse")
    @Action(input = "http://PRESENTACION/Publicador/mostrarProgramasUsuarioRequest", output = "http://PRESENTACION/Publicador/mostrarProgramasUsuarioResponse")
    public List<String> mostrarProgramasUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkincripcionPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckincripcionPrograma")
    @ResponseWrapper(localName = "checkincripcionProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CheckincripcionProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/checkincripcionProgramaRequest", output = "http://PRESENTACION/Publicador/checkincripcionProgramaResponse")
    public boolean checkincripcionPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "modificarDatosUsuario", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarDatosUsuario")
    @ResponseWrapper(localName = "modificarDatosUsuarioResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarDatosUsuarioResponse")
    @Action(input = "http://PRESENTACION/Publicador/modificarDatosUsuarioRequest", output = "http://PRESENTACION/Publicador/modificarDatosUsuarioResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/modificarDatosUsuario/Fault/ParseException")
    })
    public void modificarDatosUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3)
        throws ParseException_Exception
    ;

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "agregarCursoPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.AgregarCursoPrograma")
    @ResponseWrapper(localName = "agregarCursoProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.AgregarCursoProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/agregarCursoProgramaRequest", output = "http://PRESENTACION/Publicador/agregarCursoProgramaResponse")
    public void agregarCursoPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod(operationName = "InscripcionPrograma")
    @RequestWrapper(localName = "InscripcionPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.InscripcionPrograma")
    @ResponseWrapper(localName = "InscripcionProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.InscripcionProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/InscripcionProgramaRequest", output = "http://PRESENTACION/Publicador/InscripcionProgramaResponse")
    public void inscripcionPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns servidor.DtInstituto
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerInstitutoCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerInstitutoCurso")
    @ResponseWrapper(localName = "obtenerInstitutoCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerInstitutoCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/obtenerInstitutoCursoRequest", output = "http://PRESENTACION/Publicador/obtenerInstitutoCursoResponse")
    public DtInstituto obtenerInstitutoCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "chekuUsuarioEmail", targetNamespace = "http://PRESENTACION/", className = "servidor.ChekuUsuarioEmail")
    @ResponseWrapper(localName = "chekuUsuarioEmailResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ChekuUsuarioEmailResponse")
    @Action(input = "http://PRESENTACION/Publicador/chekuUsuarioEmailRequest", output = "http://PRESENTACION/Publicador/chekuUsuarioEmailResponse")
    public boolean chekuUsuarioEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarDocentesEdicion", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDocentesEdicion")
    @ResponseWrapper(localName = "listarDocentesEdicionResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDocentesEdicionResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarDocentesEdicionRequest", output = "http://PRESENTACION/Publicador/listarDocentesEdicionResponse")
    public List<String> listarDocentesEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns servidor.DtUsuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "obtenerUsuarioMail", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerUsuarioMail")
    @ResponseWrapper(localName = "obtenerUsuarioMailResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ObtenerUsuarioMailResponse")
    @Action(input = "http://PRESENTACION/Publicador/obtenerUsuarioMailRequest", output = "http://PRESENTACION/Publicador/obtenerUsuarioMailResponse")
    public DtUsuario obtenerUsuarioMail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns java.util.List<servidor.DtInscripcionE>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarDatosInscEdicion", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDatosInscEdicion")
    @ResponseWrapper(localName = "listarDatosInscEdicionResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDatosInscEdicionResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarDatosInscEdicionRequest", output = "http://PRESENTACION/Publicador/listarDatosInscEdicionResponse")
    public List<DtInscripcionE> listarDatosInscEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<servidor.DtInscripcionE>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosInscripEstudiante", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosInscripEstudiante")
    @ResponseWrapper(localName = "datosInscripEstudianteResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosInscripEstudianteResponse")
    @Action(input = "http://PRESENTACION/Publicador/datosInscripEstudianteRequest", output = "http://PRESENTACION/Publicador/datosInscripEstudianteResponse")
    public List<DtInscripcionE> datosInscripEstudiante(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<servidor.DatosEdicion>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarEdicionFULL", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarEdicionFULL")
    @ResponseWrapper(localName = "mostrarEdicionFULLResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarEdicionFULLResponse")
    @Action(input = "http://PRESENTACION/Publicador/mostrarEdicionFULLRequest", output = "http://PRESENTACION/Publicador/mostrarEdicionFULLResponse")
    public List<DatosEdicion> mostrarEdicionFULL(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarDocentesInstituto", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDocentesInstituto")
    @ResponseWrapper(localName = "listarDocentesInstitutoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarDocentesInstitutoResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarDocentesInstitutoRequest", output = "http://PRESENTACION/Publicador/listarDocentesInstitutoResponse")
    public List<String> listarDocentesInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "categoriasProgramas", targetNamespace = "http://PRESENTACION/", className = "servidor.CategoriasProgramas")
    @ResponseWrapper(localName = "categoriasProgramasResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.CategoriasProgramasResponse")
    @Action(input = "http://PRESENTACION/Publicador/categoriasProgramasRequest", output = "http://PRESENTACION/Publicador/categoriasProgramasResponse")
    public List<String> categoriasProgramas(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "modificarEstadoInscripcion", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarEstadoInscripcion")
    @ResponseWrapper(localName = "modificarEstadoInscripcionResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ModificarEstadoInscripcionResponse")
    @Action(input = "http://PRESENTACION/Publicador/modificarEstadoInscripcionRequest", output = "http://PRESENTACION/Publicador/modificarEstadoInscripcionResponse")
    public void modificarEstadoInscripcion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        EstadoInscripcion arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCursosCategoria", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarCursosCategoria")
    @ResponseWrapper(localName = "listarCursosCategoriaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ListarCursosCategoriaResponse")
    @Action(input = "http://PRESENTACION/Publicador/listarCursosCategoriaRequest", output = "http://PRESENTACION/Publicador/listarCursosCategoriaResponse")
    public List<String> listarCursosCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<java.lang.Object>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "mostrarCursos", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarCursos")
    @ResponseWrapper(localName = "mostrarCursosResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.MostrarCursosResponse")
    @Action(input = "http://PRESENTACION/Publicador/mostrarCursosRequest", output = "http://PRESENTACION/Publicador/mostrarCursosResponse")
    public List<Object> mostrarCursos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<servidor.DtCurso>
     */
    @WebMethod(operationName = "DTCursosPrograma")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "DTCursosPrograma", targetNamespace = "http://PRESENTACION/", className = "servidor.DTCursosPrograma")
    @ResponseWrapper(localName = "DTCursosProgramaResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.DTCursosProgramaResponse")
    @Action(input = "http://PRESENTACION/Publicador/DTCursosProgramaRequest", output = "http://PRESENTACION/Publicador/DTCursosProgramaResponse")
    public List<DtCurso> dtCursosPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg8
     * @throws ParseException_Exception
     */
    @WebMethod
    @RequestWrapper(localName = "altausuario", targetNamespace = "http://PRESENTACION/", className = "servidor.Altausuario")
    @ResponseWrapper(localName = "altausuarioResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.AltausuarioResponse")
    @Action(input = "http://PRESENTACION/Publicador/altausuarioRequest", output = "http://PRESENTACION/Publicador/altausuarioResponse", fault = {
        @FaultAction(className = ParseException_Exception.class, value = "http://PRESENTACION/Publicador/altausuario/Fault/ParseException")
    })
    public void altausuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        boolean arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        List<Object> arg8)
        throws ParseException_Exception
    ;

    /**
     * 
     * @return
     *     returns java.util.List<servidor.DtUsuario>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "consultaUsuarios", targetNamespace = "http://PRESENTACION/", className = "servidor.ConsultaUsuarios")
    @ResponseWrapper(localName = "consultaUsuariosResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ConsultaUsuariosResponse")
    @Action(input = "http://PRESENTACION/Publicador/consultaUsuariosRequest", output = "http://PRESENTACION/Publicador/consultaUsuariosResponse")
    public List<DtUsuario> consultaUsuarios();

    /**
     * 
     * @return
     *     returns java.util.List<servidor.DtPrograma>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosProgramas", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosProgramas")
    @ResponseWrapper(localName = "datosProgramasResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosProgramasResponse")
    @Action(input = "http://PRESENTACION/Publicador/datosProgramasRequest", output = "http://PRESENTACION/Publicador/datosProgramasResponse")
    public List<DtPrograma> datosProgramas();

    /**
     * 
     * @return
     *     returns java.util.List<servidor.DtCurso>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosCursos", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosCursos")
    @ResponseWrapper(localName = "datosCursosResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosCursosResponse")
    @Action(input = "http://PRESENTACION/Publicador/datosCursosRequest", output = "http://PRESENTACION/Publicador/datosCursosResponse")
    public List<DtCurso> datosCursos();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<java.lang.String>
     */
    @WebMethod(operationName = "ProgramasCurso")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "ProgramasCurso", targetNamespace = "http://PRESENTACION/", className = "servidor.ProgramasCurso")
    @ResponseWrapper(localName = "ProgramasCursoResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.ProgramasCursoResponse")
    @Action(input = "http://PRESENTACION/Publicador/ProgramasCursoRequest", output = "http://PRESENTACION/Publicador/ProgramasCursoResponse")
    public List<String> programasCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "esDocente", targetNamespace = "http://PRESENTACION/", className = "servidor.EsDocente")
    @ResponseWrapper(localName = "esDocenteResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.EsDocenteResponse")
    @Action(input = "http://PRESENTACION/Publicador/esDocenteRequest", output = "http://PRESENTACION/Publicador/esDocenteResponse")
    public boolean esDocente(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns servidor.DtEdicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "datosEdiciones", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosEdiciones")
    @ResponseWrapper(localName = "datosEdicionesResponse", targetNamespace = "http://PRESENTACION/", className = "servidor.DatosEdicionesResponse")
    @Action(input = "http://PRESENTACION/Publicador/datosEdicionesRequest", output = "http://PRESENTACION/Publicador/datosEdicionesResponse")
    public DtEdicion datosEdiciones(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}