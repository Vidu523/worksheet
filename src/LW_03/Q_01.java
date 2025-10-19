package LW_03;
import java.util.Scanner;
class Temperature{
    private double celsius;
    public Temperature(){
       this.celsius = 0.0;
    }
    public Temperature(double celsius){
        this.celsius = celsius;
    }
    public double toCelsius(){
        return celsius;
    }
    public double toFahrenheit(){
        return celsius * 9/5 + 32;
    }
    public void setCelsius(double celsius){
        this.celsius = celsius;
    }
    public void setFahrenheit(double fahrenheit){
        this.celsius = (fahrenheit-32) * 5 / 9;
    }
}
public class Q_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in celsius: ");
        double c = scanner.nextDouble();
        Temperature temp = new Temperature(c);
        temp.setCelsius(c);
        System.out.println("Temperature in Fahrenheit: " + temp.toFahrenheit());
        scanner.close();
    }
}
