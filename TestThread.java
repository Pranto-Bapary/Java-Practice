class ThreadDemo1 extends Thread{
    private String name;
    ThreadDemo1(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Thread " + name + " is running");
        for(int i = 0; i < 10; i++){
            System.out.println("Thread " + name +" " + i);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class ThreadDemo2 extends Thread{
    private String name;
    ThreadDemo2(String name){
        this.name = name;
    }
    public void run(){
        System.out.println("Thread " + name + " is running");
        for(int i = 0; i < 10; i++){
            System.out.println("Thread " + name +" " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class TestThread{
    public static void main(String[] args) {
        ThreadDemo1 th1 = new ThreadDemo1("Pranto");
        ThreadDemo2 th2 = new ThreadDemo2("Bapary");
        th1.start();
        th2.start();
    }
}