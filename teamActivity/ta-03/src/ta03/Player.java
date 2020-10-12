package ta03;

public class Player {
    public String name;
    public int health;
    public int mana;
    public int gold;

    public void displayDetails(){
        System.out.println(name + health + mana + gold);
    }
    public Player(){
        name = "Jerry";
        health = 0;
        mana = 0;
        gold = 0;
    }
}

