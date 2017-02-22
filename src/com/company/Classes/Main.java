package com.company.Classes;

import com.company.Classes.Class.Customer;
import com.company.Classes.Class.Employee;
import com.company.Classes.Class.Person;
import com.company.Classes.Class.StaticMethods;

public class Main {

    public static void main(String[] args) {

        int firstNumber=1;
        long longNumber=1000000000L;
        float floatNumber=3.14f;
        double doublenumber=3.23231d;
        char charVariable='d';
        boolean booleanVariable=true;
        byte byteNumber=-128;
        String stringValue="This is a string.";

        System.out.println("byte: "+byteNumber);
        System.out.println("int: " +firstNumber);
        System.out.println("long: "+longNumber);
        System.out.println("float: "+floatNumber);
        System.out.println("double: "+doublenumber);
        System.out.println("char: "+charVariable);
        System.out.println("boolean: "+booleanVariable);
        System.out.println("string: "+stringValue);

	System.out.println("***************");
    System.out.println("* Bailey July *");
    System.out.println("***************");

Person bailey1 = new Person();


        bailey1.setFirstName("Bailey Anthony");
        bailey1.setLastName("Escabillas");
        bailey1.setAge(21);
        bailey1.setEmail("pogingfuccboi143@gmail.com");
        bailey1.setUserName("fuccboi21");
        bailey1.setPassword("*********");
        bailey1.setPasswordAgain("*********");


        String firstnameI=bailey1.getFirstName();

        System.out.println("First Name:\t"+ firstnameI);
        System.out.println("Last Name:\t"+ bailey1.getLastName());
        System.out.println("Age:\t"+ bailey1.getAge());
        System.out.println("email:\t"+bailey1.getEmail());
        System.out.println("Username:\t"+bailey1.getUserName());
        System.out.println("Password:\t"+bailey1.getPassword());
        System.out.println("Password:\t"+bailey1.getPasswordAgain());
//second person
        System.out.println("\n******second person****\n");

Person bailey2 = new Person();

        bailey2.setFirstName("Bailey");
        bailey2.setLastName("July");
        bailey2.setAge(210);
        bailey2.setGender("Male");
        bailey1.setEmail("pepeuccboi143@gmail.com");
        bailey1.setUserName("fuuuuccboi21");
        bailey1.setPassword("*********");
        bailey1.setPasswordAgain("*********");

        System.out.println("First Name : "+bailey2.getFirstName());
        System.out.println("Last Name : "+bailey2.getLastName());
        System.out.println("Age: "+bailey2.getAge());
        System.out.println("Age: "+bailey2.getAge());
        System.out.println("Gender: "+bailey2.getGender());
        System.out.println("email: "+bailey2.getEmail());
        System.out.println("Username: "+bailey2.getUserName());
        System.out.println("Password: "+bailey2.getPassword());
        System.out.println("Password Again: "+bailey2.getPasswordAgain());

        System.out.println("\nIntroduce Yourself!\n");

        System.out.println(bailey2.introduceYourself("Bailey","July","GWAPO!"));

Employee firstEmployee= new Employee();
//this is for the employee
        System.out.println("\n*******************EMPLOYEE****************\n");

        firstEmployee.setFirstName("Ana");
        firstEmployee.setLastName("Pog");
        firstEmployee.setEmail("ana_pog@gmail.com");
        firstEmployee.setAge(41);
        firstEmployee.setUserName("anapog74");
        firstEmployee.setGender("Female");
        firstEmployee.setPassword("lskadhaskf");
        firstEmployee.setPasswordAgain("lskadhaskf");
        firstEmployee.setDepartment("Financa Analyst");
        firstEmployee.setPayGrade(17500.00);
        firstEmployee.setEmployeeID("0001-A1");

        String firstnameIII= firstEmployee.getFirstName();
        String lastnameIII= firstEmployee.getLastName();
        int ageIII= firstEmployee.getAge();
        String emailIII= firstEmployee.getEmail();
        String gender=firstEmployee.getGender();
        String usernameIII=firstEmployee.getUserName();
        String passwordIII= firstEmployee.getPassword();
        String passwordagainIII=firstEmployee.getPasswordAgain();
        String department= firstEmployee.getDepartment();
        double setPayGrade= firstEmployee.getPayGrade();
        String employeeID= firstEmployee.getEmployeeID();

        System.out.println("First Name: "+firstnameIII);
        System.out.println("Last Name: "+lastnameIII);
        System.out.println("Age: "+ageIII);
        System.out.println("Gender: "+gender);
        System.out.println("email: "+emailIII);
        System.out.println("Username: "+usernameIII);
        System.out.println("Password: "+passwordIII);
        System.out.println("Password Again: "+passwordagainIII);
        System.out.println("Department: "+department);
        System.out.println("Pay Grade: "+setPayGrade);
        System.out.println("ID: "+employeeID);

        System.out.println("\nIntroduce Yourself!\n");

        System.out.println(firstEmployee.introduceYourself("Ana","Pog",25,"Knowles"));

//this is a for the customer
        System.out.println("\n******************CUSTOMER******************\n");

Customer firstCustomer= new Customer();

        firstCustomer.setFirstName("Anton");
        firstCustomer.setLastName("Ludwig");
        firstCustomer.setAge(52);
        firstCustomer.setGender("Male");
        firstCustomer.setEmail("anotnludwig-gwapo@gmail.com");
        firstCustomer.setUserName("LudAnt");
        firstCustomer.setPassword("googoodolls");
        firstCustomer.setPasswordAgain("googoodolls");
        firstCustomer.setAddress("CAmp Sawi, Nana City, Moon");
        firstCustomer.setTelephoneNumber("576-7435");
        firstCustomer.setCustomerID("1A-234B");

        String firstnameIV= firstCustomer.getFirstName();
        String lastnameIV= firstCustomer.getLastName();
        int ageIV= firstCustomer.getAge();
        String emailIV= firstCustomer.getEmail();
        String genderIV=firstCustomer.getGender();
        String usernameIV=firstCustomer.getUserName();
        String passwordIV= firstCustomer.getPassword();
        String passwordagainIV=firstCustomer.getPasswordAgain();
        String address= firstCustomer.getAddress();
        String telephone=firstCustomer.getTelephoneNumber();
        String customerID= firstCustomer.getCustomerID();

        System.out.println("First Name: "+firstnameIV);
        System.out.println("Last Name: "+lastnameIV);
        System.out.println("Age: "+ageIV);
        System.out.println("Gender: "+genderIV);
        System.out.println("email: "+emailIV);
        System.out.println("Username: "+usernameIV);
        System.out.println("Password: "+passwordIV);
        System.out.println("Password Again: "+passwordagainIV);
        System.out.println("Address: "+address);
        System.out.println("Telephone No.: "+telephone);
        System.out.println("ID: "+customerID);

        // introduce yourself
System.out.println("\nIntroduce Yourself!\n");

        System.out.println(firstCustomer.introduceYourself("Anton","Ludwig",18,"flowers"));
        //class overload
        System.out.println("****************CLASS OVERLOAD***************");

        Customer customer=new Customer(" Neil","Andrew");

        System.out.println(customer.getFirstName()+" "+customer.getLastName());

        Employee employee=new Employee(" Bobby ","Andrews",34);

        System.out.println(employee.getFirstName()+" "+employee.getLastName()+" "+employee.getAge());
//Statement
       System.out.println("*****************DECISION MAKING*********************");
//vacation
            //while
            System.out.println("\n*****************while*********************\n");
            int i=0;
            while(i<10){
                    i=i+1;
                    System.out.print(i+" ");
            }
            System.out.println("\n*****************do while*********************\n");
               int n=0;
                do {
                  n=n+1;
                        System.out.print(n+" ");
                }
                while(n<10);
            System.out.println("\n*****************for*********************\n");

            for(int a=1; a<11; a++){
                    System.out.print(a+" ");
            }
            System.out.println("\n*****************Static Methods*********************\n");
            for(int a=1; a<7; a++){

                    System.out.println(a+" ");
            }
            System.out.println("___");
            System.out.println(StaticMethods.myMethods(6));
            //factorial
            System.out.println("\n*****************FACTORIAL*********************\n");

            int fact = 1;
            int number=0;

                    for (int f=1;f<=7;f++){
                            fact=f*fact;
                    }
                    System.out.println("The factorial of 7*6*5*4*3*2*1 is "+fact+". ");
        //write a method with for-loop that generates an array  of the first n even numbers.
        System.out.println("\n*****************For-Loop: Array even numbers*********************\n");

         /*   int evenNum[]={5};
        for(int even=0;even<10;even++){
            if (evenNum[even]%2)
        }
*/

    }

}


