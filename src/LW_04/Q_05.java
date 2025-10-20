package LW_04;
import java.util.Scanner;
public class Q_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entree");
        System.out.println("1.Tofu Burger($3.49)");
        System.out.println("2.Cajun Chicken($4.59)");
        System.out.println("3.Buffalo Wings($3.99)");
        System.out.println("4.Rainbow Fillet($2.99)");
        System.out.println("Enter your preference entree no: ");
        int entree = sc.nextInt();

        System.out.println("Side Dish");
        System.out.println("1.Rice Cracker($0.79)");
        System.out.println("2.No-Salt Fries($0.69)");
        System.out.println("3.Zucchini($1.09)");
        System.out.println("4.Brown Rice($0.59)");
        System.out.println("Enter your preference side dish no: ");
        int side_dish = sc.nextInt();

        System.out.println("Drink");
        System.out.println("1.Cafe Mocha($1.99)");
        System.out.println("2.Cafe Latte($1.90)");
        System.out.println("3.Espresso($2.49)");
        System.out.println("4.Oolong Tea($0.99)");
        System.out.println("Enter your preference drink no: ");
        int drink = sc.nextInt();

        double total = switch (entree){
            case 1 ->
                3.49;

            case 2->
                4.59;

            case 3->
                3.99;

            case 4->
                2.99;

            default->
                0.00;


        };
        total += switch(side_dish) {
            case 1->
                0.79;

            case 2->
                 0.69;

            case 3->
                 1.09;

            case 4->
                 0.59;

            default->
                0.00;

        };
        total += switch(drink){
            case 1->
                1.99;

            case 2->
                1.90;

            case 3->
                2.49;

            case 4->
                0.99;

            default->
                0.00;
        };
        System.out.printf ("Your total bill price = $%.2f%n ",total);
        }

    }

