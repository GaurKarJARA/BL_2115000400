package level1;

// Book class definition
public class Book {
    // Private fields
    private String title;
    private String author;
    private double price;
    // Constructor to initialize Book attributes
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    // Method to display book details
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    // Main method to test Book class
    public static void main(String[] args) {
        // Creating a Book object
        Book book1 = new Book("premchand ke phate joote", "premchand", 299);
        // Displaying Book details
        System.out.println("=== Book Details ===");
        book1.displayDetails();
    }
}

