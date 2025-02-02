package microservices_practice.password_generator;

import java.util.Random;
import java.util.Scanner;

/**
 * Will create a new instance for Character class
 * create an empty string to store the characters generated form getPasswordCreated class
 * run the getcharacter for each character type according to user input as Yes or no
 * add all those string values from character class
 * create random class to generate random character from generated characters according to iteration count of length
 *
 * Method : getPasswordCreated
 * returns : password
 * Inputs : length of the password
 */
public class PasswordCreation {
    public static int weakPassword = 8;
    public static int goodPassword = 16;

    public String getPasswordCreated(){
        //create an instance for the character class to use its output
        Character objCharacter = new Character();
        String generatedCharacter = "";
        //below will execute the get character function in another class according to user input
        generatedCharacter += objCharacter.getCharacter(Character.upperCase);
        generatedCharacter += objCharacter.getCharacter(Character.lowerCase);
        generatedCharacter += objCharacter.getCharacter(Character.numbers);
        generatedCharacter += objCharacter.getCharacter(Character.symbols);
        System.out.println("generated character is : "+generatedCharacter);
        //create instance for random class
        Random random = new Random();
        //get the password length from user
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is the length of the password : ");
        int passwordLength = scanner.nextInt();
        scanner.close();
        //create the string builder to store password according to length provided
        StringBuilder password = new StringBuilder(passwordLength);
        //check the length of the password
        if (passwordLength>weakPassword){
            System.out.println("Good password ");
            for (int i = 0; i<passwordLength; i++){
                //get the total length of the generated string
                int generatedCharacterLength = random.nextInt(generatedCharacter.length());
                //append the characters to string according to length
                password.append(generatedCharacter.charAt(generatedCharacterLength));
            }
        }
        else {
            System.out.println("need minimum 8 character length");
        }
        return password.toString();
    }
}
