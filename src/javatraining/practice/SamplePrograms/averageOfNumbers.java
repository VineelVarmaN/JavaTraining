package javatraining.practice.SamplePrograms;

public class averageOfNumbers {
    public static void main(String[] args) {
        double[] inputList = {1,2,3,4,5,6};
        double totalNumbers = 0;
        double output;
        for (int i=0; i<inputList.length; i++){
            totalNumbers = totalNumbers+inputList[i];
             }
        output = totalNumbers/ inputList.length;
       // System.out.println(totalNumbers);
       // System.out.println(inputList.length);
        System.out.println("AVERAGE IS:" + output);
    }
}