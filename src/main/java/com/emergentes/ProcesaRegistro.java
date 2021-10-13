package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProcesaRegistro", urlPatterns = {"/ProcesaRegistro"})
public class ProcesaRegistro extends HttpServlet {
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //Recibimos los datos del formulario index.jsp
       String titulo = request.getParameter("titulo");
       String autor = request.getParameter("autor");
       String resumen = request.getParameter("resumen");
       String medio = request.getParameter("medio");
       //Instanciamos un objeto a partir de la clase Libro
       Libro lib=new Libro();
       //Encapsulamos los datos recibidos en el objeto lib
       lib.setTitulo(titulo);
       lib.setAutor(autor);
       lib.setResumen(resumen);
       lib.setMedio(medio);
       //Colocar al objeto lib como atributo de request
       request.setAttribute("libro", lib);
       //Enviamos al formulario output.jsp
       request.getRequestDispatcher("output.jsp").forward(request, response);
    }

}
