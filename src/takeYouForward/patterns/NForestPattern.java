package takeYouForward.patterns;
/**
 * Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
 * For every value of ‘N’, help sam to print the corresponding N-dimensional forest.
 * Example:
 * Input: ‘N’ = 3
 *
 * Output:
 * * * *
 * * * *
 * * * *
 */
public class NForestPattern {
    public static void main(String[] args) {
        for (int i = 1; i<=3; i++){
            for (int j = 1; j<=3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
