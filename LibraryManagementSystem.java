import java.util.ArrayList;
import java.util.List;
abstract class LibraryItem {
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public int getItemId() {
        return itemId;
    }


    public String getAuthor() {
        return author;
    }

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }

    public abstract int getLoanDuration();
}

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 14;
    }

    public void reserveItem() {
        System.out.println("Book reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return true;
    }
}

class Magazine extends LibraryItem {
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 7;
    }
}

class DVD extends LibraryItem implements Reservable {
    public DVD(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    public int getLoanDuration() {
        return 5;
    }

    public void reserveItem() {
        System.out.println("DVD reserved: " + getTitle());
    }

    public boolean checkAvailability() {
        return false;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();

        items.add(new Book(111, "GREAT MAGAZINE", "great guy"));
        items.add(new Magazine(112, "THE HINDU", "many"));
        items.add(new DVD(113, "TIMES NOW", "many"));

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                System.out.println("Availability: " + ((Reservable) item).checkAvailability());
            }
        }
    }
}