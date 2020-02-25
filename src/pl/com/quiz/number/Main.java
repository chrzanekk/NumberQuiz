package pl.com.quiz.number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
	Computer randomNumberDraw = new Computer(1,10);
    Statistics statistics = new Statistics();
    Game game = new Game();
    Menu menu = new Menu();
    User player = new User();

        int iterator = 0;
        int winCount = 0;
        int wrongInput = 0;
        player.setUserChoice((short) -1);
        do {
            menu.showMenu();
            player.setUserChoice(scanner.nextShort());
            player.userWrongMenuChoiceNotification(1,3);

            switch (player.getUserChoice()) {
                case 1:
                {
                    statistics.setNewNumberOfPlays(iterator);
                    menu.showInputNotification(randomNumberDraw.getLowerBorder(),randomNumberDraw.getHigherBorder());
                    player.setUserInput(scanner.nextInt());

                    boolean isTrue = menu.checkPlayerInput(player.getUserInput(),randomNumberDraw.getLowerBorder(),
                            randomNumberDraw.getHigherBorder());
                    if(!isTrue){
                        wrongInput++;
                        statistics.setNewNumberOfWrongInputs(wrongInput);
                        menu.checkPlayerInputNotification();
                        break;
                    } else {
                        game.setComputerNumber(randomNumberDraw.computer());
                        game.setUserNumber(player.getUserInput());
                        if(game.resultOfTheGame()) {
                            winCount++;
                            statistics.setNewNumberOfWins(winCount);
                        }
                        game.showResultOfTheGame();
                    }
                    iterator++;
                }
                    break;

                case 2:
                {
                    menu.showActualStatisticNotification();
                    statistics.showStatistics();
                }

                case 3:
                    break;

            }

        } while ((player.getUserChoice() != 3));
        menu.showFinalStatisticNotification();
        statistics.showStatistics();
    }
}
