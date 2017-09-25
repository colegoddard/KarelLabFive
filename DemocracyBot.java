
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        for (int i = 0; i < 8 ; i++) {
            move();
            
            if (nextToABeeper()) {
                turnLeft();
                move();
                if (!nextToABeeper()) {
                    putBeeper();
                }
                turnLeft();
                turnLeft();
                move();
                move();
                if (!nextToABeeper()) {
                    putBeeper();
                }
                turnLeft();
                turnLeft();
                move();
                turnRight();
                move();
            }
            
            if (!nextToABeeper()) {
                turnLeft();
                move();
                if (nextToABeeper()) {
                    pickBeeper();
                }
                turnLeft();
                turnLeft();
                move();
                move();
                if (nextToABeeper()) {
                    pickBeeper();
                }
                if (nextToABeeper()) {
                    pickBeeper();
                }
                turnLeft();
                turnLeft();
                move();
                turnRight();
                
            }
        }
    }
    
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
}

