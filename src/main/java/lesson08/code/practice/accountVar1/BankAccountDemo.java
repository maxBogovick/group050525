package lesson08.code.practice.accountVar1;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123-456-789","Ruslan",1215,2.5);

        account.printAccountInfo();

        double interest = account.calculateInterest(7);

        System.out.println("За 7 месяцев мы получим доход: " + interest);

        account.deposit(25000);

        interest = account.calculateInterest(7);

        System.out.println("За 7 месяцев мы получим доход: " + interest);

        account.withdraw(12000);

        account.printAccountInfo();
    }
}
