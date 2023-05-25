public abstract class Parent {
    abstract void first();
    abstract void second();
}

class firstSub extends Parent{
    void first(){
        System.out.println("Hello I'm first");
    }

    void second(){
    }
}
class secondSub extends Parent{
    void first(){
    }

    void second(){
        System.out.println("Hello I'm second");
    }
}

class Test{
    public static void main(String[] args) {
        firstSub fs = new firstSub();
        fs.first();
        secondSub ss = new secondSub();
        ss.second();
    }
}


