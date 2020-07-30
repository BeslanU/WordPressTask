package day15_String;

import java.util.Scanner;

public class Wormup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any sentence ");
        String sentence = scan.nextLine();

        int lastIndex = sentence.length() - 1;

        System.out.println(" " + sentence.charAt(0) + sentence.charAt(lastIndex));





    }
}
