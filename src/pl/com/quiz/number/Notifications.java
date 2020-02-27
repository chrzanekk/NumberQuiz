package pl.com.quiz.number;

public class Notifications {
    public void showMainMenu() {
        System.out.println("***NUMBER QUIZ***");
        System.out.println("Please select an option:");
        System.out.println("1 - play game");
        System.out.println("2 - actual statistics");
        System.out.println("3 - exit");
    }

    public void showInputNumberNotification(int startBorder, int endBorder) {
        System.out.println("Enter integer number between " + startBorder + " and " + endBorder +
                " (inclusively):");
    }

    public void showUserWrongMenuChoiceNotification(int userChoice, int firstMenuOption, int lastMenuOption) {
        if (userChoice < firstMenuOption || userChoice > lastMenuOption) {
            System.out.println("Error! Wrong option. Try again!");
        }
    }

    public void showWrongPlayerNumberInputNotification() {
        System.out.println("ERROR! Incorrect input. Try again.");
    }

    public void showResultOfGame(boolean resultOfTheGame, int userNumber, int computerNumber) {
        System.out.println("RESULT:");
        if (resultOfTheGame) {
            System.out.println("This is correct number. You win.");
        } else {
            System.out.println("You loose.");
        }
        System.out.println("Your choose: " + userNumber + " ,computer choose: " + computerNumber);
    }

    public void showActualStatisticNotification() {
        System.out.println("YOUR ACTUAL RESULT!");
    }

    public void showFinalStatisticNotification() {
        System.out.println("YOUR RESULT AFTER END GAME!");
    }

    void showStatistics(int numberOfGamePlayed, int numberOfGameWins, int numberOfWrongPlayerInput) {
        System.out.println("Number of all games: " + numberOfGamePlayed);
        System.out.println("Number of wins: " + numberOfGameWins);
        System.out.println("Number of wrong inputs: " + numberOfWrongPlayerInput);
    }

}
