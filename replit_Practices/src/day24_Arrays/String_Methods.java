package day24_Arrays;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        String str = "ABCDEFGH";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("=============================");

        String str1 = "BCDAEAGASDG";
        String str2 = "ASSAWRGBVXA";

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        boolean r1 = Arrays.equals(ch1,ch2);
        System.out.println(r1);
    }
}
