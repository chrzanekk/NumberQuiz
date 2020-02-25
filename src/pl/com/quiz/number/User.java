package pl.com.quiz.number;

public class User {
    private short userChoice;
    private int userInput;

    public User() {

    }
    public void setUserChoice(short userChoice) {
        this.userChoice = userChoice;
    }

    public void setUserInput(int userInput) {
        this.userInput = userInput;
    }

    public short getUserChoice() {
        return userChoice;
    }

    public int getUserInput() {
        return userInput;
    }

    public void userWrongMenuChoiceNotification(int firstMenuOption, int lastMenuOption) {
        if(userChoice<firstMenuOption || userChoice>lastMenuOption){
            System.out.println("Error! Wrong option. Try again!");
        }
    }
}
