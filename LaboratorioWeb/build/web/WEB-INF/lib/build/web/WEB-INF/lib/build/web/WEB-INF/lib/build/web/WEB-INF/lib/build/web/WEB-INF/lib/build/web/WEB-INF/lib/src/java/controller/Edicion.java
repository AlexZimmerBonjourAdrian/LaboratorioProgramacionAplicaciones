/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DATABASE.Persistencia;
import Datatypes.DTEdicion;
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
public class Edicion extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.getRequestDispatcher("/WEB-INF/Edicion/Edicion.jsp").forward(request, response);
        }
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
        Persistencia p = Persistencia.getInstance();
        p.inicializarBaseDeDatos();
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        ArrayList<String> institutos = ICU.listarInstitutos();
        request.setAttribute("institutos", institutos); 
        String nombreEd = request.getParameter("nombreEd");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaIniDate = null;
        Date fechaFinDate = null;
        Date fechaPubDate = null;
        String fechaIni = request.getParameter("fechaIni");
        String fechaFin = request.getParameter("fechaFin");
        String fechaPub = request.getParameter("fechaPub");
        String llevaCupos = request.getParameter("Radio");
        String nombreCurso = request.getParameter("cur");
        int cupos = 0;
        if(llevaCupos!=null && llevaCupos.equals("Si")){
            cupos = Integer.parseInt(request.getParameter("cuposEd"));
        }
        else{ 
            cupos = 10000;
        }
        if(fechaIni!=null){
            try {
                fechaIniDate = formato.parse(fechaIni);
            } catch (ParseException ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fechaFin!=null){
            try {
                fechaFinDate = formato.parse(fechaFin);
            } catch (ParseException ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(fechaPub!=null){
            try {
                fechaPubDate = formato.parse(fechaPub);
            } catch (ParseException ex) {
                Logger.getLogger(Edicion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        String[] doc = request.getParameterValues("docentes");
        DTEdicion ed = new DTEdicion(nombreEd, fechaIniDate, fechaFinDate, cupos,fechaPubDate);
        List lista = new ArrayList();
        if(doc!=null){
            lista = Arrays.asList(doc);
        }
        if(nombreEd!=null){
            ICU.altaEdicionCurso(nombreCurso, ed, lista);
        }

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
        String inst = request.getParameter("inst");
        ArrayList<String> cursos = ICU.cursosInstituto(inst);
        ArrayList<String> docentes = ICU.listarDocentesInstituo(inst);
        //request.setAttribute("cursos", cursos);  
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
       
       
        JSONObject j = new JSONObject(); 
        String result1 = "";
        String result2 = ""; 
        for(Object curso : cursos){
            result1 = result1 + "<option>" + curso + "</option> ";
            
        }
        for(Object docente : docentes){
            result2 = result2 + "<option>" + docente + "</option>";
            
        }
        j.put("result1",result1);
        j.put("result2",result2);
        
        response.getWriter().write(j.toString());
        //out.print(j.toJSONString());
        
       
        
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
