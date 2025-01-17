package javalearning.javatpoint.sampletopic;

public class ForLoop {
    public static void main(String[] args) {
        //will print values from 1 to 10
        for (int x =0; x<=10; x++){
            System.out.println("The numbers are:" + x);
        }
        //prints the sum of x ranging from 1 to 20
        int x;
        int sum = 0;
        for(x = 0; x<=20; x++){
            sum += x;
        }
        System.out.println("The summation of numbers is:" + sum);
    }
}
