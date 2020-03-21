public class TestRandomCharacter {
    /* public static void main(String [ ]args) {
      Scanner input=new Scanner(System.in);

      final int CHARACTER_PER_LINE=25;

         System.out.print("\nEnter the number of characters you want: ");
         int numCharacter=input.nextInt();

         for(int i=0; i<=numCharacter; i++){

             char ch= RandomCharacter.getRandomLowerCaseLetter();
             if((i+1)%CHARACTER_PER_LINE==0)     // each line has 25 characters
                 System.out.println(ch);
             else
                 System.out.print(ch);           //if not 25 char then just print out
         }
     }
 }
 */
public static void main(String[] args){
        System.out.println("The first 100 pentagonal number are:");
        for (int i = 1; i < 101; i++){
        System.out.printf("%7d ", getPentagonalNumber(i));
        if (i % 10 == 0)
        System.out.println();
        }
        }

public static int getPentagonalNumber(int n){
        return (n * (3 * n - 1)) / 2;
        }
        }