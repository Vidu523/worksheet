package LW_01;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name:");
        String fName = scanner.next();
        System.out.println("Enter middle name:");
        String mName = scanner.next();
        System.out.println("Enter last name:");
        String lName = scanner.next();
        System.out.println(lName+"," + fName + " " + mName.charAt(0));
        scanner.close();
    }
}
