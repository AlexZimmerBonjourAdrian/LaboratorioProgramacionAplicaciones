package Clases;

import java.util.Date;
import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class InscripcionP implements Serializable {
	
	//Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;
    @Temporal(TemporalType.DATE)
    Date fecha_insc;
    Estudiante est;

    public InscripcionP() {
    }
    
    //Metodos
    
    public InscripcionP(Date fecha_insc, Estudiante est){
        this.fecha_insc=fecha_insc;
        this.est=est;
    }
    
    public void modificarDatos(Date fecha_nueva){
        this.fecha_insc=fecha_nueva;
    }

    public Date getFecha_insc() {
        return fecha_insc;
    }

    public Estudiante getEst() {
        return est;
    }
}
