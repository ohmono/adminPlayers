package DataControl;
import DataModels.Jugador;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class JsonCons {
    public static Jugador[] getJugadores(){
        Gson gson = new Gson();
        String json = ""; 
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Lenovo\\Downloads\\AdministracionDeJugadores\\src\\java\\Data\\Jugadores.json"))){
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
        for(int i=0;i<jugadores.length;i++){
            if(jugadores[i]!=null){
                System.out.println(jugadores[i].getName());
                jugadores[i].setPhoto(Integer.toString(i));
                System.out.println(jugadores[i].getPhoto());
            }
            
        }
        return jugadores;
    }
    public static String[] getJugador(String id){
        Jugador [] jugadores = getJugadores();
        Jugador j;
        for(int i = 0; i<(jugadores.length);i++){
            j=jugadores[i];
            if(j==null){
                continue;
            }
            if(id == null ? j.getId() == null : id.equals(j.getId())){
                
                return j.jugString();
            }
        }
        String[] ret=new String[12];
        ret[0]="no se esncontró el id";
        return ret;
    }
    public static void editPlayer(String old_id, String[] atrs){  
        Jugador [] jugadores = getJugadores();
        Jugador j;
        int index=0;
        for(int i=0; i<jugadores.length;i++){
            j=jugadores[i];
            if(j==null){
                continue;
            }
            if(old_id.equals(jugadores[i].getId())){
                index=i;
                System.out.println("este tiene el mismo id "+Arrays.toString(j.jugString()));
                j.edit(atrs);
                break;
                
            }
            
        }
        writeJson(jugadores);
    }
    static void writeJson(Jugador[] jugadores) {
        Gson gson = new Gson();
        String json="[";
        for(int i = 0; i<jugadores.length;i++){
            json+=(gson.toJson(jugadores[i]));
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
