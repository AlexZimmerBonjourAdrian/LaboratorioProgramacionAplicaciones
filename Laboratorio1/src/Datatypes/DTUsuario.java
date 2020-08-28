package Datatypes;

import java.util.Date;

public class DTUsuario {
	
	//Atributos
	
	private String nick;
	private String nombre;
	private String apellido;
	private String correo;
	private Date fecha_de_nac;
	
	//Metodos
	
	public String getNick() {
		return this.nick;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public String getCorreo() {
		return this.correo;
	}
	public Date getFecha() {
		return this.fecha_de_nac;
	}
}
