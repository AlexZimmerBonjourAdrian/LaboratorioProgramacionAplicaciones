package Clases;
import Datatypes.DTPrograma;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import Clases.Curso;
import java.util.HashMap;
public class Programa {
	private String nombre;
	private String descripcion;
	private Date fecha_ini;
	private Date fecha_fin;
	private Date fecha_alta;
	private Map<String,Curso> Cursos;
	private List inscripciones;
    public Programa(String nombre, String descripcion, Date fecha_ini, Date fecha_fin, Date fecha_alta){
	    this.nombre=nombre;
	    this.descripcion=descripcion;
	    this.fecha_ini=fecha_ini;
	    this.fecha_fin=fecha_fin;
	    this.fecha_alta=fecha_alta;
            this.Cursos = new HashMap();
	    this.inscripciones=new LinkedList();
            this.Cursos = new HashMap<>();
    }
    public DTPrograma getDatos(){
        return new DTPrograma(this.nombre,this.descripcion,this.fecha_ini,this.fecha_fin,this.fecha_alta);
    }
    public void agregarCurso(Curso c1){
        this.Cursos.put(c1.getNombre(), c1);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Date getFecha_ini() {
        return fecha_ini;
    }
    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }
    public Date getFecha_fin() {
        return fecha_fin;
    }
    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    public Date getFecha_Alta(){
        return fecha_alta;
    }
    public void setFechaAlta(Date fecha_alta){
        this.fecha_alta = fecha_alta;
    }
    public Map<String, Curso> getCursos() {
        return Cursos;
    }
    public List getInscripciones() {
        return inscripciones;
    }
    public Curso obtenerCurso(String nombre){
        return Cursos.get(nombre);
    }
    public void agregarCurso(Curso c){
        if(this.obtenerCurso(c.getNombre()) == null){
            Cursos.put(c.getNombre(), c);
        }
    }
    
}