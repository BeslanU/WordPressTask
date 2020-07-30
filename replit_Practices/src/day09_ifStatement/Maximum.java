package day09_ifStatement;

public class Maximum {

    public static void main(String[] args) {

        double a = 500;
        double b = 200;
        double c = 1000;

        boolean aisMax = a > b && a > c;

        boolean bisMax = b > a && b > c;

        boolean cisMax = c > a && c > b;

        if(aisMax){
            System.out.println(a);
        }
        if(bisMax){
            System.out.println(b);
        }
        if(cisMax){
            System.out.println(c);
        }





    }
}
