/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LOGICA;

import Clases.*;
import Datatypes.DTCurso;
import Datatypes.DTEdicion;
import Datatypes.DTInstituto;
import Datatypes.DTPrograma;
import Datatypes.DTUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 *
 * @author arena
 */
public interface ISistema {
    
    public void altaUsuario(DTUsuario datos, boolean docente, String nomInst);
    
    public boolean chekusuario(String nick);
    
    public boolean chekuUsuarioEmail(String email);
    
    public boolean sintaxisEmailCorrecta(String email);
    
    public ArrayList<String> listarNickUsuarios();
    
    public DTUsuario obtenerUsuario(String nick);
    
    //public Usuario obtenerUsuario(String nick);
    
    public ArrayList<String> listarNombreProgramas();
    
    public ArrayList<String> listarNombreCursos();
    
    public void modificarDatosUsuario(String nick, String nuevoNom, String nuevoApe, Date nuevaFechaNac);
    
    public void altaInstituto(String nom);
    
    public ArrayList<String> listarInstitutos();
    
    public DTInstituto buscarInstituto(String nombInst);
    
    public Set<DTEdicion> mostrarEdicion(String nick);
    
    public ArrayList<String> mostrarProgramasEst(String nick);
    
    public Set<Curso> mostrarCursosDocente(String nick); // da error porque no esta implementado Curso
    
    public Set<DTPrograma> mostrarProgramaDoc(String nick);
    
    public Set<DTUsuario> consultaUsuarios();
    
    public DTUsuario seleccionarUsuario(String nick);
   
    public void agregarCursoPrograma(String nombreP, String nombreC);
    
    public List mostrarCursos();
    
    public List mostrarProgramas();
    
    public DTCurso obtenerCurso(String nombreC);
    
    public DTPrograma obtenerPrograma(String nombreP);
    
    public boolean chequearInstituto(String nombreI);
    
    public void modificarNombreInstituto(String nombreI, String nuevonombre);
    
    public ArrayList<String> cursosInstituto(String nombreI);
    
    public ArrayList<String> cursosPrograma(String nombreP);
    
    public Curso obtenerCursoDelInstituto(String nombreI, String nombreC);
 
    public ArrayList<String> EdicionesCurso(String nombreI, String nombreCurso);
     
    public DTEdicion datosEdicion(String nombreI, String nombreCurso, String nombreEdicion);
    
    public boolean checkPrograma(String datos);
    
    public void modificarDatosPrograma(DTPrograma datos);
    
    public void crearPrograma(DTPrograma datos); 
    
    public String checkEdicionCurso(String nombreI, String nombreC, Date FechaInsc);
    
    public boolean ExisteRegistroInscripcionE(String nombreI, Estudiante e, String nombreC, String nombreE);
    
    public Set<String> pickCurso (String nombreC);
    
    public void modRegAlumEdicion(Date nuevaFecha);
    
    public InscripcionE crearRegistro(String correo, Date FechaInsc);
    
    public Set<DTCurso> indicarInstitucion(String nombre);
    
    public DTCurso seleccionarCurso(String nombre);
    
    public boolean seleccionarEdicionOPrograma(String nombre, DTEdicion edicion);
    
    public Set<DTEdicion> listaEdicion(String Instituto);
    
    public DTEdicion seleccionarEdicion(String nombre, DTEdicion edicion);
    
    public void editarEdicion(DTEdicion dataedicion);
    
    public void indicarInstitucion2(String nombreI); // que hace?
    
    public boolean indicarNombreCurso(String nombreC); // que hace?
    
    public void registrarCurso(DTCurso datoscurso);
    
    public void editarCursoInst(DTCurso datos);
    
    public void cancelar();
    
    public void aceptar();
    
}
