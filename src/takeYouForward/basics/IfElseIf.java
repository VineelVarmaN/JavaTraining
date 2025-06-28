package takeYouForward.basics;

import java.util.Scanner;

/**
 * Given marks of a student, print on the screen:
 *
 * Grade A if marks >= 90
 * Grade B if marks >= 70
 * Grade C if marks >= 50
 * Grade D if marks >= 35
 * Fail, otherwise.
 */
public class IfElseIf {
    private static final Scanner SCANNER = new Scanner(System.in);
    public static String getGrade(int marks){
        return (marks>=90) ? "Grade A":
                (marks>=70) ? "Grade B":
                        (marks>=50) ? "Grade C":
                                (marks>=35) ? "Grade D": "Fail";
    }
    public static void main(String[] args) {
        int marks = SCANNER.nextInt();
        System.out.println(getGrade(marks));
    }
}
