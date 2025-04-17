package javalearning.myTraining.day2.collections;

import java.util.HashSet;
import java.util.Set;

/**
 * Set - set will not maintain any specific order of elements
 *it does not allow any duplicate values
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Git");
        set.add("Maven");
        set.add("Spring");
        //print the set
        System.out.println("The set : "+set);
        //iterate the values and print the elements
        for (String course : set){
            System.out.println(course);
        }
        //will check if duplicate values can be added in set
        set.add("Git");
        System.out.println("The set : "+set);
        //remove the elements from set
        set.remove("Git");
        System.out.println("The set : "+set);
    }
}
