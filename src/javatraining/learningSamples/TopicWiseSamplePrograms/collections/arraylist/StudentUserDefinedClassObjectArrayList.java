package javatraining.learningSamples.TopicWiseSamplePrograms.collections.arraylist;

import java.util.ArrayList;

/**
 * create a user defined class called student
 * create the objects
 * create constructor for initializing the values
 * create an array list
 * add all object elements to array list using constructor
 * iterate and print the elements
 */
class Student {
    //creating the objects
    int rollNo;
    String name;
    int age;

    //create a constructor
    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }
}
public class StudentUserDefinedClassObjectArrayList{
    public static void main(String[] args) {
        //create an arraylist
        ArrayList<Student> studentDetails = new ArrayList<>();
        //adding all the elements using constructor
        studentDetails.add(new Student(1, "Vineel", 29));
        studentDetails.add(new Student(2, "Swathi", 24));
        studentDetails.add(new Student(3, "Varma", 50));
        //iterating the array list and print the elements
        System.out.println("Iterated the elements using forEach and Lambda expression :");
        studentDetails.forEach(a->{ //using lambda expression storing the iterated element in a
            System.out.println(a.rollNo+" "+a.name+" "+a.age);
        });
        //iterated using enhanced for loop
        System.out.println("Iterated using enhanced for loop :");
        for (Student detailsOfStudent: studentDetails){
            System.out.println(detailsOfStudent.rollNo+" "+detailsOfStudent.name+" "+detailsOfStudent.age);
        }
    }
}

