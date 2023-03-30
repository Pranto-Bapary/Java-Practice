public class AddAmount {
    int amount = 50;
    AddAmount(){
        System.out.println("Balance : " + amount);
    }

    AddAmount(int moreAmount){
        amount += moreAmount;
        System.out.println(moreAmount + "$ is Deposited to Bank");
        System.out.println("The Current Balance is: " + amount);
    }

    public static void main(String[] args) {
        AddAmount piggieBank1 = new AddAmount();
        AddAmount piggieBank2 = new AddAmount(200);
    }
}
