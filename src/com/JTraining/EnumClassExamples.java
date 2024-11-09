package com.JTraining;

enum Status{
    Completed, InError, New, Waiting;
}
//to declare the status code to named constants
enum StatusCode{
    Success(200), Failed(400);
    //to initialize the error code
    private int code;
    //parameterized constructor
    StatusCode(int code) {
        this.code = code;
    }
    //getting status codes
    public int getCode() {
        return code;
    }
}
public class EnumClassExamples {
    public static void main(String[] args) {
        //to print single value
        Status result = Status.Completed;
        System.out.println(result);

        // to print multiple values - first need to store in array and iterate and print
        Status[] allResults = Status.values();
        for (Status output : allResults){
            System.out.println("All results are " + output);
            //to know the position of values
            System.out.println(output.ordinal() + " is position of " + output);
        }
        StatusCode resultStatusCode = StatusCode.Failed;
        System.out.println(resultStatusCode.getCode());
    }
}
