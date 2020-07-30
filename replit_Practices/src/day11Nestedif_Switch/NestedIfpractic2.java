package day11Nestedif_Switch;

public class NestedIfpractic2 {
    public static void main(String[] args) {

        double salary = 20000.0;
        double jobHistory = 10;

        if(salary >= 30000){
            if(jobHistory >= 2){
                System.out.println("You are qualified");
            }else
                System.out.println("You must have been on job at least 2 years");

        }else {
            System.out.println("You must earn at least $30K");
        }


    }
}
