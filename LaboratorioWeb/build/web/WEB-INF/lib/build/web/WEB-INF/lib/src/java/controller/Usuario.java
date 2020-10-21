/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Datatypes.DTUsuario;
import LOGICA.FabricaLab;
import LOGICA.ISistema;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author admin
 */
public class Usuario extends HttpServlet {

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
            
            FabricaLab fabrica = FabricaLab.getInstance();
            ISistema ICU = fabrica.getISistema();
            String nick = request.getParameter("nick");
            String nombre=request.getParameter("nombre");
            String apellido=request.getParameter("apellido");
            String fecha = request.getParameter("fecha");
            String correo = request.getParameter("correo");
            Date fechaDate = null;
            if(fecha!=null){
               SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
               fechaDate = formato.parse(fecha);
            }

            if(nombre!=null){
                DTUsuario datos = new DTUsuario(nick, nombre, apellido, correo, fechaDate,"1234");
                ICU.altaUsuario(datos, false, new ArrayList());
            }

            if(fecha != null && nombre!=null && apellido!=null){
                String frase="El usuario es "+nombre+" " +apellido + " y nacio en " + fecha;
                out.print(frase);
            }

            request.getRequestDispatcher("/WEB-INF/Usuario/Usuario.jsp").
						forward(request, response);
        }catch(Exception e){
            System.out.print("No funciono");
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
        processRequest(request, response);
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
