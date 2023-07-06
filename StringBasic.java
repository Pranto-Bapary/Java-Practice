public class StringBasic {
    public static void main(String[] args) {
        //there are two ways of creating string
        String firstName = "Pranto";
        String lastName = new String("Bapary");
        System.out.println("First Name: " + firstName + "\nLast Name: " + lastName);

        //we can also convert an array of strings to a normal string
        char letters[] = {'P','r','a','n','t','o'};
        String name = new String(letters); //Pranto
        System.out.println(name);

        System.out.println(name.toUpperCase());//it will make the name to uperrcase letters
        System.out.println(name.toLowerCase());//it will make the name to lowercase letters

        System.out.println("Length of my name is: " + name.length());// it will print the length of the string
        System.out.println(name.charAt(4)); //it will print the value of 4th index of the name string

        String sf = String.format("%.1f ",12.34);//formating the string, it will print till the first decimal point
        System.out.println(sf);

        String text = "Hello my name is Pranto";
        System.out.println(text.indexOf("Pranto"));//it will give us the starting index of the given string
        System.out.println(text.isEmpty());// it will return a boolean value that if the string is empty or not

        String join = String.join("-","My","Name","is","Pranto");
        System.out.println(join);//it will join - to each element
        System.out.println(join.replace("Name", "First Name"));//it will replace the "Name" by "First Name"

        String demo = "Hello this is a test string";
        char test[] = demo.toCharArray();//it will convert the string to a character array
        int length = test.length;

        for(int i = 0; i < length; i++){
            System.out.print(test[i]);
        }
    }
}
