package javalearning.myTraining.day1.OOPs.inheritance;

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
