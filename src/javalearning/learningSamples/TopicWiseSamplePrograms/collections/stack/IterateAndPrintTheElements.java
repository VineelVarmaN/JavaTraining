package javalearning.learningSamples.TopicWiseSamplePrograms.collections.stack;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class IterateAndPrintTheElements {
    public void iterateTheValuesUsingIterator(){
        Stack<Integer> numbers = new Stack<>();
        numbers.push(12);
        numbers.push(13);
        numbers.push(14);
        numbers.push(15);
        System.out.println("The elements in stack : "+numbers);
        //iterate using iterator
        Iterator<Integer> itr = numbers.iterator();
        while (itr.hasNext()){
            System.out.println("The each element : "+itr.next());
        }
    }
    public void iterateTheValuesUsingForEach(){
        Stack<Integer> numbers1 = new Stack<>();
        numbers1.push(22);
        numbers1.push(23);
        numbers1.push(24);
        numbers1.push(25);
        System.out.println("The elements in stack : "+ numbers1);
        //iterate using for each
        numbers1.forEach(n-> {
            System.out.println("The each element in number1 : "+n);
        });
    }
    public void iterateTheValuesUsingListIterator(){
        Stack<Integer> numbers2 = new Stack<>();
        numbers2.push(22);
        numbers2.push(23);
        numbers2.push(24);
        numbers2.push(25);
        System.out.println("The elements in number2 stack : "+ numbers2);
        //iterate using for each
        ListIterator<Integer> listIterator = numbers2.listIterator(numbers2.size());
        while (listIterator.hasPrevious()){
            System.out.println("The each element in number 2 : "+listIterator.previous());
        }
    }

    public static void main(String[] args) {
        IterateAndPrintTheElements objIterateAndPrintTheElements = new IterateAndPrintTheElements();
        objIterateAndPrintTheElements.iterateTheValuesUsingIterator();
        objIterateAndPrintTheElements.iterateTheValuesUsingForEach();
        objIterateAndPrintTheElements.iterateTheValuesUsingListIterator();
    }
}
