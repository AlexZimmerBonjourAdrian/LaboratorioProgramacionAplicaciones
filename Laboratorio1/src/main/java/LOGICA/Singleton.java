/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import java.util.HashMap;
import java.util.Map;
import Clases.*;
import DATABASE.Persistencia;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

/**
 *
 * @author arena
 */
public class Singleton {
    
    private Map<String,Usuario> usuarios;
    
    //private Map usuarios;
    
    private Map<String,Instituto> institutos;
    
    private Map<String,Programa> programas;
    
    private Map<String,Curso> cursos; 
    
    private static Singleton instancia = null;
    
    private Singleton(){ 
        
        usuarios = new HashMap();
        
        institutos = new HashMap();
        
        programas = new HashMap();
        
        cursos = new HashMap();
        
        /*
        Persistencia p = Persistencia.getInstance();
        EntityManager em = p.obtenerEntityManager();
        
        //usuarios = em.createQuery("Select e from Estudiante e").getHints();
        
        List usuariosBaseE = em.createQuery("Select e from Estudiante e").getResultList();
        
        for(Object usr : usuariosBaseE){
            Usuario u = (Usuario)usr;
            usuarios.put(u.getNick(), u);
        }
        
        List usuariosBase = em.createQuery("Select d from Docente d").getResultList();
        
        for(Object usr : usuariosBase){
            Usuario u = (Usuario)usr;
            usuarios.put(u.getNick(), u);
        }
        
        List institutosBase = em.createQuery("Select i from Instituto i").getResultList();
        
        for(Object inst : institutosBase){
            Instituto i = (Instituto)inst;
            institutos.put(i.getNombre(), i);
        }
        
        //institutos = (Map<String, Instituto>) em.createQuery("Select i from Instituto i").getResultList();
        
        //programas = (Map<String, Programa>) em.createQuery("Select p from Programa p").getResultList();
        
        //cursos = (Map<String, Curso>) em.createQuery("Select c from Curso c").getResultList();
        */
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
            System.out.println("se creo el curso: " + cur.getNombre());
        }
    }
}
