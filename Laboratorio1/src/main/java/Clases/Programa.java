/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTPrograma;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import Clases.Curso;
/**
 *
 * @author arena
 
 */
public class Programa<Curso> {
    
	//Atributos
	
	private String nombre;
	private String descripcion;
	private Date fecha_ini;
	private Date fecha_fin;
	private Date fecha_alta;
	private Map<String,Curso> Cursos;
	private List inscripciones;
	
	//Metodos
	
    public Programa(String nombre, String descripcion, Date fecha_ini, Date fecha_fin, Date fecha_alta){
	    this.nombre=nombre;
	    this.descripcion=descripcion;
	    this.fecha_ini=fecha_ini;
	    this.fecha_fin=fecha_fin;
	    this.fecha_alta=fecha_alta;
	    this.inscripciones=new LinkedList();
    }
    
    public DTPrograma getDatos(){
    
        return new DTPrograma(this.nombre,this.descripcion,this.fecha_ini,this.fecha_fin,this.fecha_alta);
            

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
       
    
    
    
    
    public Date getFecha_Alta(){
        return fecha_alta;
    }
    
    public void setFechaAlta(Date fecha_alta){
        this.fecha_alta = fecha_alta;
    }

    public Map<String, Curso> getCursos() {
        return Cursos;
    }

    public List getInscripciones() {
        return inscripciones;
    }
    
}
