class tryCatch {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int arr[] = new int[5];
        String str = null;
        String name = "Pranto";
        try{
            //at a time only one exception can be handeled
            j = 18/i; //here there is Arithmetic exception
            System.out.println(arr[5]);// here there is ArrayIndexOutOfBounds exeception
            System.out.println(str.length()); //NullPointer exception
            int p = Integer.parseInt(name); //NumberFormat exception
        }
        catch (ArithmeticException e){//catch block will only execute if there occurs an exception
            System.out.println("Hey you can not divide the number by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Hey you have crossed the array size and trying to access the invalid value");
        }
        catch (NullPointerException e){
            System.out.println("Hey your string is empty so you can't get the length");
        }
        catch (Exception e){
            System.out.println("Hey there is a exception and that is : " + e.getMessage());
        }
        System.out.println("Rest of the code");
    }
}
