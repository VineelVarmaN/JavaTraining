package javatraining.javatpoint.sampletopic;

public class EncapsulationExamples {
    //getter and setter method used for private variable declaration
    //instance variables created with private
    private int age;
    private String name;
    private String school;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    //only getter method
    private String area = "Hyderabad";

    public String getArea() {
        return area;
    }

    public static void main(String[] args) {
        EncapsulationExamples objEncap = new EncapsulationExamples();
        objEncap.setAge(30);
        objEncap.setName("Vineel");
        objEncap.setSchool("Bhashyam");
        EncapsulationExamples objEncap1 = new EncapsulationExamples();
        objEncap1.setAge(24);
        objEncap1.setName("Swathi");
        objEncap1.setSchool("JNTU");
        System.out.println(objEncap1.getName() + " with age " + objEncap1.getAge() + " study in " + objEncap1.getSchool() + " in " + objEncap1.getArea());
        System.out.println(objEncap.getName() + " with age " + objEncap.getAge() + " study in " + objEncap.getSchool() + " in " + objEncap.getArea());
    }
}
