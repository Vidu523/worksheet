package LW_01;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in centimeters:");
        double centi = scanner.nextDouble();
        double totalInches = centi / 2.54;
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;
        System.out.printf("%.2f cm = %d feet %.2f inches",centi,feet,inches);
        scanner.close();

    }
}
