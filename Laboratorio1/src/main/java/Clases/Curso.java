/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

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
