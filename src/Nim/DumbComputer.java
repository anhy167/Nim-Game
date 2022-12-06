package Nim;


import java.util.Random;


public class DumbComputer implements Player {

//    String name;                //name of player
//    boolean firstPlayerRequest = true;    //player has first move

    /**
     * Constructs a Dumb Computer A.I.
     */
    public DumbComputer() {

//        name = "'Dumb Computer'";     //name is Dumb Computer

    }

    /**
     * Dumb Computer makes a move by removing a random number of marbles between
     * 1 and half the amount of marbles in the pile
     *
     * @param pileCount the amount of marbles in the pile
     * @return the amount of marbles to be removed from the pile
     */
    @Override
    public int move(int pileCount) {
        
        int marbleTake;
        Random generator = new Random();
        //removes a random number of marbles between 1 and n/2 
        if (pileCount > 1) {
            marbleTake = generator.nextInt(pileCount / 2) + 1;
        } else {

            marbleTake = 1;
        }
        //tells test file how many marbles to take away from pile
        return marbleTake;

    }

    @Override
    public boolean wantsFirstPlay() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    /**
     * Dumb Computer will play first if it is passed as the first player to the
     * Nim Constructor
     *
     * @return a value of true to specify that the A.I. wants to play first;
     * this is only applicable when A.I. play against each other -- yes, they
     * can play against each other in this version of the game :)
     */
//    @Override
//    public boolean wantsFirstPlay() {
//
//        return firstPlayerRequest;      //returns if players wants first play
//
//    }
////
////    /**
////     * Gets the name of the Dumb Computer
////     *
////     * @return name of the Dumb A.I.
////     */
//    @Override
//    public String getName() {
//
//        return name;                        //returns name of player
//
//    }

}
