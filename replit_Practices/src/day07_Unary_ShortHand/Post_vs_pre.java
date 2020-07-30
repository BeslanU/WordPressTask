package day07_Unary_ShortHand;

public class Post_vs_pre {
    public static void main(String[] args) {

        int a = 10;
        System.out.println( ++a ); //11
        System.out.println(a); //a = 11

        System.out.println("===================");

        int b = 10;
        System.out.println(b++);
        System.out.println(b);

        System.out.println("++++++++++++++++++++");

        int c = 25;
        int d = c++;
        System.out.println(d);
        int e = 25;
        ++e;
        e++;
        System.out.println(e);

        System.out.println("======================");

        int a1 = 1;
        a1 = -a-- + a++ / -a-- * --a1;
        System.out.println("============================");

        int b1 = 200;
        b1 += 100;

        int g1 = 216;
        g1 %= 4;
        System.out.println(g1);

    }
}
