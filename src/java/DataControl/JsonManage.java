/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataControl;

import DataModels.Jugador;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class JsonManage {
    public static void addPlayer(Jugador j) {
        Gson gson = new Gson();
        String json="";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Downloads\\AdministracionDeJugadores\\src\\java\\Data\\Jugadores.json",true)) ){
            json=gson.toJson(j);
            bw.append("\n"+","+json);
       } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    static void writeJson(Jugador[] jugadores) {
        Gson gson = new Gson();
        String json="[";
        for(int i = 0; i<jugadores.length;i++){
            json+=gson.toJson(jugadores[i]);
            json+="\n ,";
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Downloads\\AdministracionDeJugadores\\src\\java\\Data\\Jugadores.json"))) {
            bw.write(json);

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }   
        
    }
}
