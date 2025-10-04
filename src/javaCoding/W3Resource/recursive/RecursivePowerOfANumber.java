package javaCoding.W3Resource.recursive;

public class RecursivePowerOfANumber {
    public static int getPower(int number, int power){
        if (power<1){
            return 1;
        }
        return number * getPower(number,power-1);
    }

    public static void main(String[] args) {
        int number = 3;
        int power = 2;
        System.out.println(getPower(number,power));
    }
}
