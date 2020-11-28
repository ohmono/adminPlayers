/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataControl.JsonCons;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Lenovo
 */
public class Perfil {
    public static String[] getProfile(String id){
        return JsonCons.getJugador(id);
    }
    public static void editProfile(HttpServletRequest request){
        String name = request.getParameter("name");
        String lastName = request.getParameter("lastName");
        String idType = request.getParameter("idType");
        String id = request.getParameter("_id");
        String bornDate= request.getParameter("bornDate");
        String email = request.getParameter("email");
        String city = request.getParameter("city");
        String address = request.getParameter("address");
        String phoneNumber = request.getParameter("phoneNumber");
        String club = request.getParameter("delegacion");
        String rama = request.getParameter("rama");
        String categoria = request.getParameter("categoria");
        String old_id=request.getParameter("old_id");
        String[] atrs=new String[12];
        atrs[0] = name;
        atrs[1] = lastName;
        atrs[2] = idType;
        atrs[3] = id;
        atrs[4] = bornDate;
        atrs[5] = email;
        atrs[6] = city;
        atrs[7] = address;
        atrs[8] = phoneNumber;
        atrs[9] = club;
        atrs[10] = rama;
        atrs[11] = categoria;
        JsonCons.editPlayer(old_id, atrs);   
        
    }
}
