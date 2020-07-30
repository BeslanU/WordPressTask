package day30_CustomMethods;

import java.util.Arrays;

public class WarmUpTask {

    public static void main(String[] args) {
        maxNum(15,15);
        int arr[]={1,2,3,4,5,6,7,8,9,5,5,4,2,3,4};
        printDesc(arr);

        int[] a1 = {1,2,3,4,56,8};
        int[] a2 = {5,4,2,2,5,4,8,6,};
        combine2Arr(a1,a2);

        PosNegZero(100);

        System.out.println("=======================");

        int[] a3 = {12,157,0,-221,1123,-38,0};

        for (int each : a3){
            PosNegZero(each);
        }
    }

    public static void maxNum(int a,int b){
        if (a==b){
            System.out.println("Equal");
            return;
        }
        if (a>b){
            System.out.println(a+" is max");
        }else {
            System.out.println(b+" is max");
        }

    }

    public static void printDesc(int[] arr){
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--){

            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }

    public static void combine2Arr(int[] arr1,int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0;
        for (int each : arr1){
            arr3[i] = each;
            i++;
        }
        for (int each : arr2) {
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));
    }

    public static void PosNegZero(int num){
        if(num > 0){
            System.out.println(num + " is positive");
        }else if(num < 0){
            System.out.println(num + " is negative");
        }else {
            System.out.println(num + " is zero");
        }
    }

}
