/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTPrograma;
import java.util.Date;

/**
 *
 * @author arena
 */
public class Programa {
    
        private String nombre;
	private String descripcion;
	private Date fecha_ini;
	private Date fecha_fin;
	
	//Metodos
	
        public Programa(String nombre, String descripcion, Date fecha_ini, Date fecha_fin){
            this.nombre=nombre;
            this.descripcion=descripcion;
            this.fecha_ini=fecha_ini;
            this.fecha_fin=fecha_fin;
        }
        
        public DTPrograma getDatos(){
        
            return new DTPrograma(this.nombre,this.descripcion,this.fecha_ini,this.fecha_fin);
            
        }
        
       public boolean CheckPrograma()
       {
           //Metodo
           return true;
       }
}
