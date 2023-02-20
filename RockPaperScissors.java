package GitHub_Project_RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String computerMove = computerMove();

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

}
