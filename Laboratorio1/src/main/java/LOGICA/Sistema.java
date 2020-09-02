/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.*;
//import java.util.Date;
//import java.util.Iterator;
import java.util.*;
import java.util.Set;
/**
 *
 * @author arena
 */
public class Sistema implements ISistema{
    
    public Sistema(){};
    private String nombre;
    
    
    public void altaUsuario(DTUsuario datos){
        
        Singleton sm = Singleton.getInstance();
        Usuario u = new Usuario(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
        sm.agregarUsuario(u);
    
    };
    
    public boolean chekusuario(String nick){
        
        Singleton sm = Singleton.getInstance();
        if(sm.obtenerUsuario(nick)!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean chekuUsuarioEmail(String email){
        Singleton sm = Singleton.getInstance();
        boolean existeMail = true;
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        while(it.hasNext() && existeMail){
           Map.Entry<String, Usuario> usr = it.next();
           if(usr.getValue().getCorreo().equalsIgnoreCase(email)){
               existeMail = false;
           }
        }
        return existeMail;
    };
    
    public boolean sintaxisEmailCorrecta(String email){
        boolean resultado = true;
        int cantarrobas = 0;
        int i = 0;
        while(cantarrobas<2 && i<email.length() && resultado){
            if(email.charAt(0)=='@'||email.charAt(0)=='.'){
                resultado = false;
            }
            if(email.charAt(i)=='@'){
                cantarrobas++;
            }
            i++;
        }
        if(cantarrobas!=1){
            resultado = false;
        }
        return resultado;
    }
    
    public ArrayList<String> listarNickUsuarios(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        ArrayList<String> nicks = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Usuario> usr = it.next();
           nicks.add(usr.getValue().getNick());
        }
        return nicks;
    }
    
    public Usuario obtenerUsuario(String nick){
        Singleton sm = Singleton.getInstance();
        return sm.obtenerUsuario(nick);
    }
    
    public void modificarDatosUsuario(String nick, String nuevoNom, String nuevoApe, Date nuevaFechaNac){
        Usuario u = obtenerUsuario(nick);
        u.setNombre(nuevoNom);
        u.setApellido(nuevoApe);
        u.setFecha_de_nac(nuevaFechaNac);
    }
    
    
    //Buscar Instituto Completo
    //Revistar la operacion
    public DTInstituto buscarInstituto(String nombInst)
    {
      Singleton sm = Singleton.getInstance();
      nombre= sm.obtenerInstituto(nombInst).getDatos().getNombre();
      return sm.obtenerInstituto(nombInst).getDatos();
      
    }
    public Set<DTEdicion> mostrarEdicion(String nick){return null;};
    
    public Set<DTPrograma> mostrarProgramasEst(String nick){return null;};
    
    public Set<Curso> mostrarCursosDocente(String nick){return null;}; 
    
    public Set<DTPrograma> mostrarProgramaDoc(String nick){return null;};
    
    public Set<DTUsuario> consultaUsuarios(){return null;};
    
    public DTUsuario seleccionarUsuario(String nick){return null;};
    
    public void modificarDatosUsuario(DTUsuario nuevo){};
    
    public void agregarCursoPrograma(String nombreP, String nombreC){};
    
    public Set<DTCurso> mostrarCursos(){return null;};
    
    public Set<DTPrograma> mostrarProgramas(){return null;};
    
    public DTCurso mostrarCurso(String nombreC){return null;};
    
    public DTPrograma mostrarPrograma(String nombreP){return null;};
    
    public boolean chequearInstituto(String nombreI){return false;};
    
    public void modificarNombreInstituto(String nombreI, String nuevonombre){};
    
    public Set<String> cursosInstituto(String nombreI){return null;};
    
    public DTEdicion pickEdicion(String nombreE){return null;};
    
    public boolean checkPrograma(DTPrograma datos){return false;};
    
    public void modificarDatosPrograma(DTPrograma datos){};
    
    public Programa crearPrograma(DTPrograma datos){return null;}; 
    
    public boolean checkEdicionCurso(String nombreC, Date FechaInsc){return false;};
    
    public boolean checkRegistro(String correo, String nombreC, String nombreE){return false;};
    
    public Set<String> pickCurso (String nombreC){return null;};
    
    public void modRegAlumEdicion(Date nuevaFecha){};
    
    public InscripcionE crearRegistro(String correo, Date FechaInsc){return null;};
    
    
    //Caso de Uso ConsultarCurso
    //IndicarOperacion
    //Operacion Terminada 
    public Set<DTCurso> indicarInstitucion(String nombre)
    {
        Singleton sm = Singleton.getInstance();
        Instituto Inst = sm.obtenerInstituto(nombre);
        return (Set<DTCurso>) Inst.getDataCurso();
    }
    public DTCurso seleccionarCurso(String nombre)
    {
      //
        /*
       Singleton sm = Singleton.getInstance();
      nombre= sm.ObtenerCurso(nombre).getDatos().getNombre();
      return sm.ObtenerCurso(nombre).getDatos();
        */
        return null;
    }
    public boolean seleccionarEdicionOPrograma(String nombre, DTEdicion edicion){return false;};
    
    public Set<DTEdicion> listaEdicion(String Instituto){return null;};
    
    public DTEdicion seleccionarEdicion(String nombreEdicion, DTEdicion edicion)
    {
       Singleton sm = Singleton.getInstance();
       Instituto inst = sm.obtenerInstituto(nombre);
        //inst.selecionarEdicion(nombre, edicion);
        return null;
       
    }
          
    
    public void editarEdicion(DTEdicion data)
    {
       
       
    }
    
    public void indicarInstitucion2(String nombreI){}; // que hace?
    
    public boolean indicarNombreCurso(String nombreC){return false;}; // que hace?
    
    public void registrarCurso(DTCurso datoscurso){};
    
    public void editarCursoInst(DTCurso datos){};
    
    public void cancelar(){};
    
    public void aceptar(){};
/*
    @Override
    public DTEdicion seleccionarEdicion(String nombre, DTEdicion edicion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
*/
    
    
}
