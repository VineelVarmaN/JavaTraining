package javaCoding.W3Resource.basic_part1;

import java.util.stream.IntStream;

public class NumberAdjacentOrSeparatedByOne {
    public static boolean checkNumberAdjacentOr(int[] arrays){
        for (int i = 0; i<arrays.length-1; i++){
            if (arrays[i]==arrays[i+1]){
                return true;
            }
            if (i<arrays.length-2 && arrays[i]==arrays[i+2]){
                return true;
            }
        }
        return false;
    }
    public static boolean checkNumberAdjacentOrUsingStream(int[] arrays){
        boolean numberAdjacent = IntStream.range(0, arrays.length-1).anyMatch(i->arrays[i]==arrays[i+1]);
        boolean seperatedByOne = IntStream.range(0, arrays.length-2).anyMatch(i->arrays[i]==arrays[i+2]);
        return numberAdjacent || seperatedByOne;
    }
    public static void main(String[] args) {
        int[] numbers = {2,5,5,8,5};
        System.out.println(checkNumberAdjacentOr(numbers));
        System.out.println("Using stream : "+checkNumberAdjacentOrUsingStream(numbers));
    }
}
