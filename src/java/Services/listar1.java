package Services;
import Logic.ListPlayers;
public class listar1{
    public static String traerTodos(){
        String[] jug = ListPlayers.listarJugadores();
        int l = jug.length;
        String[] sp;
        String x="";
        for (int i = l - 1; i >= 0; i--) {
            if(jug[i]==null){
                continue;
            }
            sp = jug[i].split("/");
            x+=("<td>" + sp[0] + "</td>");
            x+=("<td>" + sp[1] + "</td>");
            x+=("<td>" + "<a href='Profile?id="+sp[1]+ "'>" + "Editar Perfil" + "</a>" + "</td>");
            x+=("</tr>");
        }
        return x;
    }
}
