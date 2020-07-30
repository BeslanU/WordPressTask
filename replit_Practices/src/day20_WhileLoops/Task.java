package day20_WhileLoops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String password = "Cybertek";
        System.out.println("Enter your password");
        String input = scan.nextLine();
        while (!input.equals(password)){
            System.out.println("Please enter again");
            input = scan.nextLine();
        }
        System.out.println("Logged in");
    }
}
