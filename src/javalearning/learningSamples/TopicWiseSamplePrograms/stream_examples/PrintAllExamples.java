package javalearning.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;

public class PrintAllExamples {
    //to print all numbers
    public static void printAllNumbersFromList(List<Integer> num){
        num.stream().forEach(System.out::println);
    }

    //to print all courses
    public static void printAllCoursesFromList(List<String> courses){
        courses.stream().forEach(System.out::println);
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,5,6,8,9,10);
        List<String> courses = Arrays.asList("Java", "Spring Boot", "Spring Framework",
                                            "Spring JPA", "Spring MVC", "Containers", "Maven", "Git");
        //printAllNumbersFromList(numbers);
        printAllCoursesFromList(courses);
    }
}
