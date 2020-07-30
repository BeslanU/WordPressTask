package day23_Arrays;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Enter two numbers");
            double num1  = input.nextDouble();
            double num2 = input.nextDouble();
            System.out.println("Enter math operator");
            char ch = input.next().charAt(0);

            /*double result = (ch == '+')? num1+num2 :(ch == '-')? num1-num2 :
                        (ch == '*')? num1*num2 :(ch == '/')? num1/num2 :
                                (ch == '%')? num1%num2 : 0;

             */

            switch (ch){
                case '+':
                    System.out.println(num1+num2);
                    break;
                case '-':
                    System.out.println(num1-num2);
                    break;
                case  '*':
                    System.out.println(num1*num2);
                    break;
                case '/':
                    System.out.println(num1/num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                default:
                    System.out.println("Invalid operator");


            }


            System.out.println("Do you want to continue?");
            String a = input.next().toLowerCase();
            while (!a.equals("yes")|| a.equals("no")){
                System.out.println("Invalid answer");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }
            if (a.equals("no")){
                System.out.println("no");
            }
            System.out.println("Thanks for using calculator");
        }
    }
}
