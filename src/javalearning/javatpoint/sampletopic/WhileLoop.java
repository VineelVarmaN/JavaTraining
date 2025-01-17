package javalearning.javatpoint.sampletopic;

public class WhileLoop {
    public static void main(String[] args) {
        //example of mario game logic
        int coins =0;
        int coinsNeeded = 5;
        while(coins <= coinsNeeded){
            System.out.println("Collected coins are :" + coins);
            coins++;
        }
        System.out.println("Congratulations. you are promoted to next level");

        // summation of numbers from 0 to 10
        int number = 1;
        int sum = 0;
        while (number <= 10){
            sum += number;
            number++;
        }
        System.out.println(sum);
        //nested while loop
        int i =1;
        while(i<=4)
        {
            System.out.println("Hi"+ i);
            int j=1;
            while(j<=3) {
                System.out.println("Hello"+j);
                j++;
            }
            i++;
        }
        System.out.println("Bye"+i);
    }
}
