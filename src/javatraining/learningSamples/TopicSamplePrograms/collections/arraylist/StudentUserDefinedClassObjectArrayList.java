package javatraining.learningSamples.TopicSamplePrograms.collections.arraylist;

import java.util.ArrayList;

/**
 * create a user defined class called student
 * create the objects
 * create constructor for initializing the values
 * create an array list
 * add all object elements to array list using constructor
 * iterate and print the elements
 */
public class StudentUserDefinedClassObjectArrayList {
    //creating the objects
    private int rollNo;
    private String name;
    private int age;
    //create a constructor
    public StudentUserDefinedClassObjectArrayList(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        //create an arraylist
        ArrayList<StudentUserDefinedClassObjectArrayList> studentDetails = new ArrayList<>();
        //adding all the elements using constructor
        studentDetails.add(new StudentUserDefinedClassObjectArrayList(1, "Vineel", 29));
        studentDetails.add(new StudentUserDefinedClassObjectArrayList(2, "Swathi", 24));
        studentDetails.add(new StudentUserDefinedClassObjectArrayList(3, "Varma", 50));
        //iterating the array list and print the elements
        System.out.println("Iterated the elements using forEach and Lambda expression :");
        studentDetails.forEach(a->{ //using lambda expression storing the iterated element in a
            System.out.println(a.rollNo+" "+a.name+" "+a.age);
        });
        //iterated using enhanced for loop
        System.out.println("Iterated using enhanced for loop :");
        for (StudentUserDefinedClassObjectArrayList detailsOfStudent: studentDetails){
            System.out.println(detailsOfStudent.rollNo+" "+detailsOfStudent.name+" "+detailsOfStudent.age);
        }
    }
}
