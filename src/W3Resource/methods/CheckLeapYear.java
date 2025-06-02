package W3Resource.methods;

import java.util.Scanner;

public class CheckLeapYear {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static boolean checkLeapYear(int year){
        return year % 4 == 0 && year % 100 != 0;
    }
    public static void main(String[] args) {
        int year = SCANNER.nextInt();
        System.out.println(checkLeapYear(year));
    }
}
