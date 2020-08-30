/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import java.util.Date;

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
    
    
    
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url){
        
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cantHoras = ch;
        creditos = c;
        r = registro;
        URL = url;
        
    } 
    
    public DTCurso getDatos(){
    
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cantHoras,this.creditos,this.registro,this.URL);
    }
    
    
    
}
