/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;
import DataModels.Jugador;
import DataControl.JsonManage;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Lenovo
 */
public class CrearJugador {

    public static void createPlayer(HttpServletRequest request) throws IOException{
        String name = request.getParameter("name");
        String club = request.getParameter("delegacion");
        String team = request.getParameter("categoria");
        String rama = request.getParameter("rama");
        String lastName = request.getParameter("lastName");
        String idType = request.getParameter("idType");
        String id = request.getParameter("_id");
        String city = request.getParameter("city");
        String address = request.getParameter("one")+" "+request.getParameter("two")+" # "+request.getParameter("three");
        String email = request.getParameter("email");
        String phoneNumber = request.getParameter("phoneNumber");        
        
        String photo =id+phoneNumber+city;
        
        String bornDate= request.getParameter("bornDate");
        Jugador j = new Jugador(name, lastName,id,city,address,idType,email,photo,phoneNumber,bornDate,club,team,rama);
        JsonManage.addPlayer(j);
    }
    
}
