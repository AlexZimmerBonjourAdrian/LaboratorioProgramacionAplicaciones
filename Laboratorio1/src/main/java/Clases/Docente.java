/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;

/**
 *
 * @author Bruno
 */
public class Docente extends Usuario {
    
    //Atributos
    
    //Metodos

    /**
     *
     * @param nick
     * @param nombre
     * @param apellido
     * @param correo
     * @param fecha_de_nac
     */
    
    public Docente(String nick, String nombre, String apellido, String correo, Date fecha_de_nac){
        super(nick,nombre,apellido,correo,fecha_de_nac);
    }
}
