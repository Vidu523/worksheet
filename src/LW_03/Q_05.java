package LW_03;
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
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author +
                ", ISBN: " + ISBN + ", Available: " + available);
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student extends Person {
    public Student (String name) {
        super(name);
    }
}

class Library {
    private ArrayList<BorrowableItems> itemList = new ArrayList<>();

    public void addLibraryItem(BorrowableItems item) {
        itemList.add(item);
    }

    public void listAvailableItems() {
        System.out.println("\nAvailable items:");
        for (BorrowableItems item : itemList) {
            if (item instanceof Book book && book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    public void checkoutItem(String title) {
        for (BorrowableItems item : itemList) {
            if (item instanceof Book book && book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("\nChecked out: " + book.getTitle());
                } else {
                    System.out.println("\nAlready checked out!");
                }
            }
        }
    }

    public void displayLibraryInfo() {
        System.out.println("\nTotal items in library: " + itemList.size());
    }
}

public class Q_05 {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book b2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book b3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");

        library.addLibraryItem(b1);
        library.addLibraryItem(b2);
        library.addLibraryItem(b3);

        library.displayLibraryInfo();
        library.listAvailableItems();

        library.checkoutItem("Island of a Thousand Mirrors");
        library.listAvailableItems();
    }
}
