/* Exception
1. Write a program that prints ‘HaHa’ when it face an ArithmeticException and ‘HeHe’ when
it faces an IllegalArgumentException
 */

public class Ex1 {
    public static void main(String[] args) {
        int i,j,k;
        i = 0;
        k = -12;

        try{
            j = 100/i;
        }catch (ArithmeticException e){
            System.out.println("HaHa");
        }

        try {
            if(k < 0){
                throw new IllegalArgumentException();
            }
        }catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }

    }
}
