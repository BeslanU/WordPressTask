package day16_String;

import java.util.Scanner;

public class SupString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str3 = "I like Pepsi";
        String drink = str3.substring(16);
        System.out.println(drink);

        String action = str3.substring(11, 16);
        System.out.println(action);


    }
}
