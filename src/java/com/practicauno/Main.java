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
@WebServlet(name = "Main", urlPatterns = {"/Main"})
public class Main extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Servlet Main</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align='center'><strong>Práctica #1 Emergentes 2 </strong></h1>");
            out.println("<h1><strong>Univ.Cristhian Jaime Frias Jaldin</strong></h1>");
            out.println("<h1 align='center'><strong> SERVLETS</strong><strong></strong></h1>");
            out.println("<p>Crear un servlet denominado Main para desplegar un menú de opciones que muestre la resolución de los siguientes ejercicios.</p>");
            out.println("<p>1# Usando servlets mostrar la edad de una persona a partir del año de nacimiento. El formulario debe solicitar nombre y año de nacimiento.</p>");
            out.println("<p><a href='Uno'>Solucion 1</a></p>");
            out.println("<p>2# Con servlets crear un programa para leer un número y calcular su factorial</p>");
            out.println("<p><a href='Dos'>Solucion 2</a></p>");
            out.println("<p>3# Utilizando un solo Servlet calcular la edad de una persona a partir de su año de nacimiento doGet(HttpServletRequest request, HttpServletResponse response)</p>");
            out.println("<p><a href='Tres'>Solucion 3</a></p>");
            out.println("<p>4# Usando servlete realizar un programa que permita realizar el cambio te Bolivianos a Dólares y viceversa.</p>");
            out.println("<p><a href='Cuatro'>Solucion 4</a></p>");
            out.println("<p>5# Crear un servlet para solicitar dos números y un operador (suma, resta, producto, división) en un cuadro desplegable ComboBox y un botón con el texto “Procesar”. Al pulsar el botón debe aparecer el resultado de la operación.</p>");
            out.println("<p><a href='Cinco'>Solucion 5</a></p>");
            out.println("<p>6# Crear un programa utilizando Servlets para simular el juego con dos dados. (Regla principal si la suma es 7 u 11 gana otro número pierde)</p>");
            out.println("<p><a href='Solseis'>Solucion 6</a></p>");
            out.println("<p>7# Programar un servlet que solicite un valor y pulsando el botón “Procesar” genere la matriz caracol. </p>");
            out.println("<p><a href='Siete'>Solucion 7</a></p>");
            out.println("</body>");
            out.println("</html>");
        }
    }


}
