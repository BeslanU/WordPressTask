package day09_ifStatement;

public class Alcohol {

    public static void main(String[] args) {

        boolean hasID = true;
        int age = 19;

        boolean eligible = hasID && age >= 21;

        if(eligible == true){

            System.out.println("Eligigble to buy alcohol");

        }

        if(eligible == false);{

            System.out.println("You buy your milk");

        }

    }
}
