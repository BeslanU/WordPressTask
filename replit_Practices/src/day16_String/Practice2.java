package day16_String;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");

        double n1 = scan.nextDouble();

        System.out.println("Enter second number:");

        double n2 = scan.nextDouble();

        System.out.println("Enter you math operator");
        char operator = scan.next().charAt(0);

        boolean hasValid = operator == '*' || operator == '/' ||
                operator == '+' || operator == '-' || operator == '%';
        if(hasValid){
            switch (operator){
                case '*':
                    System.out.println(n1*n2);
                    break;
                case '/':
                    System.out.println(n1/n2);
                    break;
                case '+':
                    System.out.println(n1+n2);
                    break;
                case '-':
                    System.out.println(n1-n2);
                    break;
                case '%':
                    System.out.println(n1%n2);
                    break;
            }
        }else {
            System.out.println("Invalid operator");
        }



    }
}
