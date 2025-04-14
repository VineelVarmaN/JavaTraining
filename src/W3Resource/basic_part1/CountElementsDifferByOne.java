package W3Resource.basic_part1;

import java.util.stream.IntStream;

public class CountElementsDifferByOne {
    public static int getCountOfElementsDifferByOne(int[] numbers1, int[] numbers2){
        int count = 0;
        //check if both array length is same or not
        if (numbers1.length!=numbers2.length){
            throw new IllegalArgumentException("The length of both arrays are not same.");
        }
        for (int i =0; i<numbers1.length;i++){
            //get the difference between two elements from two arrays
            int difference = Math.abs(numbers1[i]-numbers2[i]);
            //check the difference is less than 1
            if (difference<=1){
                count++;
            }
        }
        return count;
    }
    public static long getCountOfElementsDifferByOneUsingStream(int[] numbers1, int[] numbers2){
        if (numbers1.length!=numbers2.length) throw new IllegalArgumentException("The length of both arrays are not same.");
        long count = IntStream.range(0, numbers1.length).map(i->Math.abs(numbers1[i]-numbers2[i])).filter(i->i<=1).count();
        return count;
    }
    public static void main(String[] args) {
        int[] numbers1 = {1,3,5,7,9};
        int[] numbers2 = {2,1,6,3,9};
        System.out.println(getCountOfElementsDifferByOne(numbers1,numbers2));
        System.out.println("Using Stream : "+getCountOfElementsDifferByOneUsingStream(numbers1,numbers2));
    }
}
