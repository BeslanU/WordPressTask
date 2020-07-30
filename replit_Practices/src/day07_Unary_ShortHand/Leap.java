package day07_Unary_ShortHand;

public class Leap {

    public static void main(String[] args) {

        double year = 2021;
        double result = year / 4;
        System.out.println(result);

        int n1 = 65;
        boolean a1 = n1 % 2 >= 0;
        boolean a2 = n1 % 3 <= 0;
        boolean a3 = n1 % 5 >= 0;

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        double p1 = 2020.00;
        boolean g1 = p1 % 2 == 0;

        System.out.println(g1);



    }
}
