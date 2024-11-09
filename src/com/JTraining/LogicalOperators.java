package com.JTraining;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        int z = 20;
        //logical AND
        System.out.println((x > y) && (y > z)); //false - first condition failed, will not check second condition
        System.out.println((x > y) && (y < z)); //false - first condition failed, will not check second condition
        System.out.println((x < y) && (y > z)); //false - first condition passed, second condition failed
        System.out.println((x < y) && (y < z)); //true - first condition pass, second condition pass
        //bitwise AND
        System.out.println((x > y) & (y > z)); //false - first condition failed, will not check second condition
        System.out.println((x > y) & (y < z)); //false - first condition failed, will not check second condition
        System.out.println((x < y) & (y > z)); //false - first condition passed, second condition failed
        System.out.println((x < y) & (y < z)); //true - first condition pass, second condition pass
        //logical OR
        System.out.println((x > y) || (y > z)); //false - first condition failed, second condition failed
        System.out.println((x > y) || (y < z)); //true - first condition failed, second condition pass
        System.out.println((x < y) || (y > z)); //true - first condition passed, second condition fail
        System.out.println((x < y) || (y < z)); //true - first condition pass, second condition pass
        //bitwise OR
        System.out.println((x > y) | (y > z)); //false - first condition failed, second condition fail
        System.out.println((x > y) | (y < z)); //true - first condition failed, second condition pass
        System.out.println((x < y) | (y > z)); //true - first condition passed, second condition fail
        System.out.println((x < y) | (y < z)); //true - first condition pass, second condition pass
        //logical NOT
        System.out.println(!(x == y)); //true - ! will produce opposite result
        System.out.println(!(x != y)); //false -! will produce opposite result
    }
}
