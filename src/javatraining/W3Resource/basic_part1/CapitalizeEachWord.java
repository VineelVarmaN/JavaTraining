package javatraining.W3Resource.basic_part1;


import java.util.Arrays;

public class CapitalizeEachWord {
    public String getEachWordCapitalized(String input){
        String[] inputArray = input.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String word : inputArray){
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        String input = "the quick brown fox jumps over the lazy dog";
        CapitalizeEachWord objCapitalizeEachWord = new CapitalizeEachWord();
        System.out.println(objCapitalizeEachWord.getEachWordCapitalized(input));
    }
}

