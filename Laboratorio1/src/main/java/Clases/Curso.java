/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author arena
 */
@Entity
public class Curso implements Serializable {  
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;   
    private String nombre;
    private String descripcion;
    private String duracion;
    private double cant_horas;
    private double creditos;
    @Temporal(TemporalType.DATE)
    private Date registro;
    private String URL;
    //@ElementCollection
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name = "cursoCurso")
    @MapKey(name = "nombre")  
    private Map<String,Curso> previas;
    //@ElementCollection
    @OneToMany(cascade=CascadeType.PERSIST, fetch=FetchType.LAZY)
    @JoinTable(name="cursoEdicion", joinColumns = @JoinColumn(name = "curso_id"),
                inverseJoinColumns = @JoinColumn(name = "ediciones_id") )
    @MapKey(name = "nombre")  
    private Map<String,Edicion>ediciones;
    //@ElementCollection
    @ManyToMany 
    @JoinTable(name="cursoPrograma", joinColumns = @JoinColumn(name = "cursos_id"),
                inverseJoinColumns = @JoinColumn(name = "programas_id") )
    @MapKey(name = "nombre")  
    private Map<String,Programa>programas;
    
    //Metodos

    public Curso() {
    }
    
    
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url){
        
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
    public DTCurso getDatos(){
    
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cant_horas,this.creditos,this.registro,this.URL);
    }
     public Map<String,Edicion> getEdiciones(){
        return this.ediciones;
    }
     public Edicion obtenerEdicion(String nombreEdicion){
        return ediciones.get(nombreEdicion);
    }
    public void agregarEdicion(Edicion ed){
        if(obtenerEdicion(ed.getNombreEdicion())==null){
            ediciones.put(ed.getNombreEdicion(),ed);
        }
    }
    public String getNombre() {
        return nombre;
    }
    
    public Curso obtenerPrevias(String nombrePrevia){
        return previas.get(nombrePrevia);
    }
    
    public void agregarPrevias(Curso c){
        if(obtenerPrevias(c.nombre) == null){
            previas.put(c.getNombre(), c);
        }
    }

    public Map<String, Curso> getPrevias() {
        return previas;
    }

    public Map<String, Programa> getProgramas() {
        return programas;
    }
    
    public Programa obtenerPrograma(String nombrePrograma){
        return programas.get(nombrePrograma);
    }
    
    public void agregarPrograma(Programa p){
        if(obtenerPrograma(p.getNombre()) == null){
            programas.put(p.getNombre(), p);
            System.out.println("se agrego el programa: " + p.getNombre() + "al curso: " + this.nombre);
        }
    }
    
    
}
