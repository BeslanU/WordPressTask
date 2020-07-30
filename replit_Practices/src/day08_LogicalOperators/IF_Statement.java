package day08_LogicalOperators;

public class IF_Statement {

    public static void main(String[] args) {

        int a = 100;
        int b = 100;

        if(a >= b) {

            System.out.println(a + " is the larger number");

        }

        if(b == a){
            System.out.println(b + " is maximum number");
        }

        if(a == b){

            System.out.println("both equal number");
        }
    }
}
