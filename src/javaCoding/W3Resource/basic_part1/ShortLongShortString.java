package javaCoding.W3Resource.basic_part1;

import java.util.stream.Stream;

public class ShortLongShortString {
    public String getShortLongShortString(String name1, String name2){
        String result = name1+name2+name1;
        return result;
    }
    public  String getShortLongShortStringUsingStream(String name1, String name2){
        String result = Stream.of(name1,name2).map(n->name1+name2+name1).findFirst().orElse("");
        return result;
    }
    public static void main(String[] args) {
        String name1 = "Python";
        String name2 = "Tutorial";
        System.out.println("Str1 = "+name1);
        System.out.println("Str2 = "+name2);
        ShortLongShortString objShortLongShortString = new ShortLongShortString();
        System.out.println(objShortLongShortString.getShortLongShortString(name1,name2));
        System.out.println("get short long and short string : "+objShortLongShortString.getShortLongShortStringUsingStream(name1,name2));
    }
}
