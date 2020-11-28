/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Logic.Perfil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
@WebServlet(name = "Profile", urlPatterns = {"/Profile"})
public class Profile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String[] j = Perfil.getProfile(request.getParameter("id"));
            out.println("<!DOCTYPE html>\n"
                    + "<html>\n"
                    + "    <head>\n"
                    + "        <meta http-equiv=\"Content-Type\" content=\"text/html;charset=UTF-8\">\n"
                    + "        <link rel=\"stylesheet\" href=\"css/EDstyle.css\">\n"
                    + "        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\"\n"
                    + "              integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n"
                    + "        <script src=\"javascript/NPjavascript.js\"></script>\n"
                    + "        <title>Agregar Un jugador</title>\n"
                    + "        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n"
                    + "                integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\n"
                    + "                integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\"\n"
                    + "                integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\"\n"
                    + "        crossorigin=\"anonymous\"></script>\n"
                    + "        <title>Agregar Un jugador</title>\n"
                    + "    </head>");
            out.println("<body >\n"
                    + "        <header>\n"
                    + "            <div class=\"contenedor\"style=\"background-color:#7FB3D5;\">\n"
                    + "                <div class=\"logo\">\n"
                    + "                    <img src='img/" + j[6] + ".jpg' alt=\"\">\n"
                    + "                </div>\n"
                    + "                <div class=\"encabezado\">\n"
                    + "                    <h2>Editar Jugador</h2>\n"
                    + "                </div>\n"
                    + "            </div>\n"
                    + "        </header>\n"
                    + "        <div class=\"navegacion contenedor\">\n"
                    + "            <nav>\n"
                    + "                <ul>\n"
                    + "                    <li><a href=\"index.html\">Volver al inicio</a> <p>click para regrear ir a la pantalla de creacion de jugadores</p> </li>\n"
                    + "                    <li><a href=\"AllPlayers.jsp\">listar Jugadores</a><p>click para ver una lista con todos los jugadores inscritos</p></li>\n"
                    + "                    <li><a href=\"newPlayer.html\">Crear nuevo jugador</a><p>click para ver una lista con todos los jugadores inscritos</p></li>\n"
                    + "                </ul>\n"
                    + "            </nav>\n"
                    + "        </div>");
            out.println("<main>\n"
                    + "            <div class=\"contenedor\">\n"
                    + "                <div class=\"panel panel-default\" \">\n"
                    + "                    <div class=\"panel-heading\">\n"
                    + "                        <h3 style=\"text-align:left\" class=\"panel-title\">Editar Jugador</h3>\n"
                    + "                    </div>\n"
                    + "                    <form  action=\"Profile\" method=\"post\" id=\"myform\">\n"
                    + "                        <fieldset>\n"
                    + "                            <legend>Datos personales</legend>\n"
                    + "                            <div class=\"row\">\n"
                    + "                                <div class=\"col-md-5 offset-md-1\">\n"
                    + "                                    <label for=\"name\" class=\"control-label\" >Nombres</label>\n"
                    + "                                    <input value='" + j[10] + "' type=\"text\" name=\"name\" id=\"name\" class=\"form-control\"required>\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-5\">\n"
                    + "                                    <label for=\"lastName\" class=\"control-label\" >Apellidos</label>\n"
                    + "                                    <input value=\'" + j[11] + "' type=\"text\" name=\"lastName\" id=\"lastName\"  class=\"form-control\" required>\n"
                    + "                                </div>\n"
                    + "                            </div>     ");
            out.println("    \n"
                    + "                            <div class=\"row\">\n"+"<div class=\"col-md-2 offset-md-1\">\n" +
"                                    <label for=\"idType\" class=\"control-label\">Tipo de documento</label>\n" +
"                                    <input value='" +j[4] +"' class='form-control' id=\"idType\" name=\"idType\" required >\n" +
"                                    </input>\n" +
"                                </div>"
                    
                    + "                                <div class=\"col-md-2 offset-md-1\">\n"
                    + "                                    <label for=\"_id\" class=\"control-label\">Numero de documento</label>\n"
                    + "                                    <input value='" + j[1] + "' type=\"text\" id=\"_id\" class=\"form-control\" name=\"_id\" onkeydown=\"return isNumberKey(event);\" required >\n"
                    + "                                </div>"+"<input name='old_id' id='old_id' hidden='true' value='"+ j[1] +"' >"+"</input>");
            out.println("<div class=\"col-md-2 offset-1\"> \n"
                    + "                                    <label for=\"bornDate\" >Fecha de nacimiento:</label>\n"
                    + "                                    <input value='" + j[8] + "' class=\"datePicker\" type=\"date\" id=\"bornDate\" name=\"bornDate\">  \n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "\n"
                    + "                        </fieldset>\n"
                    + "\n"
                    + "                        <fieldset>\n"
                    + "                            <legend>Datos de contacto</legend>\n"
                    + "                            <div class=\"row\">" + " <div class=\"col-md-3 offset-md-1\">\n"
                    + "                                    <label for=\"email\" class=\"control-label\">Correo Electronico</label>\n"
                    + "                                    <input value='" + j[5] + "' type=\"email\" id=\"email\" class=\"form-control\" name=\"email\">\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-2 offset-md-1\">\n"
                    + "                                    <label for=\"city\" class=\"control-label\">Ciudad</label>\n"
                    + "                                    <input type=text value='" + j[2] + "'  id=\"city\" name=\"city\" required>\n"
                    + "                                    </input>\n"
                    + "                                </div>\n"
                    + "\n"
                    + "                            </div>");
            out.println("<div class=\"row\">\n"
                    + "                                <div class=\"col-md-9 offset-md-1\">\n"
                    + "                                    <label for=\"address\" class=\"control-label\">Direccion de Domicilio</label>\n"
                    + "                                    <input value='" + j[3] + "' type=\"text\" class=\"form-control\" name=\"address\" id=\"address\">\n"
                    + "\n"
                    + "                                </div>\n"
                    + "\n"
                    + "\n"
                    + "\n"
                    + "                            </div>" + "<div class=\"row\">\n"
                    + "                                <div class=\"col-md-3 offset-md-1\">\n"
                    + "                                    <label for=\"phoneNumber\" class=\"control-label\">Numero de telefono</label>\n"
                    + "                                    <input value='" + j[7] + "' type=\"text\" id=\"phoneNumber\" name =\"phoneNumber\" class=\"form-control\" onkeydown=\"return isNumberKey(event);\">\n"
                    + "                                </div>\n"
                    + "                            </div>"
                    + "\n"
                    + "                        </fieldset>");
            out.println(" <fieldset>\n"
                    + "                            <legend>Datos del equipo</legend>\n"
                    + "                            <div class=\"row \">\n"
                    + "                                <div class=\"col-md-3 offset-md-1\">\n"
                    + "                                    <label for=\"delegacion\" class=\"control-label\">Delegacion</label>\n"
                    + "                                    <input class='form-control' value='" + j[9] + "' name=\"delgacion\" id=\"delegacion\">\n"
                    + "                                        \n"
                    + "                                    </input>\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-3\">\n"
                    + "                                    <label for=\"rama\" class=\"control-label\">Rama</label>\n"
                    + "                                    <br>\n"
                    + "                                    <input class='form-control' value='" + j[12] + "'  name=\"rama\" id=\"rama\">\n"
                    + "                                    </input>\n"
                    + "                                </div>\n"
                    + "                                <div class=\"col-md-3\">\n"
                    + "                                    <label for=\"categoria\" class=\"control-label\">Categoria</label>\n"
                    + "                                    <br>\n"
                    + "                                    <input class='form-control' value='" + j[0] + "' name=\"categoria\" id=\"categoria\">\n"
                    + "                                    </input>\n"
                    + "                                </div>\n"
                    + "                            </div>\n"
                    + "                        </fieldset>");
            out.println("<div class=\"row offset-md-1\">\n"
                    + "\n"
                    + "                            <div class=\"col-md-2 offset-3\">\n"
                    + "                            </div>\n"
                    + "                            <button type=\"submit\" onclick=\"btnClick(event);\" class=\"btn btn-primary\">Editar</button>\n"
                    + "                            <label id=\"tag\"></label>\n"
                    + "                        </div>");

            out.println("</main>\n"
                    + "    </body>\n"
                    + "\n"
                    + "</html>");

        }

    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            Perfil.editProfile(request);
            try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>"
                    + "<script>\n" +
"      function load() {\n" +
"        alert(\"Jugador "+ request.getParameter("name")+" "  +" editado con exito\");\n" +
"      }\n" +
"      window.onload = load;\n" +
"    </script>");
            out.println("<title>Servlet create</title>");
            out.println("<META HTTP-EQUIV=\"REFRESH\" CONTENT=\"0;URL=AllPlayers.jsp\">");
            out.println("</head>");
            out.println("<body> ");
            out.println("</body>");
            out.println("</html>");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
            
    }

    
}
