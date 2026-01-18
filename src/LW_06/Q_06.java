package LW_06;
import java.util.Scanner;
import java.util.ArrayList;

    class Animal {
        String name;
        double weight;

        Animal(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }
    }


    class Dog extends Animal {
        Dog(String name, double weight) {
            super(name, weight);
        }
    }


    class Cat extends Animal {
        Cat(String name, double weight) {
            super(name, weight);
        }
    }

    public class Q_06 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);


            ArrayList<Animal> animals = new ArrayList<>();
            ArrayList<Dog> dogs = new ArrayList<>();
            ArrayList<Cat> cats = new ArrayList<>();

            boolean running = true;

            while (running) {

                System.out.println("\nMenu:");
                System.out.println("1. Add Cat");
                System.out.println("2. Add Dog");
                System.out.println("3. Remove Cat");
                System.out.println("4. Remove Dog");
                System.out.println("0. Quit");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter cat's name: ");
                        String catName = sc.nextLine();
                        System.out.print("Enter cat's weight: ");
                        double catWeight = sc.nextDouble();
                        sc.nextLine();
                        Cat newCat = new Cat(catName, catWeight);
                        cats.add(newCat);
                        animals.add(newCat);
                        System.out.println("Cat added.");
                        break;

                    case 2:
                        System.out.print("Enter dog's name: ");
                        String dogName = sc.nextLine();
                        System.out.print("Enter dog's weight: ");
                        double dogWeight = sc.nextDouble();
                        sc.nextLine();
                        Dog newDog = new Dog(dogName, dogWeight);
                        dogs.add(newDog);
                        animals.add(newDog);
                        System.out.println("Dog added.");
                        break;

                    case 3:
                        System.out.print("Enter cat's name to remove: ");
                        String removeCatName = sc.nextLine();
                        Cat catToRemove = null;
                        for (Cat c : cats) {
                            if (c.name.equals(removeCatName)) {
                                catToRemove = c;
                                break;
                            }
                        }
                        if (catToRemove != null) {
                            cats.remove(catToRemove);
                            animals.remove(catToRemove);
                            System.out.println("Cat removed.");
                        } else {
                            System.out.println("Cat not found!");
                        }
                        break;

                    case 4:
                        System.out.print("Enter dog's name to remove: ");
                        String removeDogName = sc.nextLine();
                        Dog dogToRemove = null;
                        for (Dog d : dogs) {
                            if (d.name.equals(removeDogName)) {
                                dogToRemove = d;
                                break;
                            }
                        }
                        if (dogToRemove != null) {
                            dogs.remove(dogToRemove);
                            animals.remove(dogToRemove);
                            System.out.println("Dog removed.");
                        } else {
                            System.out.println("Dog not found!");
                        }
                        break;

                    case 0:
                        running = false;
                        System.out.println("Exiting program.");
                        break;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }


                System.out.println("\nCurrent Animals:");
                for (Animal a : animals) {
                    String type = (a instanceof Dog) ? "Dog" : "Cat";
                    System.out.println(type + ": " + a.name + ", " + a.weight + "kg");
                }
            }

            sc.close();
        }
    }


