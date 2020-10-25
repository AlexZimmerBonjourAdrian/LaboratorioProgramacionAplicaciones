/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DATABASE.Persistencia;
import Datatypes.DTCurso;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author admin
 */
public class Curso extends HttpServlet {

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
            throws ServletException, IOException, ParseException {
        response.setContentType("text/html;charset=UTF-8");
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        String nomCur=request.getParameter("nomCur");
        String desCur=request.getParameter("desCur");
        String durCur=request.getParameter("durCur");
        String horasCur=request.getParameter("horasCur");
        String credCur=request.getParameter("credCur");
        String urlCur=request.getParameter("url");
        String fecha = request.getParameter("fecha");
        String inst = request.getParameter("inst");
        Date fechaDate=null;
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        if(fecha!=null){
            fechaDate = formato.parse(fecha);
        }
        String[] previas = request.getParameterValues("previas");
        String[] cat = request.getParameterValues("cat");
        List lista = new ArrayList();
        if(previas!=null){
            lista = Arrays.asList(previas);
        }
        List lista2 = new ArrayList();
        if(cat!=null){
            lista2 = Arrays.asList(cat);
        }
        if(nomCur!=null){
            DTCurso datoscurso = new DTCurso(nomCur,desCur,durCur,Double.parseDouble(horasCur),Double.parseDouble(credCur),fechaDate,urlCur);
            ICU.registrarCurso(inst, datoscurso, lista, lista2);
        }
        request.getRequestDispatcher("/WEB-INF/Curso/Curso.jsp").
						forward(request, response);

                            
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
        ArrayList<String> institutos = ICU.listarInstitutos();
        request.setAttribute("institutos", institutos); 
        ArrayList<String> cat = ICU.listarCategorias();
        request.setAttribute("categorias", cat); 
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Curso.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            FabricaLab fabrica = FabricaLab.getInstance();
            ISistema ICU = fabrica.getISistema();
            String inst = request.getParameter("inst");
            ArrayList<String> cur = ICU.cursosInstituto(inst);
            JSONObject j = new JSONObject(); 
            
            String result1 = "";
           
            for(Object curso : cur){
                result1 = result1 + "<option>" + curso + "</option> ";

            }
            
            j.put("result1",result1);
       
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
