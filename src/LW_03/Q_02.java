package LW_03;
import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();
        Temperature temp = new Temperature(f);
        temp.setFahrenheit(f);
        System.out.println("Temperature in celsius: "+ temp.toCelsius());
        scanner.close();
    }
}
