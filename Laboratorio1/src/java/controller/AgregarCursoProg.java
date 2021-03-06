/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTCurso;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Surface
 */
public class AgregarCursoProg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //try (PrintWriter out = response.getWriter()) {
            FabricaLab fabrica = FabricaLab.getInstance();
            ISistema ICU = fabrica.getISistema();
            String curso = request.getParameter("cur");
            String programa = request.getParameter("prog");
            System.out.println("curso: " + curso + " programa: " + programa); //esta tomando null
            if(curso!=null && programa != null){
                ICU.agregarCursoPrograma(programa, curso);
            }
            request.getRequestDispatcher("/WEB-INF/Programa/AgregarCursoProg.jsp").forward(request, response);
       // }catch(Exception e){
       //     System.out.print("No funciono");
       // }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            FabricaLab fabrica = FabricaLab.getInstance();
            ISistema ICU = fabrica.getISistema();
            ArrayList<String> programas = ICU.listarNombreProgramas();
            request.setAttribute("programas", programas);
            List cursos = ICU.mostrarCursos();
            ArrayList<String> cur = new ArrayList<String>();
            DTCurso dato; 
            for(Object c : cursos){
                dato = (DTCurso)c;
                cur.add(dato.getNombre());
            }
            request.setAttribute("cursos", cur); 
            processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
