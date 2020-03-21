public class isPalindrome {
    public static void main(String [] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("Enter a word to check is palindrome or not: ");
        String word = input.nextLine();

        String reverseWord;
        reverseWord=new StringBuffer(word).reverse().toString();

        if(word.equalsIgnoreCase(reverseWord))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }
}


