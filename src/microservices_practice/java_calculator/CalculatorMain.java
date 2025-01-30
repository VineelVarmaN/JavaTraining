package microservices_practice.java_calculator;

public class CalculatorMain {
    public static void main(String[] args) {
        //instance creation for calculator logic class
        CalculatorLogic objCalculatorLogic = new CalculatorLogic();
        //calling the get calculation function using created instance
        objCalculatorLogic.getCalculationValue();
    }
}
