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
//HACE REFERENCiA AL TIPO ASOCIATIVO ESTUDIANTE/EDICION
public class InscripcionE {
    
    //Atributos
    
    Date fecha_insc;
    Estudiante est;
    
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
