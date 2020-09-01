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
}
