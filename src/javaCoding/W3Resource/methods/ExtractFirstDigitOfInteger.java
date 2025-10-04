package javaCoding.W3Resource.methods;

public class ExtractFirstDigitOfInteger {
    public static int getFirstNumber(int number){
        if (number<0){
            number= number * -1;
        }
        String number1 = Integer.toString(number);
        return Character.getNumericValue(number1.charAt(0));
    }

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(getFirstNumber(number));
    }
}
