package javatraining.javatpoint.strings;

public class ContainsStringExamples {
    public static void main(String[] args) {
        String fullName = "My name is Vineel Varma Nemmani";
        //check whether input string matches with given string
        System.out.println(fullName.contains("Vineel"));
        //check case sensitive
        System.out.println(fullName.toLowerCase().contains("my"));
        System.out.println(fullName.contains("my"));
        System.out.println(fullName.toUpperCase().contains("MY"));
        //using conditions
        if (fullName.contains("Name")) {
            System.out.println("the string contains name");
        }
        else System.out.println("Result not found");
    }
}
