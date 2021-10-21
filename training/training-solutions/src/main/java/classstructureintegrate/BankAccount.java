package classstructureintegrate;

public class BankAccount {

    private int accountNumber;
    private String owner;
    private int balance;

    public BankAccount(int accountNumber, String owner, int balance){
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount){
        balance = balance + amount;
    }

    public void withdraw(int amount){
        balance = balance - amount;
    }

    public String getInfo(){
        return owner + " (" + accountNumber + ") " + balance + "Ft.";
    }
}
