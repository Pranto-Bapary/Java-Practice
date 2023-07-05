/*
Write a Java program to create an abstract class ‘BankAccount’ with abstract methods deposit() and withdraw() and
a non-abstract method CheckBalance(). Create subclasses: ‘SavingsAccount’ and ‘CurrentAccount’ that inherit the
‘BankAccount’ class and implement the respective methods to handle deposits and withdrawals for each account type.
Also create an object with a name ‘Mr. A’ to check his balance using the particular method.
*/

public abstract class BankAccount {

    int balance = 100;
    int cBalance = 0;
    abstract void deposite(int amount);
    abstract void withdraw(int amount);
    void checkBalance(){
        System.out.println("Current balance is : Taka " + balance);
    }
}

class SavingsAccount extends BankAccount{
    void deposite(int amount){
        balance += amount;
        System.out.println(amount + " Taka has been deposited successfully");
    }

    void withdraw(int amount){
        balance -= amount;
        System.out.println(amount + " Taka has been withdrawn");
    }

    void checkBalance(){
        System.out.println("Savings Account Current Balance: Taka " + balance);
    }
}

class CurrentAccount extends BankAccount{
    void deposite(int amount){
        cBalance += amount;
        System.out.println("\n" + amount + " Taka has been deposited successfully");
    }

    void withdraw(int amount){
        cBalance -= amount;
        System.out.println(amount + " Taka has been withdrawn");
    }

    void checkBalance(){
        System.out.println("Current Account Current Balance: Taka " + cBalance);
    }
}

class TestBankAccount{
    public static void main(String[] args) {

        SavingsAccount sAccount = new SavingsAccount();
        CurrentAccount cAccount = new CurrentAccount();

        sAccount.deposite(200);
        sAccount.withdraw(50);
        sAccount.checkBalance();

        cAccount.deposite(200);
        cAccount.withdraw(50);
        cAccount.checkBalance();

    }
}
