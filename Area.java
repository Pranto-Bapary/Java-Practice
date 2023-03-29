/*
    Write a program to print the area of a rectangle by creating a class named
    'Area' having two methods. First method named as 'setDim' takes length and
    breadth of rectangle as parameters and the second method named as 'getArea'
    returns the area of the rectangle. Length and breadth of rectangle are entered
    through keyboard.
*/


import java.util.Scanner;

public class Area {
    double length, breadth;
    void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double getArea(){
        return length * breadth;
    }

    public static void main(String[] args) {
        Area rectangle = new Area();
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the length: ");
        double length = inp.nextDouble();

        System.out.print("Enter the breadth: ");
        double breadth = inp.nextDouble();

        rectangle.setDim(length, breadth);
        double resultArea = rectangle.getArea();
        System.out.println("Area of Rectangle: " + resultArea);

    }
}
