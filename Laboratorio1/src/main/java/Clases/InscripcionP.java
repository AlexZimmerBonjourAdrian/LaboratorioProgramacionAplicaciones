package Clases;

import java.util.Date;

public class InscripcionP {
	
	//Atributos
    
    Date fecha_insc;
    Estudiante est;
    
    //Metodos
    
    public InscripcionP(Date fecha_insc, Estudiante est){
        this.fecha_insc=fecha_insc;
        this.est=est;
    }
    
    public void modificarDatos(Date fecha_nueva){
        this.fecha_insc=fecha_nueva;
    }
		
}
