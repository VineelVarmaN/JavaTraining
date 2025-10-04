package javaCoding.W3Resource.basic_part1;

public class ConvertStringsIntoLowerCase {
    public String getStringIntoLowerCase(String input){
        if (input == ""){
            return "No imput provided";
        }
        String[] inputArray = input.split(" ");
        StringBuffer word = new StringBuffer();
        for (String words: inputArray){
            word.append(words.toLowerCase()).append(" ");
        }
        return word.toString().trim();
    }

    public static void main(String[] args) {
        String input = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        ConvertStringsIntoLowerCase objConvertStringsIntoLowerCase = new ConvertStringsIntoLowerCase();
        System.out.println(objConvertStringsIntoLowerCase.getStringIntoLowerCase(input));
    }
}
