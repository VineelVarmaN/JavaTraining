package takeYouForward.basics;

import java.util.Scanner;

public class SwitchCase {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String getDayName(int day){
        return switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default-> "Invalid";
        };
    }

    public static void main(String[] args) {
        int day = SCANNER.nextInt();
        System.out.println(getDayName(day));
    }
}
