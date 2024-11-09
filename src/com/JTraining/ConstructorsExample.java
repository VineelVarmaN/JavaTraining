package com.JTraining;

public class ConstructorsExample {
    private int age;
    private String name;
    private String school;
    private String area ;

    //parameterized constructor
    public ConstructorsExample(int age, String name, String school, String area) {
        this.age = age;
        this.name = name;
        this.school = school;
        this.area = area;
    }

    //parameterized constructor with only one parameter
    public ConstructorsExample(String area){
        age = 30;
        name = "Vineel";
        school = "Bhashyam";
        this.area = area;
    }
    //default constructor where values can be initialized
    public ConstructorsExample(){
        age = 28;
        name = "Varma";
        school = "Bhashyam";
        area = "Hyderabad";
    }

    public static void main(String[] args) {
        //calling parameterized constructor with only one parameter
        ConstructorsExample objEncap = new ConstructorsExample("Hyderabad");
        //calling parameterized constructor
        ConstructorsExample objEncap1 = new ConstructorsExample(24, "Swathi", "JNTU", "Hyderabad");
        //calling default parameter with values initialized
        ConstructorsExample objEncap2 = new ConstructorsExample();
        System.out.println(objEncap2.name + " with age " + objEncap2.age + " study in " + objEncap2 .school);
        System.out.println(objEncap1.name + " with age " + objEncap1.age + " study in " + objEncap1.school + " in " + objEncap1.area);
        System.out.println(objEncap.name + " with age " + objEncap.age + " study in " + objEncap.school + " in " + objEncap.area);
    }
}
