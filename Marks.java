/*
We have to calculate the percentage of marks obtained in three subjects (each out
of 100) by student A and in four subjects (each out of 100) by student B. Create
an abstract class 'Marks' with an abstract method 'getPercentage()'. It is inherited
by two other classes 'A' and 'B' each having a method with the same name which
returns the percentage of the students. The constructor of student A takes the
marks in three subjects as its parameters and the marks in four subjects as its
parameters for student B. Create an object for each of the two classes and print
the percentage of marks for both the student
*/

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks{
    private int mark1, mark2, mark3;

    A(int mark1, int mark2, int mark3){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    double getPercentage(){
        double percentage = (mark1 + mark2 + mark3) / 3;
        return percentage;
    }
}

class B extends Marks{
    private int mark1, mark2, mark3, mark4;

    B(int mark1, int mark2, int mark3, int mark4){
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }
    double getPercentage(){
        double percentage = (mark1 + mark2 + mark3 + mark4) / 4;
        return percentage;
    }
}

class CalculateMarks{
    public static void main(String[] args) {
        A studentA = new A(80, 90, 98);
        B studentB = new B(80, 90, 98, 100);

        System.out.println("Student A Marks: " + studentA.getPercentage());
        System.out.println("Student B Marks: " + studentB.getPercentage());
    }
}
