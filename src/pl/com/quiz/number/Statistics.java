package pl.com.quiz.number;

public class Statistics {
    private int numberOfPlays;
    private int numberOfWins;
    private int wrongInputs;

    public Statistics() {

    }

    public int getNumberOfPlays() {
        return numberOfPlays;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public int getWrongInputs() {
        return wrongInputs;
    }

    public void setNewNumberOfPlays(int newNumberOfPlays) {
        numberOfPlays = newNumberOfPlays;
    }

    public void setNewNumberOfWins(int newNumberOfWins) {
        numberOfWins = newNumberOfWins;
    }

    public void setNewNumberOfWrongInputs(int newNumberOfWrongInputs) {
        wrongInputs = newNumberOfWrongInputs;
    }

    void showStatistics() {

        System.out.println("Number of all games: " + getNumberOfPlays());
        System.out.println("Number of wins: " + getNumberOfWins());
        System.out.println("Number of wrong inputs: " + getWrongInputs());
    }

}
