package pl.com.quiz.number;

import java.util.Scanner;

public class Main {
    public static final int BORDER_LOW=0;
    public static final int BORDER_HIGH=10;
    public static final int MENU_OPTION_START_GAME=1;
    public static final int MENU_OPTION_STATISTIC=2;
    public static final int MENU_OPTION_EXIT=3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        Statistics statistics = new Statistics();
        Game game = new Game();
        Notifications notifications = new Notifications();
        User player = new User();

        int gameCounter = 0;
        int winCounter = 0;
        int wrongChoiceCounter = 0;

        do {
            notifications.showMainMenu();
            player.setUseMenuChoice(scanner.nextShort());
            notifications.showUserWrongMenuChoiceNotification(player.getUseMenuChoice(),MENU_OPTION_START_GAME,
                    MENU_OPTION_EXIT);

            switch (player.getUseMenuChoice()) {
                case MENU_OPTION_START_GAME: {
                    statistics.setNewNumberOfPlays(gameCounter);
                    notifications.showInputNumberNotification(BORDER_LOW, BORDER_HIGH);
                    player.setUserNumberInput(scanner.nextInt());

                    boolean isTrue = game.checkPlayerNumberInput(player.getUserNumberInput(), BORDER_LOW,
                            BORDER_HIGH);
                    if (!isTrue) {
                        statistics.setNewNumberOfWrongInputs(++wrongChoiceCounter);
                        notifications.showWrongPlayerNumberInputNotification();
                        break;
                    } else {
                        game.setComputerGeneratedNumber(computer.getRandomNumber(BORDER_LOW,BORDER_HIGH));
                        game.setUserChoiceNumber(player.getUserNumberInput());
                        if (game.resultOfTheGame()) {
                            statistics.setNewNumberOfWins(++winCounter);
                        }
                        notifications.showResultOfGame(game.resultOfTheGame(),game.getUserChoiceNumber(),game.getComputerGeneratedNumber());
                    }
                    gameCounter++;
                }
                break;

                case MENU_OPTION_STATISTIC: {
                    notifications.showActualStatisticNotification();
                    notifications.showStatistics(statistics.getNumberOfPlays(),statistics.getNumberOfWins(),
                            statistics.getNumberOfWrongInputs());
                }

                case MENU_OPTION_EXIT:
                    break;

            }

        } while (gameIsInProgress(player));
        notifications.showFinalStatisticNotification();
        notifications.showStatistics(statistics.getNumberOfPlays(),statistics.getNumberOfWins(),
                statistics.getNumberOfWrongInputs());
    }

    private static boolean gameIsInProgress(User player) {
        return player.getUseMenuChoice() != 3;
    }
}
