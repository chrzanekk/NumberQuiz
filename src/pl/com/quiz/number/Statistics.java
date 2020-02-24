package pl.com.quiz.number;

public class Statistics {
    private int numberOfPlays;
    private int numberOfWins;

    public Statistics() {

    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public void setNewNumberOfPlays(int newNumberOfPlays) {
        numberOfPlays = newNumberOfPlays;
    }

    public void setNewNumberOfWins(int newNumberOfWins) {
        numberOfWins = newNumberOfWins;
    }
}
