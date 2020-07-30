package day16_String;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first name");

        String word = scan.next();
        char firsChar = word.charAt(0);
        char lastChar = word.charAt(word.length() - 1);
        //System.out.println(firsChar == lastChar);
        if(firsChar == lastChar){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}
