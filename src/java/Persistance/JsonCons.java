package Persistance;
import Model.Jugador;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JsonCons implements Consultador{
    public static Jugador[] getJugadores() {
        Gson gson = new Gson();
        String json = ""; 
        
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\AdminDeJugadores\\Jugadores.json"))){
            String line;
            while ((line = br.readLine()) != null) {
                json+= line;
            }
            json+="]";
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        Jugador[] jugadores = gson.fromJson(json, Jugador[].class);
        return jugadores;
    }
}
