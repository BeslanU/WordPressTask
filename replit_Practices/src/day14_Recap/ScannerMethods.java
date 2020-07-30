package day14_Recap;
import java.util.Scanner;
public class ScannerMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How old are you?");
        int number = input.nextInt();

        System.out.println("Your age is: " + number);

        System.out.println("Enter you name");
        String name = input.next();

        System.out.println("Your first name: " + name);

        System.out.println("Enter your last name");
        String last = input.next();

        System.out.println("Your last name is: " + last);





    }
}
