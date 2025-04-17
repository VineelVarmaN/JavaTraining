package javalearning.myTraining.day3.optional;

import java.util.Optional;

/**
 * Optional class is used to provide a container that may or may not contain a value.
 * It helps avoid NullPointerException
 * Ex: an employee may or may not contain email. instead of handling null values manually we use optional
 */

class Employee{
    String name;
    Optional<String> email;

    public Employee(String name, String email) {
        this.name = name;
        this.email = Optional.ofNullable(email);
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email=" + email +
                '}';
    }
}
public class EmployeeDetails {
    public static void main(String[] args) {
        Employee employee1 = new Employee("e1","e1@email.com");
        Employee employee2 = new Employee("e2", null);
        //print the values
        System.out.println(employee1);
        System.out.println(employee2);
        //get the email for employees
        System.out.println("employee1 email : "+employee1.getEmail().orElse("No Email Available"));
        System.out.println("employee2 email : "+employee2.getEmail().orElse("No Email Available"));
    }
}
