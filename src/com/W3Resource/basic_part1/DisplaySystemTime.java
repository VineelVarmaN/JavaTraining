package com.W3Resource.basic_part1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplaySystemTime {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.now();
        //Wed Nov 27 20:00:15 2024
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM d HH:mm:ss YYYY");
        String output = dtf.format(time);
        //2017/06/16 08:52:03.066
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("YYYY/M/d HH:mm:ss.SSS");
        String output1 = dtf1.format(time);
        System.out.println(output);
        System.out.println(output1);
    }
}
