package day22_Nested_loop;

import java.util.Scanner;

public class OccurancesOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char cg = scan.next().charAt(0);
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++){
            char each = str.charAt(i);
            if (each == cg){
                count +=1;
            }
        }
    }
}
