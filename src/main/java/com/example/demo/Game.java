package com.example.demo;

/**
 * Exercise Implement the rest of the code neccessary
 */
class Game {

    private int score ;
    private boolean isScoreFinal;

     Game() {
         score = 0 ;
         isScoreFinal = true;
     }

    void roll(int pins) {
        score+=pins;
    }

    int score() {
        return score;
    }

    boolean isScoreFinal() {
         return isScoreFinal;
    }

    // To-do:
}
