


import kareltherobot.*;

/**
 * Write a description of class Template here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DoubleBot extends Robot
{
    // instance variables - replace the example below with your own
    public int beepers;

    /**
     * Constructor for objects of class Template
     */
     public DoubleBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }

    public void doubleBeepers()
    {
        move();
        while (nextToABeeper()) {
            pickBeeper();
            beepers++;
        }
        for (int i = 0; i < beepers; i++) {
            putBeeper();
        }
        move();
        for (int e = 0; e < beepers; e++) {
            putBeeper();
            putBeeper();
        }
        turnLeft();
        move();
    }
}
