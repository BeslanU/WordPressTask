package day05_AriphmeticsOperations;

public class Empoyee_Info2 {


    public static void main(String[] args) {



    String firstName = "John";
    String lasttName = "Daniel'";
    char gender = 'M';
    int age = 30;
    String companyName = "CapitalOne";
    String jobTitle = "SDET";
    boolean isFulltime = true;
    boolean isMarried = false;
    double salary = 120000.50;
    String fullName = firstName + " " + lasttName;


        System.out.println("Employee' full name is: " + firstName + " " + lasttName);
        System.out.println(fullName + " gender is: " + gender);
        System.out.println("John Daniel' age is: " + age);
        System.out.println("John Daniel' works at: " + companyName);
        System.out.println("John Daniel' job title is: " + jobTitle);
        System.out.println("is John Daniel'  full time worker: " + isFulltime);
        System.out.println("is John Daniel' married: " + isMarried );
        System.out.println("John Daniel' salary: " + salary);


    }


}
