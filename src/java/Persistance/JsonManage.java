/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistance;

import Model.Jugador;
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
public class JsonManage implements Agregador {
    public static void addPlayer(Jugador j) {
        Gson gson = new Gson();
        String json="";
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\AdminDeJugadores\\Jugadores.json",true)) ){
            json=gson.toJson(j);
            bw.append("\n"+","+json);
       } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
