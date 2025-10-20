package LW_04;
import java.util.Scanner;
public class Q_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a power of 10: ");
        int power = sc.nextInt();
        String name;
        switch (power){
            case 6:
                name= "Million";
                break;
            case 9:
                name="Billion";
                break;
            case 12:
                name="Trillion";
                break;
            case 15:
                name="Quadrillion";
                break;
            case 18:
                name="Quintillion";
                break;
            case 21:
                name="Sextillion";
                break;
            case 30:
                name="Nonillion";
                break;
            case 100:
                name="Googol";
                break;
            default:
                name="no corresponding word";
                break;
        }
        System.out.println("corresponding word is: " + name);
        sc.close();
    }
}
