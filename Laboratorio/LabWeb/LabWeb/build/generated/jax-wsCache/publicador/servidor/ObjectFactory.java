
package servidor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the servidor package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarNombreProgramasResponse_QNAME = new QName("http://PRESENTACION/", "listarNombreProgramasResponse");
    private final static QName _ExisteRegistroInscripcionEResponse_QNAME = new QName("http://PRESENTACION/", "ExisteRegistroInscripcionEResponse");
    private final static QName _ParseException_QNAME = new QName("http://PRESENTACION/", "ParseException");
    private final static QName _Chekusuario_QNAME = new QName("http://PRESENTACION/", "chekusuario");
    private final static QName _CrearPrograma_QNAME = new QName("http://PRESENTACION/", "crearPrograma");
    private final static QName _CrearProgramaResponse_QNAME = new QName("http://PRESENTACION/", "crearProgramaResponse");
    private final static QName _AltaEdicionCurso_QNAME = new QName("http://PRESENTACION/", "altaEdicionCurso");
    private final static QName _MostrarProgramasUsuarioResponse_QNAME = new QName("http://PRESENTACION/", "mostrarProgramasUsuarioResponse");
    private final static QName _ListarCursosCategoria_QNAME = new QName("http://PRESENTACION/", "listarCursosCategoria");
    private final static QName _MostrarProgramasUsuario_QNAME = new QName("http://PRESENTACION/", "mostrarProgramasUsuario");
    private final static QName _ObtenerPrograma_QNAME = new QName("http://PRESENTACION/", "obtenerPrograma");
    private final static QName _ObtenerUsuarioMail_QNAME = new QName("http://PRESENTACION/", "obtenerUsuarioMail");
    private final static QName _CheckCurso_QNAME = new QName("http://PRESENTACION/", "checkCurso");
    private final static QName _MostrarCursosResponse_QNAME = new QName("http://PRESENTACION/", "mostrarCursosResponse");
    private final static QName _ProgramasCursoResponse_QNAME = new QName("http://PRESENTACION/", "ProgramasCursoResponse");
    private final static QName _AgregarCursoPrograma_QNAME = new QName("http://PRESENTACION/", "agregarCursoPrograma");
    private final static QName _ConsultaUsuarios_QNAME = new QName("http://PRESENTACION/", "consultaUsuarios");
    private final static QName _DatosInscripEstudianteResponse_QNAME = new QName("http://PRESENTACION/", "datosInscripEstudianteResponse");
    private final static QName _ObtenerInstitutoCursoResponse_QNAME = new QName("http://PRESENTACION/", "obtenerInstitutoCursoResponse");
    private final static QName _CrearInscripcionEstudianteResponse_QNAME = new QName("http://PRESENTACION/", "crearInscripcionEstudianteResponse");
    private final static QName _ExisteRegistroInscripcionE_QNAME = new QName("http://PRESENTACION/", "ExisteRegistroInscripcionE");
    private final static QName _EsDocente_QNAME = new QName("http://PRESENTACION/", "esDocente");
    private final static QName _ChekuUsuarioEmailResponse_QNAME = new QName("http://PRESENTACION/", "chekuUsuarioEmailResponse");
    private final static QName _DatosCursosResponse_QNAME = new QName("http://PRESENTACION/", "datosCursosResponse");
    private final static QName _ListarDocentesInstituto_QNAME = new QName("http://PRESENTACION/", "listarDocentesInstituto");
    private final static QName _CheckProgramaResponse_QNAME = new QName("http://PRESENTACION/", "checkProgramaResponse");
    private final static QName _Altausuario_QNAME = new QName("http://PRESENTACION/", "altausuario");
    private final static QName _ModificarDatosUsuarioResponse_QNAME = new QName("http://PRESENTACION/", "modificarDatosUsuarioResponse");
    private final static QName _ObtenerUsuarioResponse_QNAME = new QName("http://PRESENTACION/", "obtenerUsuarioResponse");
    private final static QName _InscripcionProgramaResponse_QNAME = new QName("http://PRESENTACION/", "InscripcionProgramaResponse");
    private final static QName _ChekuUsuarioEmail_QNAME = new QName("http://PRESENTACION/", "chekuUsuarioEmail");
    private final static QName _ModificarEstadoInscripcion_QNAME = new QName("http://PRESENTACION/", "modificarEstadoInscripcion");
    private final static QName _ProgramasCursosResponse_QNAME = new QName("http://PRESENTACION/", "ProgramasCursosResponse");
    private final static QName _ConsultaUsuariosResponse_QNAME = new QName("http://PRESENTACION/", "consultaUsuariosResponse");
    private final static QName _AltaEdicionCursoResponse_QNAME = new QName("http://PRESENTACION/", "altaEdicionCursoResponse");
    private final static QName _ListarCategoriasResponse_QNAME = new QName("http://PRESENTACION/", "listarCategoriasResponse");
    private final static QName _ListarDocentesEdicion_QNAME = new QName("http://PRESENTACION/", "listarDocentesEdicion");
    private final static QName _ModificarDatosUsuario_QNAME = new QName("http://PRESENTACION/", "modificarDatosUsuario");
    private final static QName _DatosEdiciones_QNAME = new QName("http://PRESENTACION/", "datosEdiciones");
    private final static QName _DTCursosPrograma_QNAME = new QName("http://PRESENTACION/", "DTCursosPrograma");
    private final static QName _ObtenerUsuarioMailResponse_QNAME = new QName("http://PRESENTACION/", "obtenerUsuarioMailResponse");
    private final static QName _CursosProgramaResponse_QNAME = new QName("http://PRESENTACION/", "cursosProgramaResponse");
    private final static QName _CheckPrograma_QNAME = new QName("http://PRESENTACION/", "checkPrograma");
    private final static QName _DatosCursos_QNAME = new QName("http://PRESENTACION/", "datosCursos");
    private final static QName _ObtenerInstitutoCurso_QNAME = new QName("http://PRESENTACION/", "obtenerInstitutoCurso");
    private final static QName _CategoriasProgramas_QNAME = new QName("http://PRESENTACION/", "categoriasProgramas");
    private final static QName _CheckCursoResponse_QNAME = new QName("http://PRESENTACION/", "checkCursoResponse");
    private final static QName _RegistrarCursoResponse_QNAME = new QName("http://PRESENTACION/", "registrarCursoResponse");
    private final static QName _CrearInscripcionEstudiante_QNAME = new QName("http://PRESENTACION/", "crearInscripcionEstudiante");
    private final static QName _AgregarCursoProgramaResponse_QNAME = new QName("http://PRESENTACION/", "agregarCursoProgramaResponse");
    private final static QName _EsDocenteResponse_QNAME = new QName("http://PRESENTACION/", "esDocenteResponse");
    private final static QName _ObtenerUsuario_QNAME = new QName("http://PRESENTACION/", "obtenerUsuario");
    private final static QName _EdicionesCursoResponse_QNAME = new QName("http://PRESENTACION/", "EdicionesCursoResponse");
    private final static QName _ModificarEstadoInscripcionResponse_QNAME = new QName("http://PRESENTACION/", "modificarEstadoInscripcionResponse");
    private final static QName _DatosInscripEstudiante_QNAME = new QName("http://PRESENTACION/", "datosInscripEstudiante");
    private final static QName _ListarDatosInscEdicionResponse_QNAME = new QName("http://PRESENTACION/", "listarDatosInscEdicionResponse");
    private final static QName _ProgramasCurso_QNAME = new QName("http://PRESENTACION/", "ProgramasCurso");
    private final static QName _ObtenerCursoResponse_QNAME = new QName("http://PRESENTACION/", "obtenerCursoResponse");
    private final static QName _ListarNombreProgramas_QNAME = new QName("http://PRESENTACION/", "listarNombreProgramas");
    private final static QName _ListarCursosCategoriaResponse_QNAME = new QName("http://PRESENTACION/", "listarCursosCategoriaResponse");
    private final static QName _CursosInstituto_QNAME = new QName("http://PRESENTACION/", "cursosInstituto");
    private final static QName _ListarInstitutosResponse_QNAME = new QName("http://PRESENTACION/", "listarInstitutosResponse");
    private final static QName _ProgramasCursos_QNAME = new QName("http://PRESENTACION/", "ProgramasCursos");
    private final static QName _ListarInstitutos_QNAME = new QName("http://PRESENTACION/", "listarInstitutos");
    private final static QName _ObtenerCurso_QNAME = new QName("http://PRESENTACION/", "obtenerCurso");
    private final static QName _MostrarEdicionFULLResponse_QNAME = new QName("http://PRESENTACION/", "mostrarEdicionFULLResponse");
    private final static QName _AltaInstitutoResponse_QNAME = new QName("http://PRESENTACION/", "altaInstitutoResponse");
    private final static QName _MostrarEdicionFULL_QNAME = new QName("http://PRESENTACION/", "mostrarEdicionFULL");
    private final static QName _DTCursosProgramaResponse_QNAME = new QName("http://PRESENTACION/", "DTCursosProgramaResponse");
    private final static QName _DatosProgramas_QNAME = new QName("http://PRESENTACION/", "datosProgramas");
    private final static QName _DatosProgramasResponse_QNAME = new QName("http://PRESENTACION/", "datosProgramasResponse");
    private final static QName _CategoriasProgramasResponse_QNAME = new QName("http://PRESENTACION/", "categoriasProgramasResponse");
    private final static QName _ModificarDatosProgramaResponse_QNAME = new QName("http://PRESENTACION/", "modificarDatosProgramaResponse");
    private final static QName _EdicionesCurso_QNAME = new QName("http://PRESENTACION/", "EdicionesCurso");
    private final static QName _CheckincripcionPrograma_QNAME = new QName("http://PRESENTACION/", "checkincripcionPrograma");
    private final static QName _ChekusuarioResponse_QNAME = new QName("http://PRESENTACION/", "chekusuarioResponse");
    private final static QName _CursosPrograma_QNAME = new QName("http://PRESENTACION/", "cursosPrograma");
    private final static QName _ListarDatosInscEdicion_QNAME = new QName("http://PRESENTACION/", "listarDatosInscEdicion");
    private final static QName _MostrarCursos_QNAME = new QName("http://PRESENTACION/", "mostrarCursos");
    private final static QName _AltausuarioResponse_QNAME = new QName("http://PRESENTACION/", "altausuarioResponse");
    private final static QName _CursosInstitutoResponse_QNAME = new QName("http://PRESENTACION/", "cursosInstitutoResponse");
    private final static QName _ModificarDatosPrograma_QNAME = new QName("http://PRESENTACION/", "modificarDatosPrograma");
    private final static QName _InscripcionPrograma_QNAME = new QName("http://PRESENTACION/", "InscripcionPrograma");
    private final static QName _ListarDocentesEdicionResponse_QNAME = new QName("http://PRESENTACION/", "listarDocentesEdicionResponse");
    private final static QName _ObtenerProgramaResponse_QNAME = new QName("http://PRESENTACION/", "obtenerProgramaResponse");
    private final static QName _AltaInstituto_QNAME = new QName("http://PRESENTACION/", "altaInstituto");
    private final static QName _CheckincripcionProgramaResponse_QNAME = new QName("http://PRESENTACION/", "checkincripcionProgramaResponse");
    private final static QName _DatosEdicionesResponse_QNAME = new QName("http://PRESENTACION/", "datosEdicionesResponse");
    private final static QName _ListarDocentesInstitutoResponse_QNAME = new QName("http://PRESENTACION/", "listarDocentesInstitutoResponse");
    private final static QName _ListarCategorias_QNAME = new QName("http://PRESENTACION/", "listarCategorias");
    private final static QName _RegistrarCurso_QNAME = new QName("http://PRESENTACION/", "registrarCurso");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: servidor
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DtEdicion }
     * 
     */
    public DtEdicion createDtEdicion() {
        return new DtEdicion();
    }

    /**
     * Create an instance of {@link DtEdicion.Docentes }
     * 
     */
    public DtEdicion.Docentes createDtEdicionDocentes() {
        return new DtEdicion.Docentes();
    }

    /**
     * Create an instance of {@link RegistrarCurso }
     * 
     */
    public RegistrarCurso createRegistrarCurso() {
        return new RegistrarCurso();
    }

    /**
     * Create an instance of {@link ListarCategorias }
     * 
     */
    public ListarCategorias createListarCategorias() {
        return new ListarCategorias();
    }

    /**
     * Create an instance of {@link ListarDocentesInstitutoResponse }
     * 
     */
    public ListarDocentesInstitutoResponse createListarDocentesInstitutoResponse() {
        return new ListarDocentesInstitutoResponse();
    }

    /**
     * Create an instance of {@link AltaInstituto }
     * 
     */
    public AltaInstituto createAltaInstituto() {
        return new AltaInstituto();
    }

    /**
     * Create an instance of {@link CheckincripcionProgramaResponse }
     * 
     */
    public CheckincripcionProgramaResponse createCheckincripcionProgramaResponse() {
        return new CheckincripcionProgramaResponse();
    }

    /**
     * Create an instance of {@link DatosEdicionesResponse }
     * 
     */
    public DatosEdicionesResponse createDatosEdicionesResponse() {
        return new DatosEdicionesResponse();
    }

    /**
     * Create an instance of {@link ObtenerProgramaResponse }
     * 
     */
    public ObtenerProgramaResponse createObtenerProgramaResponse() {
        return new ObtenerProgramaResponse();
    }

    /**
     * Create an instance of {@link InscripcionPrograma }
     * 
     */
    public InscripcionPrograma createInscripcionPrograma() {
        return new InscripcionPrograma();
    }

    /**
     * Create an instance of {@link ListarDocentesEdicionResponse }
     * 
     */
    public ListarDocentesEdicionResponse createListarDocentesEdicionResponse() {
        return new ListarDocentesEdicionResponse();
    }

    /**
     * Create an instance of {@link AltausuarioResponse }
     * 
     */
    public AltausuarioResponse createAltausuarioResponse() {
        return new AltausuarioResponse();
    }

    /**
     * Create an instance of {@link CursosInstitutoResponse }
     * 
     */
    public CursosInstitutoResponse createCursosInstitutoResponse() {
        return new CursosInstitutoResponse();
    }

    /**
     * Create an instance of {@link ModificarDatosPrograma }
     * 
     */
    public ModificarDatosPrograma createModificarDatosPrograma() {
        return new ModificarDatosPrograma();
    }

    /**
     * Create an instance of {@link EdicionesCurso }
     * 
     */
    public EdicionesCurso createEdicionesCurso() {
        return new EdicionesCurso();
    }

    /**
     * Create an instance of {@link CheckincripcionPrograma }
     * 
     */
    public CheckincripcionPrograma createCheckincripcionPrograma() {
        return new CheckincripcionPrograma();
    }

    /**
     * Create an instance of {@link ChekusuarioResponse }
     * 
     */
    public ChekusuarioResponse createChekusuarioResponse() {
        return new ChekusuarioResponse();
    }

    /**
     * Create an instance of {@link CursosPrograma }
     * 
     */
    public CursosPrograma createCursosPrograma() {
        return new CursosPrograma();
    }

    /**
     * Create an instance of {@link ListarDatosInscEdicion }
     * 
     */
    public ListarDatosInscEdicion createListarDatosInscEdicion() {
        return new ListarDatosInscEdicion();
    }

    /**
     * Create an instance of {@link MostrarCursos }
     * 
     */
    public MostrarCursos createMostrarCursos() {
        return new MostrarCursos();
    }

    /**
     * Create an instance of {@link DatosProgramas }
     * 
     */
    public DatosProgramas createDatosProgramas() {
        return new DatosProgramas();
    }

    /**
     * Create an instance of {@link DatosProgramasResponse }
     * 
     */
    public DatosProgramasResponse createDatosProgramasResponse() {
        return new DatosProgramasResponse();
    }

    /**
     * Create an instance of {@link CategoriasProgramasResponse }
     * 
     */
    public CategoriasProgramasResponse createCategoriasProgramasResponse() {
        return new CategoriasProgramasResponse();
    }

    /**
     * Create an instance of {@link ModificarDatosProgramaResponse }
     * 
     */
    public ModificarDatosProgramaResponse createModificarDatosProgramaResponse() {
        return new ModificarDatosProgramaResponse();
    }

    /**
     * Create an instance of {@link DTCursosProgramaResponse }
     * 
     */
    public DTCursosProgramaResponse createDTCursosProgramaResponse() {
        return new DTCursosProgramaResponse();
    }

    /**
     * Create an instance of {@link MostrarEdicionFULLResponse }
     * 
     */
    public MostrarEdicionFULLResponse createMostrarEdicionFULLResponse() {
        return new MostrarEdicionFULLResponse();
    }

    /**
     * Create an instance of {@link AltaInstitutoResponse }
     * 
     */
    public AltaInstitutoResponse createAltaInstitutoResponse() {
        return new AltaInstitutoResponse();
    }

    /**
     * Create an instance of {@link MostrarEdicionFULL }
     * 
     */
    public MostrarEdicionFULL createMostrarEdicionFULL() {
        return new MostrarEdicionFULL();
    }

    /**
     * Create an instance of {@link ObtenerCurso }
     * 
     */
    public ObtenerCurso createObtenerCurso() {
        return new ObtenerCurso();
    }

    /**
     * Create an instance of {@link ListarInstitutosResponse }
     * 
     */
    public ListarInstitutosResponse createListarInstitutosResponse() {
        return new ListarInstitutosResponse();
    }

    /**
     * Create an instance of {@link ListarInstitutos }
     * 
     */
    public ListarInstitutos createListarInstitutos() {
        return new ListarInstitutos();
    }

    /**
     * Create an instance of {@link ProgramasCursos }
     * 
     */
    public ProgramasCursos createProgramasCursos() {
        return new ProgramasCursos();
    }

    /**
     * Create an instance of {@link ListarCursosCategoriaResponse }
     * 
     */
    public ListarCursosCategoriaResponse createListarCursosCategoriaResponse() {
        return new ListarCursosCategoriaResponse();
    }

    /**
     * Create an instance of {@link ListarNombreProgramas }
     * 
     */
    public ListarNombreProgramas createListarNombreProgramas() {
        return new ListarNombreProgramas();
    }

    /**
     * Create an instance of {@link CursosInstituto }
     * 
     */
    public CursosInstituto createCursosInstituto() {
        return new CursosInstituto();
    }

    /**
     * Create an instance of {@link ListarDatosInscEdicionResponse }
     * 
     */
    public ListarDatosInscEdicionResponse createListarDatosInscEdicionResponse() {
        return new ListarDatosInscEdicionResponse();
    }

    /**
     * Create an instance of {@link ObtenerCursoResponse }
     * 
     */
    public ObtenerCursoResponse createObtenerCursoResponse() {
        return new ObtenerCursoResponse();
    }

    /**
     * Create an instance of {@link ProgramasCurso }
     * 
     */
    public ProgramasCurso createProgramasCurso() {
        return new ProgramasCurso();
    }

    /**
     * Create an instance of {@link DatosInscripEstudiante }
     * 
     */
    public DatosInscripEstudiante createDatosInscripEstudiante() {
        return new DatosInscripEstudiante();
    }

    /**
     * Create an instance of {@link AgregarCursoProgramaResponse }
     * 
     */
    public AgregarCursoProgramaResponse createAgregarCursoProgramaResponse() {
        return new AgregarCursoProgramaResponse();
    }

    /**
     * Create an instance of {@link EsDocenteResponse }
     * 
     */
    public EsDocenteResponse createEsDocenteResponse() {
        return new EsDocenteResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuario }
     * 
     */
    public ObtenerUsuario createObtenerUsuario() {
        return new ObtenerUsuario();
    }

    /**
     * Create an instance of {@link ModificarEstadoInscripcionResponse }
     * 
     */
    public ModificarEstadoInscripcionResponse createModificarEstadoInscripcionResponse() {
        return new ModificarEstadoInscripcionResponse();
    }

    /**
     * Create an instance of {@link EdicionesCursoResponse }
     * 
     */
    public EdicionesCursoResponse createEdicionesCursoResponse() {
        return new EdicionesCursoResponse();
    }

    /**
     * Create an instance of {@link CrearInscripcionEstudiante }
     * 
     */
    public CrearInscripcionEstudiante createCrearInscripcionEstudiante() {
        return new CrearInscripcionEstudiante();
    }

    /**
     * Create an instance of {@link RegistrarCursoResponse }
     * 
     */
    public RegistrarCursoResponse createRegistrarCursoResponse() {
        return new RegistrarCursoResponse();
    }

    /**
     * Create an instance of {@link CheckCursoResponse }
     * 
     */
    public CheckCursoResponse createCheckCursoResponse() {
        return new CheckCursoResponse();
    }

    /**
     * Create an instance of {@link CheckPrograma }
     * 
     */
    public CheckPrograma createCheckPrograma() {
        return new CheckPrograma();
    }

    /**
     * Create an instance of {@link DatosCursos }
     * 
     */
    public DatosCursos createDatosCursos() {
        return new DatosCursos();
    }

    /**
     * Create an instance of {@link ObtenerInstitutoCurso }
     * 
     */
    public ObtenerInstitutoCurso createObtenerInstitutoCurso() {
        return new ObtenerInstitutoCurso();
    }

    /**
     * Create an instance of {@link CategoriasProgramas }
     * 
     */
    public CategoriasProgramas createCategoriasProgramas() {
        return new CategoriasProgramas();
    }

    /**
     * Create an instance of {@link CursosProgramaResponse }
     * 
     */
    public CursosProgramaResponse createCursosProgramaResponse() {
        return new CursosProgramaResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioMailResponse }
     * 
     */
    public ObtenerUsuarioMailResponse createObtenerUsuarioMailResponse() {
        return new ObtenerUsuarioMailResponse();
    }

    /**
     * Create an instance of {@link DTCursosPrograma }
     * 
     */
    public DTCursosPrograma createDTCursosPrograma() {
        return new DTCursosPrograma();
    }

    /**
     * Create an instance of {@link DatosEdiciones }
     * 
     */
    public DatosEdiciones createDatosEdiciones() {
        return new DatosEdiciones();
    }

    /**
     * Create an instance of {@link AltaEdicionCursoResponse }
     * 
     */
    public AltaEdicionCursoResponse createAltaEdicionCursoResponse() {
        return new AltaEdicionCursoResponse();
    }

    /**
     * Create an instance of {@link ListarCategoriasResponse }
     * 
     */
    public ListarCategoriasResponse createListarCategoriasResponse() {
        return new ListarCategoriasResponse();
    }

    /**
     * Create an instance of {@link ListarDocentesEdicion }
     * 
     */
    public ListarDocentesEdicion createListarDocentesEdicion() {
        return new ListarDocentesEdicion();
    }

    /**
     * Create an instance of {@link ConsultaUsuariosResponse }
     * 
     */
    public ConsultaUsuariosResponse createConsultaUsuariosResponse() {
        return new ConsultaUsuariosResponse();
    }

    /**
     * Create an instance of {@link ModificarDatosUsuario }
     * 
     */
    public ModificarDatosUsuario createModificarDatosUsuario() {
        return new ModificarDatosUsuario();
    }

    /**
     * Create an instance of {@link InscripcionProgramaResponse }
     * 
     */
    public InscripcionProgramaResponse createInscripcionProgramaResponse() {
        return new InscripcionProgramaResponse();
    }

    /**
     * Create an instance of {@link ChekuUsuarioEmail }
     * 
     */
    public ChekuUsuarioEmail createChekuUsuarioEmail() {
        return new ChekuUsuarioEmail();
    }

    /**
     * Create an instance of {@link ModificarEstadoInscripcion }
     * 
     */
    public ModificarEstadoInscripcion createModificarEstadoInscripcion() {
        return new ModificarEstadoInscripcion();
    }

    /**
     * Create an instance of {@link ProgramasCursosResponse }
     * 
     */
    public ProgramasCursosResponse createProgramasCursosResponse() {
        return new ProgramasCursosResponse();
    }

    /**
     * Create an instance of {@link DatosCursosResponse }
     * 
     */
    public DatosCursosResponse createDatosCursosResponse() {
        return new DatosCursosResponse();
    }

    /**
     * Create an instance of {@link ListarDocentesInstituto }
     * 
     */
    public ListarDocentesInstituto createListarDocentesInstituto() {
        return new ListarDocentesInstituto();
    }

    /**
     * Create an instance of {@link Altausuario }
     * 
     */
    public Altausuario createAltausuario() {
        return new Altausuario();
    }

    /**
     * Create an instance of {@link ModificarDatosUsuarioResponse }
     * 
     */
    public ModificarDatosUsuarioResponse createModificarDatosUsuarioResponse() {
        return new ModificarDatosUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioResponse }
     * 
     */
    public ObtenerUsuarioResponse createObtenerUsuarioResponse() {
        return new ObtenerUsuarioResponse();
    }

    /**
     * Create an instance of {@link CheckProgramaResponse }
     * 
     */
    public CheckProgramaResponse createCheckProgramaResponse() {
        return new CheckProgramaResponse();
    }

    /**
     * Create an instance of {@link ExisteRegistroInscripcionE }
     * 
     */
    public ExisteRegistroInscripcionE createExisteRegistroInscripcionE() {
        return new ExisteRegistroInscripcionE();
    }

    /**
     * Create an instance of {@link CrearInscripcionEstudianteResponse }
     * 
     */
    public CrearInscripcionEstudianteResponse createCrearInscripcionEstudianteResponse() {
        return new CrearInscripcionEstudianteResponse();
    }

    /**
     * Create an instance of {@link ChekuUsuarioEmailResponse }
     * 
     */
    public ChekuUsuarioEmailResponse createChekuUsuarioEmailResponse() {
        return new ChekuUsuarioEmailResponse();
    }

    /**
     * Create an instance of {@link EsDocente }
     * 
     */
    public EsDocente createEsDocente() {
        return new EsDocente();
    }

    /**
     * Create an instance of {@link DatosInscripEstudianteResponse }
     * 
     */
    public DatosInscripEstudianteResponse createDatosInscripEstudianteResponse() {
        return new DatosInscripEstudianteResponse();
    }

    /**
     * Create an instance of {@link ObtenerInstitutoCursoResponse }
     * 
     */
    public ObtenerInstitutoCursoResponse createObtenerInstitutoCursoResponse() {
        return new ObtenerInstitutoCursoResponse();
    }

    /**
     * Create an instance of {@link ConsultaUsuarios }
     * 
     */
    public ConsultaUsuarios createConsultaUsuarios() {
        return new ConsultaUsuarios();
    }

    /**
     * Create an instance of {@link ProgramasCursoResponse }
     * 
     */
    public ProgramasCursoResponse createProgramasCursoResponse() {
        return new ProgramasCursoResponse();
    }

    /**
     * Create an instance of {@link AgregarCursoPrograma }
     * 
     */
    public AgregarCursoPrograma createAgregarCursoPrograma() {
        return new AgregarCursoPrograma();
    }

    /**
     * Create an instance of {@link CheckCurso }
     * 
     */
    public CheckCurso createCheckCurso() {
        return new CheckCurso();
    }

    /**
     * Create an instance of {@link MostrarCursosResponse }
     * 
     */
    public MostrarCursosResponse createMostrarCursosResponse() {
        return new MostrarCursosResponse();
    }

    /**
     * Create an instance of {@link ObtenerUsuarioMail }
     * 
     */
    public ObtenerUsuarioMail createObtenerUsuarioMail() {
        return new ObtenerUsuarioMail();
    }

    /**
     * Create an instance of {@link ListarCursosCategoria }
     * 
     */
    public ListarCursosCategoria createListarCursosCategoria() {
        return new ListarCursosCategoria();
    }

    /**
     * Create an instance of {@link MostrarProgramasUsuario }
     * 
     */
    public MostrarProgramasUsuario createMostrarProgramasUsuario() {
        return new MostrarProgramasUsuario();
    }

    /**
     * Create an instance of {@link MostrarProgramasUsuarioResponse }
     * 
     */
    public MostrarProgramasUsuarioResponse createMostrarProgramasUsuarioResponse() {
        return new MostrarProgramasUsuarioResponse();
    }

    /**
     * Create an instance of {@link ObtenerPrograma }
     * 
     */
    public ObtenerPrograma createObtenerPrograma() {
        return new ObtenerPrograma();
    }

    /**
     * Create an instance of {@link CrearProgramaResponse }
     * 
     */
    public CrearProgramaResponse createCrearProgramaResponse() {
        return new CrearProgramaResponse();
    }

    /**
     * Create an instance of {@link AltaEdicionCurso }
     * 
     */
    public AltaEdicionCurso createAltaEdicionCurso() {
        return new AltaEdicionCurso();
    }

    /**
     * Create an instance of {@link Chekusuario }
     * 
     */
    public Chekusuario createChekusuario() {
        return new Chekusuario();
    }

    /**
     * Create an instance of {@link CrearPrograma }
     * 
     */
    public CrearPrograma createCrearPrograma() {
        return new CrearPrograma();
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link ListarNombreProgramasResponse }
     * 
     */
    public ListarNombreProgramasResponse createListarNombreProgramasResponse() {
        return new ListarNombreProgramasResponse();
    }

    /**
     * Create an instance of {@link ExisteRegistroInscripcionEResponse }
     * 
     */
    public ExisteRegistroInscripcionEResponse createExisteRegistroInscripcionEResponse() {
        return new ExisteRegistroInscripcionEResponse();
    }

    /**
     * Create an instance of {@link DtCurso }
     * 
     */
    public DtCurso createDtCurso() {
        return new DtCurso();
    }

    /**
     * Create an instance of {@link DtInstituto }
     * 
     */
    public DtInstituto createDtInstituto() {
        return new DtInstituto();
    }

    /**
     * Create an instance of {@link DtInscripcionE }
     * 
     */
    public DtInscripcionE createDtInscripcionE() {
        return new DtInscripcionE();
    }

    /**
     * Create an instance of {@link DtUsuario }
     * 
     */
    public DtUsuario createDtUsuario() {
        return new DtUsuario();
    }

    /**
     * Create an instance of {@link DtPrograma }
     * 
     */
    public DtPrograma createDtPrograma() {
        return new DtPrograma();
    }

    /**
     * Create an instance of {@link DatosEdicion }
     * 
     */
    public DatosEdicion createDatosEdicion() {
        return new DatosEdicion();
    }

    /**
     * Create an instance of {@link DtEdicion.Docentes.Entry }
     * 
     */
    public DtEdicion.Docentes.Entry createDtEdicionDocentesEntry() {
        return new DtEdicion.Docentes.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombreProgramasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarNombreProgramasResponse")
    public JAXBElement<ListarNombreProgramasResponse> createListarNombreProgramasResponse(ListarNombreProgramasResponse value) {
        return new JAXBElement<ListarNombreProgramasResponse>(_ListarNombreProgramasResponse_QNAME, ListarNombreProgramasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteRegistroInscripcionEResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ExisteRegistroInscripcionEResponse")
    public JAXBElement<ExisteRegistroInscripcionEResponse> createExisteRegistroInscripcionEResponse(ExisteRegistroInscripcionEResponse value) {
        return new JAXBElement<ExisteRegistroInscripcionEResponse>(_ExisteRegistroInscripcionEResponse_QNAME, ExisteRegistroInscripcionEResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Chekusuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "chekusuario")
    public JAXBElement<Chekusuario> createChekusuario(Chekusuario value) {
        return new JAXBElement<Chekusuario>(_Chekusuario_QNAME, Chekusuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "crearPrograma")
    public JAXBElement<CrearPrograma> createCrearPrograma(CrearPrograma value) {
        return new JAXBElement<CrearPrograma>(_CrearPrograma_QNAME, CrearPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "crearProgramaResponse")
    public JAXBElement<CrearProgramaResponse> createCrearProgramaResponse(CrearProgramaResponse value) {
        return new JAXBElement<CrearProgramaResponse>(_CrearProgramaResponse_QNAME, CrearProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEdicionCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altaEdicionCurso")
    public JAXBElement<AltaEdicionCurso> createAltaEdicionCurso(AltaEdicionCurso value) {
        return new JAXBElement<AltaEdicionCurso>(_AltaEdicionCurso_QNAME, AltaEdicionCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProgramasUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarProgramasUsuarioResponse")
    public JAXBElement<MostrarProgramasUsuarioResponse> createMostrarProgramasUsuarioResponse(MostrarProgramasUsuarioResponse value) {
        return new JAXBElement<MostrarProgramasUsuarioResponse>(_MostrarProgramasUsuarioResponse_QNAME, MostrarProgramasUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCursosCategoria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarCursosCategoria")
    public JAXBElement<ListarCursosCategoria> createListarCursosCategoria(ListarCursosCategoria value) {
        return new JAXBElement<ListarCursosCategoria>(_ListarCursosCategoria_QNAME, ListarCursosCategoria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarProgramasUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarProgramasUsuario")
    public JAXBElement<MostrarProgramasUsuario> createMostrarProgramasUsuario(MostrarProgramasUsuario value) {
        return new JAXBElement<MostrarProgramasUsuario>(_MostrarProgramasUsuario_QNAME, MostrarProgramasUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerPrograma")
    public JAXBElement<ObtenerPrograma> createObtenerPrograma(ObtenerPrograma value) {
        return new JAXBElement<ObtenerPrograma>(_ObtenerPrograma_QNAME, ObtenerPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerUsuarioMail")
    public JAXBElement<ObtenerUsuarioMail> createObtenerUsuarioMail(ObtenerUsuarioMail value) {
        return new JAXBElement<ObtenerUsuarioMail>(_ObtenerUsuarioMail_QNAME, ObtenerUsuarioMail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkCurso")
    public JAXBElement<CheckCurso> createCheckCurso(CheckCurso value) {
        return new JAXBElement<CheckCurso>(_CheckCurso_QNAME, CheckCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarCursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarCursosResponse")
    public JAXBElement<MostrarCursosResponse> createMostrarCursosResponse(MostrarCursosResponse value) {
        return new JAXBElement<MostrarCursosResponse>(_MostrarCursosResponse_QNAME, MostrarCursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramasCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ProgramasCursoResponse")
    public JAXBElement<ProgramasCursoResponse> createProgramasCursoResponse(ProgramasCursoResponse value) {
        return new JAXBElement<ProgramasCursoResponse>(_ProgramasCursoResponse_QNAME, ProgramasCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCursoPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "agregarCursoPrograma")
    public JAXBElement<AgregarCursoPrograma> createAgregarCursoPrograma(AgregarCursoPrograma value) {
        return new JAXBElement<AgregarCursoPrograma>(_AgregarCursoPrograma_QNAME, AgregarCursoPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaUsuarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "consultaUsuarios")
    public JAXBElement<ConsultaUsuarios> createConsultaUsuarios(ConsultaUsuarios value) {
        return new JAXBElement<ConsultaUsuarios>(_ConsultaUsuarios_QNAME, ConsultaUsuarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosInscripEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosInscripEstudianteResponse")
    public JAXBElement<DatosInscripEstudianteResponse> createDatosInscripEstudianteResponse(DatosInscripEstudianteResponse value) {
        return new JAXBElement<DatosInscripEstudianteResponse>(_DatosInscripEstudianteResponse_QNAME, DatosInscripEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInstitutoCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerInstitutoCursoResponse")
    public JAXBElement<ObtenerInstitutoCursoResponse> createObtenerInstitutoCursoResponse(ObtenerInstitutoCursoResponse value) {
        return new JAXBElement<ObtenerInstitutoCursoResponse>(_ObtenerInstitutoCursoResponse_QNAME, ObtenerInstitutoCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearInscripcionEstudianteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "crearInscripcionEstudianteResponse")
    public JAXBElement<CrearInscripcionEstudianteResponse> createCrearInscripcionEstudianteResponse(CrearInscripcionEstudianteResponse value) {
        return new JAXBElement<CrearInscripcionEstudianteResponse>(_CrearInscripcionEstudianteResponse_QNAME, CrearInscripcionEstudianteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExisteRegistroInscripcionE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ExisteRegistroInscripcionE")
    public JAXBElement<ExisteRegistroInscripcionE> createExisteRegistroInscripcionE(ExisteRegistroInscripcionE value) {
        return new JAXBElement<ExisteRegistroInscripcionE>(_ExisteRegistroInscripcionE_QNAME, ExisteRegistroInscripcionE.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsDocente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "esDocente")
    public JAXBElement<EsDocente> createEsDocente(EsDocente value) {
        return new JAXBElement<EsDocente>(_EsDocente_QNAME, EsDocente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChekuUsuarioEmailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "chekuUsuarioEmailResponse")
    public JAXBElement<ChekuUsuarioEmailResponse> createChekuUsuarioEmailResponse(ChekuUsuarioEmailResponse value) {
        return new JAXBElement<ChekuUsuarioEmailResponse>(_ChekuUsuarioEmailResponse_QNAME, ChekuUsuarioEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosCursosResponse")
    public JAXBElement<DatosCursosResponse> createDatosCursosResponse(DatosCursosResponse value) {
        return new JAXBElement<DatosCursosResponse>(_DatosCursosResponse_QNAME, DatosCursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDocentesInstituto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDocentesInstituto")
    public JAXBElement<ListarDocentesInstituto> createListarDocentesInstituto(ListarDocentesInstituto value) {
        return new JAXBElement<ListarDocentesInstituto>(_ListarDocentesInstituto_QNAME, ListarDocentesInstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkProgramaResponse")
    public JAXBElement<CheckProgramaResponse> createCheckProgramaResponse(CheckProgramaResponse value) {
        return new JAXBElement<CheckProgramaResponse>(_CheckProgramaResponse_QNAME, CheckProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Altausuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altausuario")
    public JAXBElement<Altausuario> createAltausuario(Altausuario value) {
        return new JAXBElement<Altausuario>(_Altausuario_QNAME, Altausuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarDatosUsuarioResponse")
    public JAXBElement<ModificarDatosUsuarioResponse> createModificarDatosUsuarioResponse(ModificarDatosUsuarioResponse value) {
        return new JAXBElement<ModificarDatosUsuarioResponse>(_ModificarDatosUsuarioResponse_QNAME, ModificarDatosUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerUsuarioResponse")
    public JAXBElement<ObtenerUsuarioResponse> createObtenerUsuarioResponse(ObtenerUsuarioResponse value) {
        return new JAXBElement<ObtenerUsuarioResponse>(_ObtenerUsuarioResponse_QNAME, ObtenerUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscripcionProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "InscripcionProgramaResponse")
    public JAXBElement<InscripcionProgramaResponse> createInscripcionProgramaResponse(InscripcionProgramaResponse value) {
        return new JAXBElement<InscripcionProgramaResponse>(_InscripcionProgramaResponse_QNAME, InscripcionProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChekuUsuarioEmail }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "chekuUsuarioEmail")
    public JAXBElement<ChekuUsuarioEmail> createChekuUsuarioEmail(ChekuUsuarioEmail value) {
        return new JAXBElement<ChekuUsuarioEmail>(_ChekuUsuarioEmail_QNAME, ChekuUsuarioEmail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEstadoInscripcion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarEstadoInscripcion")
    public JAXBElement<ModificarEstadoInscripcion> createModificarEstadoInscripcion(ModificarEstadoInscripcion value) {
        return new JAXBElement<ModificarEstadoInscripcion>(_ModificarEstadoInscripcion_QNAME, ModificarEstadoInscripcion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramasCursosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ProgramasCursosResponse")
    public JAXBElement<ProgramasCursosResponse> createProgramasCursosResponse(ProgramasCursosResponse value) {
        return new JAXBElement<ProgramasCursosResponse>(_ProgramasCursosResponse_QNAME, ProgramasCursosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsultaUsuariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "consultaUsuariosResponse")
    public JAXBElement<ConsultaUsuariosResponse> createConsultaUsuariosResponse(ConsultaUsuariosResponse value) {
        return new JAXBElement<ConsultaUsuariosResponse>(_ConsultaUsuariosResponse_QNAME, ConsultaUsuariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaEdicionCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altaEdicionCursoResponse")
    public JAXBElement<AltaEdicionCursoResponse> createAltaEdicionCursoResponse(AltaEdicionCursoResponse value) {
        return new JAXBElement<AltaEdicionCursoResponse>(_AltaEdicionCursoResponse_QNAME, AltaEdicionCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategoriasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarCategoriasResponse")
    public JAXBElement<ListarCategoriasResponse> createListarCategoriasResponse(ListarCategoriasResponse value) {
        return new JAXBElement<ListarCategoriasResponse>(_ListarCategoriasResponse_QNAME, ListarCategoriasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDocentesEdicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDocentesEdicion")
    public JAXBElement<ListarDocentesEdicion> createListarDocentesEdicion(ListarDocentesEdicion value) {
        return new JAXBElement<ListarDocentesEdicion>(_ListarDocentesEdicion_QNAME, ListarDocentesEdicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarDatosUsuario")
    public JAXBElement<ModificarDatosUsuario> createModificarDatosUsuario(ModificarDatosUsuario value) {
        return new JAXBElement<ModificarDatosUsuario>(_ModificarDatosUsuario_QNAME, ModificarDatosUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEdiciones }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosEdiciones")
    public JAXBElement<DatosEdiciones> createDatosEdiciones(DatosEdiciones value) {
        return new JAXBElement<DatosEdiciones>(_DatosEdiciones_QNAME, DatosEdiciones.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTCursosPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "DTCursosPrograma")
    public JAXBElement<DTCursosPrograma> createDTCursosPrograma(DTCursosPrograma value) {
        return new JAXBElement<DTCursosPrograma>(_DTCursosPrograma_QNAME, DTCursosPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuarioMailResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerUsuarioMailResponse")
    public JAXBElement<ObtenerUsuarioMailResponse> createObtenerUsuarioMailResponse(ObtenerUsuarioMailResponse value) {
        return new JAXBElement<ObtenerUsuarioMailResponse>(_ObtenerUsuarioMailResponse_QNAME, ObtenerUsuarioMailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursosProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "cursosProgramaResponse")
    public JAXBElement<CursosProgramaResponse> createCursosProgramaResponse(CursosProgramaResponse value) {
        return new JAXBElement<CursosProgramaResponse>(_CursosProgramaResponse_QNAME, CursosProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkPrograma")
    public JAXBElement<CheckPrograma> createCheckPrograma(CheckPrograma value) {
        return new JAXBElement<CheckPrograma>(_CheckPrograma_QNAME, CheckPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosCursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosCursos")
    public JAXBElement<DatosCursos> createDatosCursos(DatosCursos value) {
        return new JAXBElement<DatosCursos>(_DatosCursos_QNAME, DatosCursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerInstitutoCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerInstitutoCurso")
    public JAXBElement<ObtenerInstitutoCurso> createObtenerInstitutoCurso(ObtenerInstitutoCurso value) {
        return new JAXBElement<ObtenerInstitutoCurso>(_ObtenerInstitutoCurso_QNAME, ObtenerInstitutoCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriasProgramas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "categoriasProgramas")
    public JAXBElement<CategoriasProgramas> createCategoriasProgramas(CategoriasProgramas value) {
        return new JAXBElement<CategoriasProgramas>(_CategoriasProgramas_QNAME, CategoriasProgramas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkCursoResponse")
    public JAXBElement<CheckCursoResponse> createCheckCursoResponse(CheckCursoResponse value) {
        return new JAXBElement<CheckCursoResponse>(_CheckCursoResponse_QNAME, CheckCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "registrarCursoResponse")
    public JAXBElement<RegistrarCursoResponse> createRegistrarCursoResponse(RegistrarCursoResponse value) {
        return new JAXBElement<RegistrarCursoResponse>(_RegistrarCursoResponse_QNAME, RegistrarCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearInscripcionEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "crearInscripcionEstudiante")
    public JAXBElement<CrearInscripcionEstudiante> createCrearInscripcionEstudiante(CrearInscripcionEstudiante value) {
        return new JAXBElement<CrearInscripcionEstudiante>(_CrearInscripcionEstudiante_QNAME, CrearInscripcionEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregarCursoProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "agregarCursoProgramaResponse")
    public JAXBElement<AgregarCursoProgramaResponse> createAgregarCursoProgramaResponse(AgregarCursoProgramaResponse value) {
        return new JAXBElement<AgregarCursoProgramaResponse>(_AgregarCursoProgramaResponse_QNAME, AgregarCursoProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsDocenteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "esDocenteResponse")
    public JAXBElement<EsDocenteResponse> createEsDocenteResponse(EsDocenteResponse value) {
        return new JAXBElement<EsDocenteResponse>(_EsDocenteResponse_QNAME, EsDocenteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerUsuario")
    public JAXBElement<ObtenerUsuario> createObtenerUsuario(ObtenerUsuario value) {
        return new JAXBElement<ObtenerUsuario>(_ObtenerUsuario_QNAME, ObtenerUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdicionesCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "EdicionesCursoResponse")
    public JAXBElement<EdicionesCursoResponse> createEdicionesCursoResponse(EdicionesCursoResponse value) {
        return new JAXBElement<EdicionesCursoResponse>(_EdicionesCursoResponse_QNAME, EdicionesCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarEstadoInscripcionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarEstadoInscripcionResponse")
    public JAXBElement<ModificarEstadoInscripcionResponse> createModificarEstadoInscripcionResponse(ModificarEstadoInscripcionResponse value) {
        return new JAXBElement<ModificarEstadoInscripcionResponse>(_ModificarEstadoInscripcionResponse_QNAME, ModificarEstadoInscripcionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosInscripEstudiante }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosInscripEstudiante")
    public JAXBElement<DatosInscripEstudiante> createDatosInscripEstudiante(DatosInscripEstudiante value) {
        return new JAXBElement<DatosInscripEstudiante>(_DatosInscripEstudiante_QNAME, DatosInscripEstudiante.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDatosInscEdicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDatosInscEdicionResponse")
    public JAXBElement<ListarDatosInscEdicionResponse> createListarDatosInscEdicionResponse(ListarDatosInscEdicionResponse value) {
        return new JAXBElement<ListarDatosInscEdicionResponse>(_ListarDatosInscEdicionResponse_QNAME, ListarDatosInscEdicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramasCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ProgramasCurso")
    public JAXBElement<ProgramasCurso> createProgramasCurso(ProgramasCurso value) {
        return new JAXBElement<ProgramasCurso>(_ProgramasCurso_QNAME, ProgramasCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCursoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerCursoResponse")
    public JAXBElement<ObtenerCursoResponse> createObtenerCursoResponse(ObtenerCursoResponse value) {
        return new JAXBElement<ObtenerCursoResponse>(_ObtenerCursoResponse_QNAME, ObtenerCursoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarNombreProgramas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarNombreProgramas")
    public JAXBElement<ListarNombreProgramas> createListarNombreProgramas(ListarNombreProgramas value) {
        return new JAXBElement<ListarNombreProgramas>(_ListarNombreProgramas_QNAME, ListarNombreProgramas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCursosCategoriaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarCursosCategoriaResponse")
    public JAXBElement<ListarCursosCategoriaResponse> createListarCursosCategoriaResponse(ListarCursosCategoriaResponse value) {
        return new JAXBElement<ListarCursosCategoriaResponse>(_ListarCursosCategoriaResponse_QNAME, ListarCursosCategoriaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursosInstituto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "cursosInstituto")
    public JAXBElement<CursosInstituto> createCursosInstituto(CursosInstituto value) {
        return new JAXBElement<CursosInstituto>(_CursosInstituto_QNAME, CursosInstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInstitutosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarInstitutosResponse")
    public JAXBElement<ListarInstitutosResponse> createListarInstitutosResponse(ListarInstitutosResponse value) {
        return new JAXBElement<ListarInstitutosResponse>(_ListarInstitutosResponse_QNAME, ListarInstitutosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProgramasCursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "ProgramasCursos")
    public JAXBElement<ProgramasCursos> createProgramasCursos(ProgramasCursos value) {
        return new JAXBElement<ProgramasCursos>(_ProgramasCursos_QNAME, ProgramasCursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarInstitutos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarInstitutos")
    public JAXBElement<ListarInstitutos> createListarInstitutos(ListarInstitutos value) {
        return new JAXBElement<ListarInstitutos>(_ListarInstitutos_QNAME, ListarInstitutos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerCurso")
    public JAXBElement<ObtenerCurso> createObtenerCurso(ObtenerCurso value) {
        return new JAXBElement<ObtenerCurso>(_ObtenerCurso_QNAME, ObtenerCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarEdicionFULLResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarEdicionFULLResponse")
    public JAXBElement<MostrarEdicionFULLResponse> createMostrarEdicionFULLResponse(MostrarEdicionFULLResponse value) {
        return new JAXBElement<MostrarEdicionFULLResponse>(_MostrarEdicionFULLResponse_QNAME, MostrarEdicionFULLResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaInstitutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altaInstitutoResponse")
    public JAXBElement<AltaInstitutoResponse> createAltaInstitutoResponse(AltaInstitutoResponse value) {
        return new JAXBElement<AltaInstitutoResponse>(_AltaInstitutoResponse_QNAME, AltaInstitutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarEdicionFULL }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarEdicionFULL")
    public JAXBElement<MostrarEdicionFULL> createMostrarEdicionFULL(MostrarEdicionFULL value) {
        return new JAXBElement<MostrarEdicionFULL>(_MostrarEdicionFULL_QNAME, MostrarEdicionFULL.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTCursosProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "DTCursosProgramaResponse")
    public JAXBElement<DTCursosProgramaResponse> createDTCursosProgramaResponse(DTCursosProgramaResponse value) {
        return new JAXBElement<DTCursosProgramaResponse>(_DTCursosProgramaResponse_QNAME, DTCursosProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosProgramas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosProgramas")
    public JAXBElement<DatosProgramas> createDatosProgramas(DatosProgramas value) {
        return new JAXBElement<DatosProgramas>(_DatosProgramas_QNAME, DatosProgramas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosProgramasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosProgramasResponse")
    public JAXBElement<DatosProgramasResponse> createDatosProgramasResponse(DatosProgramasResponse value) {
        return new JAXBElement<DatosProgramasResponse>(_DatosProgramasResponse_QNAME, DatosProgramasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategoriasProgramasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "categoriasProgramasResponse")
    public JAXBElement<CategoriasProgramasResponse> createCategoriasProgramasResponse(CategoriasProgramasResponse value) {
        return new JAXBElement<CategoriasProgramasResponse>(_CategoriasProgramasResponse_QNAME, CategoriasProgramasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarDatosProgramaResponse")
    public JAXBElement<ModificarDatosProgramaResponse> createModificarDatosProgramaResponse(ModificarDatosProgramaResponse value) {
        return new JAXBElement<ModificarDatosProgramaResponse>(_ModificarDatosProgramaResponse_QNAME, ModificarDatosProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EdicionesCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "EdicionesCurso")
    public JAXBElement<EdicionesCurso> createEdicionesCurso(EdicionesCurso value) {
        return new JAXBElement<EdicionesCurso>(_EdicionesCurso_QNAME, EdicionesCurso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckincripcionPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkincripcionPrograma")
    public JAXBElement<CheckincripcionPrograma> createCheckincripcionPrograma(CheckincripcionPrograma value) {
        return new JAXBElement<CheckincripcionPrograma>(_CheckincripcionPrograma_QNAME, CheckincripcionPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChekusuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "chekusuarioResponse")
    public JAXBElement<ChekusuarioResponse> createChekusuarioResponse(ChekusuarioResponse value) {
        return new JAXBElement<ChekusuarioResponse>(_ChekusuarioResponse_QNAME, ChekusuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursosPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "cursosPrograma")
    public JAXBElement<CursosPrograma> createCursosPrograma(CursosPrograma value) {
        return new JAXBElement<CursosPrograma>(_CursosPrograma_QNAME, CursosPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDatosInscEdicion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDatosInscEdicion")
    public JAXBElement<ListarDatosInscEdicion> createListarDatosInscEdicion(ListarDatosInscEdicion value) {
        return new JAXBElement<ListarDatosInscEdicion>(_ListarDatosInscEdicion_QNAME, ListarDatosInscEdicion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MostrarCursos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "mostrarCursos")
    public JAXBElement<MostrarCursos> createMostrarCursos(MostrarCursos value) {
        return new JAXBElement<MostrarCursos>(_MostrarCursos_QNAME, MostrarCursos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltausuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altausuarioResponse")
    public JAXBElement<AltausuarioResponse> createAltausuarioResponse(AltausuarioResponse value) {
        return new JAXBElement<AltausuarioResponse>(_AltausuarioResponse_QNAME, AltausuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CursosInstitutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "cursosInstitutoResponse")
    public JAXBElement<CursosInstitutoResponse> createCursosInstitutoResponse(CursosInstitutoResponse value) {
        return new JAXBElement<CursosInstitutoResponse>(_CursosInstitutoResponse_QNAME, CursosInstitutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModificarDatosPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "modificarDatosPrograma")
    public JAXBElement<ModificarDatosPrograma> createModificarDatosPrograma(ModificarDatosPrograma value) {
        return new JAXBElement<ModificarDatosPrograma>(_ModificarDatosPrograma_QNAME, ModificarDatosPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InscripcionPrograma }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "InscripcionPrograma")
    public JAXBElement<InscripcionPrograma> createInscripcionPrograma(InscripcionPrograma value) {
        return new JAXBElement<InscripcionPrograma>(_InscripcionPrograma_QNAME, InscripcionPrograma.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDocentesEdicionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDocentesEdicionResponse")
    public JAXBElement<ListarDocentesEdicionResponse> createListarDocentesEdicionResponse(ListarDocentesEdicionResponse value) {
        return new JAXBElement<ListarDocentesEdicionResponse>(_ListarDocentesEdicionResponse_QNAME, ListarDocentesEdicionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "obtenerProgramaResponse")
    public JAXBElement<ObtenerProgramaResponse> createObtenerProgramaResponse(ObtenerProgramaResponse value) {
        return new JAXBElement<ObtenerProgramaResponse>(_ObtenerProgramaResponse_QNAME, ObtenerProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AltaInstituto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "altaInstituto")
    public JAXBElement<AltaInstituto> createAltaInstituto(AltaInstituto value) {
        return new JAXBElement<AltaInstituto>(_AltaInstituto_QNAME, AltaInstituto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckincripcionProgramaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "checkincripcionProgramaResponse")
    public JAXBElement<CheckincripcionProgramaResponse> createCheckincripcionProgramaResponse(CheckincripcionProgramaResponse value) {
        return new JAXBElement<CheckincripcionProgramaResponse>(_CheckincripcionProgramaResponse_QNAME, CheckincripcionProgramaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosEdicionesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "datosEdicionesResponse")
    public JAXBElement<DatosEdicionesResponse> createDatosEdicionesResponse(DatosEdicionesResponse value) {
        return new JAXBElement<DatosEdicionesResponse>(_DatosEdicionesResponse_QNAME, DatosEdicionesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarDocentesInstitutoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarDocentesInstitutoResponse")
    public JAXBElement<ListarDocentesInstitutoResponse> createListarDocentesInstitutoResponse(ListarDocentesInstitutoResponse value) {
        return new JAXBElement<ListarDocentesInstitutoResponse>(_ListarDocentesInstitutoResponse_QNAME, ListarDocentesInstitutoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarCategorias }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "listarCategorias")
    public JAXBElement<ListarCategorias> createListarCategorias(ListarCategorias value) {
        return new JAXBElement<ListarCategorias>(_ListarCategorias_QNAME, ListarCategorias.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegistrarCurso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://PRESENTACION/", name = "registrarCurso")
    public JAXBElement<RegistrarCurso> createRegistrarCurso(RegistrarCurso value) {
        return new JAXBElement<RegistrarCurso>(_RegistrarCurso_QNAME, RegistrarCurso.class, null, value);
    }

}
