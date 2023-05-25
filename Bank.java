public abstract class Bank {
    abstract int getBalance(int amount);
}

class BankA extends Bank{
    int getBalance(int amount){
        int balance = 0;
        balance += amount;
        return balance;
    }
}

class BankB extends Bank{
    int getBalance(int amount){
        int balance = 0;
        balance += amount;
        return balance;
    }
}

class BankC extends Bank{
    int getBalance(int amount){
        int balance = 0;
        balance += amount;
        return balance;
    }
}

class BankTest{
    public static void main(String[] args) {
        BankA  bankA = new BankA();
        System.out.println("Deposited $" + bankA.getBalance(100));

        BankB bankB = new BankB();
        System.out.println("Deposited $" + bankB.getBalance(150));

        BankC  bankC = new BankC();
        System.out.println("Deposited $" + bankC.getBalance(100));
    }
}