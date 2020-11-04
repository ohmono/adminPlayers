/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Persistance.JsonManage;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Lenovo
 */
public class Logic {
    public static void createPlayer(HttpServletRequest request) throws IOException{
        String name = request.getParameter("name");
        String club = request.getParameter("source");
        String team = request.getParameter("status");
        String lastName = request.getParameter("lastName");
        String idType = request.getParameter("idType");
        String id = request.getParameter("_id");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String email = request.getParameter("email");
        String photo = request.getParameter("photo");
        String phoneNumber = request.getParameter("phoneNumber");
        String bornDate= request.getParameter("bornDate");
        Jugador j = new Jugador(name, lastName,id,city,address,idType,email,photo,phoneNumber,bornDate,club,team);
        JsonManage.addPlayer(j);
    }
    
}
