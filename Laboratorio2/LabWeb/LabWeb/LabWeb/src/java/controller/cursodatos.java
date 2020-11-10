
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTCurso;
import Datatypes.DTInstituto;
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
        try{
            DTCurso dtcur = ICU.obtenerCurso(curso);
            ArrayList<String> ed = ICU.EdicionesCurso(curso);
            ArrayList<String> prog = ICU.ProgramasCursos(curso);
            request.setAttribute("curso", dtcur);
            request.setAttribute("ediciones", ed);
            request.setAttribute("programas", prog);
            request.getRequestDispatcher("/WEB-INF/Curso/CursoDatos.jsp").forward(request, response);
        }catch(Exception e){
            request.getRequestDispatcher("/Error.html").forward(request, response);
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
        DTInstituto tryinst = ICU.obtenerInstitutoCurso(curso);
        String inst = null;
        if(tryinst!=null){
            inst = tryinst.getNombre();
            System.out.println("INSTITUTO="+ inst);
        }
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        
        String result1 = "";
        String result2 = "";
        String result3 = "<img src=\"" + dtcur.getImagenDir() + "\" >";
        
         for(Object edi : ediciones){
            result1 = result1 + "<label><a href=\"consultaediciondecurso?inst="+inst+"&cur="+ curso + "&ed=" + edi + "\">" + edi +"</a></label><br>";
         
        }
         
        for(Object prog : programas){
            result2 = result2 + "<label><a href=\"consultaPrograma?prog="+ prog + "\">"+ prog +"</a></label><br>";
         
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
        j.put("result3",result3);
        
                        
        
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
