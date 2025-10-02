package LW_02;
import java.util.Scanner;
public class Q_04 {
    public static void main(String[] args) {
            final int COUNT = 5;
            int[] numbers = new int[COUNT];
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter " + COUNT + " integer numbers (press Enter after each):");

            for (int i = 0; i < COUNT; i++) {
                while (true) {
                    System.out.print("Number " + (i + 1) + ": ");
                    if (scanner.hasNextInt()) {
                        numbers[i] = scanner.nextInt();
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter an integer.");
                        scanner.next();
                    }
                }
            }

            int max = Integer.MIN_VALUE;
            int secondMax = Integer.MIN_VALUE;

            for (int value : numbers) {
                if (value > max) {
                    secondMax = max;
                    max = value;
                } else if (value < max && value > secondMax) {
                    secondMax = value;
                }
            }
            if (secondMax == Integer.MIN_VALUE) {
                System.out.println("There is no distinct second‑largest element (all numbers are equal).");
            } else {
                System.out.println("The second‑largest element is: " + secondMax);
            }

            scanner.close();
        }
    }

