package javalearning.leetcode;

public class RegularExpressionMatching {

    public static   boolean isMatch(String t, String p) {
        int tLength = t.length();
        int pLength = p.length();
        boolean[][] output = new boolean[tLength + 1][pLength + 1];
        for (int i = tLength-1; i<tLength && i>=0; i++){
            for (int j = pLength-1; j<pLength && j>=0; j++){
                System.out.println(output[i][j]);
            }
        }
    return true;
    }
    public static void main(String[] args) {
        String text = "aa";
        String pattern = "a";
        isMatch(text, pattern);
    }
}
