package javatraining.javatpoint.sampletopic;

public class MethodOverloading {
    //created static method for checking method overloading concept
    public static int add(int num1, int num2){
        int sum = (num1 + num2);
        System.out.println(sum);
        return sum;
    }
    public double add(double num1, double num2, double num3){
        double sum = (num1 + num2 + num3);
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        add(5, 5);
        MethodOverloading objAdd = new MethodOverloading();
        objAdd.add(5.1, 5.2, 5.3);
    }
}
//calling the static method in different class with the help of classname.
class test{
    public static void main(String[] args) {
        MethodOverloading.add(6, 6); //static method called using class name and methos name
        MethodOverloading objAdd = new MethodOverloading();
        objAdd.add(5.0, 5.0, 5.0);
    }
}

