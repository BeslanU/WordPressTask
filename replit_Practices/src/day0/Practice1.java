package day0;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {

        char[]a1 = {'A','B'};
        char[]a2 = {'C','D'};
        char[]a3 = new char[a1.length+a2.length];
        int index = 0;
        for (char each : a1){
            a3[index] = each;
            index++;
        }for (char each : a2){
            a3[index] = each;
            index++;
        }
        System.out.println(Arrays.toString(a3));

        System.out.println("=======================================");

        String[] b1 = {"Gigi","Alex","Cabal","Emkil"};
        String[] b2 = {"Joker"};


    }
}
