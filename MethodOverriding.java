/*
    Only the child class can override the method of parent class through inheritance,
    if the method name and the type and the number of parameters are same as parent class.
*/

//Parent Class or Super Class
class SuperBike{
    void speed(){
        System.out.println("Speed of this car is 220km");
    }
}


//Child Class or Sub Class
class Bike extends SuperBike{
    void speed(){
        System.out.println("Speed of this bike is 150km");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Bike bike = new Bike();
        bike.speed();
    }
}
