/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.*;

/**
 *
 * @author arena
 */
public class Sistema implements ISistema{
    
    
    public Sistema(){};
    
    
    
    public void altaUsuario(DTUsuario datos, boolean docente, String nomInst){
        
        Singleton sm = Singleton.getInstance();
        Usuario u;
        if(docente){
              u = new Docente(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
              sm.obtenerInstituto(nomInst).addDocente((Docente)u);
        }else{
              u = new Estudiante(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
        }
        sm.agregarUsuario(u);
    };
    
    public boolean chekusuario(String nick){
        
        Singleton sm = Singleton.getInstance();
        if(sm.obtenerUsuario(nick)!=null){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean chekuUsuarioEmail(String email){
        Singleton sm = Singleton.getInstance();
        boolean existeMail = true;
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        while(it.hasNext() && existeMail){
           Map.Entry<String, Usuario> usr = it.next();
           if(usr.getValue().getCorreo().equalsIgnoreCase(email)){
               existeMail = false;
           }
        }
        return existeMail;
    };
    
    public boolean sintaxisEmailCorrecta(String email){
        boolean resultado = true;
        int cantarrobas = 0;
        int i = 0;
        while(cantarrobas<2 && i<email.length() && resultado){
            if(email.charAt(0)=='@'||email.charAt(0)=='.'){
                resultado = false;
            }
            if(email.charAt(i)=='@'){
                cantarrobas++;
            }
            i++;
        }
        if(cantarrobas!=1){
            resultado = false;
        }
        return resultado;
    }
    
    public ArrayList<String> listarNickUsuarios(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        ArrayList<String> nicks = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Usuario> usr = it.next();
           nicks.add(usr.getValue().getNick());
        }
        return nicks;
    }
    
     public ArrayList<String> listarNombreProgramas(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Programa>> it = sm.getProgramas().entrySet().iterator();
        ArrayList<String> nombres = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Programa> usr = it.next();
           nombres.add(usr.getValue().getNombre());
        }
        return nombres;
    }
     
     public ArrayList<String> listarNombreCursos(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Curso>> it = sm.getCursos().entrySet().iterator();
        ArrayList<String> nombres = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Curso> usr = it.next();
           nombres.add(usr.getValue().getNombre());
        }
        return nombres;
    }
    
    public DTUsuario obtenerUsuario(String nick){
       Singleton sm = Singleton.getInstance();
       Usuario u = sm.obtenerUsuario(nick);
       return new DTUsuario(u.getNick(), u.getNombre(), u.getApellido(), u.getCorreo(), u.getFecha_de_nac());
    }
    /*
    public Usuario obtenerUsuario(String nick){
        Singleton sm = Singleton.getInstance();
        return sm.obtenerUsuario(nick);
    }*/
    
    public void modificarDatosUsuario(String nick, String nuevoNom, String nuevoApe, Date nuevaFechaNac){
        Singleton sm = Singleton.getInstance();
        Usuario u = sm.obtenerUsuario(nick);
        u.setNombre(nuevoNom);
        u.setApellido(nuevoApe);
        u.setFecha_de_nac(nuevaFechaNac);
    }
    
    public void altaInstituto(String nom){
        Singleton sm = Singleton.getInstance();
        sm.agregarInstituto(new Instituto(nom));
    }
    
    public ArrayList<String> listarInstitutos(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Instituto>> it = sm.getInstitutos().entrySet().iterator();
        ArrayList<String> nombresInst = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Instituto> inst = it.next();
           nombresInst.add(inst.getValue().getNombre());
        }
        return nombresInst;
    }
    
    public DTInstituto buscarInstituto(String nombInst){return null;};
    
    public Set<DTEdicion> mostrarEdicion(String nick){return null;};
    
    public ArrayList<String> mostrarProgramasEst(String nick){
        Singleton sm = Singleton.getInstance();
        ArrayList<String> programasEst = new ArrayList<>();
        Iterator<Map.Entry<String, Programa>> it = sm.getProgramas().entrySet().iterator();
        while(it.hasNext()){
           Map.Entry<String, Programa> prog = it.next();
           for (Iterator it2 = prog.getValue().getInscripciones().iterator(); it2.hasNext();) {
                InscripcionP ip = (InscripcionP) it2.next();
                if(ip.getEst().getNick().equals(nick)){
                    programasEst.add(prog.getValue().getNombre());
                }
            }
        }
        return programasEst;
    }
    
    public Set<Curso> mostrarCursosDocente(String nick){return null;}; 
    
    public Set<DTPrograma> mostrarProgramaDoc(String nick){return null;};
    
    public Set<DTUsuario> consultaUsuarios(){return null;};
    
    public DTUsuario seleccionarUsuario(String nick){return null;};
    
    //public void modificarDatosUsuario(DTUsuario nuevo){};
    
    public void agregarCursoPrograma(String nombreP, String nombreC){
        
        Singleton sm = Singleton.getInstance();
        Programa p1 = sm.obtenerPrograma(nombreP);
        Curso c1 = sm.obtenerCurso(nombreC);
        p1.agregarCurso(c1);
        
    };
    //corregir
    
    public List mostrarCursos(){
    	
        Singleton sm = Singleton.getInstance();
        List cur = new ArrayList();
        for(Map.Entry<String,Curso> entry : sm.getCursos().entrySet()){
            Curso c1 = (Curso)entry.getValue();
            DTCurso dtc = c1.getDatos();
            cur.add(dtc);
            
        }
        
        return cur;
    }
    
    public List mostrarProgramas(){
        Singleton sm = Singleton.getInstance();
        List prog = new LinkedList();
        for(Map.Entry<String,Programa> entry : sm.getProgramas().entrySet()){
            Programa p1 = (Programa)entry.getValue();
            DTPrograma dprog = p1.getDatos();
            prog.add(dprog);
        }
        
        return prog;
          
    }
    
    public DTCurso obtenerCurso(String nombreC){
        Singleton sm = Singleton.getInstance();
        Curso c1 = sm.obtenerCurso(nombreC);
        DTCurso dtc = c1.getDatos();
        return dtc;
    }
    
    public DTPrograma obtenerPrograma(String nombreP){
        
        Singleton sm = Singleton.getInstance();
        Programa p1 = sm.obtenerPrograma(nombreP);
        DTPrograma dtp = p1.getDatos();
        return dtp;
    }
    
    public ArrayList<String> cursosPrograma(String nombreP){
        
        Singleton sm = Singleton.getInstance();
        Programa p1 = sm.obtenerPrograma(nombreP);
        Iterator<Map.Entry<String, Curso>> it = p1.getCursos().entrySet().iterator();
        ArrayList<String> nombresC = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Curso> inst = it.next();
           nombresC.add(inst.getValue().getNombre());
        }
        return nombresC;
        
    }
    
    public boolean chequearInstituto(String nombreI){return false;};
    
    public void modificarNombreInstituto(String nombreI, String nuevonombre){};
    
    public ArrayList<String> cursosInstituto(String nombreI){
        Singleton sm = Singleton.getInstance();
        Instituto inst = sm.obtenerInstituto(nombreI);
        Iterator<Map.Entry<String,Curso>> it = inst.getCursos().entrySet().iterator();
        ArrayList<String> cursosInst = new ArrayList<String>();
        while(it.hasNext()){
            Map.Entry<String,Curso> cur = it.next();
            cursosInst.add(cur.getValue().getNombre());
        }
        return cursosInst;
    
    };
    
    public Curso obtenerCursoDelInstituto(String nombreI, String nombreC){
        Singleton sm = Singleton.getInstance();
        Instituto inst = sm.obtenerInstituto(nombreI);
        Curso cur = inst.obtenerCurso(nombreC);
        return cur;
        }
    
     public ArrayList<String> EdicionesCurso(String nombreI, String nombreCurso){
        Curso cur = obtenerCursoDelInstituto( nombreI,  nombreCurso);
        Iterator<Map.Entry<String,Edicion>> it = cur.getEdiciones().entrySet().iterator();
        ArrayList<String> edicionesCurso = new ArrayList<String>();
        while(it.hasNext()){
            Map.Entry<String,Edicion> edic = it.next();
            edicionesCurso.add(edic.getValue().getNombreEdicion());
        }
        return edicionesCurso;
     };
    
     public DTEdicion datosEdicion(String nombreI, String nombreCurso, String nombreEdicion){
        Curso cur = obtenerCursoDelInstituto( nombreI, nombreCurso);
        Edicion edi;
        edi = cur.obtenerEdicion(nombreEdicion);
        return new DTEdicion(edi.getNombreEdicion(),edi.getFechaIni(),edi.getFechaFin(),edi.getCuposMax(),edi.getFechaPub());
     
     }
     
    public boolean checkPrograma(String nombrep){
        Singleton sm = Singleton.getInstance();
        Programa p = sm.obtenerPrograma(nombrep);
        if(p != null)
           return true;
        else
            return false;  
    };
    
    public void modificarDatosPrograma(DTPrograma datos){
        Singleton sm = Singleton.getInstance();
        Programa p = sm.obtenerPrograma(datos.getNombre());
        p.setNombre(datos.getNombre());
        p.setDescripcion(datos.getDescripcion());
        p.setFecha_ini(datos.getFechaInicial());
        p.setFecha_fin(datos.getFechaFinal());
        p.setFechaAlta(datos.getFechaAlta());
    
    };
    
    public void crearPrograma(DTPrograma datos){
        Singleton sm = Singleton.getInstance();
        Programa p = new Programa(datos.getNombre(),datos.getDescripcion(),datos.getFechaInicial(),
                                    datos.getFechaFinal(),datos.getFechaAlta());
        sm.agregarPrograma(p);
        
    }; 
    
    public String checkEdicionCurso(String nombreC){
        Singleton sm = Singleton.getInstance();
        Curso cur = sm.obtenerCurso(nombreC);
      //  ZoneId zone = ZoneId.of("America/Buenos_Aires");
       // LocalDate today = LocalDate.now(zone);
      //  Iterator<Map.Entry<String,Edicion>> it = cur.getEdiciones().entrySet().iterator();
      //  while(it.hasNext()){
      //     Edicion edic = (Edicion) it.next();
           //if (today.compareTo(edic.getFechaIni()) < 0 ){
          //     return edic.getNombreEdicion();
           //} 
        if(cur.getEdiciones() != null)   return "Prueba";
     //   }
       else return null;
    };
    
    
    
    public boolean ExisteRegistroInscripcionE(String nombreEst, String nombreC, String nombreE){
        Singleton sm = Singleton.getInstance();
        Curso cur = sm.obtenerCurso(nombreC);
        Edicion edi  = cur.obtenerEdicion(nombreE);
        return edi.obtenerInscripcionE(nombreEst) != null;
    };
    
    public ArrayList<String> listarEstudiantes(){
        Singleton sm = Singleton.getInstance();
        Iterator <Map.Entry<String,Usuario>> it = sm.getUsuarios().entrySet().iterator();
        ArrayList<String> estudiantes = new ArrayList<String>();
        while(it.hasNext()){
         //  Usuario u = (Usuario) it.next();
            Map.Entry<String, Usuario> usr = it.next();
        //   if(usr instanceof Estudiante){
               estudiantes.add(usr.getValue().getNick());
         //  }
        }
        return estudiantes;
    };
    
    public void crearInscripcionEstudiante(String nombreC, String nombreEdi, String nombreEst, Date fecha_insc){
        Singleton sm = Singleton.getInstance();
        Usuario u =  sm.obtenerUsuario(nombreEst);
        Estudiante e = (Estudiante) u;
        InscripcionE nueva = new InscripcionE(fecha_insc, e);
        Curso curso = sm.obtenerCurso(nombreC);
        Edicion edicion = curso.obtenerEdicion(nombreEdi);
        edicion.agregarInscripcionE(nueva);
    }
   public void modificarInscripcionEstudiante(String nombreC, String nombreEdi, String nombreEst, Date nueva_fecha){
       Singleton sm = Singleton.getInstance();
       Curso curso = sm.obtenerCurso(nombreC);
       Edicion edicion = curso.obtenerEdicion(nombreEdi);
       InscripcionE insc = edicion.obtenerInscripcionE(nombreEst);
       insc.modificarDatos(nueva_fecha);
       
   }
    
    public Set<String> pickCurso (String nombreC){return null;};
    
    public void modRegAlumEdicion(Date nuevaFecha){};
    
    public InscripcionE crearRegistro(String correo, Date FechaInsc){return null;};
    
    public Set<DTCurso> indicarInstitucion(String nombre){return null;};
    
    public DTCurso seleccionarCurso(String nombre){return null;};
    
    public boolean seleccionarEdicionOPrograma(String nombre, DTEdicion edicion){return false;};
    
    public Set<DTEdicion> listaEdicion(String Instituto){return null;};
    
    public DTEdicion seleccionarEdicion(String nombre, DTEdicion edicion){return null;};
    
    public void editarEdicion(DTEdicion dataedicion){};
    
    public void indicarInstitucion2(String nombreI){}; // que hace?
    
    public boolean indicarNombreCurso(String nombreC){return false;}; // que hace?
    
    public void registrarCurso(DTCurso datoscurso){}; 
    
    public void editarCursoInst(DTCurso datos){};
    
    public void cancelar(){};
    
    public void aceptar(){};
    
}
