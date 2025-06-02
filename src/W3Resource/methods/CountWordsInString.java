package W3Resource.methods;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class CountWordsInString {

    public static long getCountWords(String name){
        //intialize the count value as zero
       long count = Arrays.stream(name.split(" ")).count();
        return count;
    }

    public static void main(String[] args) {
        String name = "The quick brown fox jumps over the lazy dog.";
        System.out.println(getCountWords(name));
    }
}
