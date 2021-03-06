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
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;

/**
 *
 * @author arena
 */
public class consultaediciondecurso extends HttpServlet {

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
      
       
           request.getRequestDispatcher("/WEB-INF/Edicion/ConsultaEdiCurso.jsp").forward(request, response);
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
        ArrayList<String> categorias = ICU.listarCategorias();
        request.setAttribute("categorias", categorias);
        
 //       String edi = request.getParameter("edi");
//        DTEdicion datosedicion = ICU.datosEdicion(curso, edi);
//        request.setAttribute("docentes", datosedicion.getDocentes());
        
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
//        String cat = request.getParameter("cat");
        String cur = request.getParameter("cur");
        ArrayList<String> cursos = ICU.cursosInstituto(inst);
    //    System.out.println(inst + curs);
  //      ArrayList<String> ediciones = ICU.EdicionesCurso(cur);
        //request.setAttribute("cursos", cursos);  
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
       
       
        JSONObject j = new JSONObject(); 
        String result1 = "";
    //    String result2 = ""; 
        for(Object curso : cursos){
            result1 = result1 + "<option>" + curso + "</option> ";
            
        }
  //      for(Object edicion : ediciones){
  //          result2 = result2 + "<option>" + edicion + "</option>";
            
  //      }
        j.put("result1",result1);
  //      j.put("result2",result2);
        
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
