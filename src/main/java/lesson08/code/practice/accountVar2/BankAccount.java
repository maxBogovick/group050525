package lesson08.code.practice.accountVar2;

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

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void printAccountInfo(){
        System.out.println("---------------------------------------------");
        System.out.println("Текущее состояние счета:");
        System.out.println("Номер счета: " + accountNumber);
        System.out.println("Владелец счета: " + accountHolder);
        System.out.println("Текущий остаток на счете: " + accountBalance);
        System.out.println("Ставка по депозиту: " + interestRate);

    }

}
