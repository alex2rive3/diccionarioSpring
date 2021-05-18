/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ruben
 */
@WebServlet(urlPatterns = {"/leerServerlet"})
public class leerServerlet extends HttpServlet {
    private static File archivo;
    private static FileReader fr;
    private static BufferedReader br;
    public String path;
    public boolean traduccion;
    public String linea; 
    public String datos; 
    private String palabraEspañol;
    private String palabraIngles;
    private String defEspañol;
    private String defIngles;
    private String[] arrayLinea;
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
        traduccion = false;
        path = "C:/Users/Ruben/Desktop/JAVA/Diccionario/src/java/datosDiccionario.txt";
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String palabra = request.getParameter("palabra");
            try {
            archivo = new File(path);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            linea = null;
            arrayLinea = null;
            //linea = br.readLine();
            while((linea = br.readLine())!= null) {
                //out.print(linea.split(",")[0]);
                if(linea.contains(",")){ //esto hace que encesariamente debe tener una "," la linea que se esta leyendo
                    if (linea.split(",")[0].equalsIgnoreCase(palabra)) {
                        out.println("<h1>se encontro la traduccion " + linea.split(",")[0] + linea.split(",")[1] + "</h1>");
                        traduccion = true;
                    }
                }
            }
        } catch (IOException e) {
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (IOException e2) {
            }
            if (!traduccion) {
                //en caso que no se encuentre la traduccion de la palabra buscada para que sea redireccionado a la vista de registro
                RequestDispatcher rd;
                rd = request.getRequestDispatcher("/jsp/registro.jsp");
                rd.forward(request, response);
            }
        }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet leerServerlet</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Traduccion y Significado de las palabras buscada " + datos + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        processRequest(request, response);
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
        processRequest(request, response);
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

}
