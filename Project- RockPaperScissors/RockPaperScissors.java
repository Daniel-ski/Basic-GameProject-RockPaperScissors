package GitHub_Project_RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String computerMove = computerMove();

        System.out.println("HELLO!");
        System.out.println("Please select game type:");
        System.out.println("1) for a single game");
        System.out.println("2) for a set of % rounds");
        String typeOfGame = scanner.nextLine();

        if (typeOfGame.equals("1")) {

            System.out.println("Choose: Rock, Paper or Scissors:");
            System.out.print("-> ");

            String playerMove = scanner.nextLine();

            while (!playerMove.equalsIgnoreCase("rock") && !playerMove.equalsIgnoreCase("paper") && !playerMove.equalsIgnoreCase("scissors")) {

                System.out.println("Invalid Input.Try Again:");
                System.out.print("-> ");
                playerMove = scanner.nextLine();

            }
            System.out.printf("The computer choose:%n-> %s%n", computerMove);

            winner(playerMove, computerMove);

        } else if (typeOfGame.equals("2")) {
            double playerScore = 0;
            double computerScore = 0;

            for (int gamesCount = 1; gamesCount <= 5; gamesCount++) {
                System.out.println("Choose: Rock, Paper or Scissors:");
                System.out.print("-> ");

                String playerMove = scanner.nextLine();

                while (!playerMove.equalsIgnoreCase("rock") && !playerMove.equalsIgnoreCase("paper") && !playerMove.equalsIgnoreCase("scissors")) {

                    System.out.println("Invalid Input.Try Again:");
                    System.out.print("-> ");
                    playerMove = scanner.nextLine();

                }
                System.out.printf("The computer choose:%n-> %s%n", computerMove);
                if (winnerForSet(playerMove, computerMove).equals("p")) {
                    playerScore++;
                    System.out.println("YOU WIN 1 score!");
                } else if (winnerForSet(playerMove, computerMove).equals("c")) {
                    computerScore++;
                    System.out.println("Sorry! YOU LOSE.Computer win 1 score");
                } else if (winnerForSet(playerMove, computerMove).equals("c/p")) {
                    playerScore += 0.5;
                    computerScore += 0.5;
                    System.out.println("This game was DRAW:");
                    System.out.println("0.5 score for you");
                    System.out.println("0.5 score for computer");
                }
            }
            System.out.println("GAME END :");
            if (playerScore > computerScore) {

                System.out.println("Congratulations! YOU WIN");
                System.out.printf("You score : %.1f", playerScore);
            } else if (computerScore > playerScore) {
                System.out.println("Sorry! YOU LOSE");
                System.out.printf("You score : %f", playerScore);

            } else {
                System.out.println("This game was DRAW");
                System.out.printf("You score : %.1f", playerScore);
            }

        }
    }

    public static String computerMove() {
        Random random = new Random();
        int computerRandomNumber = random.nextInt(4);
        String computerMove = "";

        switch (computerRandomNumber) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Scissors";
                break;
            case 3:
                computerMove = "Paper";
                break;
        }
        return computerMove;
    }

    public static void winner(String playerMove, String computerMove) {

        if ((playerMove.equalsIgnoreCase("rock")) && computerMove.equalsIgnoreCase("scissors") ||
                (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("paper"))) {

            System.out.println("Congratulations! YOU WIN");

        } else if ((playerMove.equalsIgnoreCase("scissors")) && computerMove.equalsIgnoreCase("rock") ||
                (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) ||
                (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors"))) {

            System.out.println("Sorry! YOU LOSE");
        } else {
            System.out.println("This game was DRAW");
        }

    }

    public static String winnerForSet(String playerMove, String computerMove) {
        String winner = "";

        if ((playerMove.equalsIgnoreCase("rock")) && computerMove.equalsIgnoreCase("scissors") ||
                (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("paper"))) {
            winner = "p";


        } else if ((playerMove.equalsIgnoreCase("scissors")) && computerMove.equalsIgnoreCase("rock") ||
                (playerMove.equalsIgnoreCase("rock") && computerMove.equalsIgnoreCase("paper")) ||
                (playerMove.equalsIgnoreCase("paper") && computerMove.equalsIgnoreCase("scissors"))) {
            winner = "c";


        } else {
            winner = "c/p";

        }
        return winner;
    }
}


