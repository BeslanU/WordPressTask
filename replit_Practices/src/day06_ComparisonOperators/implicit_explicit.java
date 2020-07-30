package day06_ComparisonOperators;

public class implicit_explicit {
    public static void main(String[] args) {

        short s1 = 100;
        long l1 = s1;
        long l2 = (short)s1;
        System.out.println(s1);
        System.out.println("============================");

        double d1 = 400.66666;
        int i1 = (int)d1;
        long d2 = (long)i1;
        System.out.println(i1 + d1);
        System.out.println(d2 / 2);

        System.out.println("Process finished with exit code 0");
    }
}
