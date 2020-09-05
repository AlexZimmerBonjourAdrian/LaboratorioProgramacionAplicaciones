/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.util.HashMap;
import java.util.Map;
import Clases.*;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author arena
 */
public class Singleton {
    
    private Map<String,Usuario> usuarios;
    
    private Map<String,Instituto> institutos;
    
    private Map<String,Programa> programas;
    
    private Map<String,Curso> cursos; 
    
    private static Singleton instancia = null;
    
    private Singleton(){ 
        
        usuarios = new HashMap();
        
        institutos = new HashMap();
        
        programas = new HashMap();
        
        cursos = new HashMap();
        
        Curso c1 = new Curso("Programacion avanzada","UML-DSS-DC-IMPL","12",150.0,20,new Date(),"www.nuncaseusa.com");
        Curso c2 = new Curso("Ingenieria de software","No entiendo nada","20",130.0,25,new Date(),"www.lalaland.com");
        Curso c3 = new Curso("Arquitecura de sistemas","GIT-UBUNTU","1500",800.0,10,new Date(),"www.zzzzzz.com");
        
        this.cursos.put(c1.getNombre(),c1);
        this.cursos.put(c2.getNombre(),c2);
        this.cursos.put(c3.getNombre(),c3);
        
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
    
    public Map<String,Instituto> getInstitutos(){
        return this.institutos;
    }
    
    public Map<String,Programa> getProgramas(){
        return this.programas;
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

    public Map<String, Curso> getCursos() {
        return cursos;
    }
    
    public Curso obtenerCurso(String nombre){
        return cursos.get(nombre);
    }
    
    public void agregarCurso(Curso cur){
        if (this.obtenerCurso(cur.getNombre()) == null) {
            cursos.put(cur.getNombre(),cur);
        }
    }
}
