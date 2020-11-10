/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRESENTACION;

import Clases.Curso;
import Clases.Docente;
import Clases.Estudiante;
import Clases.Instituto;
import Clases.Usuario;
import DATABASE.Persistencia;
import Datatypes.DTCurso;
import Datatypes.DTInstituto;
import Datatypes.DTPrograma;
import Datatypes.DTUsuario;
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
   
   public HashSet<DTCurso> datosCursos(){
        return (HashSet)ICU.datosCursos();
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
   public List mostrarCursos(){
       return ICU.mostrarCursos();
   }
   
   @WebMethod
   public DTPrograma obtenerPrograma(String nombreP){
       return ICU.obtenerPrograma(nombreP);
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
   
}
