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
        
       public boolean CheckPrograma()
       {
           //Metodo
           return true;
       }
       
}
