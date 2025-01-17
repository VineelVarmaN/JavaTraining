package javapractice.W3Resource.basic_part1;

public class ReverseTheString {
    public String getReverseString(String input){
        if (input == ""){
            return "No input is provided";
        }
        System.out.println("Input a word: " + input);
        StringBuffer sb = new StringBuffer(input);
        sb.reverse().toString().trim();
        return "Reverse word: " + sb;
    }

    public static void main(String[] args) {
        String input = "dsaf";
        ReverseTheString objReverseTheString = new ReverseTheString();
        System.out.println(objReverseTheString.getReverseString(input));
    }
}
