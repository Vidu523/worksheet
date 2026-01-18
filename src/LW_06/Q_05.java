package LW_06;

    class Animal {
        double weight;

        Animal(double weight) {
            this.weight = weight;
        }
    }


    class Dog extends Animal {
        Dog(double weight) {
            super(weight);
        }
    }


    class Cat extends Animal {
        Cat(double weight) {
            super(weight);
        }
    }


    public class Q_05 {
        public static void main(String[] args) {

            Animal[] animals = {
                    new Dog(20.5),
                    new Cat(4.2),
                    new Dog(18.0),
                    new Dog(25.3),
                    new Cat(5.1)
            };


            int dogCount = 0;
            for (Animal a : animals) {
                if (a instanceof Dog) {
                    dogCount++;
                }
            }


            Dog[] dogs = new Dog[dogCount];
            int index = 0;
            for (Animal a : animals) {
                if (a instanceof Dog) {
                    dogs[index++] = (Dog) a;
                }
            }


            double sum = 0;
            double min = dogs[0].weight;
            double max = dogs[0].weight;

            for (Dog d : dogs) {
                sum += d.weight;

                if (d.weight < min) min = d.weight;
                if (d.weight > max) max = d.weight;
            }

            double average = sum / dogs.length;


            System.out.println("Number of Dogs: " + dogs.length);
            System.out.println("Average Dog Weight: " + average);
            System.out.println("Minimum Dog Weight: " + min);
            System.out.println("Maximum Dog Weight: " + max);
        }
    }


