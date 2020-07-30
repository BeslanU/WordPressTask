package day29_CustomMethods;

public class EligibilityToVote {

    public static void main(String[] args) {
        vote("Jhon", 28, true, "Trump");
        vote("Daniel", 17,true, "Kanye");
    }

    public static void vote(String name,int age,boolean citizen, String presidentName){
        boolean eligibletoVote = age >= 18 && citizen == true;
        if (eligibletoVote){
            System.out.println(name+ " eligible to vote for" + presidentName);

        }else {
            System.out.println(name + " Not eligible to vote");
        }
    }


}
