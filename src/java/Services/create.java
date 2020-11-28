/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;
import Logic.CrearJugador;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "create", urlPatterns = {"/create"})
public class create extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CrearJugador.createPlayer(request);
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"
                    + "<script>\n" +
"      function load() {\n" +
"        alert(\"Jugador "+ request.getParameter("name")+" "  +" creado con exito\");\n" +
"      }\n" +
"      window.onload = load;\n" +
"    </script>");
            out.println("<title>Servlet create</title>");
            out.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"0;URL=newPlayer.html\">");
            out.println("</head>");
            out.println("<body> ");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}