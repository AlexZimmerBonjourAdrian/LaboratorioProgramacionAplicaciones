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
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Dictionary;

/**
 *
 * @author arena
 */
public class Curso {
    
    private String nombre;
    
    private String descripcion;
    
    private String duracion;
    
    private double cantHoras;
    
    private double creditos;
    
    private Date registro;
    
    private String URL;
    
    private  Map<String,Edicion>Ediciones;
    

    
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url){
        
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cantHoras = ch;
        creditos = c;
        r = registro;
        URL = url;
        //this.Ediciones = Ediciones;
        Ediciones = new HashMap();
        
    } 
    
    public DTCurso getDatos(){
    
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cantHoras,this.creditos,this.registro,this.URL);
    }
    
    public DTEdicion seleccinarEdicion(String nombre, DTEdicion Dato)
   {
       return Ediciones.get(nombre).getDatos();

    }
    
    
    
    
}
