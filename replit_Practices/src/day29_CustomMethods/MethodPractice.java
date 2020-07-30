package day29_CustomMethods;

public class MethodPractice {

    public static void main(String[] args) {

        oddNumbers();
        System.out.println("Hello");
        oddNumbers();
        System.out.println("Hello");

        evenNumbers();
        System.out.println("Hello");
        evenNumbers();
        System.out.println("Hello");

    }
    public static void oddNumbers(){
        for (int i = 1; i <= 100; i +=2){
            System.out.print(i+ " ");
        }
        System.out.println();


    }
    public static void evenNumbers(){
        for (int i = 2; i <= 100; i +=2){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
