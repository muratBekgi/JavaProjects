import java.io.File;
import java.io.PrintWriter;


public class TextFileWritingExample2 {
    public static void main(String[] args) throws Exception{

        java.util.Scanner sc=new java.util.Scanner(System.in);

        File createFile=new File("myFile.txt");
        PrintWriter writeFile=new PrintWriter(createFile);


        for (int i = 0; i < 4; i++) {

            System.out.println("Enter name: ");
            String name = sc.nextLine();
            writeFile.println(name);
        }



        writeFile.close();

    }
}