package javatraining.learningSamples.TopicWiseSamplePrograms.stream_examples;

import java.util.Arrays;
import java.util.List;

public class MapLogicExamples {

    //to print squares of numbers
    public static void printSquaresOfNumbersFromList(List<Integer> num){
        //map = input parameter -> logic using input parameter
        num.stream().map(number->number * number).forEach(System.out::println);
    }
    //to print cubes of numbers
    public static void printCubessOfNumbersFromList(List<Integer> num){
        //map = input parameter -> logic using input parameter
        num.stream().map(number->number * number * number).forEach(System.out::println);
    }
    //to print cubes of odd numbers
    public static void printCubesOfOddNumbersFromList(List<Integer> num){
        //map = input parameter -> logic using input parameter
        num.stream().filter(number->number%2!=0).map(number->number * number * number).forEach(System.out::println);
    }

    //to print all courses length
    public static void printCoursesLengthFromList(List<String> courses){
        //map() = input param -> input param + input pram. length of input param
        courses.stream().map(course-> course + " : " + course.length()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12,4,5,6,8,9,10,3);
        List<String> courses = Arrays.asList("Java", "Spring Boot", "Spring Framework",
                "Spring JPA", "Spring MVC", "Containers", "Maven", "Git");
        //printSquaresOfNumbersFromList(numbers);
        //printCubessOfNumbersFromList(numbers);
        //printCubesOfOddNumbersFromList(numbers);
        printCoursesLengthFromList(courses);
    }

}
