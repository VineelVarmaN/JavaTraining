package javalearning.myTraining.day3.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  A Stream is a sequence of components that can be processed sequentially.
 *  These packages include classes, interfaces, and enum to allow functional-style
 *  operations on the elements.
 *  Stream API is used to process collections of objects
 */
class Employee{
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        //create an empty list
        List<Employee> employeeList = Arrays.asList(new Employee("e1",20,10000),
                new Employee("e2",30,20000),
                new Employee("e3", 40,30000),
                new Employee("e4",50,40000));
        //filter the salaries and collect the emplyees with more than 20000 salary
        //employeeList.stream() - convert list to stream
        List<Employee> highSalary = employeeList.stream().filter(employee -> employee.salary>20000)
                .toList();
        System.out.println("Employees with more than 20000 salary");
        highSalary.forEach(System.out::println);

        //sort the employees with age
        employeeList.sort(Comparator.comparingDouble(emp-> emp.age));
        System.out.println("Employees with sorted age");
        employeeList.forEach(System.out::println);
    }
}
