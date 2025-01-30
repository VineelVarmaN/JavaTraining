package microservices_practice.java_calculator;

import java.util.Scanner;

public class CalculatorLogic {
    public void getCalculationValue(){
        //get the input values using scanner
        Scanner scanner = new Scanner(System.in);
        //store the first value
        int firstValue = scanner.nextInt();
        System.out.println("The given first number : "+firstValue);
        //store the mathematical operation
        String operations = scanner.next();
        System.out.println("The given operation : "+operations);
        //store the second value
        int secondValue = scanner.nextInt();
        System.out.println("The given second number : "+secondValue);


        //do the mathematical operation according to input
        switch (operations){
            case "/": System.out.println("the result for / operation : "+(firstValue/secondValue));
                break;
            case "*": System.out.println("the result for * operation : "+(firstValue*secondValue));
                break;
            case "-": System.out.println("the result for - operation : "+(firstValue-secondValue));
                break;
            case "+": System.out.println("the result for + operation : "+(firstValue+secondValue));
                break;
            case "%": System.out.println("the result for % operation : "+(firstValue%secondValue));
                break;
            default:
                System.out.println("Please select a valid operation");
        }
        scanner.close();
    }
}
