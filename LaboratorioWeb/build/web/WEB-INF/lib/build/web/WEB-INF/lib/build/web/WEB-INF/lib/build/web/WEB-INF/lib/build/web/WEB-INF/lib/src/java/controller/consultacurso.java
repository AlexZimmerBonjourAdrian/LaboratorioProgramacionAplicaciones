/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
public class consultacurso extends HttpServlet {

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
        ArrayList<String> institutos = ICU.listarInstitutos();
        request.setAttribute("institutos", institutos); 
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("/WEB-INF/Curso/consultacurso.jsp").forward(request, response);
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
        response.setContentType("application/json");
        String inst = request.getParameter("inst");
        ArrayList<String> cursos = ICU.cursosInstituto(inst);
        String result = "";
        for(Object curso : cursos){
            result = result + "<option>" + curso + "</option> ";
            
        }
        JSONObject j = new JSONObject(); 
        j.put("result1", result);
        System.out.println(result);
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
