package Nim;

import java.util.Random;


public class Pile {

    int pileSize;           //amount of marbles in pile

    /**
     * Constructs a pile of marbles such that the initial amount is anywhere
     * from 10 to 100
     */
    public Pile() {

        Random generator = new Random();
        //creates a pile with 10 to 100 marbles, inclusive
        pileSize = generator.nextInt(91) + 10; 
        

    }

    /**
     * Gets the amount of marbles present in pile
     *
     * @return amount of marbles in pile
     */
    public int getPileSize() {

        return pileSize;            //gets the amount of marbles in pile

    }

    /**
     * Removes the specified amount of marbles from the pile
     *
     * @param amount number of marbles to be removed
     */
    public void removeMarbles(int amount) {
        //resizes pile by removing the amount of marbles specified
        pileSize = pileSize - amount;

    }

}
