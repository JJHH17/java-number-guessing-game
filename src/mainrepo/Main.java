package mainrepo;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creating a scanner input

        System.out.println("Welcome to number guesser!");
        System.out.println("__________________________");

        // Generate a random number, between 0 and 100
        int randomNum = (int) (Math.random() * 101);

        // Game loop
        while (true) {
            try {
                System.out.println("Guess a number from 0 to 100 (Enter quit to leave)");
                String userInput = input.nextLine();

                // Exit keyword
                if (userInput.toLowerCase().equals("quit")) {
                    break;
                }

                if (Integer.parseInt(userInput) == randomNum) {
                    System.out.println("You win! Number was: " + randomNum);
                    break;

                } else if (Integer.parseInt(userInput) > randomNum) {
                    System.out.println("Too high! Try again.");

                } else {
                    System.out.println("Too low! Try again.");
                }
            } catch (Exception InvalidParameterException) {
                    System.out.println("Please enter a valid number");
            }
        }
    }
}

