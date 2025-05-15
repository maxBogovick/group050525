package lesson08.code.practice.accountVar1;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double accountBalance;
    private double interestRate;

    public BankAccount(String accountNumber, String accountHolder, double accountBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.interestRate = interestRate;
    }

    public double calculateInterest(int months){
        double calculatedInterest = accountBalance * interestRate / 100 / 12 * months;
        return calculatedInterest;
    }

    public void printAccountInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("Текущее состояние счета:");
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Владелец счета: " + accountHolder);
        System.out.println("Текущий остаток на счете: " + accountBalance);
        System.out.println("Ставка по депозиту: " + interestRate);

    }

    public void deposit(int amount){
        accountBalance = accountBalance + amount;
    }

    public void withdraw(int amount){
        accountBalance = accountBalance - amount;
    }

}
