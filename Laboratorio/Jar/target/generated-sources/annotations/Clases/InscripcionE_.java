package Clases;

import Clases.Estudiante;
import Datatypes.EstadoInscripcion;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-06T14:12:43")
@StaticMetamodel(InscripcionE.class)
public class InscripcionE_ { 

    public static volatile SingularAttribute<InscripcionE, EstadoInscripcion> estado;
    public static volatile SingularAttribute<InscripcionE, Date> fecha_insc;
    public static volatile SingularAttribute<InscripcionE, Estudiante> est;
    public static volatile SingularAttribute<InscripcionE, Long> id;

}