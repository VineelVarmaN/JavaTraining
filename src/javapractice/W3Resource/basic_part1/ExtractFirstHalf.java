package javapractice.W3Resource.basic_part1;

import java.util.stream.Stream;

public class ExtractFirstHalf {
    public String getFirstHalf(String name){
        String result = "";
        //check if given string is even
        if(name.length()%2==0){
            //extract the first half from the string if condition is matched
            result = name.substring(0,name.length()/2);
        }else {
            return "Given input is not matching criteria";
        }
        return result;
    }
    public String getFirstHalfUsingStream(String name){
        String result = Stream.of(name).filter(n->name.length()%2==0).map(n->name.substring(0,name.length()/2)).findFirst().orElse("");
        return result;
    }
    public static void main(String[] args) {
        String name = "Python";
        System.out.println("Test Data: "+name);
        ExtractFirstHalf objExtractFirstHalf = new ExtractFirstHalf();
        System.out.println(objExtractFirstHalf.getFirstHalf(name));
        System.out.println("Using stream : "+objExtractFirstHalf.getFirstHalfUsingStream(name));
    }
}
