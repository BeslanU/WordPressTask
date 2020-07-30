package day15_String;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = scan.next();

        System.out.println("Enter you last name");
        String lastName = scan.next();

        String fullName = firstName + " " + lastName;
        fullName = fullName.toUpperCase();
        System.out.println(fullName);




    }
}
