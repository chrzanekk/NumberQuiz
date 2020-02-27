package pl.com.quiz.number;

public class Game{
    private int userChoiceNumber;
    private int computerGeneratedNumber;

    public Game() {
    }

    public int getUserChoiceNumber() {
        return userChoiceNumber;
    }

    public void setUserChoiceNumber(int userChoiceNumber) {
        this.userChoiceNumber = userChoiceNumber;
    }

    public int getComputerGeneratedNumber() {
        return computerGeneratedNumber;
    }

    public void setComputerGeneratedNumber(int computerGeneratedNumber) {
        this.computerGeneratedNumber = computerGeneratedNumber;
    }

    public boolean resultOfTheGame() {
        return userChoiceNumber == computerGeneratedNumber;

    }

    public boolean checkPlayerNumberInput(int playerInput, int startBorder, int endBorder) {
        return playerInput >= startBorder && playerInput <= endBorder;
    }


}
