import java.util.Scanner;

public class InvalidMarksException extends Exception{
    InvalidMarksException(String str){
        super(str);
    }
}

class TestException{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int mark = input.nextInt();

        if(mark < 0 || mark > 100){
            try {
                throw new InvalidMarksException("You have entered invalid marks");
            }catch (InvalidMarksException ie){
                System.out.println("Please enter correct marks. You've entered invalid marks");
            }
        }
        else{
            System.out.println("Your marks is: " + mark);
        }
        System.out.println("Terminating the program");
    }
}