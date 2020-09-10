/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 *
 * @author Bruno
 */
@Entity
public class Docente extends Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    //Metodos

    public Docente() {
    }

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
