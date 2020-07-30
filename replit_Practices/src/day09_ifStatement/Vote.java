package day09_ifStatement;

public class Vote {

    public static void main(String[] args) {

        int age = 17;
        boolean usCit = true;

        if(age >= 18 && usCit){
            System.out.println("Eligible Vote for Trump");
        }
        else{
            System.out.println("Not Eligible Vote for Trump");
        }

    }
}
