abstract public class Abstra {
    Abstra(){
        System.out.println("This is a abstract constructor");
    }

    abstract void a_method();
    void b_method(){
        System.out.println("This is a normal method");
    }

}

class A extends Abstra{
    void a_method(){
        System.out.println("This is a abstract method");
    }
}

class TestAbstraction{
    public static void main(String[] args) {
        A abs = new A();
        abs.a_method();
        abs.b_method();
    }
}
