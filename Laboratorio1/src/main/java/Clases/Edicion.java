/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTEdicion;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Bruno
 */
public class Edicion {
    
    //Atributos
    
    String nombre;
    Date fecha_ini;
    Date fecha_fin;
    int cupo_max;
    Date fecha_pub;
    Map docentes;
    Map inscripciones;
    
    //Metodos
    
    public Edicion(String nombre, Date fecha_ini, Date fecha_fin, int cupo_max, Date fecha_pub){
        this.nombre=nombre;
        this.fecha_fin=fecha_ini;
        this.fecha_fin=fecha_fin;
        this.cupo_max=cupo_max;
        this.fecha_pub=fecha_pub;
        docentes = new HashMap();
        inscripciones = new HashMap();
    }
    
   /* public DTEdicion getDatos(){
        
        //Se genera una lista con los datatypes de todos los docentes
        Iterator it = this.docentes.entrySet().iterator();
        List doc = new LinkedList();
        while(it.hasNext()){
            doc.add(it.getClass());
            it.next();
        }
        //Se genera una lista con los datatypes de todas las inscripciones
        it = this.inscripciones.entrySet().iterator();
        List insc = new LinkedList();
        while(it.hasNext()){
            insc.add(it.getClass());
            it.next();
        }
        return new DTEdicion(this.nombre, this.fecha_ini, this.fecha_fin, this.cupo_max,this.fecha_pub,doc,insc);
    } */
    
    public String getNombreEdicion(){
        return this.nombre;
    }
    public Date getFechaIni() {
		return this.fecha_ini;
	}
	public Date getFechaFin() {
		return this.fecha_fin;
	}
	public int getCuposMax() {
		return this.cupo_max;
	}
	public Date getFechaPub() {
		return this.fecha_pub;
	}
	public Map getDocentes(){
            return this.docentes;
    }
    public Map getInscripciones(){
        return this.inscripciones;
    }
}
    
