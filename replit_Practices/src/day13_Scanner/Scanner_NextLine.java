package day13_Scanner;

import java.util.Scanner;

public class Scanner_NextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
           String fulName = scan.nextLine();
        System.out.println("Full name: " + fulName);
        System.out.println("Enter your company name");
            String companyName = scan.nextLine();
        System.out.println("Company name: " + companyName);

    }
}
