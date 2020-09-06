/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.*;
import java.time.Instant;
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
    public Set<DTEdicion> mostrarEdicion(String nick)
    {
         Singleton sm = Singleton.getInstance();
        Curso Cur = sm.obtenerCurso(nick);
        return Cur.ListarEdicion();
    }
    
    /*
    public Set<DTEdicion> mostrarEdicion(String nick)
    {
     Singleton sm = Singleton.getInstance();
     Iterator<Map.Entry<String, Curso>>it = sm.getCursos().entrySet().iterator();
     ArrayList<String> nombreInst = new ArrayList<String>();
     while(it.hasNext())
     {
         Map.Entry<String, Instituto> Inst= it.next();
     }
    
    }
    
    */
    public DTInstituto buscarInstituto(String nombInst)
    {
        Singleton sm = Singleton.getInstance();
       Instituto inst = sm.obtenerInstituto(nombInst);
       return new DTInstituto(inst.getNombre()); 
    }
   
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
    
    public void agregarCursoPrograma(String nombreP, String nombreC){};
    //corregir
    
    public Set<DTCurso> mostrarCursos()
    {
    	Singleton sm = Singleton.getInstance();
    
         Set<DTCurso> cur= new HashSet();
        Iterator<Map.Entry<String,Curso>>it = sm.getCursos().entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry<String,Curso> inst=it.next();
            cur.add(inst.getValue().getDatos());
        }
        return cur;
         /*
                   Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Instituto>> it = sm.getInstitutos().entrySet().iterator();
        ArrayList<String> nombresInst = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Instituto> inst = it.next();
           nombresInst.add(inst.getValue().getNombre());
        }
        return nombresInst;
                
       Iterator<Map.Entry<String,Curso>> it = inst.getCursos().entrySet().iterator();
        while(it.hasNext() && existeMail){
           Map.Entry<String, Usuario> usr = it.next();
           if(usr.getValue().getCorreo().equalsIgnoreCase(email)){
               existeMail = false;
           }
        }
        return existeMail;
         */
         
        /*
        List cur = new ArrayList();
        for(Map.Entry<String,Instituto> entry != this.institutos.entrySet())
        {
            Instituto i1 = (Instituto)entry.getValue();
            List agr = (List) i1.getCursos();
            cur.addAll(agr);
            
        }
        */
        
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
    
    public DTCurso mostrarCurso(String nombreC)           
    {
        Singleton sm = Singleton.getInstance();
        Curso cur = sm.obtenerCurso(nombreC);
        return cur.getDatos();
        //return (Set<DTCurso>) Inst.getCursos();
                /*
                Singleton sm = Singleton.getInstance();
        Instituto Inst = sm.obtenerInstituto(nombre);
        return (Set<DTCurso>) Inst.getCursos();
                */
    }
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
        };
    
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
        return new DTEdicion(edi.getNombreEdicion(),edi.getFechaIni(),edi.getFechaFin(),edi.getCuposMax(),edi.getFechaPub(),edi.getDocentes(),edi.getInscripciones());
     //(String nombre,Date fecha_ini,Date fecha_fin,int cupo_max,Date fecha_pub, Map docentes, List inscripciones)
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
    
     public Set<DTCurso> indicarInstitucion(String nombre)
    {
        Singleton sm = Singleton.getInstance();
        Instituto Inst = sm.obtenerInstituto(nombre);
        return (Set<DTCurso>) Inst.getCursos();
    }
     
    
    public DTCurso seleccionarCurso(String nombre)
    {
       return mostrarCurso(nombre);
    }  
    
    public boolean seleccionarEdicionOPrograma(String nombre)
    {
         Singleton sm = Singleton.getInstance();
         Boolean IsProgram = false; 
         
         if( sm.obtenerPrograma(nombre) != null)
         {
          return IsProgram = true;  
         }
         
         else 
         {
             return IsProgram =false;
         }
             
        //Programa Pro = sm.obtenerPrograma(nombre);
        //Edicion = Edicion.get(nombre).getDatos();
        //sm.obtenerCurso(nombre).se
    }
    //Hay que Terminar
    public Set<DTEdicion> listaEdicion(String Curso)
    {
        
    /*
            public ArrayList<DTEdicion> listarNickUsuarios(){
        Singleton sm = Singleton.getInstance();
        Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
        ArrayList<String> nicks = new ArrayList<String>();
        while(it.hasNext()){
           Map.Entry<String, Usuario> usr = it.next();
           nicks.add(usr.getValue().getNick());
        }
        return nicks;
        
    */
        Singleton sm = Singleton.getInstance();
        Curso Cur = sm.obtenerCurso(Curso);
        return Cur.ListarEdicion();
        
    /*
        Singleton sm = Singleton.getInstance();
        Instituto Inst = sm.obtenerInstituto(nombre);
        return (Set<DTCurso>) Inst.getCursos();
        
    }
    }
        */
    }
    
    public DTEdicion seleccionarEdicion(String nombre, DTEdicion edicion)
    {
        Singleton sm = Singleton.getInstance();
          Iterator<Map.Entry<String, Curso>> it = sm.getCursos().entrySet().iterator();
          
         // DTEdicion Edit = sm.obtenerCurso(it.next().getValue().);
         DTEdicion Edit= null ;
         /*
          (this.nombre, this.fecha_ini, this.fecha_fin, this.cupo_max,this.fecha_pub,this.docentes,this.inscripciones);
          ArrayList<String> nicks = new ArrayList<String>();
            
            while(it.hasNext()){
           Map.Entry<String, Usuario> usr = it.next();
           nicks.add(usr.getValue().getNick());
        }
        return nicks;
          */
            while(it.hasNext())
            {
                Map.Entry<String,Curso> cur = it.next();
               Edit = cur.getValue().seleccinarEdicion(nombre, edicion);
                
            }
            /*
            Singleton sm = Singleton.getInstance();
       Usuario u = sm.obtenerUsuario(nick);
       return new DTUsuario(u.getNick(), u.getNombre(), u.getApellido(), u.getCorreo(), u.getFecha_de_nac());
    */
            return Edit;
            }
    
    public void editarEdicion(DTEdicion dataedicion){};
    
    
    
   public boolean IndicarNombreCurso(String nombreCurso)
    {
        Singleton sm = Singleton.getInstance();
        Boolean IsCur = false;
        //Edicion = Edicion.get(nombre).getDatos();
        if( sm.obtenerCurso(nombreCurso) != null)
        {
            return IsCur= true;
        }
        else
        {
            return IsCur=false;
        }
    }
    public void registrarCurso(DTCurso datoscursdo)
    {
       Singleton sm = Singleton.getInstance();
        Curso Cur = new Curso(datoscursdo.getNombre(),datoscursdo.getDescripcion(),datoscursdo.getDuracion(),datoscursdo.getHoras(),datoscursdo.getFechaReg(), datoscursdo.getUrl());
        sm.agregarCurso(Cur);
        
             // (String n, String desc, String dur, double ch, double c, Date r, String url){
              //sm.obtenerInstituto(nomInst).addDocente((Docente)u);
        //}else{
            //  u = new Estudiante(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
       // }
       // sm.agregarUsuario(u);
/*
         Singleton sm = Singleton.getInstance();
        Usuario u;
        if(docente){
              u = new Docente(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
              sm.obtenerInstituto(nomInst).addDocente((Docente)u);
        }else{
              u = new Estudiante(datos.getNick(),datos.getNombre(),datos.getApellido(),datos.getCorreo(),datos.getFecha());
        }
        sm.agregarUsuario(u);
*/
    }
    public void editarCursoInst(DTCurso datos)
    {
          
       Singleton sm = Singleton.getInstance();
       Curso Cur = sm.obtenerCurso(datos.getNombre());
       //DTUsuario(u.getNick(), u.getNombre(), u.getApellido(), u.getCorreo(), u.getFecha_de_nac());
       Cur.EditarCurso(datos);
    }
    
    
    public void cancelar(){};
    
    public void aceptar(){};

    /*
    @Override
    public boolean indicarNombreCurso(String nombreC) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

}

