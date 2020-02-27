package pl.com.quiz.number;

import java.util.Random;

public class Computer {
    private Random randomize = new Random();

    public int getRandomNumber(int lowerBorder, int higherBorder) {
        return randomize.nextInt(higherBorder - lowerBorder + 1) + lowerBorder;
    }
}
