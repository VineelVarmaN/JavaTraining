package W3Resource.basic_part1;

import java.util.Optional;
import java.util.stream.Stream;

public class LargestAndSmallestValue {
    public  int getLargestOrSmallestValue(int first, int second){
        if(first == second){
            return 0;
        }
        if ((first%6) == (second%6)){
            return Math.min(first, second);
        }
     return Math.max(first,second);
    }

    public int getLargestOrSmallestValueUsingStream(int first, int second){
        if(first == second){
            return 0;
        }
        Optional<Integer> largest = Stream.of(first,second).map(n->n%6).max(Integer::compareTo);
        //System.out.println("largest value : "+largest.get());
        Optional<Integer> smallest = Stream.of(first,second).map(n->n%6).min(Integer::compareTo);
        //System.out.println("smallest value : "+smallest.get());
        if (largest.get().equals(smallest.get())){
         return first;
        }
        return second;
    }

    public static void main(String[] args) {
        int first = 12;
        int second = 13;
        System.out.println("Input the first number : "+first);
        System.out.println("Input the second number: "+second);
        LargestAndSmallestValue objLargestAndSmallestValue = new LargestAndSmallestValue();
        System.out.println("Result of largest and smallest value : "+objLargestAndSmallestValue.getLargestOrSmallestValue(first, second));
        //using stream api
        System.out.println("Result of largest and smallest value using stream : "+objLargestAndSmallestValue.getLargestOrSmallestValueUsingStream(first,second));
    }
}
