package javalearning.myTraining.day3.dateTimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Java Date and Time API = will help to handle date, time, duration and timeZone related operations
 */
public class DateTimeExample {
    public static void main(String[] args) {
        //gets current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("current date : "+currentDate);
        //get current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("current time : "+currentTime);
        //get current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("current date and time : "+currentDateTime);
        //format the current date time
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = dateTimeFormatter.format(currentDateTime);
        System.out.println("formatted timestamp : "+formattedDateTime);
        //create future date
        LocalDateTime futureDate = currentDateTime.plusDays(5);
        System.out.println("future date "+futureDate);
        //past date
        LocalDateTime pastDate = currentDateTime.minusHours(6);
        System.out.println("pastDate "+pastDate);

    }
}
