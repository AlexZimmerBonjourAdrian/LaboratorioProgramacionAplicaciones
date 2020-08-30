/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.*;
import java.util.Date;

import java.util.Set;
/**
 *
 * @author arena
 */
public class Sistema implements ISistema{
    
    public Sistema(){};
    
    public boolean altaUsuario(DTUsuario datos){return false;};
    
    public DTInstituto buscarInstituto(String nombInst){return null;};
    
    public Set<DTEdicion> mostrarEdicion(String nick){return null;};
    
    public Set<DTPrograma> mostrarProgramasEst(String nick){return null;};
    
    public Set<Curso> mostrarCursosDocente(String nick){return null;}; 
    
    public Set<DTPrograma> mostrarProgramaDoc(String nick){return null;};
    
    public Set<DTUsuario> consultaUsuarios(){return null;};
    
    public DTUsuario seleccionarUsuario(String nick){return null;};
    
    public void modificarDatosUsuario(DTUsuario nuevo){};
    
    public void agregarCursoPrograma(String nombreP, String nombreC){};
    
    public Set<DTCurso> mostrarCursos(){return null;};
    
    public Set<DTPrograma> mostrarProgramas(){return null;};
    
    public DTCurso mostrarCurso(String nombreC){return null;};
    
    public DTPrograma mostrarPrograma(String nombreP){return null;};
    
    public boolean chequearInstituto(String nombreI){return false;};
    
    public void modificarNombreInstituto(String nombreI, String nuevonombre){};
    
    public Set<String> cursosInstituto(String nombreI){return null;};
    
    public DTEdicion pickEdicion(String nombreE){return null;};
    
    public boolean checkPrograma(DTPrograma datos){return false;};
    
    public void modificarDatosPrograma(DTPrograma datos){};
    
    public Programa crearPrograma(DTPrograma datos){return null;}; 
    
    public boolean checkEdicionCurso(String nombreC, Date FechaInsc){return false;};
    
    public boolean checkRegistro(String correo, String nombreC, String nombreE){return false;};
    
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
