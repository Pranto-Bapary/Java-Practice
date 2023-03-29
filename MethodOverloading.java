/*
    Demonstrate the key-concept behind Method Overloading within a single sentence. Now, take two
    integers (say, 5 and 10) and a double type value (say, 20.0) from keyboard and apply the concept of
    method overloading by calling a method namely ‘callMethod()’ once with the integers and again with the
    double value. Also print them individually.
    [ Hints: callMethod(5, 10) and callMethod(20.0) ]
 */

import java.util.Scanner;

public class MethodOverloading {
    void callMethod(int num1, int num2){
        System.out.println("Number 1: " + num1);
        System.out.println("Number 2: " + num2);
    }

    void callMethod(double num3){
        System.out.println("Number 3: " + num3);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Integer Number: ");
        int num1 = input.nextInt();

        System.out.print("Enter again a Integer Number: ");
        int num2 = input.nextInt();

        System.out.print("Enter a Double Number: ");
        double num3 = input.nextDouble();

        new MethodOverloading().callMethod(num1,num2);
        new MethodOverloading().callMethod(num3);
    }
}
