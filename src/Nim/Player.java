package Nim;


public interface Player {
    

    int move(int pileCount);             //player's move

    boolean wantsFirstPlay();   //returns whether player moves first

    String getName();           //gets name of player

}
