import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

class Book
{
    String title;
    double price;

    public Book(String title, double price) 
    {
        this.title = title;
        this.price = price;
    }
}

public class prac7_3 
{
    static HashMap<String, Book> books = new HashMap<>();
    static ArrayList<Book> cart = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        initializeBooks();
        while (true) 
        {
            System.out.println("\n!!!WELCOME TO ONLINE BOOKSTORE MENU!!!");
            System.out.println("1. Browse Books");
            System.out.println("2. Add Book to Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) 
            {
                case 1 -> browseBooks();
                case 2 -> addBookToCart();
                case 3 -> checkout();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private static void initializeBooks() 
    {
        books.put("B001", new Book("Book 1", 49.99));
        books.put("B002", new Book("Book 2", 39.99));
        books.put("B003", new Book("Book 3", 29.99));
        books.put("B004", new Book("Book 4", 19.99));
        books.put("B005", new Book("Book 5", 9.99));
    }

    private static void browseBooks() 
    {
        System.out.println("\nAvailable Books:");
        for (String id : books.keySet()) 
        {
            Book book = books.get(id);
            System.out.println(id + ": " + book.title + " ($" + book.price + ")");
        }
    }

    private static void addBookToCart() 
    {
        System.out.print("\nEnter book ID: ");
        String bookId = scanner.nextLine();
        if (books.containsKey(bookId)) 
        {
            cart.add(books.get(bookId));
            System.out.println("Book added to cart successfully!");
        } 
        else 
        {
            System.out.println("Invalid book ID. Please try again.");
        }
    }

    private static void checkout() 
    {
        double totalCost = 0;
        if (cart.isEmpty()) 
        {
            System.out.println("Your cart is empty.");
            return;
        }
        System.out.println("\nCart Items:");
        for (int i = 0; i < cart.size(); i++) 
        {
            Book book = cart.get(i);
            System.out.println((i + 1) + ". " + book.title + " ($" + book.price + ")");
            totalCost += book.price;
        }
        System.out.println("\nTotal Cost: $" + totalCost);
        cart.clear();
        System.out.println("Checkout successful. Cart cleared.");
    }
}
