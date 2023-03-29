//Constructor Overloading: It is a technique of having multiple constructors of same name but different parameters
public class ConstructorOverloading {
    ConstructorOverloading(String name, int age){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    ConstructorOverloading(float salary){
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        new ConstructorOverloading("Pranto", 22);
        new ConstructorOverloading(25000.50f);
    }
}
