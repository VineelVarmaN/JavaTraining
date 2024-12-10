package javatraining.javatpoint.strings;

import java.util.ArrayList;

public class EqualsExamples {
    public static void main(String[] args) {
        String firstName = "vineel";
        ArrayList<String> names = new ArrayList<>();
        names.add("Nemmani");
        names.add("Vineel");
        names.add("Varma");
        for (int i = 0; i<names.size();i++){
            if(names.get(i).equals(firstName)){
                System.out.println("Vineel is present");
            }
            else System.out.println("vineel is not present");
        }
    }
}
