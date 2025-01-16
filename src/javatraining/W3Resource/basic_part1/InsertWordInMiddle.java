package javatraining.W3Resource.basic_part1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class InsertWordInMiddle {
    public String finalWord(String name, String insertValue){
        //can add using substring concept
        String word = name.substring(0,7)+insertValue+name.substring(6);
        return word;
    }
    public static void main(String[] args) {
        String name = "Python 3.0";
        String insertValue = "Tutorial";
        InsertWordInMiddle objInsertWordInMiddle = new InsertWordInMiddle();
        System.out.println(objInsertWordInMiddle.finalWord(name,insertValue));
    }
}
