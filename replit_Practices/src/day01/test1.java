package day01;

import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;

public class test1 {

    public static void main(String[] args) {

        int num = -2;
        boolean positive = num > 0;
        boolean negative = num < 0;
        boolean equal = num == 0;

        String output = "";

        if(positive){
            System.out.println(num + " is positive");
        }else if(negative){
            System.out.println(num + " is negative");
        }else{
            System.out.println(num + " is equal to zero");
        }

        int num1 = 9;

        if(num++ ==10){
            System.out.println("Hello world " + num);

        }else {
            System.out.println("Hello unioverse " + num);
        }
        boolean a = true, b = !false;
        if(b){
            System.out.println("B");
        }else if(a){
            System.out.println("A");
        }

        float f1 = (12345.1 > 12345.0) ?  12456 : 12456.02f;
        float f2 = f1 + 1024;
        System.out.println(f2);



    }
}
