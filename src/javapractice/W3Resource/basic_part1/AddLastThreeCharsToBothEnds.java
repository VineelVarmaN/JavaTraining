package javapractice.W3Resource.basic_part1;

import java.util.stream.Stream;

public class AddLastThreeCharsToBothEnds {
    public String getStringAfterAddingChar(String name){
        String result ="";
        //check the length of the string greater than 3
        if (name.length()>3){
            //get the last three characters from the string
            String lastThreeChars = name.substring(3);
            //add three characters to both frond and back of the string
            result = lastThreeChars.concat(name).concat(lastThreeChars);
        }else {
            return "String name is less than 3 characters";
        }
        return result;
    }
    public String getStringAfterAddingCharUsingStream(String name){
        String result = Stream.of(name).filter(n->name.length()>3)
                .map(n->name.substring(3).concat(name).concat(name.substring(3)))
                .findFirst().orElse("String name is less than 3 characters");
        return result;
    }
    public static void main(String[] args) {
        String name = "Pyt";
        AddLastThreeCharsToBothEnds objAddLastThreeCharsToBothEnds = new AddLastThreeCharsToBothEnds();
        System.out.println(objAddLastThreeCharsToBothEnds.getStringAfterAddingChar(name));
        //using stream
        System.out.println("Using stream : "+objAddLastThreeCharsToBothEnds.getStringAfterAddingCharUsingStream(name));
    }
}
