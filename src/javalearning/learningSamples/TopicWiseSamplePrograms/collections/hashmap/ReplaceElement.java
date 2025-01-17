package javalearning.learningSamples.TopicWiseSamplePrograms.collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class ReplaceElement {
    public void usingReplaceWithKeyValue(){
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1,"Vineel");
        names.put(2,"Varma");
        names.put(3,"Nemmani");
        System.out.println(names);
        //replace element with key and value
        names.replace(3,"Swathi");
        System.out.println(names);
        for (Map.Entry<Integer,String> name: names.entrySet()){
            System.out.println(name.getKey()+" : "+name.getValue());
        }
    }
    public void usingReplaceWithKeyOldValueNewValue(){
        HashMap<Integer,String> names1 = new HashMap<>();
        names1.put(1,"Vineel");
        names1.put(2,"Varma");
        names1.put(3,"Nemmani");
        System.out.println(names1);
        //replacing element
        names1.replace(3,"Nemmani","Swathi");
        System.out.println(names1);
    }
    public void usingReplaceAll(){
        HashMap<Integer,String> names2 = new HashMap<>();
        names2.put(1,"Vineel");
        names2.put(2,"Varma");
        System.out.println(names2);
        //replace all
        names2.replaceAll((V, N) -> "Nemmani");
        System.out.println(names2);
    }
    public static void main(String[] args) {
        ReplaceElement objReplaceElement = new ReplaceElement();
        objReplaceElement.usingReplaceWithKeyValue();
        objReplaceElement.usingReplaceWithKeyOldValueNewValue();
        objReplaceElement.usingReplaceAll();
    }
}
