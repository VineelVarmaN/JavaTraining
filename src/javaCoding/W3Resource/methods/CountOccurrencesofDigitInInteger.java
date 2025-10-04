package javaCoding.W3Resource.methods;

public class CountOccurrencesofDigitInInteger {
    public static int digitOccurrenceCount(int number, int digit){
        int count = 0;
        if (number<0) return -1;
        String number1 = Integer.toString(number);
        for (int i = 0; i<number1.length(); i++){
            if (Character.getNumericValue(number1.charAt(i))==digit){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 12541;
        int digit = 1;
        System.out.println(digitOccurrenceCount(number, digit));
    }
}
