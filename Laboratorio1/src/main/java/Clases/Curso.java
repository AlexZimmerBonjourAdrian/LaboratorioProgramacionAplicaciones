/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import Datatypes.DTUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author arena
 */
public class Curso {
    
    //Atributos
       
    private String nombre;
    private String descripcion;
    private String duracion;
    private double cant_horas;
    private double creditos;
    private Date registro;
    private String URL;
    private Map<String,Curso> previas;
    private Map<String,Edicion>ediciones;
    private Map<String,Programa>programas;
    
    //Metodos
    
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url,Map<String,Curso> previas){
        
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cant_horas = ch;
        creditos = c;
        registro = r;
        URL = url;
        previas = new HashMap();
        ediciones = new HashMap();
        programas = new HashMap();
        
    }   

    public Curso(String nombre, String descripcion, String duracion, double horas, Date fechaReg, String url) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public DTCurso getDatos(){
    
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cant_horas,this.creditos,this.registro,this.URL);
    }
     public Map<String,Edicion> getEdiciones(){
        return this.ediciones;
    }
     public Edicion obtenerEdicion(String nombreEdicion){
        return ediciones.get(nombreEdicion);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public DTEdicion seleccinarEdicion(String nombre, DTEdicion Dato)
   {
       return ediciones.get(nombre).getDatos();

    }
    
   
    
    public void EditarCurso(DTCurso datos)
    {
        this.nombre=datos.getNombre();
        this.descripcion=datos.getDescripcion();
        this.URL=datos.getUrl();
        this.duracion=datos.getDuracion();
        this.creditos=datos.getCreditos();
        this.cant_horas=datos.getHoras(); 
    }
    
    public Set<DTEdicion> ListarEdicion()
    {
       //return ediciones;
        Iterator<Map.Entry<String, Edicion>> it= getEdiciones().entrySet().iterator();
        Set<DTEdicion> Edit = new HashSet();
        while(it.hasNext())
        {
            Map.Entry<String, Edicion> Ed= it.next();
            Edit.add(Ed.getValue().getDatos());
        }
        
        return Edit;
            
       /*
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        ArrayList<String> nicks = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Usuario> usr = it.next();
           nicks.add(usr.getValue().getNick());
        }
        return nicks;
       
        Iterator it = this.inscripciones.iterator();
        while(it.hasNext()){
            InscripcionE insc = (InscripcionE) it.next();
            if(insc.est.equals(e))
                return insc;
        }
*/
    }
    
   public void EditarEdicion (DTEdicion dato)
   {
     ediciones.get(dato.getNombre()).EditarCurso(dato);
   }
  

}

           
            
            

