package prove02;

import java.awt.*;
import java.util.Random;

public class Zombie extends Creature implements Movable, Aggressor{

    Random _rand;

    public Zombie() {
        _rand = new Random();
        _health = 1;
    }

    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(10);
            _health++;
        }

    }


    Shape getShape() {
        return Shape.Square;
    }


    Color getColor() {
        return new Color(9, 48, 199);
    }


    Boolean isAlive() {
        return _health > 0;
    }


    public void move() {
        _location.x++;
    }
}
