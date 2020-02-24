package pl.com.quiz.number;

public class Game {
    private int userNumber;
    private int computerNumber;

    public Game(int userNumber, int computerNumber) {
        this.userNumber = userNumber;
        this.computerNumber = computerNumber;
    }

    public boolean resultOfTheGame() {
        return userNumber == computerNumber;

    }
}
