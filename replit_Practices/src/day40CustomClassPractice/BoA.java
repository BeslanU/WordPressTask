package day40CustomClassPractice;

public class BoA {
    public static void main(String[] args) {
        BankAccount Beslan = new BankAccount();
        Beslan.setAccountInfo("Saving","Beslan Uruzbiyev", "58974131");
        Beslan.getAccountIfo();
        Beslan.deposit(1000);
        Beslan.checkBalance();
        Beslan.withDraw(750);
        Beslan.checkBalance();
    }
}
