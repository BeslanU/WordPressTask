package day14_Recap;
import java.util.Scanner;
public class NextLine_VS_Others {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("enter your full name ");
        String fullName = scan.nextLine();
        scan.nextLine();

        System.out.println("Your full name is: " + fullName);






    }
}
