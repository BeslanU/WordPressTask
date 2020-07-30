package day12_Switch_Scanner;

import java.util.Scanner;

public class RateCulculater {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week ");
        int hours = input.nextInt();
        int totalHours = hours * 52;
        double hourlyrate = salary / totalHours;
        System.out.println("Yor hourly rate is " + hourlyrate +  " $");


    }
}


