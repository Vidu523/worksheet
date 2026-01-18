package LW_05;
import java.util.ArrayList;
    abstract class BorrowableItems {
        public abstract void displayInfo();
    }


    class Book extends BorrowableItems {
        private String title;
        private String author;
        private String ISBN;
        private boolean available;


        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
            this.available = true;
        }


        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getISBN() {
            return ISBN;
        }

        public boolean isAvailable() {
            return available;
        }

        public void setAvailable(boolean available) {
            this.available = available;
        }


        @Override
        public void displayInfo() {
            System.out.println("Title: " + title +
                    ", Author: " + author +
                    ", ISBN: " + ISBN +
                    ", Available: " + available);
        }
    }


    class Person {
        private String name;

        public Person(String name) {
            this.name = name;
        }
    }


    class Student extends Person {
        public Student(String name) {
            super(name);
        }
    }


    class Library {
        private ArrayList<BorrowableItems> borrowableItemsList;


        public Library() {
            borrowableItemsList = new ArrayList<>();
        }


        public void addLibraryItem(BorrowableItems item) {
            borrowableItemsList.add(item);
        }


        public void checkoutItem(String title) {
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.getTitle().equalsIgnoreCase(title)) {
                        book.setAvailable(false);
                        System.out.println("Book checked out: " + title);
                        return;
                    }
                }
            }
            System.out.println("Book not found.");
        }


        public void listAvailableItems() {
            System.out.println("\nAvailable Library Items:");
            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.isAvailable()) {
                        book.displayInfo();
                    }
                }
            }
        }


        public void displayLibraryInfo() {
            int availableCount = 0;

            for (BorrowableItems item : borrowableItemsList) {
                if (item instanceof Book) {
                    Book book = (Book) item;
                    if (book.isAvailable()) {
                        availableCount++;
                    }
                }
            }

            System.out.println("\nLibrary Information:");
            System.out.println("Total Items: " + borrowableItemsList.size());
            System.out.println("Available Items: " + availableCount);
        }
    }


    public class Q_01 {
        public static void main(String[] args) {


            Book book1 = new Book(
                    "Seena Maragatham",
                    "Sujatha Thilaka",
                    "9789553023975");

            Book book2 = new Book(
                    "Nuramakadya Bauthika Nuladanayakshanamaala",
                    "Seynamasasekaka",
                    "9789553548721");

            Book book3 = new Book(
                    "Island of a Thousand Mirrors",
                    "Nayomi Munaweera",
                    "9781616953623");


            Library library = new Library();


            library.addLibraryItem(book1);
            library.addLibraryItem(book2);
            library.addLibraryItem(book3);


            library.displayLibraryInfo();

            library.listAvailableItems();


            library.checkoutItem("Island of a Thousand Mirrors");


            library.listAvailableItems();
        }
    }


