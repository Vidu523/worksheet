package LW_04;
import java.util.Scanner;
import java.util.Random;
public class Q_11 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();

            int secretNumber = random.nextInt(100) + 1;
            int guess = 0;

            System.out.println("Guess a number between 1 and 100:");

            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");
                guess = scanner.nextInt();

                if (guess < secretNumber) {
                    System.out.println("Higher!");
                } else if (guess > secretNumber) {
                    System.out.println("Lower!");
                } else {
                    System.out.println("Congratulations! You guessed the correct number.");
                }
            }

            scanner.close();
        }
    }


