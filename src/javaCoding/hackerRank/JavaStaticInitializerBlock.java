package javaCoding.hackerRank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static boolean flag = false;
    private static int B;
    private static int H;
    static {
        B = SCANNER.nextInt();
        H = SCANNER.nextInt();
        if(B<=0 || H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            flag = false;
        }else {
            flag = true;
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main

}//end of class