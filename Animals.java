public abstract class Animals {
    abstract void dogs();
    abstract void cats();
}

class Cats extends Animals{
    void cats(){
        System.out.println("Cat's Meow");
    }

    void dogs(){

    }
}
class Dogs extends Animals{
    void cats(){
    }

    void dogs(){
        System.out.println("Dogs Bark");
    }
}

class TestAnimals{
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.dogs();

        Cats c = new Cats();
        c.cats();
    }
}