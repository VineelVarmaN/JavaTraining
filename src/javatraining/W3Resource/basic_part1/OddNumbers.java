package javatraining.W3Resource.basic_part1;

public class OddNumbers {
    public int isEvenOrOdd(int n){
        if (n%2==0){
            return 1;
        }
        return 0;
    }
    public void getOdd(){
        for (int i = 1; i<100; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
    public void divisibleBy3(){
        for (int i = 1; i<100; i++){
            if (i%3 ==0)
                System.out.print(i + ",");
        }
    }
    public void divisibleBy5(){
        for (int i = 1; i<100; i++){
            if (i%5 ==0)
                System.out.print(i + ",");
        }
    }
    public void divisibleBy5And3(){
        for (int i = 1; i<100; i++){
            if (i%5 ==0 &&i%3 ==0)
                System.out.print(i + ",");
        }
    }
    public int getFactorialCount(int n1){
        int count = 0;
        for (int i =1; i<=n1; i++){
            if(n1%i == 0){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {

        OddNumbers objOddNumbers = new OddNumbers();
        //objOddNumbers.getOdd();
        //objOddNumbers.divisibleBy3();
       //objOddNumbers.divisibleBy5();
        //objOddNumbers.divisibleBy5And3();
        //System.out.println(objOddNumbers.isEvenOrOdd(21));
        System.out.println(objOddNumbers.getFactorialCount(25));
    }
}
