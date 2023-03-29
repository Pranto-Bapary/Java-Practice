/*
    Write a program to print the names of students by creating a Student class. If no name is
    passed while creating an object of Student class, then the name should be "Unknown",
    otherwise the name should be equal to the String value passed while creating object of
    Student class
*/


//Here I have created the class named Students because under the same package, I already have a Student class
public class Studentss {
    Studentss(String name){
        System.out.println("Student Name: " + name);
    }

    Studentss(){
        System.out.println("Unknown");
    }

    public static void main(String[] args) {
        Studentss st1 = new Studentss("Pranto");
        Studentss st2 = new Studentss();
    }
}
