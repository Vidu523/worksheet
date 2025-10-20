package LW_04;
import java.util.Scanner;
public class Q_07 {
    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int count = 0;
        int n = Math.abs(num);
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an integer (negative number to stop): ");
            int number = sc.nextInt();

            if (number < 0) {
                System.out.println("Program ended.");
                break;
            }
            int digits = countDigits(number);
            System.out.println("The number " + number + " has " + digits + " digits.\n");
        }
    }

}