import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class BuildGraph {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner((new File("" +
                "/Users/MUratBekgi/Desktop/ClassCodes_2/Project 5 - Word Ladder/src/dictionary.txt")));

        ArrayList<String> words = new ArrayList<String>();
        while (sc.hasNextLine() && sc.hasNext()) {
            String word = sc.next();
            if (word.length() == 4) {
                words.add(word);
            }
        }

        File output = new File("/Users/MUratBekgi/Desktop/ClassCodes_2/Project 5 - Word Ladder/src/graph.txt");
        PrintWriter printer = new PrintWriter(output);



        for (int i = 0; i < words.size(); i++) {

            printer.print(words.get(i)+" ");

            for (int j = 0; j < words.size(); j++){
                if (isAnEdge(words.get(i), words.get(j))) {
                    printer.print(words.get(j)+" ");

                }

            }
            printer.println();

        }

        printer.close();

    }


    private static boolean isAnEdge(String s1, String s2){

        int count=0;
        for(int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                count++;
            }
        }
        return count == 1;
    }
}

