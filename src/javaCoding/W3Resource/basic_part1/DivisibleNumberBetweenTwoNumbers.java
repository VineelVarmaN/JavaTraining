package javaCoding.W3Resource.basic_part1;

public class DivisibleNumberBetweenTwoNumbers {
    public int getDivisibleNumbersCount(int x, int y, int z){
        int count = 0;
        for (int i =x; i<y; i++){
            if (i%z==0){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DivisibleNumberBetweenTwoNumbers objDivisibleNumberBetweenTwoNumbers = new DivisibleNumberBetweenTwoNumbers();
        System.out.println(objDivisibleNumberBetweenTwoNumbers.getDivisibleNumbersCount(5,22,3));
    }
}
