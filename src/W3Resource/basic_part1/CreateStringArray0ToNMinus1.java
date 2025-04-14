package W3Resource.basic_part1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class CreateStringArray0ToNMinus1 {
    public static int[] createStringArrayValues(int n){
        int[] numbers = new int[n];
        for (int i = 0; i<n;i++){
            numbers[i]=i;
        }
        return numbers;
    }
    public static int[] createStringArrayValuesUsingStream(int num){
        int[] numbers = IntStream.iterate(0,n->n<num,n->n+1).toArray();
        return numbers;
    }
    public static void main(String[] args) {
        int n = 6;
        int num = 7;
        System.out.println(Arrays.toString(createStringArrayValues(n)));
        System.out.println(Arrays.toString(createStringArrayValuesUsingStream(num)));
    }
}
