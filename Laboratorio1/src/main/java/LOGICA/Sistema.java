/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.*;
import java.util.*;

/**
 *
 * @author arena
 */
public class Sistema implements ISistema{
    
    
    public Sistema(){};
    
    
    
    public void altaUsuario(DTUsuario datos, boolean docente, List nomInst){
        
        Singleton sm = Singleton.getInstance();
        Usuario u;
        String nombreInst;
        if(docente){
              u = new Docente(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
              for(Object nombre : nomInst){
                  nombreInst = nombre.toString();
                  sm.obtenerInstituto(nombreInst).addDocente((Docente)u);
              }
              
        }else{
              u = new Estudiante(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
        }
        sm.agregarUsuario(u);
    };
    
    public boolean chekusuario(String nick){
        
        Singleton sm = Singleton.getInstance();
        if(sm.obtenerUsuario(nick)!=null){
            return false;
        }else{
            return true;
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
    
    public ArrayList<String> mostrarEdicion(String nick){
        Singleton sm = Singleton.getInstance();
        Usuario u = sm.obtenerUsuario(nick);
        ArrayList<String> ediciones = new ArrayList<>();
        Iterator<Map.Entry<String, Curso>> it = sm.getCursos().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Curso> curso = it.next();
            Iterator<Map.Entry<String, Edicion>> ite = curso.getValue().getEdiciones().entrySet().iterator();
            while(ite.hasNext()){
                Map.Entry<String, Edicion> edic = ite.next();
                if(u instanceof Estudiante){
                    for(Iterator itinsc = edic.getValue().getInscripciones().iterator(); itinsc.hasNext();){
                        InscripcionE ie = (InscripcionE) itinsc.next();
                        if(ie.getEst().getNick().equals(nick)){
                            ediciones.add(edic.getValue().getNombreEdicion());
                        }
                    }
                }else{
                    if(edic.getValue().obtenerDocente(nick)!=null){
                        ediciones.add(edic.getValue().getNombreEdicion());
                    }
                } 
            }
        }
        return ediciones;
    }
    
    public ArrayList<String> mostrarProgramasUsuario(String nick){
        Singleton sm = Singleton.getInstance();
        Usuario u = sm.obtenerUsuario(nick);
        ArrayList<String> programas = new ArrayList<>();
        //if(sm.getProgramas()!=null){
            Iterator<Map.Entry<String, Programa>> it = sm.getProgramas().entrySet().iterator();
            while(it.hasNext()){
                Map.Entry<String, Programa> prog = it.next();
                if(u instanceof Estudiante){
                    //if(prog.getValue().getInscripciones()!=null){
                       for (Iterator it2 = prog.getValue().getInscripciones().iterator(); it2.hasNext();) {
                            InscripcionP ip = (InscripcionP) it2.next();
                            if(ip.getEst().getNick().equals(nick)){
                                programas.add(prog.getValue().getNombre());
                            }
                        } 
                    //}else System.out.println("hay programas pero no inscripciones");
                }else{
                    //if(prog.getValue().getCursos()!=null){
                        Iterator<Map.Entry<String, Curso>> itc = prog.getValue().getCursos().entrySet().iterator();
                        while(itc.hasNext()){
                            Map.Entry<String, Curso> curso = itc.next();
                            //if(curso.getValue().getEdiciones()!=null){
                                Iterator<Map.Entry<String, Edicion>> ite = curso.getValue().getEdiciones().entrySet().iterator();
                                while(ite.hasNext()){
                                    Map.Entry<String, Edicion> edic = ite.next();
                                    if(edic.getValue().getDocentes()!=null){
                                        Iterator<Map.Entry<String, Usuario>> itd = edic.getValue().getDocentes().entrySet().iterator();
                                        while(itd.hasNext()){
                                            Map.Entry<String, Usuario> docente = itd.next();
                                            if(docente.getValue().getNick().equals(nick)){
                                                programas.add(prog.getValue().getNombre());
                                            }
                                        } 
                                    }   
                                } 
                            //}else System.out.println("hay cursos pero no tienen ediciones");
                            
                        } 
                    //}else System.out.println("hay programas pero no tienen cursos"); 
                }
            }
        //}else System.out.println("no hay programas en el sistema");
        return programas;
    }
    
    public ArrayList<String> mostrarCursosDocente(String nick){
        Singleton sm = Singleton.getInstance();
        ArrayList<String> cursos = new ArrayList<>();
        Iterator<Map.Entry<String, Curso>> it = sm.getCursos().entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<String, Curso> curso = it.next();
            Iterator<Map.Entry<String, Edicion>> ite = curso.getValue().getEdiciones().entrySet().iterator();
            while(ite.hasNext()){
                Map.Entry<String, Edicion> edic = ite.next();
                Iterator<Map.Entry<String, Usuario>> itd = edic.getValue().getDocentes().entrySet().iterator();
                while(itd.hasNext()){
                    Map.Entry<String, Usuario> docente = itd.next();
                    if(docente.getValue().getNick().equals(nick)){
                        cursos.add(curso.getValue().getNombre());
                    }  
                }
            }
        }
        return cursos;
    } 
    
    public Set<DTPrograma> mostrarProgramaDoc(String nick){return null;};
    
    public Set<DTUsuario> consultaUsuarios(){return null;};
    
    public DTUsuario seleccionarUsuario(String nick){return null;};
    
    //public void modificarDatosUsuario(DTUsuario nuevo){};
    
    public void agregarCursoPrograma(String nombreP, String nombreC){};
    //corregir
    
    public List mostrarCursos(){
    	
        /*
        List cur = new ArrayList();
        for(Map.Entry<String,Instituto> entry : this.institutos.entrySet()){
            Instituto i1 = (Instituto)entry.getValue();
            List agr = (List) i1.getCursos();
            cur.addAll(agr);
            
        }
        */
        return null;
    }
    
    public List mostrarProgramas(){
        /*
        List prog = new LinkedList();
        for(Map.Entry<String,Programa> entry : this.programas.entrySet()){
            Programa p1 = (Programa)entry.getValue();
            DTPrograma dprog = p1.getDatos();
            prog.add(dprog);
        }
        */
        return null;
          
    }
    
    public DTCurso mostrarCurso(String nombreC){return null;};
    
    public DTPrograma mostrarPrograma(String nombreP){return null;};
    
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
    
    public String checkEdicionCurso(String nombreI,String nombreC, Date FechaInsc){
        Curso cur = obtenerCursoDelInstituto( nombreI, nombreC);
        Edicion vigente;
        Iterator<Map.Entry<String,Edicion>> it = cur.getEdiciones().entrySet().iterator();
        while(it.hasNext()){
           Edicion edic = (Edicion) it.next();
           if (FechaInsc.compareTo(edic.getFechaIni()) < 0 ){
               return edic.getNombreEdicion();
           }     
        }
        return null;
    };
    
    public boolean ExisteRegistroInscripcionE(String nombreI, Estudiante e, String nombreC, String nombreE){
        Curso cur = obtenerCursoDelInstituto( nombreI, nombreC);
        Edicion edi  = cur.obtenerEdicion(nombreE);
        return edi.obtenerInscripcionE(e) != null;
    };
    
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
