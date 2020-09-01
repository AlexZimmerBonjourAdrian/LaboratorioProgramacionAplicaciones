/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTUsuario;
import java.util.Date;

/**
 *
 * @author Bruno
 */
public class Usuario {
    
    //Atributos
    
    private String nick;
    private String nombre;
    private String apellido;
    private String correo;
    private Date fecha_de_nac;
    
    //Metodos
    
    public Usuario(String nick, String nombre, String apellido, String correo, Date fecha_de_nac){
        this.nick=nick;
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.fecha_de_nac=fecha_de_nac;
    }
  
    public DTUsuario getDatos(){
        return new DTUsuario(this.nick, this.nombre, this.apellido, this.correo, this.fecha_de_nac);
    }
    
    
    public void modificarDatos(DTUsuario datos){
        this.nombre=datos.getNombre();
        this.apellido=datos.getApellido();
        this.fecha_de_nac=datos.getFecha();
    }
    
    
    
    
}
