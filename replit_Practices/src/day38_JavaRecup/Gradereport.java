package day38_JavaRecup;

import java.util.ArrayList;
import java.util.Arrays;

public class Gradereport {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(100,95,90,85,80,75,70,65,60,55,50,45,40,35,30,25,20,15,10));

        ArrayList<Integer> gradeA = new ArrayList<>();
        gradeA.addAll(list);
        gradeA.removeIf( each -> each<90);
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();
        gradeB.addAll(list);
        gradeB.removeIf( each -> each<80 || each>89);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();
        gradeC.addAll(list);
        gradeC.removeIf( each -> each<70 || each>79);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();
        gradeD.addAll(list);
        gradeD.removeIf( each -> each<60 || each>69);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeF = new ArrayList<>();
        gradeF.addAll(list);
        gradeF.removeIf(p -> p>59);
        System.out.println("Grade F " + gradeF);

        System.out.println(gradeA.size()+ " students make A"  );


    }
}
