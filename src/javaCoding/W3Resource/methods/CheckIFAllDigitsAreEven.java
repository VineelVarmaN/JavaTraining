package javaCoding.W3Resource.methods;

public class CheckIFAllDigitsAreEven {
    public static boolean checkAllEven(int number){
        if (number<0){
            return false;
        }
        String number1 = Integer.toString(number);
        for (int i = 0; i<number1.length(); i++){
            if (Character.getNumericValue(number1.charAt(i))%2 !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 8642;
        System.out.println(checkAllEven(number));
    }
}
