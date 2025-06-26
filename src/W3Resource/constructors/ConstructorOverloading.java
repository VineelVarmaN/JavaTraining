package W3Resource.constructors;

/**
 * Write a Java program to create a class called "Book" with instance variables title, author, and price.
 * Implement a default constructor and two parameterized constructors:
 * One constructor takes title and author as parameters.
 * The other constructor takes title, author, and price as parameters.
 * Print the values of the variables for each constructor.
 */
class Book{
    private String title;
    private String author;
    private double price;
    //default constructor
    public Book() {
        this.title="Java";
        this.author="telusko";
        this.price=90.00;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String author, double price, String title) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Book bookObj = new Book();
        System.out.println("The values using default constructor for author : "+bookObj.getAuthor());
        System.out.println("The values using default constructor for title : "+bookObj.getTitle());
        System.out.println("The values using default constructor for price : "+bookObj.getPrice());
        Book bookObj1 = new Book("Git","Google");
        System.out.println("The values using multiple parameter constructor for author : "+bookObj1.getAuthor());
        System.out.println("The values using multiple parameter constructor for title : "+bookObj1.getTitle());
        Book bookObj2 = new Book("in28Minutes",1800.00,"Spring");
        System.out.println("The values using all parameter constructor for author : "+bookObj2.getAuthor());
        System.out.println("The values using all parameter constructor for title : "+bookObj2.getTitle());
        System.out.println("The values using all parameter constructor for price : "+bookObj2.getPrice());
    }
}
