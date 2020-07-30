package day33_LocalDateTime;

import java.util.Arrays;

public class Calculate {

    public static void main(String[] args) {
       int a = 10;
       double b = 20;

        System.out.println(addition(a,(int)b));

        float num1 = 10;
        float num2 = 9;
        System.out.println(addition(num1, num2));

        int[] arr1 = {4,8,5,6,4,4,2};
        Arrays.sort(arr1);
        char[] arr2 = {'A','G','Y','B'};
        Arrays.sort(arr2);




    }

    public static int addition(int a, int b){

        return  a + b;
    }
    public static double addition(double a,double b){

        return  a + b;
    }

}
