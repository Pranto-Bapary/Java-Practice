/* Exception
2.Write a program that allows you to access an array until a valid index is given. If maximum retries exceeds array_size, prints Error.
Write a program that allows you to access an array until a valid index is given.
If maximum retries exceeds array_size, prints Error.

3.Modify the program in problem 2 to throw a custom Exception if maximum retries are reached.
4.Wrap your program in problem 3 inside a method which throws your custom Exception.

*/

import java.util.Scanner;

class InvalidTryException extends RuntimeException{
    InvalidTryException(String str){
        super(str);
    }
}

class ExceptionMethodClass{
    void exceptionMethod() throws InvalidTryException{
        Scanner inp = new Scanner(System.in);
        int maxTry = 3;
        int [] arr = {13,2,15,1,5};
        int arrLength = arr.length;

        while (maxTry > 0){
            System.out.println("Enter the index: ");
            int index = inp.nextInt();

            if(index >= 0 && index <= arrLength){
                System.out.println(arr[index]);
            }

            maxTry--;

            if(maxTry == 0){
                try{
                    throw new InvalidTryException("Opppps!");
                }catch (InvalidTryException e){
                    System.out.println("Sorry, you've reached the maximum retry limits.");
                    System.out.println("Terminating the program.");
                    break;
                }
            }
        }
    }
}
public class Ex234{
    public static void main(String[] args){
        ExceptionMethodClass ex = new ExceptionMethodClass();
        ex.exceptionMethod();
    }
}
