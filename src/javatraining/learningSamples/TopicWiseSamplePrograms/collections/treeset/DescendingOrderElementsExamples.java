package javatraining.learningSamples.TopicWiseSamplePrograms.collections.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class DescendingOrderElementsExamples {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(29);
        treeSet.add(3);
        treeSet.add(19);
        treeSet.add(98);
        System.out.println(treeSet);
        //descending order
        Iterator<Integer> itr = treeSet.descendingIterator();
        while (itr.hasNext()){
            System.out.println("The descending order : "+itr.next());
        }
    }
}
