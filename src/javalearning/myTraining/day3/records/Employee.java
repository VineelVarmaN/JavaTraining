package javalearning.myTraining.day3.records;

class EmployeePojo {

    //variables
    private String firstName;
    private String lastName;
    private int id;
    //constructor
    public EmployeePojo(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }
    //setters and getters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //to string method to return the attributes

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }
}

public class Employee{
    public static void main(String[] args) {
        //create object for EmployeePOJO class
        EmployeePojo employeePojoObj = new EmployeePojo("Vineel","Varma",1);
        System.out.println("The First name : "+employeePojoObj.getFirstName());
        System.out.println("The Last name : "+employeePojoObj.getLastName());
        System.out.println("The employee id : "+employeePojoObj.getId());
        System.out.println(employeePojoObj.toString())  ;
    }
}
