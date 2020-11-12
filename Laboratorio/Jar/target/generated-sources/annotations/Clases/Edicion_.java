package Clases;

import Clases.Docente;
import Clases.InscripcionE;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-06T14:12:43")
@StaticMetamodel(Edicion.class)
public class Edicion_ { 

    public static volatile SingularAttribute<Edicion, Integer> cupo_max;
    public static volatile SingularAttribute<Edicion, Date> fecha_pub;
    public static volatile SingularAttribute<Edicion, Date> fecha_fin;
    public static volatile ListAttribute<Edicion, InscripcionE> inscripciones;
    public static volatile SingularAttribute<Edicion, String> imagenDir;
    public static volatile SingularAttribute<Edicion, Long> id;
    public static volatile SingularAttribute<Edicion, String> nombre;
    public static volatile SingularAttribute<Edicion, Date> fecha_ini;
    public static volatile MapAttribute<Edicion, String, Docente> docentes;

}