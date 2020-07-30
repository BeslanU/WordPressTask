package day04_Variable;

import com.sun.org.apache.xpath.internal.objects.XString;

public class Variable_String {

    public static void main(String[] args) {

        String employeName = "Beslan";
        int employeID = 251992;
        double salary = 127_000.00;
        String jobTitle = "SDET";
        char gender = 'M';
        boolean isFulltime = true;

        System.out.println("Employe Name: " + employeName);
        System.out.println("Employe ID: " + employeID);
        System.out.println("Salary: " + salary);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Gender: " + gender);
        System.out.println("Full Time: " + isFulltime);
        System.out.println((char)27 + "[33mYELLOW");

    }

}
