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
@WebServlet(name = "Cuatro", urlPatterns = {"/Cuatro"})
public class Cuatro extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset='utf-8'>");
            out.println("<title>Servlet Cuatro</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p><a href='Main'>Volver Practica 1 </a></p>");
            out.println("<p>EJERCICIO 4</p>");
            out.println("<form action='Solcuatro' method='post'>");
            out.println("<label>Monto:</label>");
            out.println("<input type='text' name='monto'><br>");
            out.println("<select name='convertir' id='convertir'>");
            out.println("<option value='1'>Bs a Dolares</option>");
            out.println("<option value='2'>Dolares a Bs</option>");
            out.println("</select><br>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
