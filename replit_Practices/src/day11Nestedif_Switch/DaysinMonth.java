package day11Nestedif_Switch;

public class DaysinMonth {

    public static void main(String[] args) {

        int month = 9;
        boolean days28 = month == 2;

        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month < 1 || month > 12;

        String word = "";

        if(days28){
            word = "28 days";
        }else if(days30){
            word = "30 days";
        }else if (invalid){
            word = "invalid";
        }else{
            word = "31 days";
        }

        System.out.println(word);

    }
}
