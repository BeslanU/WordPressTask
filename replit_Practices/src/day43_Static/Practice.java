package day43_Static;

public class Practice {

    public static void main(String[] args) {
        ClassA objA = new ClassA();
        ClassA objA2 = new ClassA();
        objA.a = 1;
        objA2.a = 2;
        objA.b = 3;
        objA2.b = 4;
        ClassA.c = 5;
        ClassA.c = 6;
        System.out.println("objA.a=" + objA.a);
        System.out.println("objA2.a=" + objA2.a);
        System.out.println("objA.b=" + objA.b);
        System.out.println("objA2.b=" + objA2.b);
        System.out.println("objA.c=" + ClassA.c);
        System.out.println("objA2.c=" + ClassA.c);
    }

}
