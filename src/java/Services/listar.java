/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.ListPlayers;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "listar", urlPatterns = {"/listar"})
public class listar extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet listar</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet listar at " + request.getContextPath() + "</h1>");
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
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] jug = ListPlayers.listarJugadores();
        int l = jug.length;
        String[] sp;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<html >\n"
                    + "\n"
                    + "    <head>\n"
                    + "        <title>Listar Jugadores</title>\n"
                    + "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\n"
                    + "              integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n"
                    + "    </head>\n"
                    + "\n"
                    + "    <body>\n"
                    + "        <div class=\"panel panel-default\" style=\"background-color:lightgrey\">\n"
                    + "            <div class=\"row\">\n"
                    + "                <div class=\"col-md-4 offset-5\">\n"
                    + "                    <h1 class=\"panel-title\">Jugadores Inscritos</h1>\n"
                    + "\n"
                    + "                </div>\n"
                    + "\n"
                    + "            </div>"
                    + "            <table class=\"table offset-1\" >\n"
                    + "                <thead>\n"
                    + "                    <tr>\n"
                    + "                        <th scope=\"col\">Nombre</th>\n"
                    + "                        <th scope=\"col\">Id</th>\n"
                    + "                        <th scope=\"col\">Perfil</th>\n"
                    + "                    </tr>\n"
                    + "                </thead>"
                    + "<tbody>\n"
                    + "                    <tr>");
            for (int i = l - 1; i >= 0; i--) {
                sp = jug[i].split("/");
                out.println("<td>" + sp[0] + "</td>");
                out.println("<td>" + sp[1] + "</td>");
                out.println("<td>" + "<a >" + Integer.toString(i + 1) + "</a>" + "</td>");
                out.println("</tr>");
            }
            out.println("</tbody>\n"
                    + "            </table>\n"
                    + "            <form action=\"listar\" id=\"form\" name=\"form\" method=\"post\"></form>\n"
                    + "\n"
                    + "        </div>\n"
                    + "\n"
                    + "\n"
                    + "        <script>\n"
                    + "            function loadTable(){\n"
                    + "                document.getElementById(\"form\").submit();\n"
                    + "            }\n"
                    + "           \n"
                    + "\n"
                    + "        </script>\n"
                    + "        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n"
                    + "                integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\n"
                    + "                integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\"\n"
                    + "                integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "\n"
                    + "    </body>\n"
                    + "\n"
                    + "</html>");

        }

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
