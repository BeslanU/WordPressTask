package day29_CustomMethods;



public class MethodsWithParameter {

    public static void main(String[] args) {

        printHello(3);
        age(1959);

    }

    public static void printHello(int n){
        for (int i = 0; i < n ; i++){
            System.out.print("Hello World");
        }
        System.out.println();
    }

    public static void age(int q){
        int age = 2020 - q;
        System.out.println("You are " + age + "y.o");
    }

}
