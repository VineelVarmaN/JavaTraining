package javaCoding.interviewBit.hashing;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstringWithoutRepeat {
    public int lengthOfLongestSubstring(String A) {
        List<Character> subString = new ArrayList<>();
        for (int i = 0; i<A.length(); i++){
            char c = A.charAt(i);
            if (!subString.contains(c)){
                subString.add(c);
            }
        }
        return subString.size();
    }

    public static void main(String[] args) {
        String A = "abcabcbb";
        LongestSubstringWithoutRepeat longestSubstringWithoutRepeatObj = new LongestSubstringWithoutRepeat();
        System.out.println(longestSubstringWithoutRepeatObj.lengthOfLongestSubstring(A));
    }
}
