class Animal{
    void eat(){
        System.out.println("Eating.................");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking................");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("Weeping................");
    }
}

//Here Dog inherits Animal and BabyDog inherits Dog, so BabyDog will be able to access all the properties of Animal and Dog
public class Inheritance {
    public static void main(String[] args) {
        BabyDog dog = new BabyDog();
        dog.eat();
        dog.bark();
        dog.weep();
    }
}
