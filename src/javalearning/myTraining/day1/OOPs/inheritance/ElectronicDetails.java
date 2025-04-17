package javalearning.myTraining.day1.OOPs.inheritance;

/**
 * Electronics (Subclass) class inherits properties and methods from Product(Super class) by using extends keyword
 */
class Electronics extends Product {
    private String type;

    //super - It is used to invoke a constructor of its super class
    public Electronics(String name, double price, String brand) {
        super(name, price); // Calls Parent Constructor
        this.type = brand;
    }

    public void display() {
        System.out.println("Electronics: " + type +" "+getName()+ " costs $" + getPrice());
    }
}
public class ElectronicDetails {
    public static void main(String[] args) {
        // created object for electronics with values initialized
        Electronics laptopObj = new Electronics("Laptop", 1200.00, "Dell");
        // Display products
        laptopObj.display();
    }
}

/**
 * when an object of Electronics class is created,
 * a copy of all methods and fields of the superclass (Product) acquires memory in this object.
 * That is why by using the object of the subclass we can also access the members of a superclass.
 */
