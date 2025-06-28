package hackerRank;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class Result1{
    public static String getDay(int month, int day, int year){
        return LocalDate.of(year,month,day).getDayOfWeek().toString();
    }
}
public class DateAndTime extends Result1{
    private static final Scanner SCANNER = new Scanner(System.in);
    public static void main(String[] args) {
        int month = SCANNER.nextInt();
        int day = SCANNER.nextInt();
        int year = SCANNER.nextInt();
        System.out.println(getDay(month,day,year));
    }
}
