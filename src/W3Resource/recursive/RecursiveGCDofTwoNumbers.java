package W3Resource.recursive;

/**
 * Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.
 */
public class RecursiveGCDofTwoNumbers {
    public static int getGCDValue(int a, int b){
        if (b==0){
            return a;
        }
        int remainder = a%b;
        //int dummy = b;
        if(a%b>0){
            return getGCDValue(b,remainder);
        }
        return b;
    }

    public static void main(String[] args) {
        int a = 16;
        int b = 18;
        System.out.println(getGCDValue(a,b));
    }
}
