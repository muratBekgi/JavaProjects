import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.*;


public class FileRead {
    public static void main(String[] args) throws FileNotFoundException
    {

        //declare and initialize the variables
        double test1, test2, test3, test4, test5;
        double average;

        String firstName;
        String lastName;

        Scanner inFile = new Scanner (new FileReader("/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/setsofdata.txt"));

        PrintWriter outFile = new PrintWriter("C:\\testavg.out");

        firstName = inFile.next();
        lastName = inFile.next();

        outFile.println("Student Name: " + firstName + "" + lastName);

        test1 = inFile.nextDouble();
        test2 = inFile.nextDouble();
        test3 = inFile.nextDouble();
        test4 = inFile.nextDouble();
        test5 = inFile.nextDouble();

        outFile.printf("Test Scores:  %5.2f %5.2f %5.2f %5.2f %5.2 %n", test1, test2, test3, test4, test5);

        average = (test1 + test2 + test3 + test4 + test5);
        outFile.printf("Average test score: %5.2f %n", average);

        inFile.close();
        outFile.close();



    }
}
