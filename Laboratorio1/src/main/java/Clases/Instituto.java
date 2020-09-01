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
import java.util.Iterator;


/**
 
 * @author Alex2
 */
public class Instituto {
    String Nombre;
    List Cursos;
    List Docentes;
    
    public Instituto(String nombre)
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
   
   public void seleccinarEdicion(String nombre, DTEdicion Dato)
   {
       
       Iterator it=Cursos.iterator();
       Curso *C;
       while(it->Cursos.listIterator().)
       
    //Curso Cur = (Curso*) Cursos;
    
        
     //while(C)
        
   }
           
  
  
  
  
   
}
