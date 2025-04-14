package W3Resource.basic_part1;

public class ReverseOfString {
    public String usingStringBuilder(String input){
        StringBuilder stringBuilder = new StringBuilder(input);
        String output = stringBuilder.reverse().toString();
        return " using stringbuilder " + output;
    }
    public String usingOldApproach(String input){
        int inputLength = input.length();
        String temp = "";
        for (int i = inputLength-1; i<inputLength && i>=0; i--){
           temp += String.valueOf(input.charAt(i));
        }

        return temp;
    }

    public static void main(String[] args) {
        String input = "The quick brown fox";
        ReverseOfString objReverseOfString = new ReverseOfString();
        System.out.println(objReverseOfString.usingStringBuilder(input));
        System.out.println(objReverseOfString.usingOldApproach(input));
    }
}
