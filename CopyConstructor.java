import java.util.Scanner;

public class CopyConstructor {
    String name;
    int age;

    CopyConstructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    CopyConstructor(CopyConstructor newCons){
        name = newCons.name;
        age = newCons.age;
    }

    void display(){
        System.out.println("\nName: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        String name = input.nextLine();

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        CopyConstructor con1 = new CopyConstructor(name, age);
        CopyConstructor con2 = new CopyConstructor(con1);

        con1.display();
        con2.display();
    }
}
