package takeYouForward.baisctopics.basicMaths;

import java.util.Scanner;

public class ArmstrongNumber {
    public static final Scanner SCANNER = new Scanner(System.in);
    public boolean isArmStrong(int n){
        int input = n;
        int count = String.valueOf(n).length();
        int result = 0;
        while (n>0){
            int temp = n%10;
            result += Math.pow(temp,count);
            n=n/10;
        }
        if (result!=input){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = SCANNER.nextInt();
        ArmstrongNumber armstrongNumberObj = new ArmstrongNumber();
        System.out.println(armstrongNumberObj.isArmStrong(n));
    }
}
