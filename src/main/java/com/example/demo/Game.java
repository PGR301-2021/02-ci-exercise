package com.example.demo;

/**
 * Exercise Implement the rest of the code neccessary
 */
public class Game {

    private int score;


    void roll(int pins) {
        score += pins;
    }

    int score() {
        return score;
    }

}
