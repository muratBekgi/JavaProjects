public class Bwords {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.println ("Please enter 5 words");
        System.out.println ("====================");
        String[] words = new String[5];
        int count=0;
        String  [] b_words=new String[5];


            for (int x = 0; x <= 4; x++) {
                System.out.print(x+1+" word: ");
                words[x] = input.next();
                 if (words[x].toLowerCase().startsWith("b")) {
                     count++;
                     b_words[x]=words[x];
                 }

        }
        System.out.print ("You entered " + count + " 'B' words and they were: ");

        for (String b_word : b_words) {
            if (b_word != null)
                System.out.print(b_word + " ");
        }

    }
}
