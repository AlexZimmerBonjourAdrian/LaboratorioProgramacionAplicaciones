/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import Datatypes.DTCurso;
import Datatypes.DTInstituto;
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
/**
 *
 * @author Bruno
 */
@Entity
public class Instituto implements Serializable {
    
	//Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; 
    private String nombre;
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private Map<String,Curso> cursos;
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.EAGER)
    private Map<String,Docente> docentes;

    public Instituto() {
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Map<String,Curso> getCursos(){
        return this.cursos;
    }
    
    public Map<String,Docente> getDocentes(){
        return this.docentes;
    }
    
    public Curso obtenerCurso(String nomCurso){
        return cursos.get(nomCurso);
    }
    
    public Docente obtenerDocente(String nickDocente){
        return docentes.get(nickDocente);
    }
    
    public void addDocente(Docente d){
        if(obtenerDocente(d.getNick())==null){
            docentes.put(d.getNick(), d);
            //borrar esto
            System.out.println("Se agrego al instituto: " + getNombre() + "el docente: " + d.getNick());
        }
    }
    
    public void addCurso(Curso c){
        if(obtenerCurso(c.getNombre())==null){
            cursos.put(c.getNombre(), c);
             System.out.println("se agrego el curso: " + c.getNombre() + "al instuto: " + nombre);
        }
    }
    
    
    public Instituto(String nombre) {
        this.nombre=nombre;
    	cursos = new HashMap();
    	docentes = new HashMap();
    }
    
    
    public DTInstituto getDatos() {
    	
    	
    	return new DTInstituto(this.nombre);
    
    }
    
}
