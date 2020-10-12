package ta03;

import com.google.gson.Gson;

public class Game {

    Player p1 = new Player();

    public Game(Player player){
        p1 = player;
    }

    public String saveGame(){
        Gson gson = new Gson();
        String data = gson.toJson(p1);
        //System.out.println(data);
        return data;
    }

    public static Player loadGame(String filename){
        //System.out.println(filename);
        Gson gson = new Gson();

        Player p2 = gson.fromJson(filename, Player.class);
        return p2;
    }


}
