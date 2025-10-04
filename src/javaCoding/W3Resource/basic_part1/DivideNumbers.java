package javaCoding.W3Resource.basic_part1;

public class DivideNumbers {
    public int getDivideNumbers(int first, int second){
        return first/second;
    }

    public static void main(String[] args) {
        int first = 50;
        int second = 3;
        DivideNumbers objDivideNumbers = new DivideNumbers();
        System.out.println(objDivideNumbers.getDivideNumbers(first,second));
    }
}
