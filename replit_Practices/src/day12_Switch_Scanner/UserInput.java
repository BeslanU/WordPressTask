package day12_Switch_Scanner;
import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) {

        Scanner Babushka = new Scanner(System.in);
        System.out.println("How old are you??");
        int num1 = Babushka.nextInt();

        System.out.println("Are you sure you " + num1 + " ?");


    }
}

