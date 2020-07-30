package day13_Scanner;

import day02_printStatements.Classmates;

import java.util.Scanner;

public class Next_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("You entered: " + firstName);
        System.out.println("Enter your last name");
        String lirstName = scan.next();
        System.out.println("You entered: " + lirstName);
        String fullname = firstName + lirstName;
        System.out.println(fullname);







    }
}
