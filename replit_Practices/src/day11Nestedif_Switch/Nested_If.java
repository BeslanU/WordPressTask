package day11Nestedif_Switch;

public class Nested_If {

    public static void main(String[] args) {

        int score = 10;
        String result = "";
        if(score >= 0 && score <= 100){
            if(score >= 90){
                result = "A";
            }else if(score >= 80 && score < 90){
                result = "B";
            }else if(score >= 70 && score < 80){
                result = "C";
            }else if(score >= 60 && score < 70){
                result = "D";
            }else {
                result = "F";
            }


        }else {
            result = "invalid";
        }
        System.out.println("Student score is: " +  result);
    }
}
