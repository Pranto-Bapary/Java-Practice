abstract class X{
    public X(){
        System.out.println("One");
    }

    abstract void abstractMethod();
}

class Y extends X{
    public Y(){
        System.out.println("Two");
    }

    void abstractMethod(){
        System.out.println("Three");
    }
}

public class AbstractOutput {
    public static void main(String[] args) {
        Y y = new Y();
        y.abstractMethod();
    }
}
