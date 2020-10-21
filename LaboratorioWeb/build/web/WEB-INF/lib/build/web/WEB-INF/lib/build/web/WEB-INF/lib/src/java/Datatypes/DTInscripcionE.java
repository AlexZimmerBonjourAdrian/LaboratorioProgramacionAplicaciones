/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datatypes;

import java.util.Date;

/**
 *
 * @author admin
 */
public class DTInscripcionE {
    
    private Date fecha_insc;
    private DTUsuario est;
    private EstadoInscripcion estado;
    
    public DTInscripcionE(Date fecha_insc, DTUsuario est,EstadoInscripcion estado){
        this.fecha_insc = fecha_insc;
        this.est = est;
        this.estado = estado;
    }
    
    public Date getFecha(){
        return this.fecha_insc;
    }
    public DTUsuario getEstudiante(){
        return this.est;
    }
    public EstadoInscripcion getEstado(){
        return this.estado;
    }
    
    
    
}
