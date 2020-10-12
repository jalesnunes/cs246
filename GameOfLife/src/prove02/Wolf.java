package prove02;

import java.awt.*;
import java.util.Random;

public class Wolf extends Creature implements Movable, Aware, Aggressor, Spawner {

    Random _rand;
    boolean _canSpawn;
    Direction direction;
    int preferredDirection;

    public Wolf() {
        _rand = new Random();
        _health = 1;
        _canSpawn = false;

        preferredDirection = _rand.nextInt(4);

        switch(preferredDirection) {
            case 0:
                direction = Direction.Up;
                break;
            case 1:
                direction = Direction.Right;
                break;
            case 2:
                direction = Direction.Down;
                break;
            case 3:
                direction = Direction.Left;
                break;
            default:
                break;
        }


    }

    public void attack(Creature target) {
        if(target instanceof Animal) {
            target.takeDamage(5);
            _health++;
            _canSpawn = true;
        }

    }


    public void senseNeighbors(Creature above, Creature below, Creature left, Creature right) {

        /*switch(preferredDirection) {
            case Up:
                if (Up instanceof Animal) {
                    return;
                }
                break;
            case Right:
                if (Right instanceof Animal) {
                    return;
                }
                break;
            case Down:
                if (Down instanceof Animal) {
                    return;
                }
                break;
            case Left:
                if (Left instanceof Animal) {
                    return;
                }
                break;
            default:
                break;
        }*/


    }


    Shape getShape() {
        return Shape.Square;
    }


    Color getColor() {
        return Color.gray;
    }


    Boolean isAlive() {
        return _health > 0;
    }


    public void move() {

        switch(_rand.nextInt(4)) {
            case 0:
                _location.x++;
                break;
            case 1:
                _location.x--;
                break;
            case 2:
                _location.y++;
                break;
            case 3:
                _location.y--;
                break;
            default:
                break;

        }
    }


    public Creature spawnNewCreature() {
        if (_canSpawn) {
            _canSpawn = false;
            Wolf babyWolf = new Wolf();
            babyWolf.setLocation((Point) _location.clone());
            babyWolf._location.x--;
            //babyWolf.getShape();
            //babyWolf.getColor();
            return babyWolf;
        }

        return null;
    }
}
