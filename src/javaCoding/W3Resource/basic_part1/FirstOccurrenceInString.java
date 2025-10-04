package javaCoding.W3Resource.basic_part1;

import java.security.InvalidParameterException;

public class FirstOccurrenceInString {
    public static int firstOccurrenceInString(String mainString, String subString){
        //check both string should not be null
        if (mainString == null && subString == null){
            throw new InvalidParameterException("Input parameter should not be null");
        }
        //check if substring matches with main string and the occurrence starts from first
        assert mainString != null;
        if (mainString.startsWith(subString)){
            return 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        String mainString = "Vineel";
        String subString = "Vi";
        System.out.println(firstOccurrenceInString(mainString,subString));
    }
}
