package day20_WhileLoops;

import java.util.Scanner;

public class UntilNegative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i == 0;){
            System.out.println("Enter the number: ");
            int number = scan.nextInt();
            if(number < 0){
                break;
            }
            sum += number;
        }

        System.out.println("sum is: " + sum );
    }
}
