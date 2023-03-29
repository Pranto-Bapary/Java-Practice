/*
    Consider a class Car having characteristics (states) like wheel, seats, color and behaviors like applying
    brake and increasing speed. Now, prepare two objects namely ‘Sedan’ and ‘Coupe’ of the aforementioned
    class possessing the following values shown in the chart. Also print the values
 */

public class Car {
    int wheel;
    int seat;
    String color;

    void applyBreak(){
        System.out.println("Break has been applied");
    }

    void increaseSpeed(){
        System.out.println("Not increased");
    }

    public static void main(String[] args) {
        Car Sedan = new Car();
        Car Coupe = new Car();

        Sedan.seat = 5;
        Sedan.color = "Blue";

        Coupe.seat = 4;
        Coupe.wheel = 4;

        System.out.println("For Sedan");
        System.out.println("Seats: " + Sedan.seat);
        System.out.println("Color: " + Sedan.color);
        Sedan.applyBreak();

        System.out.println("\nFor Coupe");
        System.out.println("Seats: " + Coupe.seat);
        System.out.println("Wheel: " + Coupe.wheel);
        Coupe.increaseSpeed();

    }



}
