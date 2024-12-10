package javatraining.javatpoint.sampletopic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(15);
        list.add(29);
        System.out.println(list); //will give all values in arraylist
        //List<Integer> list = Arrays.asList(2,24,246,3);
        List<Integer> result = list.stream().filter(n-> n%2==0).map(n -> n * 2).collect(Collectors.toList());
        System.out.println(result);
        //        //enhanced for loop
//        for (Integer values: list){
//            System.out.println(values);
//        }
       //Iterator<Integer> itr = list.iterator();
//        while (itr.hasNext())
//            System.out.println(itr.next());

    }
}
