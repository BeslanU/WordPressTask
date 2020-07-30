package day01;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectName = scan.nextLine();
        String score = scan.nextLine();
        System.out.println("Please enter subject name number 2 and score for this subject");
        String subjectName2 = scan.nextLine();
        String score2 = scan.nextLine();
        System.out.println("Please enter subject name number 3 and score for this subject");
        String subjectName3 = scan.nextLine();
        String score3 = scan.nextLine();
        System.out.println("Please enter subject name number 4 and score for this subject");
        String subjectName4 = scan.nextLine();
        String score4 = scan.nextLine();
        System.out.println("Please enter subject name number 5 and score for this subject");
        String subjectName5 = scan.nextLine();
        String score5 = scan.nextLine();

        System.out.println("Summary: " + subjectName + score + "," + subjectName2 + score2 + "," + subjectName3 + score3 + "," + subjectName4 + score4 + "," + subjectName5 + score5);
        System.out.println("Welcome to the Grader!");
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");

    }
}
