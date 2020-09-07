
import Clases.*;
import Datatypes.DTUsuario;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import LOGICA.Singleton;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bruno
 */
public class main {
    public static void main(String args[]){
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        Singleton sm = Singleton.getInstance();
        
        //Map<String,Usuario> c1 = new HashMap();
        //Map<String,Curso> cursos = new HashMap<>();
        //Map<String,Programa> programas = new HashMap<>();
        Docente d1 = new Docente("jorge123","Jorge","Hernandez","jorge.hernandez@lol.com.es",new Date());
        Docente d4 = new Docente("juan223","Juan","Perez","juan.perz@robert.com",new Date());
        Estudiante d5 = new Estudiante("nicoManya","Nicolas","Bataglino","nico.bata@lol.com.es",new Date());
        Estudiante e6 = new Estudiante("Pablogb83", "pablo", "gaione", "pablo@gaione", new Date());
        
        sm.agregarUsuario(e6);
        sm.agregarUsuario(d1);
        sm.agregarUsuario(d4);
        sm.agregarUsuario(d5);
        
        Curso curso1 = new Curso("Matematica", "Sirven de mucho", "1 semestre", 25, 12, new Date(), "mate.com");
        Curso curso2 = new Curso("Biologia", "Sirven pa poco", "1 semestre", 34, 8, new Date(), "biolo.com");
        Curso curso3 = new Curso("Fisica", "Sirven ahi", "1 semestre", 46, 10, new Date(), "Fis.com");
        Curso curso4 = new Curso("Sociales", "No sirve pa na", "1 semestre", 23, 8, new Date(), "sociales.com");
        
        sm.agregarCurso(curso4);
        sm.agregarCurso(curso3);
        sm.agregarCurso(curso2);
        sm.agregarCurso(curso1);
        
        
        Programa programa1 = new Programa("Ciclo Basico", "Formar crios", new Date(), new Date(), new Date());
        Programa programa2 = new Programa("Ciclo Avanzado", "Formar crios mayores", new Date(), new Date(), new Date());
        
        sm.agregarPrograma(programa1);
        sm.agregarPrograma(programa2);
        
        Edicion curso1ed1 = new Edicion("Matematica2020", new Date(), new Date(), 15, new Date());
        Edicion curso2ed1 = new Edicion("Biologia2020", new Date(), new Date(), 15, new Date());
        Edicion curso3ed1 = new Edicion("Fisica2020", new Date(), new Date(), 15, new Date());
        Edicion curso4ed1 = new Edicion("Sociales2020", new Date(), new Date(), 15, new Date());
        Edicion curso1ed0 = new Edicion("Matematica2019", new Date(), new Date(), 15, new Date());
        curso1.agregarEdicion(curso1ed0);
        curso1.agregarEdicion(curso1ed1);
        curso2.agregarEdicion(curso2ed1);
        curso3.agregarEdicion(curso3ed1);
        curso4.agregarEdicion(curso4ed1);
        programa1.agregarCurso(curso1);
        programa1.agregarCurso(curso2);
        programa1.agregarCurso(curso3);
        programa1.agregarCurso(curso4);
        curso1ed1.agregarDocente(d4);
        curso2ed1.agregarDocente(d1);
        curso3ed1.agregarDocente(d4);
        curso4ed1.agregarDocente(d1);
        
        InscripcionE insc1 = new InscripcionE(new Date(), d5);
        curso1ed1.agregarInscripcion(insc1);
        
        for (Iterator<String> it = ICU.mostrarProgramasUsuario(d4.getNick()).iterator(); it.hasNext();) {
            String nombre = it.next();
            System.out.println("nombre");
        }
       
        //c1.put("jorge",d1);
        //c1.put("juan",d4);
        //c1.put("nico",d5);
        //c1.put("pablo", e6);
        /*
        List cur = new LinkedList();
        for(Map.Entry<String,Usuario> entry: c1.entrySet()){
        Usuario d2 = entry.getValue();
        if(d2 instanceof Estudiante){
        System.out.println("El alumno es: " + d2.getNombre()+ " " + d2.getApellido());
        }else{
        System.out.println("El profesor es: " + d2.getNombre()+ " " + d2.getApellido());
        }
        //DTUsuario d3 = d2.getDatos();
        //System.out.println("El profesor es: " + d2.getNombre()+ " " + d2.getApellido());
        }
         */
    }
    
}
