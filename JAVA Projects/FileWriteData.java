import java.util.Scanner;
import java.io.*;

public class FileWriteData {
    public static void main(String [] args) throws Exception{
        Scanner input=new Scanner(System.in);
        File file=new File("Myrat.txt");
        if(file.exists()){
            System.out.println("File already exits");
            System.exit(0);
        }
        //Create a file
        PrintWriter output=new PrintWriter(file);

        //Write formatted output to the file
        output.print("John T Smith");
        output.println(90);
        output.print("Eric K JOnes");
        output.print(85);

        //Close the file
        output.close();
    }
}
