package W3Resource.recursive;

public class RecursiveSumFrom1toN {
    public static int sumOfAll(int number){
        if (number == 0){
            return 0;
        }
        return number + sumOfAll(number-1);
    }

    public static void main(String[] args) {
        int number = 12;
        System.out.println(sumOfAll(number));
    }
}
