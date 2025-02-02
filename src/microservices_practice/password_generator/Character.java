package microservices_practice.password_generator;

import java.util.Scanner;

public class Character {
    public static String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String lowerCase = "abcdefghijklmnopqrstuvwxyz";
    public static String numbers = "1234567890";
    public static String symbols = "!@#$%^&*()_+";

    //declare a character to store the variables
    StringBuilder character = new StringBuilder();
    public String getCharacter(String str){
        //get the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("The character should contain "+str+" in geenrated password ?");
        String result = scanner.next();
        //check the user input validation
        System.out.println("user input : "+result);
        if (result.equalsIgnoreCase("yes")){
            character.append(str);
        }
        return character.toString();
    }
}
