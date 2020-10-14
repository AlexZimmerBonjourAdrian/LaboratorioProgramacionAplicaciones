package Datatypes;

import java.util.Date;

public class DTUsuario {
	
	//Atributos
	
	private String nick;
	private String nombre;
	private String apellido;
	private String correo;
	private Date fecha_de_nac;
	private String contrasena;
	//Metodos
	
        public DTUsuario(String nick, String nombre, String apellido, String correo, Date fecha_de_nac, String contrasena){
            this.nick=nick;
            this.nombre=nombre;
            this.apellido=apellido;
            this.correo=correo;
            this.fecha_de_nac=fecha_de_nac;
            this.contrasena = contrasena;
        }
        
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

        public String getContrasena() {
            return contrasena;
        }
        
}
