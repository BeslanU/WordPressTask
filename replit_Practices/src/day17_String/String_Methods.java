package day17_String;

public class String_Methods {
    public static void main(String[] args) {
        String str = "Cybertek";
        char c1 = str.charAt(0);
        System.out.println("First charakter is: " + c1);
        char c2 = str.charAt(1);
        System.out.println("Second character is: " + c2);

        String str2 = "Cebertek";
        str2 = str2 + "School";
        System.out.println(str2);
        String str3 = "Ceberteklololo";
        int l = str3.length();
        System.out.println(l);
        char ch2 = str3.charAt(l - 1);

        System.out.println(ch2);

        String str4 = "CYBERTEK";
        str4 = str4.toLowerCase();
        System.out.println(str4);
        String str6 = "   Cybertek   ";
        System.out.println(str6);
        str6 = str6.trim();
        System.out.println(str6);
        String str7 = " I like Java Language";
        String word = str7.substring(8,12 + 1);
        System.out.println(word);
        String word2 = str7.substring(13, str7.length() );
        System.out.println(word2);

        String str8 = "Hello batch 20 Have a wonderful day Epta";
        int i1 =str8.indexOf("E");
        System.out.println(i1);
        System.out.println(str8.charAt(36));


    }
}
