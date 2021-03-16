/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practicauno;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
@WebServlet(name = "SolEjer6", urlPatterns = {"/SolEjer6"})
public class Solseis extends HttpServlet {

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
        int suma=0;
        String res="";
        int dado1 = (int) (Math.random() * (7 -1 )) + 1;
        int dado2 = (int) (Math.random() * (7 -1 )) + 1;
        suma=dado1+dado2;
        
        
        if(suma==7 || suma==11)
            res="Gana";
        else
            res="Pierde";
            
       
     
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SolEjer3</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dado 1: " +dado1+ "</h1>");
            out.println("<h1>Dado 2: " +dado2+ "</h1>");
            out.println("<h1>Suma: " +suma+ "</h1>");
            out.println("<h1>Mensage: " +res+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }



}
