package ta03;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson g = new Gson();
        Player p1 = new Player();
        Game newGame = new Game(p1);
        String gamefile = newGame.saveGame();
        System.out.println(gamefile);

        Player p2 = Game.loadGame(gamefile);
        Game game2 = new Game(p2);
        String game2file = game2.saveGame();
        System.out.println("Game 2: ");
        System.out.println(game2file);


    }


}
