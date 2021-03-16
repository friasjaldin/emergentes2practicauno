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
@WebServlet(name = "Solcuatro", urlPatterns = {"/Solcuatro"})
public class Solcuatro extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }


 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int convertir;
        double resul;
        String mensage;
        String monto= request.getParameter("monto");
        String conv= request.getParameter("convertir");
        convertir=Integer.parseInt(conv);
        
        if(convertir==1)
        {
            mensage="Bs a Dolares";
            resul=Double.parseDouble(monto)/7;
        }
        else
        {
            mensage="Dolares a Bs";
            resul=Integer.parseInt(monto)*7;
        
        }
     
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Soltres</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" +mensage+ "</h1>");
            out.println("<h1>Monto: " +monto+ "</h1>");
            out.println("<h1>Resultado: " +resul+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }



}
