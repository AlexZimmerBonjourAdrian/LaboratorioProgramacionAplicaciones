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
import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Bruno
 */
@Entity
public class Edicion implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    @Temporal(TemporalType.DATE)
    private Date fecha_ini;
    @Temporal(TemporalType.DATE)
    private Date fecha_fin;
    private int cupo_max;
    @Temporal(TemporalType.DATE)
    private Date fecha_pub;
    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @JoinTable(name="edicion_usuario", joinColumns = @JoinColumn(name = "edicion_id"),
                inverseJoinColumns = @JoinColumn(name = "docentes_id") )
    private Map<String, Usuario> docentes;
    private List inscripciones;

    public Edicion() {
    }
    
    
    
    public Edicion(String nombre, Date fecha_ini, Date fecha_fin, int cupo_max, Date fecha_pub){
        this.nombre=nombre;
        this.fecha_ini=fecha_ini;
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
        InscripcionE ie;
        for(Object e : inscripciones){
          ie = (InscripcionE) e;
          if(ie.getEst().getNick().equals(nombreE)) return ie;
        }
        return null;
    }
    
    public Usuario obtenerDocente(String nick){
        return docentes.get(nick);
    }
    
    public void agregarDocente(Usuario u){
        if(obtenerDocente(u.getNick())==null){
            docentes.put(u.getNick(), u);
        }
    }
    
    public void agregarInscripcion(InscripcionE insc){
        if(!inscripciones.contains(insc)){
            inscripciones.add(insc);
        }
    }
    
}


