package Datatypes;

import java.util.Date;

public class DTPrograma {
	
	//Atributos
	
	private String nombre;
	private String descripcion;
	private Date fecha_ini;
	private Date fecha_fin;
	private Date fecha_alta;
	
	//Metodos
	
        public DTPrograma(String nombre, String descripcion, Date fecha_ini, Date fecha_fin,Date fecha_alta){
            this.nombre=nombre;
            this.descripcion=descripcion;
            this.fecha_ini=fecha_ini;
            this.fecha_fin=fecha_fin;
            this.fecha_alta=fecha_alta;
        }
        
	public String getNombre() {
		return this.nombre;
	}
	public String getDescripcion() {
		return this.descripcion;
	}
	public Date getFechaInicial() {
		return this.fecha_ini;
	}
	public Date getFechaFinal() {
		return this.fecha_fin;
	}
	public Date getFechaAlta() {
		return this.fecha_alta;
	}
}
	
	