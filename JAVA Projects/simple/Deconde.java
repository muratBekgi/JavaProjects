import java.io.File;
import java.util.Scanner;

public class Deconde{
    public static void main (String []args) throws Exception {
        //File byte stream
       File file=new File("/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/Data_21.txt");

       Scanner inFile=new Scanner(file);

       while (inFile.hasNextLine()){
           String line=inFile.nextLine();
           System.out.println(line);
       }



    }

}