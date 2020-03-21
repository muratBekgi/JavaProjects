import java.util.Scanner;

public class multipleInput {
 public static void main(String [] args){

     getInput();

 }

    public static String getInput() {
        Scanner sc = new Scanner(System.in);
        String input = "";

        System.out.println("Awaiting input...");

        if (sc.hasNextLine()) {
            System.out.println("Combining Input to One Line...");
            while (sc.hasNextLine()) {
                //System.out.println(sc.hasNextLine());
                //System.out.println("check");

                input.concat(sc.nextLine() + " ");

                //System.out.println(sc.hasNextLine());
                //System.out.println("check2");
                //System.out.println("check3");

            }
        }
        sc.close();
        return input;
    }
}