package javatraining.W3Resource.basic_part1;

public class MultiplicationTable {
    public void getMultiplicationTable(int input){
        int output = 0;
        for (int i =1; i<=10; i++){
           output =  input * i;
            System.out.println(input + "*" + i + "=" + output);
        }
    }

    public static void main(String[] args) {
        int input = 8;
        MultiplicationTable objMultiplicationTable = new MultiplicationTable();
        objMultiplicationTable.getMultiplicationTable(input);
    }
}
