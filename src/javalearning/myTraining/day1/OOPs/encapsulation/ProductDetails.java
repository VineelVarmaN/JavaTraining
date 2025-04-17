package javalearning.myTraining.day1.OOPs.encapsulation;

/**
 * Encapsulation: It is a process of wrapping data (variables) and methods in to a single unit.
 * Encapsulation is used to hide the sensitive data by using private variables and public methods.
 * While exposing a public interface for interaction.
 */
class Product {
    //Private Variables → name and price are hidden from direct access outside the class.
    //To protects data and ensures controlled access.
    private String name;
    private double price;

    //A constructor in Java is used to initialize objects when they are created
    //constructor initializes the object with name & price when created.
    //A constructor has the same name as the class in which it is defined.
    //Constructors are primarily used to set the values of an object’s attributes when it is created.
    public Product(String name, double price) {
        this.name = name;
        //this is a reference variable that refers to the current object
        this.price = price;
    }

    //empty constructor allows creating an object without setting values immediately.
    public Product() {
    }

    //We use getter/setter methods to control access safely.
    //setters - are used to set values safely
    //getters - are used to get values safely
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }
    //this is my security check
    public void setPrice(double price) {
        if (price>0) this.price = price;
    }

    public void display(){
        System.out.println(name + " costs $ "+price);
    }
}

public class ProductDetails{

    public static void main(String[] args) {
        //calls constructor with parameters
        Product productObj1 = new Product("HP", 35000);
        productObj1.display();
        //calls empty constructor
        Product productObj = new Product();
        //then initialize the values
        productObj.setName("Dell");
        productObj.setPrice(45000);
        productObj.display();
        System.out.println("The name of laptop is : "+productObj.getName());
        System.out.println("The price of laptop is : "+productObj.getPrice());
    }
}

/**
 * 	There can be a question, why we have used private access modifer for variables and why not public access modifier
 * 		○ For public variables, you can intialize any value directly.
 * 		○ For private variables, you can add a security check logic in setters method before setting the value.
 * 	Explaination: Here the encapsulation is achieved by restricting direct access to the name and price fields of the Product class.
 * 	These fields are marked as private and can only be accessed or modified through public getter and setter methods (getName(), setName(),
 * 	getPrice(), setPrice()).
 * 	This approach ensures data hiding and maintains control over the values of these fields.
 */