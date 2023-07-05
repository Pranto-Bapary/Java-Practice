class TestClass{
    void show() throws ClassNotFoundException{
        //Here the exception arises but by using throws keyword we sent the exception back to the main and handeling it in main method
        Class.forName("Pranto");
    }
}
public class Throws {
    public static void main(String[] args) {
        TestClass t = new TestClass();
        try{
            t.show();
        }catch (Exception e){
            System.out.println("Exception Handeled");
        }

    }
}
