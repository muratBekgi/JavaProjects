import java.util.*;
public class Exercise10_03 {
  public static void main(String[] args) 
  {

    Scanner sc=new Scanner(System.in);
    int myint1=sc.nextInt();

    MyInteger n1 = new MyInteger(myint1);
    System.out.println("n1 is even? " + n1.isEven());
    System.out.println("n1 is prime? " + n1.isPrime());
    System.out.println("15 is prime? " + MyInteger.isPrime(15));

    char ch1 = sc.next().charAt(0);
    char ch2 = sc.next().charAt(0);
    char ch3 = sc.next().charAt(0);
    char ch4 = sc.next().charAt(0);
    char[] chars = {ch1,ch2,ch3,ch4};
    System.out.println(MyInteger.parseInt(chars));

    String s = sc.next();
    System.out.println(MyInteger.parseInt(s));
    int myint2 = sc.nextInt();   
    MyInteger n2 = new MyInteger(myint2);
    System.out.println("n2 is odd? " + n2.isOdd());
    System.out.println("45 is odd? " + MyInteger.isOdd(45));
    System.out.println("n1 is equal to n2? " + n1.equals(n2));
    System.out.println("n1 is equal to 5? " + n1.equals(5));
  }
}

 class MyInteger
{
  private int value;

  public MyInteger(int value)
  {
    this.value = value;
  }

  public int getValue()
  {
    return value;
  }

  public boolean isEven()
  {
    return isEven(value);
  }

  public boolean isOdd()
  {
    return isOdd(value);
  }

  public boolean isPrime()
  {
    return isPrime(value);
  }

  public static boolean isEven(int value)
  {
    return value % 2 == 0;
  }

  public static boolean isOdd(int value)
  {
    return value % 2 != 0;
  }

  public static boolean isPrime(int value)
  {
double range=Math.sqrt(value);

for(int i=2; i<range; i++){
  if(value%i==0) return false;
}
return true;
   /* for(int divisor = 2; divisor <= (value / 2); divisor++)
    {
      if(value % 2 == 0)
        return false;
    }
    return true;*/
  }

  public static boolean isEven(MyInteger myInteger) {
    return myInteger.isEven();
  }

  public static boolean isOdd(MyInteger myInteger)
  {
    return myInteger.isOdd();
  }

  public static boolean isPrime(MyInteger myInteger)
  {
    return myInteger.isPrime();
  }

  public static int parseInt(char [] chars)
  {
    int value = 0;
    for (int i = 0, j = (int)Math.pow(10, chars.length - 1); i < chars.length; i++, j /= 10)
    {
      value += (chars[i]- 48) * j;
    }
    return value;
  }

  public static int parseInt(String str)
  {
    int value = 0;
    for (int i = 0, j = (int)Math.pow(10, str.length() - 1); i < str.length(); i++, j /= 10)
    {
      value += (str.charAt(i) - 48) * j;
    }
    return value;
  }
}