package LW_06;
import java.util.Scanner;
public class Q_03 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            Pet[] pets = new Pet[100];
            int count = 0;

            while (true) {
                System.out.print("Enter pet name (or STOP to finish): ");
                String name = sc.nextLine();

                if (name.equalsIgnoreCase("STOP")) {
                    break;
                }

                System.out.print("Enter pet type (c for cat, d for dog): ");
                char type = sc.nextLine().toLowerCase().charAt(0);

                Pet pet;

                if (type == 'c') {
                    pet = new Cat();
                } else if (type == 'd') {
                    pet = new Dog();
                } else {
                    System.out.println("Invalid type. Try again.");
                    continue;
                }

                pet.setName(name);
                pets[count] = pet;
                count++;
            }

            // Print all Cats first
            System.out.println("\nCats:");
            for (int i = 0; i < count; i++) {
                if (pets[i] instanceof Cat) {
                    System.out.println(pets[i].getName());
                }
            }

            // Print all Dogs next
            System.out.println("\nDogs:");
            for (int i = 0; i < count; i++) {
                if (pets[i] instanceof Dog) {
                    System.out.println(pets[i].getName());
                }
            }

            sc.close();
        }
    }


