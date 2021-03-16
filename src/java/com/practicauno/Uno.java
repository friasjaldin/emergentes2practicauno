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
@WebServlet(name = "Uno", urlPatterns = {"/Uno"})
public class Uno extends HttpServlet {

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
            out.println("<title>Servlet Uno</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p><a href='Main'>atras </a></p>");
            out.println("<p>EJERCICIO UNO</p>");
            out.println("<form action='Soluno' method='post'>");
            out.println("<label>Nombre:</label>");
            out.println("<input type='text' name='nombre'><br>");
            out.println("<label>Año de Nacimiento:</label>");
            out.println("<input type='text' name='nacimiento'><br>");
            out.println("<input type='submit' value='Enviar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
