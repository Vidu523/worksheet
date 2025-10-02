package LW_02;

import java.util.Scanner;
public class Q_02 {
    public static int countDigits(int number) {
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("Enter an integer(without negative): ");
            int number;
            number= scanner.nextInt();
            if(number<0){
                System.out.println("Exiting the program. ");
                break;
            }
            int digitCount= countDigits(number);
            System.out.println("Number of digits: " + digitCount);
        }
        scanner.close();
    }
}
