package javalearning.javatpoint.sampletopic;

public class TypeCasting {
    public static void main(String[] args) {
        /**
         * explicitly conversion of values from lower data type to higher data type
         */
        //initializing the value for double data type
        double d = 20.100;
        System.out.println("value for d:" + d);
        //conversion of value from double to float
        float f = (float)d;
        System.out.println("value for f:" + f);
        long l = (long)f;
        long l1 = (long)d;
        System.out.println("value for l:" + l);
        System.out.println("value for l1:" + l1);
        int i = (int)l1;
        int i1 = (int)l;
        int i2 = (int)f;
        System.out.println("value for i:" + i);
        System.out.println("value for i1:" + i1);
        System.out.println("value for i2:" + i2);
        byte b = (byte)f;
        byte b1 = (byte)l;
        byte b2 = (byte)l1;
        byte b3 = (byte)d;
        System.out.println("value for b:" + b);
        System.out.println("value for b1:" + b1);
        System.out.println("value for b2:" + b2);
        System.out.println("value for b3:" + b3);
    }
}
