/*
Write a Java program to create an interface ‘Shape’ with abstract methods calculateArea() and calculatePerimeter().
Create subclass Circle, Rectangle and Triangle that inherit the ‘Shape’ class and implement the respective methods to
calculate the area and perimeter of each shape. Create objects of each subclass with a reference variable
to the parent class and call the respective methods for each of them.
*/

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
}

class Circle implements Shape{

    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    public void calculateArea(){
        System.out.println("Area of Circle: " + (3.14 * radius * radius));
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Circle: " + (2 * 3.14 * radius));
    }
}

class Rectangle implements Shape{

    private double l, h;

    Rectangle(double l, double h){
        this.l = l;
        this.h = h;
    }
    public void calculateArea(){
        System.out.println("\nArea of Rectangle: " + (l * h));
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Rectangle: " + (2 * (l + h)));
    }
}

class Triangle implements Shape{
    private double base, height, side;
    Triangle(double base, double height, double side){
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public void calculateArea(){
        System.out.println("\nArea of Triangle: " + (0.5 * base * height));
    }

    public void calculatePerimeter(){
        System.out.println("Perimeter of Triangle: " + (base * height * side));
    }
}

class TestInterface1{
    public static void main(String[] args) {

        Circle circle = new Circle(4);
        circle.calculateArea();
        circle.calculatePerimeter();

        Rectangle rectangle = new Rectangle(10,20);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        Triangle triangle = new Triangle(12,15,17);
        triangle.calculateArea();
        triangle.calculatePerimeter();
    }
}
