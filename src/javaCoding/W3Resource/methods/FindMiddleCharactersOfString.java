package javaCoding.W3Resource.methods;

public class FindMiddleCharactersOfString {
    public static String middleCharacter(String input){
        if (input.length()%2 != 0){
            String oddStringMiddleChar = input.substring(input.length()/2,(input.length()/2)+1);
            return oddStringMiddleChar;
        }
        String evenStringMiddleChar = input.substring((input.length() / 2)-1, (input.length()/2)+1);
        return evenStringMiddleChar;
    }

    public static void main(String[] args) {
        String input = "350";
        System.out.println("Input a string "+input);
        System.out.println("The middle character in the string: "+middleCharacter(input));
    }
}
