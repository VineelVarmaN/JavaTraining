package javalearning.javatpoint.sampletopic;

public class TypeConversion {
    public static void main(String[] args) {

       // automatic conversion from lower data type to higher data type
        byte b = 10;
        System.out.println("value for b:" + b);
        //converting byte value to int
        int i = b;
        System.out.println("value for i:" + i);
        //converting int and byte value to long
        long l =i;
        long l1 = b;
        System.out.println("value for l:" + l);
        System.out.println("value for l1:" + l1);
        //converting int, byte and long values to float
        float f = b;
        float f1 = i;
        float f2 = l;
        float f3 = l1;
        System.out.println("value for f:" + f);
        System.out.println("value for f1:" + f1);
        System.out.println("value for f2:" + f2);
        System.out.println("value for f3:" + f3);
    }
}