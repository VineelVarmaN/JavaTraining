package com.JTraining;

//no parameter lambda expression
@FunctionalInterface
interface Display{
    void show();
}

//single parameter lambda expression
@FunctionalInterface
interface Number{
    void num(int i);
}

//multiple parameter lambda expression
@FunctionalInterface
interface MultipleParameters{
    void multiParam(int i, String name);
}
public class LambdaExpressionExamples {
    public static void main(String[] args) {
        Display objDisplay = () ->{
            System.out.println("No Parameter syntax");
        };
        objDisplay.show();
        Number objNumber = (i) ->{
            System.out.println("Single parameter suntax " + i);
        };
        objNumber.num(5);
        MultipleParameters objMultiParam = (i, name) ->{
            System.out.println("Multiple parameter syntax " + i + " " + name);
        };
        objMultiParam.multiParam(29, "Vineel");
    }
}
