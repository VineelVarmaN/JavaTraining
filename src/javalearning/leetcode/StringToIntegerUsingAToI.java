package javalearning.leetcode;

public class StringToIntegerUsingAToI {
    public static String convertStringToInt(String s){
        int sLength = s.length();
        //String result = "";
        String output = "";
        //char[] c = s.toCharArray();
        //if (c[0] == ' ' || s.contains())
        for (int i = 0; i<sLength; i++){
           char c = s.charAt(i);
            String result = Character.toString(c);
           System.out.println("result" + result);
           if (result == " " || result.matches("[a-zA-Z]")){
               System.out.println("if condition matches" + 0);
               break;
            }
            else {
               output=output+result;
            }
        }
        System.out.println(output);
        return output;
    }
    public static void main(String[] args) {
        String input = "04a2";
        convertStringToInt(input);
        //int output = convertStringToInt(input);
        //System.out.println("Output is : " + output);
    }
}
