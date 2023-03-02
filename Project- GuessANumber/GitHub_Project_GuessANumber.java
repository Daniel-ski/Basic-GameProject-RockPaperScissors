import java.util.Random;
import java.util.Scanner;

public class GitHub_Project_GuessANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumbers = new Random();
        int computerNumbers = randomNumbers.nextInt(100);

        while (true){
            System.out.println("Try to guess a number I thought from 0 -> 100 :");

            String playerInput = scanner.nextLine();
            int playerNumber;
            boolean isValidInput = true;

            for (int i = 0; i < playerInput.length() ; i++) {
             if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57){
                 isValidInput = false;
                 break;
             }
            }
            if (isValidInput){
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumbers){
                    System.out.println("You guessed it!");
                    break;
                } else if (playerNumber > computerNumbers) {
                    System.out.println("Too High");
                    
                } else if (playerNumber < computerNumbers) {
                    System.out.println("Too Low");
                }
            }else {
                System.out.println("Invalid input.");
            }
        }
    }
}
