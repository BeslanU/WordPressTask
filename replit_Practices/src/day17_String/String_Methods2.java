package day17_String;

import com.sun.media.jfxmediaimpl.HostUtils;

public class String_Methods2 {
    public static void main(String[] args) {

        String  s1 = "Cat";
        String  s2 = new String("Cat");
        String  s3 = new String("Cat");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));
        String s4 = "java";
        String s5 = "Java";
        System.out.println(s4.equalsIgnoreCase(s5));
        System.out.println("=============================");

        String str = " ";
        String str1 = str.trim();
        System.out.println(str1.isEmpty());

        System.out.println("==============================");

        String str2 = "Java, C#, Python, Ruby, C++";
        System.out.println(str2.contains("Java"));


    }
}
