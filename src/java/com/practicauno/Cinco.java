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
@WebServlet(name = "Cinco", urlPatterns = {"/Cinco"})
public class Cinco extends HttpServlet {

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
            out.println("<title>Servlet Cinco</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p><a href='Main'>Volver Practica 1 </a></p>");
            out.println("<p>EJERCICIO 5</p>");
            out.println("<form action='Solcinco' method='post'>");
            out.println("<label>Numero A:</label>");
            out.println("<input type='text' name='numA'><br>");
            out.println("<label>Numero B:</label>");
            out.println("<input type='text' name='numB'><br>");
            out.println("<select name='operador' id='operador'>");
            out.println("<option value='1'>sumar</option>");
            out.println("<option value='2'>restar</option>");
            out.println("<option value='3'>multiplicar</option>");
            out.println("<option value='4'>division</option>");
            out.println("</select><br>");
            out.println("<input type='submit' value='Procesar'>");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
