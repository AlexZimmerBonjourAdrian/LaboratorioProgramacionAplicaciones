/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import LOGICA.Singleton;
import Datatypes.DTCurso;
import Datatypes.DTInstituto;

/**
 *
 * @author Bruno
 */
public class Instituto {
    
	//Atributos
	
    private String nombre;
    private Map<String,Curso> cursos;
    private Map<String,Docente> docentes;
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Map<String,Curso> getCursos(){
        return this.cursos;
    }
    
    public Map<String,Docente> getDocentes(){
        return this.docentes;
    }
    
    public Curso obtenerCurso(String nomCurso){
        return cursos.get(nomCurso);
    }
    
    public Docente obtenerDocente(String nickDocente){
        return docentes.get(nickDocente);
    }
    
    public void addDocente(Docente d){
        if(obtenerDocente(d.getNick())==null){
            docentes.put(d.getNick(), d);
            //borrar esto
            System.out.println("Se agrego al instituto: " + getNombre() + "el docente: " + d.getNick());
        }
    }
    
    public void addCurso(Curso c){
        if(obtenerCurso(c.getNombre())==null){
            cursos.put(c.getNombre(), c);
        }
    }
    
    
    public Instituto(String nombre) {
        this.nombre=nombre;
    	cursos = new HashMap();
    	docentes = new HashMap();
    }
    
    
    public DTInstituto getDatos() {
    	
    	
    	return new DTInstituto(this.nombre);
    
    }
    
    
      /*
         public ArrayList<DTCurso>  getDataCurso()
    {
        Iterator<Map.Entry<String, Curso>> it = cursos.;
        ArrayList<DTCurso> Cur = new ArrayList<DTCurso>();
        while(it.hasNext())
        {
          Map.Entry<String, Curso> usr = it.next(); 
          Cur.add(usr.getValue().getDatos());
        }
        return Cur;
    }
       */

   
 
   

   
}
