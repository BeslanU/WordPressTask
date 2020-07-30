package day21_Loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        for (int i = 10; i <= 50; i += 10){
            System.out.println("Enter the number");
            int num1 = scan.nextInt();
            if (num1 > max){
                max = num1;
            }
        }
        System.out.println("Max number " + max);
    }
}
