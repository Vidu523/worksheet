package LW_04;
import java.util.Scanner;

public class Q_10 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter a word or phrase: ");
            String input = scanner.nextLine();


            String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();


            String reversed = new StringBuilder(cleaned).reverse().toString();


            if (cleaned.equals(reversed)) {
                System.out.println("It is a palindrome.");
            } else {
                System.out.println("It is not a palindrome.");
            }

            scanner.close();
        }
    }


