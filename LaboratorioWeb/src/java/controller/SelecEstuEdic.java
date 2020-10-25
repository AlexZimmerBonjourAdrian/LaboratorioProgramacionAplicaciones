/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTInscripcionE;
import Datatypes.EstadoInscripcion;
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
public class SelecEstuEdic extends HttpServlet {

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
         try{
             FabricaLab fabrica = FabricaLab.getInstance();
             ISistema ICU = fabrica.getISistema();
             String[] elegidos = request.getParameterValues("elegidos");
             String cur = request.getParameter("cur");
             String edi = request.getParameter("edi");
             if(elegidos!=null){
                for(String nombre : elegidos){
                    ICU.modificarEstadoInscripcion(cur, edi, nombre, EstadoInscripcion.ACEPTADA);
                }
             }
             request.getRequestDispatcher("/WEB-INF/Edicion/SelecEstuEdic.jsp").forward(request, response);
         }catch(Exception e){
             System.out.println("No funciono");
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
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        ArrayList<String> institutos = ICU.listarInstitutos();
        request.setAttribute("institutos", institutos);
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
        String cur = request.getParameter("cur");
        String edi = request.getParameter("edi");
        ArrayList<DTInscripcionE> inscriptos = ICU.listarDatosInscEdicion(cur, edi);
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        JSONObject j = new JSONObject();
        String result1 = "<tr> <th>Nombre</th><th>Fecha insc</th><th>Estado</th></tr>";
        //String result2 = "";
        //String result3 = "";
        String nombre;
        DTInscripcionE datosins;
        for(Object insc : inscriptos){
            datosins = (DTInscripcionE) insc;
            nombre = datosins.getEstudiante().getNick();
            result1 = result1 + "<tr><td name=\"est\" id=\"est\"> <input value=\"" + nombre + "\"name=\"elegidos\" type=\"checkbox\" >" + nombre + "</input></td>" 
             + "<td name=\"fech\" id=\"fech\">" + datosins.getFecha().toString() + "</td>" +
             "<td name=\"estado\" id=\"estado\">" + datosins.getEstado().toString() + "</td> </tr>";
            
        }
        
        j.put("result1",result1);
       // j.put("result2",result2);
       // j.put("result3",result3);
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
