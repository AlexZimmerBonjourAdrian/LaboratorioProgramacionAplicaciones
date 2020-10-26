/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DATABASE.Persistencia;
import Datatypes.DTPrograma;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author arena
 */
public class Programa extends HttpServlet {

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
       
        Persistencia p = Persistencia.getInstance();
        p.inicializarBaseDeDatos();
        FabricaLab fabrica = FabricaLab.getInstance();
        ISistema ICU = fabrica.getISistema();
        String nombrep = request.getParameter("nombrep");
        String desc = request.getParameter("descripcion"); 
        String fechaDate = request.getParameter("fechaini");
        String fechaDate2 = request.getParameter("fechafin");
        
        String imagenNom = request.getParameter("txtDireccion");
        String imagenDir = "images/logo.png";
        
        if(imagenNom!=null){
                imagenDir = "images/"+imagenNom;
        }
        
        
        Date fechaini = null;
        Date fechafin = null;
        if(fechaDate!=null){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            fechaini = formato.parse(fechaDate);
        }
        if(fechaDate2!=null){
            SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
            fechafin = formato.parse(fechaDate2);
        }
        DTPrograma datos = new DTPrograma(nombrep,desc,fechaini,fechafin,new Date(), imagenDir);

        if (nombrep != null && ICU.obtenerPrograma(nombrep) == null){

            ICU.crearPrograma(datos);

        }else{
            if(nombrep != null){
                ICU.modificarDatosPrograma(datos);
            }

        } 

         request.getRequestDispatcher("/WEB-INF/Programa/AltaPrograma.jsp").
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
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
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
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
