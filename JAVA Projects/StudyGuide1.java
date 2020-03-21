import java.util.*;

public class StudyGuide1 {

    public static void main(String[]  args){
        Scanner input=new Scanner(System.in);


        // 1) What is the value of sum after the following code executes?
        int sum = 0;
        int count = 0;
        while (count < 4)
        {
            sum =sum+ count / 2;
            count =count+1;
        }
        System.out.println(sum);

        /*
        2)  	Suppose s1 is a String variable.  We want to check to see if the first and last
        characters of s1 are the same.  Complete the following if-statement to accomplish the task.
        boolean same;
       if (______________________________________________)
      same = true;
      else
      same = false;
         */
        String s1="ewelcomewe";
        boolean same;
        int length=s1.length();
        char firstLetter=Character.toUpperCase(s1.charAt(0));
        char lastLetter=Character.toUpperCase(s1.charAt(length-1));
        if(firstLetter==lastLetter)
            same=true;
        else
            same =false;

        System.out.println(same);

        /*
        3)  	Write a for-loop that will print all the positive integers from 100 down to 1,
        inclusive, one number per line.

         */
        for(int i=100; i>=0;i--){
            System.out.print(i+",");
        }

        /*
        4)  	Suppose a is a one-dimensional array of double.  Show how you would find
        the largest element of a using Java code.
         */

        double [] a={1,4,99,54,-1};
        double largestElement=0;
        for(int i=0; i<a.length-1; i++){
            if(largestElement<a[i])
                largestElement=a[i];
        }
        System.out.println("\n"+largestElement);

        /*
        5)  	The following code containing a loop attempts to find how many times the letter ‘r’
        appears in a string.  But something is wrong with the loop.  How would you fix it?
        String s = “railroad”;
        int count = 0;
        char letter = s.charAt(index);
        for (int index = 0; index < s.length(); ++index)
        if (letter == ‘r’)
	    ++count;
         */
        String s="railroad";
        int count1=0;
        for(int index=0;index<s.length();index++){
            char letter=s.charAt(index);
            if(letter=='r')
                count1++;
        }
        System.out.println(count1);


        System.out.println("Enter your word for reverse: ");
        String word=input.nextLine();
        System.out.println("Enter number for sigma calculation: ");
        int number=input.nextInt();
        System.out.println("Enter number for digit estm: ");
        int num=input.nextInt();
        System.out.println("Enter number for recursion reverse; ");
        int reverseNum=input.nextInt();



        System.out.println("Reverse: ");
        reverse(word);
        System.out.println("\nSigma result: "+sum(number));
        System.out.println("\nNumber of digits : "+countDigits(num));
        System.out.println("Recusrion integer reverse: ");
        printReverse(reverseNum);
  }


    /*
    6)  	Write a recursive method that takes a String parameter and prints out the characters of
    the string in reverse order.
    public static void reverse(String s){
    }
     */
    public static void reverse(String s) {
        if(s.length()==0)
            return;
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0,s.length()-1));
    }

/*
7)	Write a recursive method that takes an integer parameter (n) and return the following summation:
1n1n
public int sum(int n) {
}
 */
public static int sum(int n){
    if(n==0)
        return 0;
    else
        return n+sum(n-1);
}

/*
8) Write a recursive method that take an integer parameter (n) and counts number of digits of n
public int countDigits(int n) {
}
 */
public static int countDigits(int n){
    if(n<10)
        return 1;
    else
        return 1+countDigits(n/10);
}

/*
9) Write a recursive method that take an integer parameter (n) and prints it in reverse
public void printReverse(int n)
{
}
 */
public static void printReverse(int n){
    if(n<10){
        System.out.println(n);
    }
    else{
        System.out.print(n%10);
    printReverse(n/10);}
}

/*
10) Given the class Rational to represent Fractions, implement the method compareTo()

public class Rational implements Comparable {
  private int numerator;
  private int denominator;
  public Rational(int n, int d)
  {
    numerator = n;
    denominator = d;
  }
  public int compareTo(Rational rhs)
  {


   }
 */

 // public static int compareTo(Rational rhs){


   // return this.numerator*rhs.denominator-this.denominator*rhs.numerator;


//  }

}
//11
































