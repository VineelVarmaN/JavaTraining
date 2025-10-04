package javaCoding.W3Resource.basic_part1;

import java.util.stream.Stream;

public class FirstThreeCharOrHash {
    public String getFirstThreeChar(String name){
        //check if the string has more than 3 characters
        if (name.length()>=3){
            //get the first three characters to string variable by using substring(0,3)
            String result = name.substring(0,3);
            return result;
        }
        else {
            //populate ### if the char length is less than 3
            return "###";
        }
    }
    public String getFirstThreeCharUsingStream(String name){
        String result = Stream.of(name).filter(n->name.length()>=3)
                        .map(n->name.substring(0,3)).findFirst().orElse("###");
        return result;
    }
    public static void main(String[] args) {
        String name = "Vinnu";
        System.out.println("Test Data : Str1 = "+name);
        FirstThreeCharOrHash objFirstThreeCharOrHash = new FirstThreeCharOrHash();
        System.out.println(objFirstThreeCharOrHash.getFirstThreeChar(name));
        //using stream
        System.out.println("Using stream : "+objFirstThreeCharOrHash.getFirstThreeCharUsingStream(name));
    }
}
