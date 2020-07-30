package day12_Switch_Scanner;

public class BiggerNumber {

    public static void main(String[] args) {

        double n1 = 1001;
        double n2 = 200;
        double n3 = 300;

        boolean n1Bigger = n1 > n2 && n1 > n3;

        boolean n2Bigger = n1Bigger == false && n2 > n3;
        // n3 > n1 && n3 > n2;
/*
        String result = "";

         if(n1Bigger){
                result = "n1 is bigger";
        }else if(n2Bigger){
               result = "n2 is bigger";
        }else {
              result = "n3 is bigger";
        }
 */

        String  result = (n1Bigger) ? "n1 is Bigger" : (n2Bigger) ? "n2 is Bigger" : "n3 is bigger" ;


        System.out.println(result);

    }
}
