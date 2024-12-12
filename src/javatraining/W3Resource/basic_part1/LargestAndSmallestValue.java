package javatraining.W3Resource.basic_part1;

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

    public static void main(String[] args) {
        int first = 12;
        int second = 13;
        LargestAndSmallestValue objLargestAndSmallestValue = new LargestAndSmallestValue();
        System.out.println(objLargestAndSmallestValue.getLargestOrSmallestValue(first, second));
    }
}
