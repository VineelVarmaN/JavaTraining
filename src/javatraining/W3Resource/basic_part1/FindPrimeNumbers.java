package javatraining.W3Resource.basic_part1;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        //6n+-1 = prime number
        int additionOfPrimeNumbers = 0;
        for (int i =1; i<17; i++){
            System.out.println("before adding "+additionOfPrimeNumbers);
            additionOfPrimeNumbers += (6*i)-1;
            //System.out.println((6*i)+1);
            //System.out.println((6*i)-1);

            System.out.println((6*i)-1);
            System.out.println("after adding "+additionOfPrimeNumbers);
        }
        System.out.println(additionOfPrimeNumbers);
    }

}
