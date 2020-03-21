import java.util.*;

public class reverseString {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=input.nextLine();

        System.out.print("Reverse: ");
        for(int i=word.length()-1;i>=0;i--){
            System.out.print(word.charAt(i));
        }
    }
}
