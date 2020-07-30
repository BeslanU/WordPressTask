package day09_ifStatement;

public class Minimun {

    public static void main(String[] args) {

        double a = 100;
        double b = 200;
        double c = 300;

        boolean aisMin = a < b && a < c;
        boolean bisMin = aisMin == false && b < c;               //b < a && b < c;
        boolean cisMin = !aisMin && !bisMin;

        double min = 0;

        if(aisMin){
            min = a;
        }
        if(bisMin){
            min = b;
        }
        if(cisMin){
            min = c;
        }
        System.out.println(min);


    }
}
