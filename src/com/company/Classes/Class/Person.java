package com.company.Classes.Class;

import com.company.Classes.Main;

/**
 * Created by JPMPC-B213 on 2/17/2017.
 */
public class Person {

    String firstName;
    String lastName;
    String email;
    String userName;
    String password;
    String passwordAgain;
    String gender;
    int age;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordAgain() {
        return passwordAgain;
    }

    public void setPasswordAgain(String passwordAgain) {
        this.passwordAgain = passwordAgain;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    //introduce yourself


    public String introduceYourself(String fname, String lname, String adj) {
        return "\tHello I'm "+fname+" "+lname+"!"+"I'm so "+adj;

    }

}