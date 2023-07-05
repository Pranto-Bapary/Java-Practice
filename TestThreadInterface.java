import static java.lang.Thread.sleep;

class Aa implements Runnable{
    public void run(){
        System.out.println("Hello I'm Aa Running....");
        for(int i = 0; i < 10; i++){
            System.out.println("Thread Aa: " +  i);
            try {
                sleep(500);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

class Bb implements Runnable{
    public void run(){
        System.out.println("Hello I'm Bb Running....");
        for(int i = 0; i < 10; i++){
            System.out.println("Thread Bb: " +  i);
            try {
                sleep(800);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
public class TestThreadInterface {
    public static void main(String[] args) {
        Aa th1 = new Aa();
        Bb th2 = new Bb();

        Thread t1 = new Thread(th1);
        Thread t2 = new Thread(th2);

        t1.start();
        t2.start();
    }
}
