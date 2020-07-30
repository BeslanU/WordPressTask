package day01;

import java.util.Scanner;

public class practice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        double version = 8.0;

        //Write your code here:
        if(version == 1.5){
            System.out.println("Cupcake");
        }else if(version == 1.6){
            System.out.println("Donut");
        }else if(version == 2.1){
            System.out.println("Eclair");
        }else if(version == 2.2){
            System.out.println("Floyo");
        }else if(version == 2.3){
            System.out.println("Gingerbread");
        }else if(version == 3.1) {
            System.out.println("Honeycomb");
        }else if(version == 4.0){
                System.out.println("Ice Cream Sandwich");
            }else if(version <= 4.1 || version == 4.3 ){
                System.out.println("Jelly Bean");
            }else if(version == 4.4){
                System.out.println("KitKat");
            }else if(version == 5.0 || version == 5.1){
                System.out.println("Lollipop");
            }else if(version == 8.0 || version == 8.1){
                System.out.println("Oreo");
            }else if(version == 9.0){

            }else{
                System.out.println("Sorry, i don't know this version");
            }

    }
    }






