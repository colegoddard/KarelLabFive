
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DangerousBot extends Robot
{
    public DangerousBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void choosePile() {
        move();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        int beepers = 0;
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int i = 0; i < beepers; i++) {
            putBeeper();
        }
        if (beepers % 2 == 0) {
            turnRight();
            move();
        }
        else {
            turnLeft();
            move();
        }
        while (nextToABeeper()) {
            pickBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

