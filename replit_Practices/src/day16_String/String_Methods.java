package day16_String;

public class String_Methods {
    public static void main(String[] args) {
        String email = "cybertek@gmail.com";
        String newEmail = email.replace("gmail", "yahoo");
        System.out.println(newEmail);

        String sentence = "I like Java, Java is cool, Java is fun";
        sentence = sentence.replace("a, Java", "a, C#");
        sentence = sentence.replace(" Java "," Pyton ");
        System.out.println(sentence);
        System.out.println("===============================================");

        String s1 = "I live in CITY and living at STREET"; // MIT
        s1 = s1.replace("CITY", "New York");
        s1 = s1.replace("STREET", "Main street");
        System.out.println(s1);


    }
}
