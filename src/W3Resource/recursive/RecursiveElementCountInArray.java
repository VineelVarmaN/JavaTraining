package W3Resource.recursive;

/**
 * Write a Java recursive method to count the number of occurrences of a specific element in an array.
 */
public class RecursiveElementCountInArray {
    public static int getElementCount(int[] numbers, int number, int length){
        if (length>= numbers.length){
            return 0;
        }
        int count = 0;
        if (numbers[length]==number){
            count++;
        }
        return count + getElementCount(numbers,number,length+1);
    }

    public static void main(String[] args) {
        int[] numbers= {2,3,2,4,2,5};
        int number = 2;
        System.out.println(getElementCount(numbers,number,0));
    }
}
