package Clases;

import Clases.Comentarios;
import Clases.Estudiante;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-12-02T17:46:32")
@StaticMetamodel(Comentarios.class)
public class Comentarios_ { 

    public static volatile ListAttribute<Comentarios, Comentarios> respuestas;
    public static volatile SingularAttribute<Comentarios, Estudiante> est;
    public static volatile SingularAttribute<Comentarios, Long> id;
    public static volatile SingularAttribute<Comentarios, String> comentario;

}