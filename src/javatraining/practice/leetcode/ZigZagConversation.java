package javatraining.practice.leetcode;

public class ZigZagConversation {
    public static void printZigZagConversion(String a, int n){
    int aLength = a.length();
    int row = 0;
    String[] output = new String[n];
    char[] c = a.toCharArray();
    boolean down = true;
        //System.out.println(aLength);
        if(n == 1){
            System.out.println(a);
            return;
        }
        for (int i = 0; i<aLength; ++i){
            output[i] += (c[i]);
           if (row == n-1){
               down = false;
            }
            //System.out.println(a.charAt(i));

        }
    }

    public static void main(String[] args) {
        String input = "PAYPALISHIRING";
        int numRows = 3;
        printZigZagConversion(input, numRows);
    }
}
