package Clases;
import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
public class Curso {
    //Atributos
    private String nombre;
    private String descripcion;
    private String duracion;
    private double cant_horas;
    private double creditos;
    private Date registro;
    private String URL;
    private Map<String,Curso> previas;
    private Map<String,Edicion>ediciones;
    private Map<String,Programa>programas;
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url,Map<String,Curso> previas){
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cant_horas = ch;
        creditos = c;
        registro = r;
        URL = url;
        previas = new HashMap();
        ediciones = new HashMap();
        programas = new HashMap();
    }   
    public Curso(String n, String desc, String dur, double ch, double c, Date r, String url){
        nombre = n;
        descripcion = desc;
        duracion = dur;
        cant_horas = ch;
        creditos = c;
        registro = r;
        URL = url;
        previas = new HashMap();
        ediciones = new HashMap();
        programas = new HashMap();
    }   
    public DTCurso getDatos(){
        return new DTCurso(this.nombre, this.descripcion,this.duracion,this.cant_horas,this.creditos,this.registro,this.URL);
     public Map<String,Edicion> getEdiciones(){
        return this.ediciones;
     public Edicion obtenerEdicion(String nombreEdicion){
        return ediciones.get(nombreEdicion);
    public void agregarEdicion(Edicion ed){
        if(obtenerEdicion(ed.getNombreEdicion())==null){
            ediciones.put(ed.getNombreEdicion(),ed);
        }
    }
    public String getNombre() {
        return nombre;
    }
    public Curso(String nombre, String descripcion, String duracion, double horas, Date fechaReg, String url) {
    public DTEdicion seleccinarEdicion(String nombre, DTEdicion Dato)
   {
       return ediciones.get(nombre).getDatos();
    }
    public void EditarCurso(DTCurso datos)
    {
        this.nombre=datos.getNombre();
        this.descripcion=datos.getDescripcion();
        this.URL=datos.getUrl();
        this.duracion=datos.getDuracion();
        this.creditos=datos.getCreditos();
        this.cant_horas=datos.getHoras(); 
    }
    public Set<DTEdicion> ListarEdicion()
    {
        Iterator<Map.Entry<String, Edicion>> it= getEdiciones().entrySet().iterator();
        Set<DTEdicion> Edit = new HashSet();
        while(it.hasNext())
        {
            Map.Entry<String, Edicion> Ed= it.next();
            Edit.add(Ed.getValue().getDatos());
        }
        return Edit;
    }
   public void EditarEdicion (DTEdicion dato)
   {
     ediciones.get(dato.getNombre()).EditarCurso(dato);
   }
}