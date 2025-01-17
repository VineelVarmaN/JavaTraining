package javapractice.W3Resource.basic_part1;

import java.util.logging.Logger;
import java.util.stream.Stream;

public class RemoveFirstCharAndConcatenate {
    public String getConcatenateChar(String name1, String name2){
        if (name1.length()>1 && name2.length()>1){
            String result = name1.substring(1).concat(name2.substring(1));
            return result;
        }
        else {
            return "No input Paramteter";
        }
    }
    public String getConcatenateCharUsingStream(String name1, String name2){
        String result = Stream.of(name1,name2).filter(n->name1.length()>1 && name2.length()>1)
                .map(n->name1.substring(1).concat(name2.substring(1))).findFirst().orElse("No input Paramteter");
        return result;
    }
    public static void main(String[] args) {
        String name1 = "Python";
        String name2 = "Tutorial";
        System.out.println("Str1 = "+name1);
        System.out.println("Str2 = "+name2);
        RemoveFirstCharAndConcatenate objRemoveFirstCharAndConcatenate = new RemoveFirstCharAndConcatenate();
        System.out.println(objRemoveFirstCharAndConcatenate.getConcatenateChar(name1,name2));
        //using stream
        System.out.println(objRemoveFirstCharAndConcatenate.getConcatenateCharUsingStream(name1,name2));
    }
}
