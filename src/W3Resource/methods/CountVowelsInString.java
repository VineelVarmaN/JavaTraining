package W3Resource.methods;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsInString {
    public static int countVowels(String input){
        int count = 0;
        Set<Character> vowels = new HashSet<>(Set.of('A','E','I','O','U','a','e','i','o','u'));
        for (char ch: input.toCharArray()){
            if (vowels.contains(ch)){
                count++;
            }
        }
         return count;
    }

    public static void main(String[] args) {
        String input = "w3resource";
        System.out.println("Input the string "+input);
        System.out.println("Number of Vowels in the string: "+countVowels(input));
    }
}
