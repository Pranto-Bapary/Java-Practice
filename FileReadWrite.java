import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("G:\\Desktop Backup\\Study Materials\\Object Oriented Programming\\Slides\\Done\\test.txt");
        fileWriter.write("Hello This is Ashfe Speaking Mike Testing 1,2,3..............Done");
        fileWriter.close();

        FileReader fread = new FileReader("G:\\Desktop Backup\\Study Materials\\Object Oriented Programming\\Slides\\Done\\test.txt");
        Scanner read = new Scanner(fread);
        while(read.hasNext()){
            if(read.hasNext()){
                String i = read.next();
                System.out.println(i);
            }
        }
        fread.close();
    }
}
