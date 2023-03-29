class A{

    String className = "A";
    A(){
        System.out.println("Hello I'm Parent Constructor");
    }
    void hello(){
        System.out.println("Hello I'm from Parent Class!!!");
    }
}

class B extends A{

    String className = "B";
    B(){
        super();
        System.out.println("Hello I'm Child Constructor");
    }
    void hello(){
        System.out.println("Hello I'm from Child Class!!!!");
    }

    void display(){
        hello();
        super.hello(); //parent class hello method
        System.out.println("Hello I'm from Class: " + className);
        System.out.println("Hello I'm from Class: " + super.className);
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        B bClass = new B();
        bClass.display();
    }
}
