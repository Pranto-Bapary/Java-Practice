/*
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively.
'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'.
 Call this method by creating an object of each of the three classes.
 */

public abstract class Bankk {
    abstract int getBalance();
}

class BankA extends Bankk{
    int getBalance(){
        return 100;
    }
}

class BankB extends Bankk{
    int getBalance(){
        return 150;
    }
}

class BankC extends Bankk{
    int getBalance(){
        return 200;
    }
}

class BankTest{
    public static void main(String[] args) {
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        System.out.println("Bank A: " + bankA.getBalance());
        System.out.println("Bank B: " + bankB.getBalance());
        System.out.println("Bank C: " + bankC.getBalance());

    }
}