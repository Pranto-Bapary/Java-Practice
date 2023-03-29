import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int fibo, first = 0, second = 1, count = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

        System.out.print("Fibonacci Series: ");
        while(count < num){
            if(count <= 1){
                fibo = count;
            }
            else{
                fibo = first + second;
                first = second;
                second = fibo;
            }
            System.out.print(fibo + " ");
            count++;
        }
    }
}
