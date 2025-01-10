package javatraining.learningSamples.TopicWiseSamplePrograms.operations;

public class HighestNumber {


   public static void main(String[] args) {

        int[] numbers = {1, 15, -1, 23, 45, 70, 99, -13, -5};
       int x= highest(numbers);
       int y= lowest(numbers);
       differenceNumber(y,x );

    }
    // program to find highest number
    public static int highest(int numbers[]){
        int highestNumber = numbers[0];
        for (int i=0;i<numbers.length;i++)
        {
            //highestNumber=numbers[0];
            if(highestNumber<numbers[i])

            {
                highestNumber=numbers[i];
            }
        }
        System.out.println("HIGHEST NUMBER:" + highestNumber);
        return highestNumber;
    }
    // program to find lowest number
    public static int lowest(int numbers[]){
        int lowestNumber = numbers[0];
        for(int j=0;j<numbers.length;j++){
            if (lowestNumber>numbers[j])
            {
                lowestNumber=numbers[j];
            }
        }
        System.out.println("LOWEST NUMBER:" + lowestNumber);
        return lowestNumber;
    }
    //program to find difference between highest and lowest number
    public static int differenceNumber(int lowestNumber, int highestNumber){
       int diffnum=highestNumber-lowestNumber;
        System.out.println("Difference between highest and lowest is:" + diffnum);
       return diffnum;
    }
}
