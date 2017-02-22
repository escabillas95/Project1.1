package com.company.Classes.Class;

/**
 * Created by JPMPC-B213 on 2/17/2017.
 */
public class Employee extends Person {

    private String department;
    private double payGrade;
    private String employeeID;

    public Employee(){
    }
    public Employee(String firstName, String lastName, int Age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(double payGrade) {
        this.payGrade = payGrade;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }
//polymorhpism
    public String introduceYourself(String fname, String lname, int age, String company) {
        return "\tHi I'm "+fname+" "+lname+"! I,m "+age+" years old. Representing "+company+"!";

    }

}
