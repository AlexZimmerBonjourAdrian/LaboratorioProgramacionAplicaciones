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
    
    public Instituto(String nombre) {
    	this.nombre=nombre;
    	cursos = new HashMap();
    	docentes = new HashMap();
    }
    
    public List getCursos() {
    	List cur = new LinkedList();
        for(Map.Entry<String,Curso> entry : this.cursos.entrySet()){
           Curso c1 = (Curso) entry.getValue();
           DTCurso dtc = c1.getDatos();
           cur.add(dtc);
        }
        return cur;
    }
    
    public DTInstituto getDatos() {
    	
    	
    	return new DTInstituto(this.nombre);
    
    }
    
}
