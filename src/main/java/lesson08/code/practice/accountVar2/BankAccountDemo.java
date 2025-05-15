package lesson08.code.practice.accountVar2;

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount myAccount = new BankAccount("123-456-789","Ruslan",1215,2.5);

        myAccount.printAccountInfo();


        BankAccountService myService = new BankAccountService();

        double interest = myService.calculateInterest(7, myAccount);

        System.out.println("За 7 месяцев мы получим доход: " + interest);

        myService.deposit(25000,myAccount);

        interest = myService.calculateInterest(7, myAccount);

        System.out.println("За 7 месяцев мы получим доход: " + interest);

        myService.withdraw(12000,myAccount);

        myAccount.printAccountInfo();
    }
}
