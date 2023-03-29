/*
    Assign and print the roll number, phone number and address of two students
    having names "Sam" and "John" respectively by creating two objects of class
    'Student'.
 */


//Here I've created the class named Students because in my pc I have already a class named Student before
public class Students {
    int roll_no,phone_no;
    String address;

    public static void main(String[] args) {

        Students Sam = new Students();
        Students John = new Students();

        Sam.roll_no = 15;
        Sam.phone_no = 982123;
        Sam.address = "New York";

        John.roll_no = 25;
        John.phone_no = 762453;
        John.address = "Canada";

        System.out.println("Roll No of Student 1: " + Sam.roll_no);
        System.out.println("Phone No of Student 1: " + Sam.phone_no);
        System.out.println("Address of Student 1: " + Sam.address);

        System.out.println();

        System.out.println("Roll No of Student 2: " + John.roll_no);
        System.out.println("Phone No of Student 2: " + John.phone_no);
        System.out.println("Address of Student 2: " + John.address);

    }
}
