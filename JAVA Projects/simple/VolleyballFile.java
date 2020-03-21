import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


class VolleyballFile {
    String fileName;
    int count;

    String currentFileName;

    String outputFile = "";
    String firstName;
    String lastName;
    double attackScore;
    double defenceScore;

    Scanner input = new Scanner(System.in);


    public VolleyballFile() throws FileNotFoundException {
            System.out.println("Please enter a file name to get the roster from");
            this.fileName = input.nextLine();
            File file = new File(fileName);
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine()) {
                int result = Integer.parseInt(scan.nextLine());

                this.count += 1;


            }

    }

    public static void main(String [] args) throws FileNotFoundException {

       VolleyballFile c=new VolleyballFile();



    }
}