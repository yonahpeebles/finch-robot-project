package com.yonah;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        // What do I want my bird to do?
        bird.setBeak(50, 100, 100);
        bird.pause(1);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("L", 20, 25);
        bird.setMove("F", 3, 25);
        bird.setTurn("R", 110, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 70, 25);
        bird.setMove("F", 3, 25);
        bird.setTurn("R", 110, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("L", 90, 25);
        bird.setMove("F", 10, 25);
        bird.setTurn("R", 160, 25);
        bird.setMove("F", 3, 25);
        bird.setTurn("R", 20, 25);
        bird.setMove("F", 10, 25);








      










        
        



        bird.stopAll();
        bird.disconnect();
    }
}