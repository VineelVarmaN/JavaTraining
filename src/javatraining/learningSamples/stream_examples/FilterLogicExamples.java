package javatraining.learningSamples.stream_examples;

import java.util.Arrays;
import java.util.List;

public class FilterLogicExamples {

    //to print only even numbers
    public static void printEvenNumbersFromList(List<Integer> num){
        //filter = input parameter -> logic using input parameter
        num.stream().filter(number->number%2==0).forEach(System.out::println);
    }
    //to print only odd numbers
    public static void printOddNumbersFromList(List<Integer> num){
        num.stream().filter(number->number%2 !=0).forEach(System.out::println);
    }

    //to print all courses with Spring name
    public static void printCoursesWithSpringNameFromList(List<String> courses){
        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
    }
    //to print all courses with character length is greater than 4
    public static void printCoursesWithCharacterLengthFromList(List<String> courses){
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,5,6,8,9,10);
        List<String> courses = Arrays.asList("Java", "Spring Boot", "Spring Framework",
                "Spring JPA", "Spring MVC", "Containers", "Maven", "Git");
        //printEvenNumbersFromList(numbers);
        //printOddNumbersFromList(numbers);
        //printCoursesWithSpringNameFromList(courses);
        printCoursesWithCharacterLengthFromList(courses);
    }
}
