package javapractice.W3Resource.basic_part1;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstAndLastCharCombo {
    public String getFirstAndLastCharCombo(String name1, String name2){
        //if the length of each string is greater than 0
        if (!name1.isEmpty() && !name2.isEmpty()){
            //create a string taking the first and last characters from two given strings.
            String result = name1.substring(0,1).concat(name2.substring(0,1));
            return result;
        //if name1 is empty then replace the empty char with #
        } else if (name1.isEmpty() && !name2.isEmpty()) {
            return name1.replace("","#").concat(name2.substring(0,1));
        }
        // If the length of each string is 0 use "#" for missing characters.
        else {
            return name1.substring(0,1).concat(name2.replace("","#"));
        }
    }
    public String getFirstAndLastCharComboUsingStream(String name1, String name2){
        // Create a stream from the names and map each string to its corresponding part or "#"
        String result = Stream.of(Optional.ofNullable(name1).filter(n -> !n.isEmpty()).map(n -> n.substring(0, 1)).orElse("#"),
                Optional.ofNullable(name2).filter(n -> !n.isEmpty()).map(n -> n.substring(0, 1)).orElse("#"))
                .collect(Collectors.joining());
        return result;
    }
    public static void main(String[] args) {
        String name1 = "Python";
        String name2 = "";
        FirstAndLastCharCombo objFirstAndLastCharCombo = new FirstAndLastCharCombo();
        System.out.println(objFirstAndLastCharCombo.getFirstAndLastCharCombo(name1,name2));
        //using stream
        System.out.println("using stream : "+objFirstAndLastCharCombo.getFirstAndLastCharComboUsingStream(name1,name2));
    }
}
