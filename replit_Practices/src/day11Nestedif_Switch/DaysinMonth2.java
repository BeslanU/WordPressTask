package day11Nestedif_Switch;

public class DaysinMonth2 {

    public static void main(String[] args) {

        int month = 1;
        boolean validNumber = month >= 1 && month <= 12;
        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;


        String  result = "";
        if(validNumber){
            if(days28){
                result = "28 days";
            }else if(days30){
                result = "30 days";
            }else
                result = "31 days";


        }else {
            result ="Invalid month";
        }

        System.out.println(result);



     }
}
