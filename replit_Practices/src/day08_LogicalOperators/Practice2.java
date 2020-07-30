package day08_LogicalOperators;

public class Practice2 {
    public static void main(String[] args) {

     int age = 12;
     String citizen = "USA";
     String  citizen2 = "Canada";
     boolean eligibleAge = age >=18;
     boolean usCitizen = citizen == "USA" || citizen2 == "USA";
     boolean eligibleToVote = eligibleAge && usCitizen;

        System.out.println();


    }
}
