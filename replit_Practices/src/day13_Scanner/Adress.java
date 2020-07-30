package day13_Scanner;

import java.util.Scanner;

public class Adress {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number: ");
        double bNumber = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter your street name: ");
        String street = scan.nextLine();
        System.out.println("You entered: " + bNumber + " " + street);
    }
}
