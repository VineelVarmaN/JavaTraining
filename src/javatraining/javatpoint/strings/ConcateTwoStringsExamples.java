package javatraining.javatpoint.strings;

public class ConcateTwoStringsExamples {
    public static void main(String[] args) {
        String s1 = "Vineel";
        //print values at concat
        System.out.println(s1.concat("Varma"));
        //concat strings then print it
        String output =s1.concat("Nemmani");
        System.out.println(output);
        //concat multiple strings
        String result = s1.concat(" ").concat("Varma").concat(" ").concat("Nemmani");
        System.out.println(result);
        //concat at the beginning
        String addStringAtBeginning = "My Name is ".concat(result);
        System.out.println(addStringAtBeginning);
    }
}
