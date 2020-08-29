package Datatypes;

import java.util.LinkedList;
import java.util.List;

public class DTInstituto {
	
	//Atributos
	
	private String nombre;
	private List cursos;
	private List docentes;
	
	//Metodos
	
        public DTInstituto(String nombre,List cursos,List docentes){
            this.nombre=nombre;
            this.cursos = new LinkedList();
            this.docentes = new LinkedList();
        }
        
	public String getNombre() {
		return this.nombre;
	}
	public List getCursos() {
		return this.cursos;
	}
	public List getDocentes() {
		return this.docentes;
	}
	
	
}
