package javalearning.javatpoint.sampletopic;

//abstract call can have abstract method, constructor and non - abstract method
abstract class Car{
    //abstract method
    abstract void functionality();
    // constructor
   private String carCompany;

   public Car(String carCompany) {
        this.carCompany = carCompany;
    }
    //non-abstract method
    public void carType(String carModel){
        System.out.println(carCompany + " is a " + carModel + " and functionality is to ");
    }
}

class Tata extends Car {
    public Tata(String carCompany) {
        super(carCompany);
    }

    void functionality(){
        System.out.println("run");
    }
}
public class AbstractClassExamples {
    public static void main(String[] args) {
        Car obj = new Tata("Tata Neaxon");
        obj.functionality();
        obj.carType("Compact SUV");
    }

}
