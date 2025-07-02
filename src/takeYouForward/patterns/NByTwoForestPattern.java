package takeYouForward.patterns;
/**
 * Sam is making a forest visualizer. An N-dimensional forest is represented by the pattern of size NxN filled with ‘*’.
 * An N/2-dimensional forest is represented by the lower triangle of the pattern filled with ‘*’.
 * For every value of ‘N’, help sam to print the corresponding N/2-dimensional forest.
 * Example:
 * Input:  ‘N’ = 3
 * Output:
 *  *
 *  * *
 *  * * *
 */
public class NByTwoForestPattern {
    public static void main(String[] args) {
        for (int i = 0; i<3;i++){
            for (int j = 0; j<3; j++){
                if(i>=j)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
