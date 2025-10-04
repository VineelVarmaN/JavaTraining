package javaCoding.W3Resource.recursive;

public class RecursivePalindrome {

    public static boolean isPalindrome(String name){
        if (name.length()<=1){
            return false;
        }
        if (name.charAt(0)==name.charAt(name.length()-1)){
            return true;
        }
        String remainingString = name.substring(1,name.length()-1);
        return isPalindrome(remainingString);
    }

    public static void main(String[] args) {
        String name = "ABCCBA";
        System.out.println(isPalindrome(name));
    }
}
