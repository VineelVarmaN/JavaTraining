package javatraining.javatpoint.strings;

public class CharAtExamples {
    public static void main(String[] args) {
        String name="Javatpoint";
        //character at certain index
        System.out.println(name.charAt(5));
        //out of box index error
        //System.out.println(name.charAt(10));
        //character at first index and last index
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length()-1));
        //character at odd index
        for (int i=0; i<name.length(); i++){
            if(i%2 !=0){
                System.out.println("value of " + i + " : " + name.charAt(i));
            }
        }
        //count of character frequency
        int count = 0;
        for (int i=0; i<name.length(); i++){
            if (name.charAt(i) == 't'){
                count++;
            }
        }
        System.out.println(count);
        //counting the vowels in string
        char[] vowels = {'A','E','O','U','a','e','o','u'};
        char[] nameArray = name.toCharArray();
        int vowelCount = 0;
        for (int i =0; i<nameArray.length;i++){
            for (int j =0; j<vowels.length;j++){
                if (nameArray[i] == vowels[j]){
                    vowelCount++;
                }
            }
        }
        System.out.println("Total vowelCount is " + vowelCount);
    }
}
