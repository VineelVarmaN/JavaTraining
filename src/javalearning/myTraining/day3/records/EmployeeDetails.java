package javalearning.myTraining.day3.records;

/**
 * a record is a special type of class declaration for reducing the boilerplate code.
 * Java records were introduced to be used as a fast way to create data carrier classes to carry data
 * between modules
 * we use POJO's (Plain Old Java Objects) and DTO's (Data Transfer Objects) to carry data between modules
 * instead of POJO class, we can use record classes.
 */
//create a record class for employee with no constructor, getters or setters or to string () method.
    //everything will be auto generated.
    public record EmployeeDetails(String firstName, String lastName, int id){
}

