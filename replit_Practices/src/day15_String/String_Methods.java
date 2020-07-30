package day15_String;

import java.util.Scanner;

public class String_Methods {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
            int ch1 = firstName.length();
        System.out.println("Enter your last name: ");
        String lastName = input.next();
            int ch2 = lastName.length();
        System.out.println("Your initial is: " + ch1 + "." + ch2);




    }
}
