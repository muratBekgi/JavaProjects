public class printWords
{
    public static void main(String [] args) {
        String words = "quick brown fox jumps over the lazy dog";

        for (int i = 0; i < words.length(); i++) {
            System.out.print(words.charAt(i));
            if(Character.isWhitespace(words.charAt(i)))
                //creates a line when there's white space
                System.out.println();
            }
        }
}