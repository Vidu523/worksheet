package LW_04;
import java.util.Scanner;
public class Q_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int a = sc.nextInt();
        System.out.println("Enter an integer: ");
        int b = sc.nextInt();
        System.out.println("Enter an integer: ");
        int c = sc.nextInt();

        int smallest;
        if (a<b && a<c) {
            smallest = a;
        }else{
            if (b<a && b<c){
                smallest = b;
                }else{
                   if(c<a && c<b){
                       smallest = c;
                       System.out.println("The smallest integer is: "+ smallest);
                   }
                }
            }
        sc.close();


        }

    }

