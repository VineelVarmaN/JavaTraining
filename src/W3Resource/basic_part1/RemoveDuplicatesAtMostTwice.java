package W3Resource.basic_part1;

public class RemoveDuplicatesAtMostTwice {

    public static int getArrayWithTwoDuplicateValues(int[] numbers){
        //check the array should not be empty
        if (numbers==null || numbers.length==0){
            return 0;
        }
        //declare count value as two
        int index = 2;
        for (int i = 2; i<numbers.length; i++){
            //Allow duplicates at most two
            if (numbers[i]!= numbers[index-2]) {
                numbers[index]=numbers[i];
                index++;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7};
        System.out.println("The duplicate array length "+getArrayWithTwoDuplicateValues(numbers));
    }
}
