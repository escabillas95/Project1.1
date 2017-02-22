package com.company.Classes.Class;

/**
 * Created by JPMPC-B213 on 2/17/2017.
 */
public class Customer extends Person {
    private String address;
    private String telephoneNumber;
    private String customerID;


    public Customer(){
    }
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
//polymorphism
    public String introduceYourself(String fname, String lname, int amt, String item) {
        return "\tHi I'm  "+fname+" "+lname+"! And I'd like to buy "+item+" for my Love. "+amt+ " roses pls!";

    }
    //class overload







}

