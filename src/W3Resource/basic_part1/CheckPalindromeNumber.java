package W3Resource.basic_part1;

public class CheckPalindromeNumber {
    public static boolean checkPalindromeNumber(int number){
        //convert the integer to string
        String num = Integer.toString(number);
        System.out.println("String num : "+num);
        //reverse the string using string builder
        String reversedString = new StringBuilder(num).reverse().toString();
        System.out.println("reversed string : "+reversedString);
        //check both strings are equal or not
        return num.equals(reversedString);
    }

    public static void main(String[] args) {
        int number = 123321;
        System.out.println("Input number : "+number);
        System.out.println(checkPalindromeNumber(number));
    }
}
