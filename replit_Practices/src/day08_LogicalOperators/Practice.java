package day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {

        String  firstName = "Beslan";
        String lastName = "Uruzbiyev!";
        int age = 18;
        String citizenship = "USA";
        boolean eligibleToVote = age >= 17 && citizenship == "USA";

        String fullName = firstName + " " + lastName;
        System.out.println(fullName + " is eligible to vote after 18 years old; " + eligibleToVote);
    }
}
