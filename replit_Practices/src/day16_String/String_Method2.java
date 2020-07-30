package day16_String;

public class String_Method2 {

    public static void main(String[] args) {
        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String nam2 = "";
        System.out.println(nam2.isEmpty());

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 + str2);
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String key = "JAVA";
        String key2 = "java";
        System.out.println(key == key);

    }
}
