/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTCurso;
import Datatypes.DTEdicion;
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
 * @author Surface
 */
public class edicionCurso extends HttpServlet {

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
        String inst = request.getParameter("inst");
        System.out.println(curso + inst);
        ArrayList<String> ediciones = ICU.EdicionesCurso(curso);
        System.out.println("la edicion es: " + ediciones.get(0));
        //request.setAttribute("ed", ediciones);  
  
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
       
        JSONObject j = new JSONObject(); 
        String result1 = "";
        //String result2 = ""; 
        for(Object ed : ediciones){
            result1 = result1 + "<option>" + ed + "</option> ";
            
        }
        //for(Object ed : ediciones){
        //    result2 = result2 + "<option>" + ed + "</option>";
            
        //}
        j.put("result1",result1);
        //j.put("result2",result2);
        
        response.getWriter().write(j.toString());
        //out.print(j.toJSONString());
        
        //processRequest(request, response);
    

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
