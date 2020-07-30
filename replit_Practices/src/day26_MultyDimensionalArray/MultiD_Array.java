package day26_MultyDimensionalArray;

import java.util.Arrays;

public class MultiD_Array {
    public static void main(String[] args) {
        char[] ch1 = {'A','B'};
        char[] ch2 = {'C','D','E'};
        char[] ch3 = {'F','G','H'};

        char[][] ch2D = { {'A','B'},{'C','D','E'},{'F','G','H'} };
        System.out.println(Arrays.toString(ch2D[2]));
        System.out.println("==============================");

        int[][] num = { {1,2,3} , {4} , {5,6} , {7,8,9,10} };

        for (int i = 0; i <= num.length-1; i++){
            System.out.println(Arrays.toString(num[i]));
        }
        System.out.println(Arrays.deepToString(num));


    }
}
