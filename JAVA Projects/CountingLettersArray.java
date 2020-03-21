public class CountingLettersArray {
    public static void main(String [ ]args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        createArray();

    }
    public static char[] createArray(){
        char [] result=new char[100];

        for(int i=0; i<result.length;i++){
            int ascciiCode=(int)(97+Math.random()*(122-97+1));
            result[i]=(char) ascciiCode;
        }
        return result;
    }
    public static void displayArray(char [] chars){
        for(int i=0; i<chars.length; i++)
            System.out.println(chars[i]+" ");
    }

    public static int[] countLetters(char [] chars){
        int[] counts=new int [26];

        for(int i=0; i<counts.length; i++) {
            counts[chars[i] - 'a']++;
        }
        return counts;
    }
    public static void displayCounts(int[] counts){
        for(int i=0; i<counts.length; i++){
            if((i+1)%10==0)
                System.out.println(counts[i]+" "+(char)(i+'a'));
            else
                System.out.println(counts[i]+" "+(char)(i+'a')+" ");
        }
    }
}
