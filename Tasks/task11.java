package Tasks;

class Book {
    private String title;
    private String author;
    private int yearPublished;
    private double price;
    
    // Constructor
    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    
    // Override toString() to display book details
    @Override
    public String toString() {
        return String.format("Title: \"%s\"\n" +
                          "Author: \"%s\"\n" +
                          "Year Published: %d\n" +
                          "Price: $%.2f",
                          title, author, yearPublished, price);
    }
}

public class task11 {
    public static void main(String[] args) {
        // Create three Book objects with different values
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2019, 49.99);
        
        // Print details of each book
        System.out.println("Book 1:");
        System.out.println(book1);
        
        System.out.println("\nBook 2:");
        System.out.println(book2);
        
        System.out.println("\nBook 3:");
        System.out.println(book3);
    }
}