package day14_Recap;

import java.util.Scanner;

public class Scanner_practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gander: ");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your country: ");
        String country = scan.nextLine();

        System.out.println("Enter your zip code: ");
        int zip = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();











    }
}
