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
@WebServlet(name = "Soluno", urlPatterns = {"/Soluno"})
public class Soluno extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int fnac;
        String nombre= request.getParameter("nombre");
        String nac= request.getParameter("nacimiento");
        fnac=Integer.parseInt(nac);
     
                response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Soluno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nombre: " +nombre+ "</h1>");
            out.println("<h1>Edad: " +(2021-fnac)+ "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }



}
