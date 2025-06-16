package mainrepo;
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
            System.out.println("Guess a number from 0 to 100 (Enter quit to leave)");
            String userInput = input.nextLine();

            if (Integer.parseInt(userInput) == randomNum) {
                System.out.println("You win! Number was: " + randomNum);
                break;

            } else if (Integer.parseInt(userInput) > randomNum) {
                System.out.println("Too high! Try again.");

            } else if (Integer.parseInt(userInput) < randomNum) {
                System.out.println("Too low! Try again.");

            } else {
                System.out.println("Please enter a valid input"); // TODO: Add error handling
            }
        }
    }
}
