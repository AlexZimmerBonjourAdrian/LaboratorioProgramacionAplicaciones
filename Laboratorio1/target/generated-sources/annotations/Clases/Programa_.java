package Clases;

import Clases.Curso;
import java.util.Date;
import java.util.List;
import javax.annotation.Generated;
import javax.persistence.metamodel.MapAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-09-11T00:57:08")
@StaticMetamodel(Programa.class)
public class Programa_ { 

    public static volatile SingularAttribute<Programa, String> descripcion;
    public static volatile SingularAttribute<Programa, Date> fecha_fin;
    public static volatile SingularAttribute<Programa, Date> fecha_alta;
    public static volatile SingularAttribute<Programa, List> inscripciones;
    public static volatile SingularAttribute<Programa, Long> id;
    public static volatile SingularAttribute<Programa, String> nombre;
    public static volatile SingularAttribute<Programa, Date> fecha_ini;
    public static volatile MapAttribute<Programa, String, Curso> Cursos;

}