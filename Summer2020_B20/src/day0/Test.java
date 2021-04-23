package day0;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
         int CANDY_PRICE = 10;
         int GUM_PRICE = 3;
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
         if (coupons>2){
    int candyAV = coupons/CANDY_PRICE;
    int gumAV = (coupons%CANDY_PRICE)/GUM_PRICE;
    int couponLeft = (coupons%CANDY_PRICE)%GUM_PRICE;
    System.out.println("Number of Candies: "+candyAV);
    System.out.println("Number of Gumballs: "+gumAV);
        }else {
             System.out.println("Not enough coupons");
        }



    }


}

