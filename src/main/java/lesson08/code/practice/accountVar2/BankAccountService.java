package lesson08.code.practice.accountVar2;

public class BankAccountService {


    public double calculateInterest(int months, BankAccount currentAccount){
        double calculatedInterest = currentAccount.getAccountBalance() * currentAccount.getInterestRate() / 100 / 12 * months;
        return calculatedInterest;
    }

    public void deposit(int amount, BankAccount currentAccount){

        double currentAccountBalance = currentAccount.getAccountBalance();

        currentAccount.setAccountBalance(currentAccountBalance + amount);
    }

    public void withdraw(int amount, BankAccount currentAccount){
        double currentAccountBalance = currentAccount.getAccountBalance();

        currentAccount.setAccountBalance(currentAccountBalance - amount);
    }

}
