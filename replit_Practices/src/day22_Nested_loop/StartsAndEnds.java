package day22_Nested_loop;

import java.util.Scanner;

public class StartsAndEnds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = scan.next();
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);
        boolean start = ch1 >= 'A' && ch1 <= 'Z';
        boolean finish = ch2 >= 'a' && ch2 <= 'z';
        System.out.println(start && finish);
    }
}
