package day06_ComparisonOperators;

public class Swap1 {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        b = a;
        a = b;

        int c = b;

        b = a;
        a = c;

        System.out.println( a );
        System.out.println( b );

    }
}
