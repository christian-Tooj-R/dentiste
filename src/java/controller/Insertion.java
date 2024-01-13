
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.sql.Connection;
import model.Connect;
import model.Pointdent;

/**
 *
 * @author Christian
 */
@WebServlet(name = "Insertion", urlPatterns = {"/Insertion"})
public class Insertion extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
            
            RequestDispatcher dispatcher = request.getRequestDispatcher("insertion.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
            String dents = request.getParameter("dent");
            String valeur = request.getParameter("valeur");
            traitement(dents,valeur);
            RequestDispatcher dispatcher = request.getRequestDispatcher("insertion.jsp");
            dispatcher.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
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
    public static void traitement(String dents,String value)throws Exception{
        Connection connect = null;
        if(dents.contains("-") && !value.contains(";")){
            String[] all =  dents.split("-");
            for (int i = Integer.parseInt(all[0]); i < Integer.parseInt(all[1])+1; i++) {
                connect = new Connect().getConnection();
                Pointdent pdt =  new Pointdent();
                pdt.setIddent(i);
                pdt.setPts(Integer.parseInt(value));
                pdt.insert(connect);
            }
        }else if(dents.contains(";") && value.contains(";")){
            String[] all =  dents.split(";");
            String[] allvalue = value.split(";");
            for (int i = 0; i < all.length; i++) {
                connect = new Connect().getConnection();
                Pointdent pdt =  new Pointdent();
                pdt.setIddent(Integer.parseInt(all[i]));
                pdt.setPts(Integer.parseInt(allvalue[i]));
                pdt.insert(connect);
            }
        }else{
            connect = new Connect().getConnection();
                Pointdent pdt =  new Pointdent();
                pdt.setIddent(Integer.parseInt(dents));
                pdt.setPts(Integer.parseInt(value));
                pdt.insert(connect);
        }
    }
}
