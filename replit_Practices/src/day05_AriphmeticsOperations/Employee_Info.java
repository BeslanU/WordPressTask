package day05_AriphmeticsOperations;

import org.omg.CORBA.ServiceDetail;

public class Employee_Info {
    public static void main(String[] args) {

        /*


Warmup tasks:
        1. create a class named EmployeeInfo
                    declare the following variables:
                             firstName
                             lastName
                             gender
                             age
                             companyName
                             jobTitle
                             isFullTime
                             isMarried
                             salary
            write a program that can display the full info of the employee
                    ex:
                             firstName = John
                             lastName = Daniel
                             gender = Male
                             age = 35
                             companyName = CapitalOne
                             jobTitle = SDET
                             isFullTime = true
                             isMarried = false
                             salary = 120000.50
             output:
                        Employee' full name is: John Daniel
                        John Daniel' gender is: Male
                        John Daniel' age is: 35 years old
                        John Daniel works at: CapitalOne
                        John Daniel' Job title is: SDET
                        John Daniel' salary is 120000.5 $
                        John Daniel is full time employee: true
                        John Daniel is married: false

         */

        String firstName = "John";
        String lasttName = "Daniel'";
        char gender = 'M';
        int age = 30;
        String companyName = "CapitalOne";
        String jobTitle = "SDET";
        boolean isFulltime = true;
        boolean isMarried = false;
        double salary = 120000.50;

        System.out.println("Employee' full name is: " + firstName + " " + lasttName);
        System.out.println("John Daniel' gender is: " + gender);
        System.out.println("John Daniel' age is: " + age);
        System.out.println("John Daniel' works at: " + companyName);
        System.out.println("John Daniel' job title is: " + jobTitle);
        System.out.println("is John Daniel'  full time worker: " + isFulltime);
        System.out.println("is John Daniel' married: " + isMarried );
        System.out.println("John Daniel' salary: " + salary);
    }
}
