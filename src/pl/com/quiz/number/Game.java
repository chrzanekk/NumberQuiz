package pl.com.quiz.number;

public class Game{
    private int userNumber;
    private int computerNumber;

    public Game() {
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public int getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(int computerNumber) {
        this.computerNumber = computerNumber;
    }

    public boolean resultOfTheGame() {
        return userNumber == computerNumber;

    }

    public void showResultOfTheGame(){
        System.out.println("RESULT:");
        if (resultOfTheGame()) {
            System.out.println("This is correct number. You win.");
        } else {
            System.out.println("You loose.");
        }
        System.out.println("Your choose: " + userNumber + " ,computer choose: " + computerNumber);
    }
}
