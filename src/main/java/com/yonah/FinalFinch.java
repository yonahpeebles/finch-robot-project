package com.yonah;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();

        // What do I want my bird to do?
        bird.setBeak(50, 100, 100);
        bird.pause(1);
        bird.setTurn ("R", 30, 50);
        bird.setMove("F", 10, 75);
        bird.setTurn ("R", 30, 50);
        bird.setMove("F", 10, 75);
        
        


        


        bird.stopAll();
        bird.disconnect();
    }
}