import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        System.out.println("🎯 Welcome to the Guess the Number Game!");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Try to guess it in as few attempts as possible.\n");

        do {
            int randomNumber = rand.nextInt(100) + 1;
            int guess = 0;
            int tries = 0;
            boolean correct = false;

            while (!correct) {
                System.out.print("Enter your guess: ");
                try {
                    guess = scanner.nextInt();
                    tries++;

                    if (guess < 1 || guess > 100) {
                        System.out.println("⚠️ Please enter a number between 1 and 100.");
                    } else if (guess > randomNumber) {
                        System.out.println("Too high, try again.");
                    } else if (guess < randomNumber) {
                        System.out.println("Too low, try again.");
                    } else {
                        System.out.println("🎉 You win! You took " + tries + " tries.");
                        correct = true;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("⚠️ Invalid input. Please enter a number.");
                    scanner.next(); // clear the invalid input
                }
            }

            System.out.print("\nDo you want to play again? (yes/no): ");
            playAgain = scanner.next().toLowerCase();
            System.out.println();

        } while (playAgain.equals("yes") || playAgain.equals("y"));

        System.out.println("👋 Thanks for playing! Goodbye!");
        scanner.close();
    }
}￼Enter
