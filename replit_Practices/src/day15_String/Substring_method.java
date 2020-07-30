package day15_String;

public class Substring_method {
    public static void main(String[] args) {

        String sentence = "Java is fun";
        //                 0123456789....
        String word = sentence.substring(0 , 4);

        System.out.println(word);

        String word2 = sentence.substring(5,8);
        System.out.println(word2);

        String word3 = sentence.substring(8,11);
        System.out.println(word3);

        System.out.println("======================================");


        String sentence2 = " i like Movies and TV series ";
        String word4 = sentence2.substring(8 , 14);
        System.out.println(word4);

        String word5 = sentence2.substring(1, 7);
        System.out.println(word5);

        System.out.println("======================================");
        String fullName = "MUHTAR-TATAR";
        String firstChar = fullName.substring(0,1);
        String rest = fullName.substring(1,fullName.length());
        System.out.println(firstChar);
        System.out.println(rest);
        System.out.println("=========================================");

        String lastName = "GeMiNiTaRs";
        String firstChar1 = lastName.substring(0,1);
        String restChar = lastName.substring(1);
        lastName = firstChar1.toUpperCase() + restChar.toLowerCase();

        System.out.println(lastName);

        System.out.println("=======================================");

        String  s = "I like Braking bad";
        String  series = s.substring(7);
        System.out.println(series);




    }

}
