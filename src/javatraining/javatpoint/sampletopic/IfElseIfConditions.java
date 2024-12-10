package javatraining.javatpoint.sampletopic;

public class IfElseIfConditions {
    public static void main(String[] args) {
        //share market price buy and sell
        int price = 39;
        int stopLoss = 10%(price)-price;
       int target = 10%(price)+price;
        if (target > 39){
            System.out.println("BUY the stock at:" + target);
        }
        else if (price < stopLoss) {
            System.out.println("SELL the stock at:" + stopLoss);
        }
        else{
            System.out.println("HOLD the stock");
        }
        //finding max values
        int n1 = 5;
        int n2 = 10;
        if(n1 > n2){
            System.out.println("Max value is:" + n1);
        }
        else {
            System.out.println("Max value is:" + n2);
        }
        //
    }
}
