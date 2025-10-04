package javaCoding.W3Resource.basic_part1;

import java.util.Optional;

public class StringStartWithWord {
    public boolean checkStringStartWithWord(String sentence, String word){
        //check if a string start with a specified word
            boolean result = sentence.startsWith(word);
        return result;
    }
    public boolean checkStringStartWithWordUsingStream(String sentence, String word){
        boolean result = Optional.of(sentence).map(s->sentence.startsWith(word)).orElse(false);
        return result;
    }
    public static void main(String[] args) {
        String word = "Hello";
        String sentence = "Hello How are you ?";
        StringStartWithWord objStringStartWithWord = new StringStartWithWord();
        System.out.println(objStringStartWithWord.checkStringStartWithWord(sentence,word));
        //using stream
        System.out.println(objStringStartWithWord.checkStringStartWithWordUsingStream(sentence,word));
    }
}
