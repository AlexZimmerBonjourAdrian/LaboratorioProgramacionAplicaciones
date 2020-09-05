/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTEdicion;
import Clases.InscripcionE;
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
    Map<String, Usuario> docentes;
    List inscripciones;
    
    //Metodos
    
    public Edicion(String nombre, Date fecha_ini, Date fecha_fin, int cupo_max, Date fecha_pub){
        this.nombre=nombre;
        this.fecha_fin=fecha_ini;
        this.fecha_fin=fecha_fin;
        this.cupo_max=cupo_max;
        this.fecha_pub=fecha_pub;
        docentes = new HashMap();
        inscripciones = new LinkedList();
    }
    
    public Edicion(String nombre){ //CONSTRUCTOR PARA PRUEBA
        this.nombre = nombre;
        this.cupo_max = 40;
      
    }
    
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
    public List getInscripciones(){
        return this.inscripciones;
    }
    
    public void agregarInscripcionE(InscripcionE ie){
        if(obtenerInscripcionE(ie.est.getNick()) == null){
            inscripciones.add(ie);
        }
    
    }
    
    public InscripcionE obtenerInscripcionE(String nombreE){
        Iterator it = this.inscripciones.iterator();
        while(it.hasNext()){
            InscripcionE insc = (InscripcionE) it.next();
            if(insc.est.getNick().equals(nombreE))
                return insc;
        }
    return null;
}
    
    
}


