package day27_Recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        String[] students = new String[scan.nextInt()];
        scan.nextLine();

        for (int i = 0; i <= students.length-1; i++ ) {
            System.out.println("Enter a name");
            students[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));

    }
}
