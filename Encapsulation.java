class Account{
    private String name;
    private int acc_no;
    private float amount;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAccount(){
        return acc_no;
    }

    public void setAccount(int account){
        this.acc_no = account;
    }

    public float getAmount(){
        return amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Account acc = new Account();

        acc.setName("Pranto");
        acc.setAccount(123456);
        acc.setAmount(120000.00f);

        System.out.println("Name: " + acc.getName());
        System.out.println("Account No: " + acc.getAccount());
        System.out.println("Amount: " + acc.getAmount());
    }
}
