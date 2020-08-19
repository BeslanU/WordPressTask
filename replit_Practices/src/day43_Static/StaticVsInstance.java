package day43_Static;

public class StaticVsInstance {
    static int staticVariable;
    int instanceVariable;

    public static void main(String[] args) {
        StaticVsInstance ob1 = new StaticVsInstance();
        ob1.instanceVariable = 100;
        ob1.staticVariable = 500;
        StaticVsInstance ob2 = new StaticVsInstance();
        ob2.instanceVariable = 200;
        ob2.staticVariable = 400;
        System.out.println(ob1.instanceVariable);
        System.out.println(ob2.instanceVariable);

        System.out.println("===============================");
        System.out.println(ob1.staticVariable);
        System.out.println(ob2.staticVariable);




    }

}
