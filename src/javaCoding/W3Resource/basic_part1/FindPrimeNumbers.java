package javaCoding.W3Resource.basic_part1;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        int additionOfPrimeNumbers = 17;
        for (int i =4; i<=100; i++){
            if (i%2 !=0 && i%3 !=0 && i%5 !=0 && i%7 !=0){
                additionOfPrimeNumbers += i;
            }
        }
        System.out.println(additionOfPrimeNumbers);
    }

}
