package day09_ifStatement;

public class Breaks {

    public static void main(String[] args) {

        String  ItsBreakTime = "Yes";
        String ItsNotBreakTime = "No";

        if(ItsNotBreakTime == "Yes"){
            System.out.println("Take 15 min break");
        }else{
            System.out.println("Continue the class");
        }

        System.out.println("=============================");

        int a = 300;
        int b = 700;

        if( a > b ){

            System.out.println(a + " Is greater");

        }

        
        else {
            System.out.println(b + " Is greater");
        }



    }
}
