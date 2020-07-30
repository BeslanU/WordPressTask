package day31_Recap;

public class Methods_Practice {

    public static void main(String[] args) {
        max(50,75);
        int b = max2(15,99);
        System.out.println(max2(10,55));
    }

    public static void  max(int a,int b){
        int max = a > b ? a : b;
        System.out.println("max is: " + max);
    }
    public static int max2(int a,int b){
        return a > b ? a : b;

    }



}
