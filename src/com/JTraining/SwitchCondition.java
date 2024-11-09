package com.JTraining;

public class SwitchCondition {
    public static void main(String[] args) {
        //finding the size of the number
        int sizeNumber = 8;
        switch(sizeNumber){
            case 1:
                System.out.println("verySmall");
                break; //break - if case satisfied, it will come out and do not validate other conditions
            case 2:
                System.out.println("small");
                break;
            case 3:
                System.out.println("medium");
                break;
            case 4:
                System.out.println("large");
                break;
            default: //default - if any switch case not satisfied, then will do operation under default case.
                System.out.println("invalid number");
        }

        //finding the size of the number using switch new update
        int number = 2;
        switch(number){
        case 1 -> System.out.println("verySmall");
        case 2 -> System.out.println("small");
        case 3 -> System.out.println("medium");
        case 4 -> System.out.println("large");
        default -> System.out.println("invalid number");
        }

        //will find out day and week type.
        int value1 = 5;
        String day;
        String Week;
        switch(value1){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Not in a week";
        }
        switch(value1){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Week = "weekday";
                break;
            case 6:
            case 7:
                Week = "weekend";
                break;
            default:
                Week = "Not a week";
        }
        System.out.println(day + " is a " + Week);

        //daily task of change request according to day of sprint
        int Day = 6;
        String task;
        switch(Day){
            case 1 -> task = "Assignment";
            case 2 -> task = "Analysis";
            case 3 -> task = "Technical Design Document";
            case 4 -> task = "Git Branch Feature Creation";
            case 5 -> task = "Development";
            case 6 , 7 , 13 , 14-> task = "Week Off";
            case 8 -> task = "Unit Testing";
            case 9 -> task = "Deployment";
            case 10 -> task = "Code Review";
            case 11 -> task = "Junit";
            case 12 -> task = "Support";
            default -> task = "Out of Sprint";
        }
        System.out.println(task);
    }
}