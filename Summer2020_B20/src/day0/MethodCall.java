package day0;

import java.util.Scanner;

public class MethodCall {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String  input = scan.nextLine();
        int giftCard = 100;
        if(input.equals("Smartphone")|| input.equals("Loptop")){
            System.out.println("Sorry, not enough funds on your gift card!");
        }else if(input.equals("Charger")){
            giftCard-=15.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 85$");
        }else if(input.equals("USB cable")){
            giftCard-=10.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 90$");
        }else if(input.equals("Headphones")){
            giftCard-=30.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 70$");
        }else if(input.equals("Pants")){
            giftCard-=50.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 50$");
        }else if(input.equals("Hat")){
            giftCard-=25.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 75$");
        }else if(input.equals("Socks")){
            giftCard-=5.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 95$");
        }else if(input.equals("Blanket")){
            giftCard-=60.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 40$");
        }else if(input.equals("Pillow")){
            giftCard-=40.00;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: 60$");
        }else {
            System.out.println("Invalid item!");
        }


    }

}
