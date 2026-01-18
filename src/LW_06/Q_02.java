package LW_06;
import java.util.Scanner;
public class Q_02 {
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
                    System.out.println("Invalid pet type. Try again.");
                    continue;
                }

                pet.setName(name);
                pets[count] = pet;
                count++;
            }


            System.out.println("\nPet List:");
            for (int i = 0; i < count; i++) {
                String type = (pets[i] instanceof Cat) ? "Cat" : "Dog";
                System.out.println("Name: " + pets[i].getName() + ", Type: " + type);
            }

            sc.close();
        }
    }


