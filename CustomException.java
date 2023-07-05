class PrantosException extends RuntimeException{
    PrantosException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {
        int age = 19;
        try{
            if(age > 18){
                throw new PrantosException("Hey you grown up man");
            }else{
                System.out.println("You are still a kid");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
