package takeYouForward.baisctopics.recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArray {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static void ReverseArray(int start,int end, int[] numbers){
        if (start>=end){
            return;
        }
        int temp = numbers[start];
        numbers[start]=numbers[end];
        numbers[end] = temp;

        ReverseArray(start+1, end-1, numbers);
    }
    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        int[] numbers = new int[n];
        for (int i =0; i<n;i++){
            numbers[i] = SCANNER.nextInt();
        }
        ReverseArray(0,n-1,numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
