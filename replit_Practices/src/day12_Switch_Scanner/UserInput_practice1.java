package day12_Switch_Scanner;

import java.util.Scanner;

public class UserInput_practice1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What time is it?");
        double num = scan.nextDouble();

        String result = (num == 3)? "It' break time" : "It's not a break time" ;
        System.out.println(result);




    }
}
