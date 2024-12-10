package javatraining.javatpoint.sampletopic;

public class TernaryOperator {
    public static void main(String[] args) {
        //ternary operator for leap year condition
        int days = 28;
        String result;
        result = (days == 29) ? "Not a leap year" : "leap year";
        System.out.println(result);
        String result3;
        result3 = (days != 29) ? "Not a leap year" : "leap year";
        System.out.println(result3);
        //for marks
        int marks = 35;
        String result1;
        result1 = (marks < 37) ? "Pass" : "Fail";
        System.out.println(result1);
        String result2;
        result2 = (marks < 34) ? "Pass" : "Fail";
        System.out.println(result2);
    }
}
