class Tree{
    void leaf(){
        System.out.println("It has a leaf.");
    }
}

class Flower extends Tree{
    void fragrance(){
        System.out.println("It has a nice fragrance.");
    }
}

class Fruit extends Tree{
    void taste(){
        System.out.println("It is tasty.");
    }
}

//Here Flower and Fruit both child class are inheriting a parent class Tree. So it is a hierarchical inheritance

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Flower flower = new Flower();
        Fruit fruit = new Fruit();

        flower.leaf();
        flower.fragrance();

        fruit.leaf();
        fruit.taste();
    }
}
