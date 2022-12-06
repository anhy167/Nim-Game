package Nim;


import java.util.Random;


public class SmartComputer implements Player {

       //player has first move
    static int[] pileTarget = {1, 3, 7, 15, 31, 63};  //the intended marble 
    //count for the pile after a move (one less than the powers of 2 -- 
    //up to 100)

    /**
     * Constructs a Smart Computer A.I.
     *
     */
    public SmartComputer() {


    }
    /**
     * Smart Computer makes a move by removing an amount from anywhere between
     * 1 to half the amount of marbles present in the pile such that
     * the amount of marbles in the pile after it's turn is a power of 2 
     *
     * @param pileCount the amount of marbles in the pile
     * @return the amount of marbles to be removed from the pile
     */
    @Override
    public int move(int pileCount) {
        Random generator = new Random();
        int marbleTake = 0;
        //if there's more than 1 marble in the pile...
        if (pileCount > 1) {
            if(pileCount==2)
                marbleTake=1;
            //remove an amount (1 to n/2) of marbles such that the pile
            //marble count is one less than a power of 2 (up to 63)
            //If A.I. cannot take such an amount, then it will pick up
            //a random number between 1 and n/2
            if (pileCount == 3 || pileCount == 7
                    || pileCount == 15 || pileCount == 31 || pileCount == 63) {

                marbleTake = generator.nextInt(pileCount / 2) + 1;

            } else {
                do {

                    marbleTake = pileCount - pileTarget[generator.nextInt(6)]; // trả về một số trong mảng plieTarget
                } while ((marbleTake > (pileCount / 2)) || marbleTake <= 0);
            }

        } else {                //otherwise, pick up the last marble
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
     * Smart Computer will play first if it is passed as the first player to the
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
//    /**
//     * Gets the name of the Smart Computer
//     *
//     * @return name of the Smart A.I.
//     */
//    @Override
//    public String getName() {
//
//        return name;                        //returns name of player
//
//    }

}
