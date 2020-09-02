/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Datatypes.DTCurso;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import Datatypes.DTInstituto;
import Datatypes.DTEdicion;
import LOGICA.Singleton;
import java.util.*;
import java.util.Set;
/**
 *
 * @author pablogb
 */
public class Instituto {

     String Nombre;
    List Cursos;
    List Docentes;
    
    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    private String nombre;
    
    public Instituto(String nombre,List Cursos, List Docente)
    {
        this.Nombre= nombre;
        Cursos= new LinkedList();
        Docentes = new LinkedList();
    }
    
   public boolean  IndicarNombreCurso(String nombreCurso)
   {
       //Metodo
       return true;
   }
   
    public DTInstituto getDatos(){
    
        return new DTInstituto(this.Nombre,this.Cursos,this.Docentes);
    }
   
   public void RegistraCurso(DTCurso dataCurso)
   {
       //Metodo a aplicar
   }
   
   public void EditarCursoins(DTCurso dataCurso)
   {
      //Metodo 
   }
   
   public void cancelar()
   {
       //Metodo
   }
   /*
   public DTEdicion  selecionarEdicion(String nombre, DTEdicion Dato)
   {
       
       Iterator<Map.Entry<String, Curso>> it = Cursos.iterator();
       Map.Entry<String, Curso> Cur;
       DTEdicion Ed;
       //ArrayList<String> nicks = new ArrayList<String>();
       
       while(it.hasNext())
       {
           //map<int,Curso>::Iterator t;
         //  Map.Entry<Integer, Curso> Cur = it.next();
           Cur.getValue().seleccinarEdicion(nombre, Dato);
           //Curs.getValue().
       }
       
        
        
        //ArrayList<DTCurso> Cur = new ArrayList<DTCurso>();
        while(it.hasNext()){
          Cur = it.next();
         Ed = Cur.getValue().seleccinarEdicion(nombre, Dato);
        }
          return Ed;
    }
       
               
       
       Iterator it=Cursos.iterator();
       Curso *C;
       while(it->Cursos.listIterator().)
      *
    //Curso Cur = (Curso*) Cursos;
    
        
     //while(C)
        
   }
*/
    public ArrayList<DTCurso>  getDataCurso()
    {
        Iterator<Map.Entry<String, Curso>> it = Cursos.iterator();
        ArrayList<DTCurso> Cur = new ArrayList<DTCurso>();
        while(it.hasNext())
        {
          Map.Entry<String, Curso> usr = it.next(); 
          Cur.add(usr.getValue().getDatos());
        }
        return Cur;
    }
    
   
        //Singleton sm = Singleton.getInstance();
       // Iterator<Map.Entry<String, Usuario>> it = sm.getUsuarios().entrySet().iterator();
    
}
