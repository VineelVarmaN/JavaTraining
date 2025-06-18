package W3Resource.recursive;

public class RecursiveFactorialCalculation {
    public static int factorialCalculation(int number){
        if (number == 0){
            return 1;
        }
        return number * factorialCalculation(number-1);
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println(factorialCalculation(number));
    }
}
