package pl.com.quiz.number;

public class Statistics {
    private int numberOfPlays;
    private int numberOfWins;
    private int numberOfWrongInputs;

    public Statistics() {

    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getNumberOfWrongInputs() {
        return numberOfWrongInputs;
    }

    public void setNewNumberOfPlays(int newNumberOfPlays) {
        numberOfPlays = newNumberOfPlays;
    }

    public void setNewNumberOfWins(int newNumberOfWins) {
        numberOfWins = newNumberOfWins;
    }

    public void setNewNumberOfWrongInputs(int newNumberOfWrongInputs) {
        numberOfWrongInputs = newNumberOfWrongInputs;
    }

}
