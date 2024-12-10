package javatraining.W3Resource.basic_part1;

public class SumOfIntegersDigits {
    public int getSum(int n1){
        String value = String.valueOf(n1);
        int valueLength = value.length();
        int output = 0;
        for(int i=0; i<valueLength; i++){
            output += Integer.parseInt(String.valueOf(value.charAt(i)));
        }
        return output;
    }

    public static void main(String[] args) {
        int n1 = 25;
        SumOfIntegersDigits objSumOfIntegersDigits = new SumOfIntegersDigits();
        System.out.println(objSumOfIntegersDigits.getSum(n1));
    }
}
