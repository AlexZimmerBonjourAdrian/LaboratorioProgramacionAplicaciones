package Datatypes;

import java.util.Date;

public class DTEdicion {

	//Atributos
	
	private String nombre;
	private Date fecha_ini;
	private Date fecha_fin;
	private int cupo_max;
	private Date fechaPub;
	
	//Metodos
	
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
		return this.fechaPub;
	}
	
}
