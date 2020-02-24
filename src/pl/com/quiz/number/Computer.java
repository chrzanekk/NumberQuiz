package pl.com.quiz.number;

import java.util.Random;

public class Computer {
    private int lowerBorder;
    private int higherBorder;

    public Computer(int lowerBorder, int higherBorder) {
        this.lowerBorder = lowerBorder;
        this.higherBorder = higherBorder;
    }

    public int computer () {
        Random randomize = new Random();
        int generateRandomNumber = randomize.nextInt(higherBorder - lowerBorder + 1) + lowerBorder;
        return generateRandomNumber;
    }

    public int getLowerBorder() {
        return lowerBorder;
    }

    public int getHigherBorder() {
        return higherBorder;
    }



}
