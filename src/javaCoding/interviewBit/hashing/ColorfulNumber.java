package javaCoding.interviewBit.hashing;

import java.util.HashSet;

public class ColorfulNumber {
    public int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        String num = String.valueOf(A);
        for (int i = 0; i < num.length(); i++) {
            int product = 1;
            for (int j = i + 1; j <= num.length(); j++) {
                int digit = Integer.parseInt(num.substring(i, j));
                product *= digit;
                if (set.contains(Integer.valueOf(num.substring(i, j)))) {
                    return 0;
                }
                set.add(product);
            }
        }
        System.out.println(set);
        return 1;
    }


    public static void main(String[] args) {
        int A = 235;
        ColorfulNumber colorfulNumberObj = new ColorfulNumber();
        System.out.println(colorfulNumberObj.colorful(A));
    }
}
