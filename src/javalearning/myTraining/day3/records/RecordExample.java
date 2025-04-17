package javalearning.myTraining.day3.records;

//create a class
public class RecordExample{
    public static void main(String[] args) {
        //creating object with default constructors
        EmployeeDetails employeeDetailsObj = new EmployeeDetails("Vineel","Varma",2);
        //Auto generated getters method
        System.out.println(employeeDetailsObj.firstName());
        System.out.println(employeeDetailsObj.lastName());
        System.out.println(employeeDetailsObj.id());
        //Auto generated to String() method
        System.out.println(employeeDetailsObj.toString());
    }
}
