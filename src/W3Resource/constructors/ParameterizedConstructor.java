package W3Resource.constructors;

class Dog{
    private String Name;
    private String colour;

    public Dog(String colour, String name) {
        this.colour = colour;
        Name = name;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return Name;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Dog dogObj = new Dog("White","snow");
        System.out.println("The name of the dog is : "+dogObj.getName());
        System.out.println("The colour of the dog is : "+dogObj.getColour());
    }
}
