/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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
    
    List Ediciones;
    List Programas;
    List Previas;
    
    
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url){
        
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cantHoras = ch;
        creditos = c;
        r = registro;
        URL = url;
        Ediciones=new LinkedList();
        Programas=new LinkedList();
        Previas=new LinkedList();
    } 
    
    public DTCurso getDatos(){
    
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cantHoras,this.creditos,this.registro,this.URL);
    }
      boolean existeEdicionVigente(Date fechaInsc)
    {
        //Metodo
        return true;
    }      
      boolean existeRegAlumno(String cirreo, String nomEdi)
      {
          //Metodo
          return true;
      }
      
     public void EditarCurso(DTCurso DataCurso)
     {
         //Metodo
     }
     

    public void Cancelar()
    {
        
    }
    
}
