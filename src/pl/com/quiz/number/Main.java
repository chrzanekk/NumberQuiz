package pl.com.quiz.number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Computer randomNumberDraw = new Computer(1,10);
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();

        int iterator = 1;
        int winCount = 0;
        short userOption = -1;
        do {
            System.out.println("***NUMBER QUIZ***");
            System.out.println("Please select an option:");
            System.out.println("1 - play game");
            System.out.println("2 - actual statistics");
            System.out.println("3 - exit");
            userOption = scanner.nextShort();
            switch (userOption) {
                case 1:
                {
                    statistics.setNewNumberOfPlays(iterator);

                    System.out.println("Enter integer number between "+ randomNumberDraw.getLowerBorder() + " and "+ randomNumberDraw.getHigherBorder() +
                            " (inclusively):");
                    int inputNumber = scanner.nextInt();

                    if (inputNumber < randomNumberDraw.getLowerBorder() || inputNumber>randomNumberDraw.getHigherBorder()) {
                        System.out.println("ERROR! Incorrect input. Try again.");
                        break;
                    } else {
                        User player = new User(inputNumber);
                        int randomNumber = randomNumberDraw.computer();
                        Game game = new Game(inputNumber,randomNumber);

                        System.out.println("RESULT:");
                        if (game.resultOfTheGame()) {
                            System.out.println("This is correct number. You win.");
                            System.out.println("Your choose: " + player.getSelectedNumber() + " ,computer choose: " + randomNumber);
                            winCount++;
                            statistics.setNewNumberOfWins(winCount);
                        } else {
                            System.out.println("You loose.");
                            System.out.println("Your choose: " + player.getSelectedNumber() + " ,computer choose: " + randomNumber);
                        }
                    }
                    iterator++;
                }
                    break;
                case 2:
                {
                    System.out.println("YOUR ACTUAL RESULT!");
                    System.out.println("Number of all games: " + statistics.getNumberOfPlays());
                    System.out.println("Number of wins: " + statistics.getNumberOfWins());
                }
                case 3:
                    break;

            }

        } while ((userOption != 3));
        System.out.println("YOUR RESULT AFTER END GAME!");
        System.out.println("Number of all games: " + statistics.getNumberOfPlays());
        System.out.println("Number of wins: " + statistics.getNumberOfWins());


    }
}
