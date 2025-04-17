package javalearning.myTraining.day1.OOPs.methodOverriding;

/**
 * 	• Polymorphism: The same method can behave differently depending on the object that calls this method.
 * 	• Types of polymorphism
 * 		○ Compile time polymorphism - Method overloading
 * 		○ Run time polymorphism - Method overriding
 * 	• Method Overriding: A child class can redefine a method of its parent class.
 * 	• Method Overloading: We can define multiple methods with the same name but different parameters.
 *
 * 	• Method Overriding:
 * 		○ Will have same method name & parameters in both parent and child classes
 * 		○ The child class redifines the behavior of the inherited method
 * 		○ Example: Let's say we are designing a vehicle system. Different vehicles have the same move action, but their movement differs.
 */
class Vehicle {
    //parent class Vehilce has a default move method
    void move() {
        System.out.println("The vehicle is moving");
    }
}

//child class override the method with specific behaviour
class Car extends Vehicle {
    @Override
    void move() {
        System.out.println("The car is driving on the road");
    }
}

class Boat extends Vehicle {
    @Override
    void move() {
        System.out.println("The boat is sailing on water");
    }
}

public class VehicleMovement {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();

        myVehicle.move();  // Calls Vehicle's move() method
        myCar.move();      // Calls Car's overridden move() method
        myBoat.move();     // Calls Boat's overridden move() method
    }

}
