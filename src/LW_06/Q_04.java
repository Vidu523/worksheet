package LW_06;
import java.util.Scanner;
public class Dog extends Pet {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String speak() {
        return "";
    }
}

public class Cat extends Pet {
    private String coatColor;

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }

    @Override
    public String speak() {
        return "";
    }
}



public class Q_04 {
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

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter coat color: ");
                String color = sc.nextLine();
                cat.setCoatColor(color);

                pets[count] = cat;
                count++;

            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);

                System.out.print("Enter weight: ");
                double weight = Double.parseDouble(sc.nextLine());
                dog.setWeight(weight);

                pets[count] = dog;
                count++;

            } else {
                System.out.println("Invalid pet type. Try again.");
            }
        }


        System.out.println("\nCats:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Cat) {
                Cat c = (Cat) pets[i];
                System.out.println("Name: " + c.getName() +
                        ", Type: Cat" +
                        ", Coat Color: " + c.getCoatColor());
            }
        }


        System.out.println("\nDogs:");
        for (int i = 0; i < count; i++) {
            if (pets[i] instanceof Dog) {
                Dog d = (Dog) pets[i];
                System.out.println("Name: " + d.getName() +
                        ", Type: Dog" +
                        ", Weight: " + d.getWeight());
            }
        }

        sc.close();
    }
}

