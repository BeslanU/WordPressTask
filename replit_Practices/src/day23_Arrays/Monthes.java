package day23_Arrays;

import java.util.Scanner;

public class Monthes {
    public static void main(String[] args) {

        String[] month = {"Jen", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 12");
        int n = scan.nextInt();

        System.out.println(month[n-1]);


    }
}
