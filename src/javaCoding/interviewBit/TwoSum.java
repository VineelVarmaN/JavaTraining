package javaCoding.interviewBit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {
    public static ArrayList<Integer> twoSum(final List<Integer> A, int B) {
        ArrayList<Integer> result = new ArrayList<>();
        Collections.sort(A);
        System.out.println(A);
        List<Integer> distinctList = A.stream().distinct().toList();
        System.out.println(distinctList);
        for (int i = 0; i<distinctList.size()-1; i++){
            if ((distinctList.get(i)+distinctList.get(i+1))==B){
                result.add(i+1);
                result.add(i+2);
                return result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        //List<Integer> A = List.of(2,7,11,15);
        List<Integer> A = new ArrayList<>(List.of( 4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8));
        //int B = 9;
        int B = -3;
        System.out.println(twoSum(A,B));
    }
}
