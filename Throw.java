//Throw keyword is used just to throw the exception
class Throw {
    public static void main(String[] args) {
        int age = 17;
        if (age < 18) {
            throw new ArithmeticException("You can not vote");
        } else {
            System.out.println("You are ready to vote");
        }
    }
}
