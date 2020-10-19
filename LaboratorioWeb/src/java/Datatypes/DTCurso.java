package Datatypes;

import Clases.Categoria;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class DTCurso {
	
	//Atributos
	
	private String nombre;
	private String descripcion;
	private String duracion;
	private double cant_horas;
	private double cant_cred;
	private Date fecha_reg;
	private String url;
        
        
	//Metodos
	
	public DTCurso(String nombre,String descripcion, String duracion,double cant_horas,double cant_cred, Date fecha_reg, String url) {
            this.nombre=nombre;
            this.descripcion=descripcion;
            this.duracion=duracion;
            this.cant_horas=cant_horas;
            this.cant_cred=cant_cred;
            this.fecha_reg=fecha_reg;
            this.url=url;
            
	}
	
	public String getNombre(){
		return this.nombre;
	}
	public String getDescripcion(){
		return this.descripcion;
	}
	public String getDuracion(){
		return this.duracion;
	}
	public double getHoras(){
		return this.cant_horas;
	}
	public double getCreditos(){
		return this.cant_cred;
	}
	public Date getFechaReg(){
		return this.fecha_reg;
	}
	public String getUrl() {
		return this.url;
	}


  
}
