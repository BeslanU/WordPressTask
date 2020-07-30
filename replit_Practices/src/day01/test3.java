package day01;

import com.sun.org.apache.xerces.internal.xni.parser.XMLErrorHandler;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("Enter your email");
        String email = scan.nextLine();
        System.out.println("Enter your street");
        String street = scan.nextLine();
        System.out.println("Enter your city");
        String city = scan.nextLine();
        System.out.println("Enter your state");
        String state = scan.nextLine();
        System.out.println("Enter your zip code");
        String zip = scan.nextLine();
        System.out.println("Enter your work phone number");
        String workNumber = scan.nextLine();
        System.out.println("Enter your personal phone number");
        String personalNumber = scan.nextLine();
        System.out.println("Enter your age");
        String age = scan.nextLine();
        System.out.println("Enter your height");
        String height = scan.nextLine();
        System.out.println("Enter your weight");
        String weight = scan.nextLine();
        System.out.println("Are you married?");
        boolean married = scan.nextBoolean();

        System.out.println("Patient personal information\n" +
                "Full name:" + firstName + lastName + "\n" +
                "Address:" + street + "," + city + "," + state + "," + zip + "\n" +
                "Contacts: work phone number - " + workNumber + "personal phone number - " + personalNumber + "email:" + "\n" +
                "Age:" + age + "\n" +
                "Height:"  + height + "\n" +
                "Weight:"  + weight +  "\n" +
                "Married?:" + married);





}
}
