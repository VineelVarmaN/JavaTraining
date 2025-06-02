package javalearning.myTraining.day3.functionalInterface;

import java.util.Arrays;
import java.util.List;

/**
 * 	• Functional interface will have only one abstract method
 * 	• Functional interface can have many static and default methods
 * 	• Lambda expressions and method references can be used to represent the instance of functional interface.
 * 		○ @FunctionalInterface
 */
//1.    create an functional interface
//2.    create a data model
class Student{
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
public class StudentResult {
    public static void main(String[] args) {
        //create an list of students with score
        List<Student> studentList = Arrays.asList(
                new Student("s1",30),
                new Student("s2",40),
                new Student("s3",50));

        //define a lambda function to check if score greater than 30
        //create an interface reference
        ScoreEvaluator scoreEvaluator = score -> score>30;

        //iterate the student list and apply the lambda expression check
        for (Student student: studentList){

            //student score matches with lambda expression marks criteria
            String result = scoreEvaluator.isPassed(student.score)? "PASSED":"FAILED";
            System.out.println(student.name+" with "+student.score+" : "+result);
        }
    }
}
