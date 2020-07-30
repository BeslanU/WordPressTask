package day13_Scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class NextLine_VS_Next {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        int salary = scan.nextInt();
        String enter = scan.nextLine();

        System.out.println("Enter your full name");
        String name = scan.nextLine();

        System.out.println("Salary: " + salary);
        System.out.println("Full name: " + name);






    }
}
