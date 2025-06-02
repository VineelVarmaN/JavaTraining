package W3Resource.methods;

import java.util.Scanner;

public class ValidatePassword {

    private static final Scanner SCANNER = new Scanner(System.in);
    public static void checkPassword(String password){
        int digitCount = 0;
        //check password has at least eight characters
        if (password.length()>=8){
            for (int i = 0; i<password.length(); i++){
                //check password has only letters and digits
                if (!Character.isLetter(password.charAt(i)) || !Character.isAlphabetic(password.charAt(i))) {
                    System.out.println("A password must consists of only letters and digits.");
                }
                if (Character.isDigit(password.charAt(i))){
                    digitCount ++;
                    //check password contain atleast two digits
                    if (digitCount>=2){
                        System.out.println("Password is valid : "+password);
                    }else {
                        System.out.println("A password must contain at least two digits");
                    }
                }
            }
        }
        else {
            System.out.println("Not matching length criteria.");
        }

    }
    public static void main(String[] args) {
        String password = SCANNER.next();
        checkPassword(password);
    }
}
