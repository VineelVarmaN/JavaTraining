package com.JTraining;

//interface class will have only abstract methods
interface Vineel {
    void fisrtName();
}
interface Varma{
   // void secondName();
}
//interface class inherits abstract class
interface Nemmani extends Varma{
    void secondName();
}
class Name implements Vineel, Nemmani{
    public void fisrtName(){
        System.out.println("fistname is Vineel");
    }
    public void secondName(){
        System.out.println("secondName is Varma");
    }
}
public class InterfaceClassExamples {
    public static void main(String[] args) {
        Name obj = new Name();
        obj.fisrtName();
        obj.secondName();
    }
}
