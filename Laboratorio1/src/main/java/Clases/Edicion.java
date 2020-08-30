/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTEdicion;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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
        docentes = new TreeMap();
        inscripciones = new TreeMap();
    }
    
    public DTEdicion getDatos(){
        return new DTEdicion(this.nombre, this.fecha_ini, this.fecha_fin, this.cupo_max,this.fecha_pub);
    }
    
    
    
}
