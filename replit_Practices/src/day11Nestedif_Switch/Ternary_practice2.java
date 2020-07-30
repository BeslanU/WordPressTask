package day11Nestedif_Switch;

public class Ternary_practice2 {
    public static void main(String[] args) {

        int num = -5;
        String result = "";

        String result2 = (num > 0) ? num + " Positive number" : (num < 0) ? num + " negative number" : num + " is Zero";
        System.out.println(result2);

        System.out.println("======================");

        int a = 10;
        int b = 20;

        String r = (a > b) ? " a is greater" : (b > a) ? " b is greater" : " a is equal to b ";

        System.out.println(r);


    }
}
