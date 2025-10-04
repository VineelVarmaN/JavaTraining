package javaCoding.W3Resource.basic_part1;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseLinkedList {

    public static List<Integer> getReversedLinkedList(List<Integer> numbers) {
        //create and empty Integer list to store reversed list values
        List<Integer> reversedNumbersList = new ArrayList<>();
        //check if linked list is not empty
        if (numbers.isEmpty()){
            throw new InvalidParameterException("Numbers List should not be empty");
        }
        //use for loop and start from length-1, get the value from list
        for (int i = numbers.size()-1; i<numbers.size() && i>=0; i--){
            //add the value to empty array list
            reversedNumbersList.add(numbers.get(i));
        }
        return reversedNumbersList;
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(20,40,60,80);
        System.out.println(numbers);
        System.out.println(getReversedLinkedList(numbers));
    }
}
