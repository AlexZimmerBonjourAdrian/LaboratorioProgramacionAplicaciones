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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author admin
 */
public class cursodatos extends HttpServlet {

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
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        String curso = request.getParameter("cur");
        DTCurso dtcur = ICU.obtenerCurso(curso);
        request.setAttribute("curso", dtcur);
        request.getRequestDispatcher("/WEB-INF/Curso/CursoDatos.jsp").forward(request, response);
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
        String curso = request.getParameter("cur");
        
        DTCurso dtcur = ICU.obtenerCurso(curso);
        ArrayList<String> ediciones = ICU.EdicionesCurso(curso);
        ArrayList<String> programas = ICU.ProgramasCursos(curso);
        
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        
        String result1 = "";
       String result2 = "";
        
         for(Object edi : ediciones){
            result1 = result1 + "<option>"+ edi + "</option>";
         
        }
         
          for(Object prog : programas){
            result2 = result2 + "<option>"+ prog + "</option>";
         
        }
     
        
        JSONObject j = new JSONObject(); 
        j.put("nombre", dtcur.getNombre());
        j.put("descripcion", dtcur.getDescripcion());
        j.put("duracion", dtcur.getDuracion());
        j.put("horas", dtcur.getHoras());
        j.put("creditos", dtcur.getCreditos());
        j.put("fechaReg", dtcur.getFechaReg().toString());
        j.put("url", dtcur.getUrl());
        j.put("result1",result1);
        j.put("result2",result2);
        
                        
        
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
