package pl.com.quiz.number;

public class Menu {
    void showMenu() {
        System.out.println("***NUMBER QUIZ***");
        System.out.println("Please select an option:");
        System.out.println("1 - play game");
        System.out.println("2 - actual statistics");
        System.out.println("3 - exit");
    }

    public void showInputNotification(int startBorder, int endBorder){
        System.out.println("Enter integer number between "+ startBorder + " and "+ endBorder +
                " (inclusively):");
    }

    public boolean checkPlayerInput(int playerInput, int startBorder, int endBorder){
        if (playerInput < startBorder || playerInput>endBorder) {
            return false;
        }
        return true;
    }

    public void checkPlayerInputNotification(){
                    System.out.println("ERROR! Incorrect input. Try again.");
    }

    public void showActualStatisticNotification(){
        System.out.println("YOUR ACTUAL RESULT!");
    }

    public void showFinalStatisticNotification(){
        System.out.println("YOUR RESULT AFTER END GAME!");
    }

}
