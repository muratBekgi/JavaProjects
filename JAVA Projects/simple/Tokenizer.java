import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String [] args) throws FileNotFoundException {


        java.util.Scanner input = new java.util.Scanner(System.in);

        input = new Scanner(new File("/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/x_YPoints.txt"));

        //skipping line 1-3
        for (int i = 1; i <= 3; i++) {
            input.nextLine();
        }
        //Printing out Dimesntion
        String reader = input.nextLine();
        System.out.println(reader);
        //Skipping lines 5-6
        for (int i = 5; i <= 6; i++) {
            input.nextLine();
        }

        //printing x and y values or coordinates
        while (input.hasNextLine()) {
            String read = input.nextLine();
            StringTokenizer tokenizer = new StringTokenizer(read.split(" ")[1]);
            StringTokenizer tokenizer1 = new StringTokenizer(read.split(" ")[2]);
            while (tokenizer.hasMoreElements() && tokenizer1.hasMoreElements()) {
                System.out.print((tokenizer.nextElement()) + " ");
                System.out.print(tokenizer1.nextElement() + "\n");

            }

        }



    }

    public static class Coordinate {
        StringTokenizer x;
        StringTokenizer y;
         Coordinate(StringTokenizer x, StringTokenizer y) {
            this.x = x;
            this.y = y;
        }
    }
}
