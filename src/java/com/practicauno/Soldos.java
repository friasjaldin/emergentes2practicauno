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
 * @author CristhianFriasJaldin
 */
@WebServlet(name = "Soldos", urlPatterns = {"/Soldos"})
public class Soldos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int numero,fac;
        String varnum= request.getParameter("numero");
        numero=Integer.parseInt(varnum);
        
        fac=1;
        for(int i=1;i<=numero;i++)
        {
            fac=fac*i;
        }
     
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Soluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Numero: " +numero+ "</h1>");
            out.println("<h1>Factorial: " +fac+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }



}
