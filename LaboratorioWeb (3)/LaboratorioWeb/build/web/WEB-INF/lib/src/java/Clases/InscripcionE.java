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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Bruno
 */
//HACE REFERENCiA AL TIPO ASOCIATIVO ESTUDIANTE/EDICION
@Entity
@Table (name = "inscripcionEstu")
public class InscripcionE implements Serializable{
    
    //Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    Date fecha_insc;
    @OneToOne
    Estudiante est;

    public InscripcionE() {
    }
    
    //Metodos
    
    public InscripcionE(Date fecha_insc, Estudiante est){
        this.fecha_insc=fecha_insc;
        this.est=est;
    }
    
    public void modificarDatos(Date fecha_nueva){
        this.fecha_insc=fecha_nueva;
    }

    public Estudiante getEst() {
        return est;
    }
    
}
