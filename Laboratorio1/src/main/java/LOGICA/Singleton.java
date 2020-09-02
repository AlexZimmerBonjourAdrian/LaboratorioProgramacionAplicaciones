/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.util.HashMap;
import java.util.Map;
import Clases.*;
import Datatypes.*;

/**
 *
 * @author arena
 */
public class Singleton {
    
    private Map<String,Usuario> usuarios;
    
    private Map<String,Instituto> institutos;
    
    private Map<String,Programa> programas;
    private Map<String,Edicion> ediciones;
    private Map<String,Curso> cursos;
    
    private static Singleton instancia = null;
    
    private Singleton(){ 
        
        usuarios = new HashMap();
        
        institutos = new HashMap();
        
        programas = new HashMap();
        
        ediciones = new HashMap();
        cursos = new HashMap();
    }
    
    public static Singleton getInstance(){
    
        if (instancia == null){
            
            instancia = new Singleton();
        }
        
        return instancia;
    }
    
    public void agregarUsuario(Usuario usr){
        if (this.obtenerUsuario(usr.getNick()) == null) {
            usuarios.put(usr.getNick(),usr);
            // hay que sacar esto
            System.out.println("se creo el usuario: " + usr.getNick());
        }
    }
    
    public Usuario obtenerUsuario(String nick){
        return usuarios.get(nick);
    }
    
    public Map<String,Usuario> getUsuarios(){
        return this.usuarios;
    }
    
    
    public void agregarInstituto(Instituto inst){
        if (this.obtenerInstituto(inst.getNombre()) == null) {
            institutos.put(inst.getNombre(),inst);
        }
    }
    
    public Instituto obtenerInstituto(String nombre){
        return institutos.get(nombre);
    }
    
    public void agregarPrograma(Programa prog){
        if (this.obtenerPrograma(prog.getNombre()) == null) {
            programas.put(prog.getNombre(),prog);
        }
    }
    
    public Programa obtenerPrograma(String nombre){
        return programas.get(nombre);
    }
    
    public Edicion seleccionarEdicion(String nombre)
    {
      return ediciones.get(nombre);
    }
         
    
    public Curso ObtenerCurso(String nombre)
    {
       return cursos.get(nombre);
    }
            
            
        
}
