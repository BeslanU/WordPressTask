package day06_ComparisonOperators;

public class salaryCalculatetoe {

    public static void main(String[] args) {

        double rate = 89;
        double stateTaxRate = 0.09;
        double federalTaxRate = 0.22;
        int weeklyHours = 50;

        double salary = rate * weeklyHours * 48;

        System.out.println("Salary is: " + salary + "$" );
        double totaltax = salary * (stateTaxRate + federalTaxRate);
        System.out.println("Total tax is: " + totaltax + "$");

        double afterTax = salary - totaltax;
        System.out.println("Take home: " + afterTax + "$");


    }

}
