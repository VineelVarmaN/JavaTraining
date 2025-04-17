package javalearning.myTraining.day3.LambdaExpression;

import java.util.Arrays;
import java.util.List;

/**
 * Lambda expression represents instances of functional interfaces.
 * lambda expression reduces boilerplate code by no need for extra classes
 * lambda expression works mainly with streams and collections
 */
//create a Employee class
class Employee{
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        //create a list to store the employee details
        List<Employee> employeeList = Arrays.asList(new Employee("e1", 30000),
                new Employee("e2", 60000),
                new Employee("e3", 50000),
                new Employee("e4", 40000));
        //print the initial
        employeeList.forEach(System.out::println);
        //sort the employees
        employeeList.sort((emp1,emp2)-> Double.compare(emp1.salary,emp2.salary));

        System.out.println("Sorted Employees by salary using Lambda expression");
        //print all the sorted employee details
        employeeList.forEach(System.out::println);
    }
}

/***
 * when to use lambda
 * 1.   Sorting lists
 * 2.   filtering data
 * 3.   performing operations on collections ..etc
 */
