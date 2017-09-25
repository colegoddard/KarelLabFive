
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class TreasureBot extends Robot
{
    public TreasureBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findTreasure() {
        int beepers = 0;
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int i = 0; i < beepers; i++) {
            putBeeper();
        }
        if (beepers == 1) {
            turnLeft();
        }
        
        turnOff();
    }
   
}

