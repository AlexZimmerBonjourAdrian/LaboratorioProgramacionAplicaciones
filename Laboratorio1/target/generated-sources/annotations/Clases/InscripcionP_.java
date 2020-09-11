package Clases;

import Clases.Estudiante;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-10T21:50:20")
@StaticMetamodel(InscripcionP.class)
public class InscripcionP_ { 

    public static volatile SingularAttribute<InscripcionP, Date> fecha_insc;
    public static volatile SingularAttribute<InscripcionP, Estudiante> est;
    public static volatile SingularAttribute<InscripcionP, Long> id;

}