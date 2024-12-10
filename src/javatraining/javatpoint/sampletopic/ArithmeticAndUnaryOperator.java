package javatraining.javatpoint.sampletopic;

public class ArithmeticAndUnaryOperator {

    public static void main(String[] args) {
        //Arithmetic Operations
        int x = 12;
        int y = 5;
        double z = 21.0;
        int resultAdd = x + y;
        System.out.println("addition of two values : " + resultAdd);
        System.out.println("subtraction of two values:" + (x - y));
        System.out.println("multiplication of two values:" + (x * y));
        System.out.println("division of two values:" + (z / y)); //converting int values to double
        System.out.println("percentile of two values:" + (z % y));
        //Unary Operations
        int num = 10;
        int result;
        result = num;
        System.out.println("value of num:" + result); //result = 10(num)
        //unary plus (+)
        result += num;
        System.out.println("value of num +=" + result); //result = 10(result) + 10(num)
        //unary minus (-)
        result -= num;
        System.out.println("value of num -=" + result); //result = 20(result) - 10(num)
        //increment operator
        System.out.println("Value of increment:" + result++); //result = 10 as the operator comes after value
        System.out.println("Value of increment:" + ++result); //result = 1+11(result++) as the operator comes first
        System.out.println("Value of decrement:" + result--); //result = 12 as the operator comes after value
        System.out.println("Value of increment:" + --result); //result = 1-11(result--) as the operator comes after value
    }
}
