class AdditionThread extends Thread{
    private int sum = 0;
    public void run(){
        for (int i = 0; i < 10; i++){
            sum += i;
            System.out.println("Sum: " + sum);
            try {
                sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class MultiplicationThread extends Thread{
    private int mul = 1;
    public void run(){
        for(int i = 1; i < 10; i++){
            mul *= i;
            System.out.println("Multiplication: " + mul);
            try {
                sleep(900);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class ThreadPriority extends Thread
{
    public static void main (String[]args)
    {
        AdditionThread add = new AdditionThread();
        MultiplicationThread mul = new MultiplicationThread();

        System.out.println(add.getPriority());
        System.out.println(mul.getPriority());

        mul.setPriority(4); //less value more priority in thread
        add.setPriority(7);

        System.out.println(add.getPriority());
        System.out.println(mul.getPriority());

        add.start();
        mul.start();


    }
}