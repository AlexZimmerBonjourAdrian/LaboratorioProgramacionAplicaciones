/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import Clases.Categoria;
import Clases.Curso;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Instituto;
import Clases.Usuario;
import DATABASE.Persistencia;
import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import Datatypes.DTInscripcionE;
import Datatypes.DTInstituto;
import Datatypes.DTPrograma;
import Datatypes.DTUsuario;
import Datatypes.DatosEdicion;
import Datatypes.EstadoInscripcion;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import LOGICA.Singleton;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.EntityManager;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Surface
 */

@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL, parameterStyle = ParameterStyle.WRAPPED)
public class Publicador {
    
   private ISistema ICU = FabricaLab.getInstance().getISistema();
   
   private Endpoint endpoint = null;
   
   public Publicador(){}
   
   @WebMethod(exclude = true)
   public void publicar(){
       endpoint = Endpoint.publish("http://localhost:9128/publicador", this);
   }
   
   @WebMethod(exclude = true)
   public Endpoint getEndpoint(){
       return endpoint;
   }
   
  @WebMethod
  public Set<DTUsuario> consultaUsuarios(){
      return ICU.consultaUsuarios();
  }
   
  @WebMethod
  public ArrayList<String> EdicionesCurso(String curso){
      return ICU.EdicionesCurso(curso);
  }
  @WebMethod
  public ArrayList<String> ProgramasCurso(String curso){
      return ICU.ProgramasCursos(curso);
  }
  @WebMethod
  public ArrayList<String> cursosInstituto(String curso){
      return ICU.cursosInstituto(curso);
  }
  @WebMethod 
  public void altausuario(String nick, String nombre, String ape, String correo, String fecha, String contr, boolean docente, String imagendir, List inst) throws ParseException{
      Date fechaDate = null;
      if(fecha!=null){
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        fechaDate = formato.parse(fecha);
       }
      DTUsuario datos = new DTUsuario(nick, nombre, ape, correo, fechaDate, contr, imagendir);
      ICU.altaUsuario (datos, docente, inst);
  }
   @WebMethod
   public boolean chekusuario(String nick){
      return ICU.chekusuario(nick);
   }
   
   @WebMethod
   public ArrayList<DatosEdicion> mostrarEdicionFULL(String nick){
      return ICU.mostrarEdicionFULL(nick);
   }
   
   @WebMethod
   
   public HashSet<DTCurso> datosCursos(){
        return (HashSet)ICU.datosCursos();
    }
   @WebMethod
   public Set<DTPrograma> datosProgramas(){
        return (HashSet)ICU.datosProgramas();
   }
   @WebMethod
   public void agregarCursoPrograma(String nombreP, String nombreC){
       ICU.agregarCursoPrograma(nombreP, nombreC);
   }
   
   @WebMethod
   public boolean esDocente(String login){
       return ICU.esDocente(login);
   }
   
   @WebMethod
   public ArrayList<String> listarNombreProgramas(){
       return ICU.listarNombreProgramas();
   }
   
   @WebMethod
   public ArrayList<String> listarDocentesInstituto(String inst){
       return ICU.listarDocentesInstituo(inst);
   }
   
   @WebMethod
   public List mostrarCursos(){
       return ICU.mostrarCursos();
   }
   
   @WebMethod
   public ArrayList<String> mostrarProgramasUsuario(String nick){
       return ICU.mostrarProgramasUsuario(nick);
   }
   
   @WebMethod
   public void modificarDatosUsuario(String nick, String nombre, String apellido, String fechaNac) throws ParseException{
        Date fechaDate=null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if(fechaNac!=null && !fechaNac.equals("")){
            fechaDate = formato.parse(fechaNac);
        }
       ICU.modificarDatosUsuario(nick, nombre, apellido, fechaDate);
   }
   
   @WebMethod
   public DTPrograma obtenerPrograma(String nombreP){
       return ICU.obtenerPrograma(nombreP);
   }
   @WebMethod
   public DTUsuario obtenerUsuario(String nick){
       return ICU.obtenerUsuario(nick);
   }
   @WebMethod
   public DTCurso obtenerCurso(String nombre){
       return ICU.obtenerCurso(nombre);
   }
   @WebMethod
   public void registrarCurso(String inst,String nombre,String desc,String duracion, double cant_horas,double cant_cred, String fecha, String url, String imagenDir, List previas, List categorias) throws ParseException{
       Date fechaDate = null; 
       if(fecha!=null){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            fechaDate = formato.parse(fecha);
       }
       DTCurso dtc = new DTCurso(nombre, desc, duracion ,cant_horas, cant_cred, fechaDate, url, imagenDir);
       ICU.registrarCurso(inst, dtc, previas, categorias);
   }
   @WebMethod
   public ArrayList<String> listarInstitutos(){
       return ICU.listarInstitutos();
   }
    @WebMethod
    public ArrayList<String> listarCategorias(){
        return ICU.listarCategorias();
    }
   @WebMethod
   public DTUsuario obtenerUsuarioMail(String nick){
       return ICU.obtenerUsuarioMail(nick);
   }
   @WebMethod
   public ArrayList<DTInscripcionE> datosInscripEstudiante(String nick){
       return ICU.datosInscripEstudiante(nick);
   }
   
   @WebMethod
   public void crearPrograma(String nombre, String desc, String fecha_ini, String fecha_fin, String imagenDir) throws ParseException{
      Date fechaini = null;
      Date fechafin = null;
      if(fecha_ini!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechaini = formato.parse(fecha_ini);
       }
       if(fecha_fin!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechafin = formato.parse(fecha_fin);
       }
       
       DTPrograma datos = new DTPrograma(nombre, desc, fechaini, fechafin, new Date(), imagenDir);
       ICU.crearPrograma(datos);
   }
   
   @WebMethod
   public void modificarDatosPrograma(String nombre, String desc, String fecha_ini, String fecha_fin, String imagenDir) throws ParseException{
       Date fechaini = null;
      Date fechafin = null;
      if(fecha_ini!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechaini = formato.parse(fecha_ini);
       }
       if(fecha_fin!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechafin = formato.parse(fecha_fin);
       }
       
       DTPrograma datos = new DTPrograma(nombre, desc, fechaini, fechafin, new Date(), imagenDir);
       ICU.modificarDatosPrograma(datos);
   }
   
   @WebMethod
   public ArrayList<String> cursosPrograma(String nombreP){
       return ICU.cursosPrograma(nombreP);
   }
   
   @WebMethod
   public Set<String> categoriasProgramas(String nombreP){
       return ICU.CategoriasProgramas(nombreP);
   }
   
   @WebMethod
   public Set<DTCurso> DTCursosPrograma(String nombreP){
       return ICU.DTcursosPrograma(nombreP);
   }
   
   @WebMethod
   public DTInstituto obtenerInstitutoCurso(String nombreC){
       return ICU.obtenerInstitutoCurso(nombreC);
   }
   @WebMethod
   public void altaEdicionCurso(String nomCurso,String nombreEd,String fechaIniDate,String fechaFinDate,int cupos,String fechaPubDate,String imagenDir, List docentes) throws ParseException{
      Date fechaini = null;
      Date fechafin = null;
      Date fechapub = null;
      if(fechaIniDate!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechaini = formato.parse(fechaIniDate);
       }
       if(fechaFinDate!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechafin = formato.parse(fechaFinDate);
       }
       if(fechaPubDate!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechapub = formato.parse(fechaPubDate);
       }
       DTEdicion datos = new DTEdicion(nombreEd, fechaini, fechafin, cupos,fechapub, imagenDir);
       ICU.altaEdicionCurso(nomCurso, datos, docentes);
   }
   
 
   
   @WebMethod
   public void crearInscripcionEstudiante(String nombreC, String nombreEdi,Date  fecha_insc,String nombreEst){
      ICU.crearInscripcionEstudiante(nombreC, nombreEdi, nombreEst, fecha_insc, nombreC); 
   }
   
   @WebMethod
   public boolean checkincripcionPrograma(String nomP, String nickE){
       return ICU.checkincripcionPrograma(nomP, nickE);
   }
   
   @WebMethod 
   public void InscripcionPrograma(String nomP, String nickE){
       ICU.InscripcionPrograma(nomP, nickE, new Date());   
   }
   //********************************************************************************************
   @WebMethod
   public void altaInstituto(String nom){
   
       ICU.altaInstituto(nom);
   }
   
   @WebMethod
   public void modificarEstadoInscripcion(String cur, String ed, String est, EstadoInscripcion estado){
   
       ICU.modificarEstadoInscripcion(cur, ed, est, estado);
   }
  
   @WebMethod
   public ArrayList<DTInscripcionE> listarDatosInscEdicion(String nombreC, String nombreE){
   
       return ICU.listarDatosInscEdicion(nombreC, nombreE);
   }
   
   //*********************************************************************************************
   @WebMethod 
   public boolean checkCurso(String nomCurso){
       return ICU.checkCurso(nomCurso);
   }
   
   @WebMethod
   public boolean checkPrograma(String nombreP){
       return ICU.checkPrograma(nombreP);
   }
   
   @WebMethod
   public boolean chekuUsuarioEmail(String email){
       return ICU.chekuUsuarioEmail(email);
   }
   
   public ArrayList<String> listarCursosCategoria(String nomCat){
       return ICU.listarCursosCategoria(nomCat);
   }
   @WebMethod
   public ArrayList<String> ProgramasCursos(String nombreC){
   
      return ICU.ProgramasCursos(nombreC);
   }
   @WebMethod
   public DTEdicion datosEdiciones(String nombreCurso, String nombreEdicion){
      
       return ICU.datosEdicion(nombreCurso, nombreEdicion);
   
   }
   @WebMethod
   public boolean ExisteRegistroInscripcionE(String nombreEst, String nombreC, String nombreE){
   
       return ICU.ExisteRegistroInscripcionE(nombreEst, nombreC, nombreE);
   }
   
   @WebMethod
   public ArrayList<String> listarDocentesEdicion(String nombreC, String nombreE){
   
      return  ICU.listarDocentesEdicion(nombreC, nombreE);
   }
 @WebMethod  
public ArrayList<String> mostrarEdicion(String nick)
{
    return ICU.mostrarEdicion(nick);
}
@WebMethod
 public DTCurso cursoEdicion(String nombreE)
 {
     return ICU.cursoEdicion(nombreE);
 }
 @WebMethod
  public ArrayList<String> mostrarCursosDocente(String nick)
  {
      return ICU.mostrarCursosDocente(nick);
  }
@WebMethod
public Set<String> CategoriasProgramas(String nombreP)
{
    return ICU.CategoriasProgramas(nombreP);
}
@WebMethod
public ArrayList<String> CategoriasCurso(String nombreC)
{
    return ICU.CategoriasCurso(nombreC);
}
@WebMethod
public boolean chequearInstituto(String nombreI)
{
    return ICU.chequearInstituto(nombreI);
}
@WebMethod
public boolean sintaxisEmailCorrecta(String email)
{
    return ICU.sintaxisEmailCorrecta(email);
}
@WebMethod
public ArrayList<String> listarNickUsuarios()
{
    return ICU.listarNickUsuarios();
}
@WebMethod
 public ArrayList<String> listarNombreCursos()
 {
     return ICU.listarNombreCursos();
 }
 @WebMethod
public void modificarDatosUsuario(String nick, String nuevoNom, String nuevoApe, Date nuevaFechaNac)
{
    ICU.modificarDatosUsuario(nick, nuevoNom, nuevoApe, nuevaFechaNac);
}
@WebMethod
public DTInstituto institutoEdicion(String nombreE)
{
    return ICU.institutoEdicion(nombreE);
}
@WebMethod
public List mostrarProgramas()
{
    return ICU.mostrarProgramas();
}
 @WebMethod
public DTEdicion datosEdicion(String nombreCurso, String nombreEdicion)
{
    return ICU.datosEdicion(nombreCurso, nombreEdicion);
}
@WebMethod
public void modificarDatosPrograma(DTPrograma datos)
{
    ICU.modificarDatosPrograma(datos);
}
@WebMethod
 public void crearPrograma(DTPrograma datos)
 {
     ICU.crearPrograma(datos);
 }
 @WebMethod
 public String checkEdicionCurso(String nombreC)
 {
     return ICU.checkEdicionCurso(nombreC);
 }
 @WebMethod
 public boolean InscripcionCorrectaEstEdi(String nombreC, String nombreE, Date fecha)
 {
     return ICU.InscripcionCorrectaEstEdi(nombreC, nombreE, fecha);
 }
 @WebMethod
public boolean InscripcionEstEdiIsNull(String nombreI, String nombreC, String nombreEdi, String nombreEst, Date fecha )
{
    return ICU.InscripcionEstEdiIsNull(nombreI, nombreC, nombreEdi, nombreEst, fecha);
}
@WebMethod
 public ArrayList<String> listarEstudiantes()
 {
     return ICU.listarEstudiantes();
 }
 @WebMethod
  public ArrayList<String> listarDocentesInstituo(String nomInst)
  {
      return ICU.listarDocentesInstituo(nomInst);
  }
  @WebMethod
  public void modificarInscPrograma (String nomP, String nickE, Date nuevaFecha)
  {
       ICU.modificarInscPrograma(nomP, nickE, nuevaFecha);
  }
  @WebMethod
    public void InscripcionPrograma (String nomP, String nickE, Date fecha)
    {
        ICU.InscripcionPrograma(nomP, nickE, fecha);
    }
    
    @WebMethod
     public void crearInscripcionEstudiante(String nombreC, String nombreEdi,String nombreEst, Date fecha_insc)
     {
       
         ICU.crearInscripcionEstudiante(nombreC, nombreEdi, nombreEst, fecha_insc, nombreC);
     }

     @WebMethod
      public void modificarInscripcionEstudiante(String nombreC, String nombreEdi, String nombreEst, Date nueva_fecha)
      {
          ICU.modificarInscripcionEstudiante(nombreC, nombreEdi, nombreEst, nueva_fecha);
      }
      @WebMethod
     public void registrarCurso(String nomInst, DTCurso datoscurso, List previas, List categorias)
     {
         ICU.registrarCurso(nomInst, datoscurso, previas, categorias);
     }
     @WebMethod
     public void altaEdicionCurso(String nombCurso, DTEdicion datos, List docentes)
     {
         ICU.altaEdicionCurso(nombCurso, datos, docentes);
     }
     @WebMethod
     
     public boolean checkExisteEdicionCurso(String nomCurso, String nomEdic)
     {
         return ICU.checkExisteEdicionCurso(nomCurso, nomEdic);
     }
     @WebMethod
     public Categoria obtenerCategoria(String nombreCat)
     {
         return ICU.obtenerCategoria(nombreCat);
     }
     @WebMethod
      public void altaCategoria(String nombreCat)
      {
          ICU.altaCategoria(nombreCat);
      }
      @WebMethod
      public void modificarCategoria(String viejo,String nuevo)
      {
          ICU.modificarCategoria(viejo, nuevo);
      }
      @WebMethod
      public void agregarCategoriaCurso(String nombreCurso, List nombreCat)
      {
          ICU.agregarCategoriaCurso(nombreCurso, nombreCat);
      }
      @WebMethod
      
       public Set<DTCurso> DTcursosPrograma(String nombreP)
       {
           return ICU.DTcursosPrograma(nombreP);
       }
      
}
