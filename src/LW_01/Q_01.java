package LW_01;
import java.util.Scanner;
public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an odd-length word:");
        String word = scanner.nextLine();
        int middleIndex = word.length()/2;
        char letter = word.charAt(middleIndex);
        System.out.println("The middle character is " + letter);
        scanner.close();

    }
}
