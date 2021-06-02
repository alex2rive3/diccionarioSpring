/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ruben
 */
@WebServlet(urlPatterns = {"/registroServlet"})
public class registroServlet extends HttpServlet {

    public ArrayList datos;
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String palabraEs = request.getParameter("palabraEspañol");
            String palabraIn = request.getParameter("palabraIngles");
            String defEs = request.getParameter("defEspañol");
            String defIn = request.getParameter("defIngles");
            ServletContext sc = this.getServletContext();
            String path = sc.getRealPath("/WEB-INF/datosDiccionario.txt");
            path = path.replace('\\','/');
            
            datos = null;
            diccionario dic = new diccionario();
            dic.setPalabraEspañol(palabraEs);
            dic.setPalabraIngles(palabraIn);
            dic.setDefinicionEspañol(defEs);
            dic.setDefinicionIngles(defIn);
            
            datos.add(dic);
            String[] lineas = { "Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "..." };
		try {
                    FileWriter fichero = new FileWriter(path);
                    fichero.write(dic.getPalabraEspañol() + ", " + dic.getPalabraIngles());
                    fichero.close();
		} catch (IOException ex) {
			out.println("Mensaje de la excepción: " + ex.getMessage());
		}
            
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registroServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registroServlet at " + palabraIn+ "</h1>");
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
