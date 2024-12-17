package javatraining.learningSamples.TopicSamplePrograms.others;

public class searchNumber {

        public static void main(String[] args) {
        int[] numbersList = {34, 67, 81, 97, 45, 54, 90, 83};

            numberIsPresent(numbersList);
            numberIsNotPresent(numbersList);
            presentNumberPosition(numbersList);

    }
    //Given the list of numbers, write a program to find whether a given number is present in the list or not
    //	input:
    //		numbers list = {34, 67, 81, 97, 45, 54, 90, 83}
    //		search number = 54
    //	output:
    //		Given number is present in the list
    public static void numberIsPresent(int[] numbersList){
            int number= 54;
        for( int position=0; position<numbersList.length; position++) {
            int result = numbersList[position];
            if (number == result) {
                System.out.println("Given number is present in the list");
                break;
            }
        }
    }

    // Continue with the same program with the search number = 40
    //	Output:
    //		Given number is not present in the list
    public static void numberIsNotPresent(int[] numbersList){
        int number= 40;
        for( int position=0; position<numbersList.length; position++){
            int result = numbersList[position];
            if (number == result){
                System.out.println("Given number is present in the list");
                break;
            }
        }
        System.out.println("Given number is not present in the list");
    }

    // print the position of the search number in the list, if it is present, else don't print the position
    public static void presentNumberPosition(int[] numberList){
            int number = 54;
            for (int i=0; i<numberList.length; i++){
                int result = numberList[i];
                if (number == result){
                    System.out.println(result);
                    int position = i;
                    System.out.println("position of the search number in the list:" + position);
                    break;
                }
            }
    }
}
