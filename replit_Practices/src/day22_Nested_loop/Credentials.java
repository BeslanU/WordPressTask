package day22_Nested_loop;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String u = scan.next();
        System.out.println("Enter your password");
        String p = scan.next();
        int attampt = 0;
        while ( !(u.equals("cyber") && p.equals("tek12"))){
            if (attampt == 3){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("invalid user name or password please re-enter");
            System.out.println("Enter you user name");
            u = scan.next();
            System.out.println("Enter your password");
            p = scan.next();
            attampt++;
        }
        System.out.println("You Logged in");
    }
}
