package day40CustomClassPractice;

public class BankAccount {

    String accountType;
    String accountHolder;
    String accountNumber;
    double balance;

    public void setAccountInfo(String clientAccountType,String name,String accNum){
        accountType = clientAccountType;
        accountHolder = name;
        accountNumber = accNum;
    }

    public void getAccountIfo(){
        System.out.println("==========================");
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Balance: "+balance);
        System.out.println("==========================");
    }

    public void checkBalance(){
        System.out.println("Available balance " +balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing: $" +amount+ " to " +accountNumber);
    }

    public void withDraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing: $" +amount);

    }

}
