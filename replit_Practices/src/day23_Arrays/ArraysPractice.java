package day23_Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] scores = {85, 70, 95, 90};
        String[] names ={"Mike", "Adam", "Tony", "Amy" };
        //System.out.println(names[0]+" score is: " + scores[0]);

        for(int i = 0; i <= 3; i++){
            System.out.println(names[i] + " : " + scores[i]);
        }

        System.out.println("==============================");

        String[] classmater = new String[5];
        classmater[0] = "First";
        classmater[1] = "Second";
        classmater[2] = "Third";
        classmater[3] = "Forth";
        classmater[4] = "Fifth";

        for (int i = 0; i <= 4; i++){
            System.out.println(classmater[i]);
        }
    }
}
