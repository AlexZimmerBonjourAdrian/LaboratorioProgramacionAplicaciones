/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTCurso;
import Datatypes.DTPrograma;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author arena
 */
public class programadatos extends HttpServlet {

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
        
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        
        response.setContentType("text/html;charset=UTF-8");
 //       String prog = request.getParameter("prog");
   //      if(prog!=null) {
     //        Set<DTCurso> cursos = ICU.DTcursosPrograma(prog);
       //      request.setAttribute("cursos", cursos);
   //      }
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
        
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        
        String prog = request.getParameter("prog");
        
        DTPrograma dtprograma = ICU.obtenerPrograma(prog);
        Set<String> catprog = ICU.CategoriasProgramas(prog);
   //     Set<DTCurso> cursos = ICU.DTcursosPrograma(prog);
      
   //     request.setAttribute("cursos", cursos);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        
        
        
        
        JSONObject j = new JSONObject(); 
        String result1 = ""; 
        for(Object cp : catprog){
            result1 = result1 + "<option>"+ cp + "</option>";
         
        }
        j.put("result1",result1);
        j.put("nombre", dtprograma.getNombre());
        j.put("descripcion", dtprograma.getDescripcion());
        j.put("fechaini", dtprograma.getFechaInicial().toString());
        j.put("fechafin", dtprograma.getFechaFinal().toString());
        j.put("fechaalta", dtprograma.getFechaAlta().toString());

        response.getWriter().write(j.toString());
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
