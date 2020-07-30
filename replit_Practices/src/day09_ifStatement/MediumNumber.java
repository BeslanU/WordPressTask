package day09_ifStatement;

public class MediumNumber {

    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;

        boolean aisMed = (a > b && a < c) || (a > c && a < b);
        boolean bisMed = (b < a && b > c) || (b < c && b > a);
        boolean cisMid = !aisMed && !bisMed;

        double Medium = 0;
        if(aisMed){
            Medium = a;
        }
        if(bisMed){
            Medium = b;
        }
        if(cisMid){
            Medium = c;
        }

        System.out.println(Medium + " is medium number");
    }
}
