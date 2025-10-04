package javaCoding.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class FirstAndLastElementSame {
    public boolean getFirstAndLastElement(int[] array1){
        //Check the length must be greater than or equal to 2
        //check the first and last element of the array is same
        if (array1.length>=2 && array1[0]==array1[array1.length-1]){
                return true;
        }
        return false;
    }
    public boolean getFirstAndLastElementUsingStream(int[] array1){
        boolean result = IntStream.of(array1.length).allMatch(length->length>=2 && array1[0]==array1[array1.length-1]);
        return result;
    }
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0, 30, 40, 60, 50};
        FirstAndLastElementSame objFirstAndLastElementSame = new FirstAndLastElementSame();
        System.out.println(objFirstAndLastElementSame.getFirstAndLastElement(array1));
        //using stream
        System.out.println("Using stream : "+objFirstAndLastElementSame.getFirstAndLastElementUsingStream(array1));
    }
}
