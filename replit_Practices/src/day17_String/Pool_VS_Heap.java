package day17_String;

public class Pool_VS_Heap {
    public static void main(String[] args) {
        String s1 = "Cybertek";
        String s2 = "Cybertek";
        String s3 = new String("Cybertek");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}













