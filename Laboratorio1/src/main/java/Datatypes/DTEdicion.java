package Datatypes;

import java.util.Date;
import java.util.List;
public class DTEdicion {

	//Atributos
	
	private String nombre;
	private Date fecha_ini;
	private Date fecha_fin;
	private int cupo_max;
	private Date fecha_pub;
        private List Docente;
	private List Inscripciones;
	//Metodos
	
        public DTEdicion(String nombre,Date fecha_ini,Date fecha_fin,int cupo_max,Date fecha_pub, List Docente, List Inscripciones){
            this.nombre=nombre;
            this.fecha_ini=fecha_ini;
            this.fecha_fin=fecha_fin;
            this.cupo_max=cupo_max;
            this.fecha_pub=fecha_pub;
            this.Docente =Docente;
            this.Inscripciones= Inscripciones;
        }
        
	public String getNombre() {
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
        public List getDocente()
        {
            return this.Docente;
        }
        public List getInscripciones()
        {
           return this.Inscripciones; 
        }
        
        
	
}
