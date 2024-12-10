package javatraining.W3Resource.basic_part1;

public class CountOfSpacesNumbersLettersInString {
    public static void main(String[] args) {
        String input = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        int inputLength = input.length();
        char[] inputChar = input.toCharArray();
        int letters = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i<inputLength; i++){
            if(Character.isLetter(inputChar[i])){
                letters++;
            } else if (Character.isDigit(inputChar[i])) {
                number++;
            } else if (Character.isSpaceChar(inputChar[i])) {
                space++;
            }
            else other++;
        }
        System.out.println("letter: "+letters);
        System.out.println("number: "+number);
        System.out.println("space: "+space);
        System.out.println("other: "+other);
    }
}
