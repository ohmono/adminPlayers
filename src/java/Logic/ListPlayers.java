/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import DataControl.JsonCons;
import DataModels.Jugador;

/**
 *
 * @author Lenovo
 */
public class ListPlayers {
    public static String[] listarJugadores(){
        Jugador[] j = JsonCons.getJugadores();
        int l=j.length;
        String temp;
        String[] ret = new String[l];
        for(int i=0;i<l;i++){
            if(j[i]==null){
              continue; 
            }
           temp=j[i].getNames()+"/"+j[i].getId();
           ret[i]=temp;
        }
        return ret;
    }
}
