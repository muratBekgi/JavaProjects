import java.util.*;

class ude1 extends Exception
{
    public ude1()
    {
        System.out.println("User defind exception 1 thrown");
    }
    public String toString()
    {
        return "NegativeValueException";
    }
}
class ude2 extends Exception
{
    public ude2()
    {
        System.out.println("User defind exception 2 thrown");
    }
    public String toString()
    {
        return "ValueOutofBouundException";
    }
}
class excep6
{
    /* String stud_name;
    int mark1,mark2,mark3;
    excep6(String name,int a,int b,int c)
    {
        stud_name=name;
        mark1=a;
        mark2=b;
        mark3=c;
    }
    public void calculator()
    {
      float avg=0;
      avg=(mark1+mark2+mark3)/3;
      System.out.println("The average of "+stud_name+" is "+avg);

    } */
    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,c,l=2;
        String std="";

        while(l>0)
        {
            try{
                System.out.println("enter student name");
                std=in.next();
                System.out.println("enter mark1");

                if(in.hasNextInt())
                    a=in.nextInt();
                else
                    throw new NumberFormatException();
                if(a<0)
                {
                    throw new ude1();
                }
                if(a>100)
                {
                    throw new ude2();
                }
            }
            catch(ude1 u1)
            {
                System.out.println(u1.toString());a=0;
            }
            catch(ude2 u2)
            {
                System.out.println(u2.toString());a=0;
            }
            catch(NumberFormatException e)
            {
                System.out.println("NumberFormat Exception");a=0;
            }
            System.out.println("enter mark2");
            try{
                if(in.hasNextInt())
                    b=in.nextInt();
                else
                    throw new NumberFormatException();
                if(b<0)
                {
                    throw new ude1();
                }
                if(b>100)
                {
                    throw new ude2();
                }
            }
            catch(ude1 u1)
            {
                System.out.println(u1.toString());b=0;
            }
            catch(ude2 u2)
            {
                System.out.println(u2.toString());b=0;
            }
            catch(NumberFormatException e)
            {
                System.out.println("NumberFormatException Exception");b=0;
            }
            System.out.println("enter mark3");
            try{
                if(in.hasNextInt())
                    c=in.nextInt();
                else
                    throw new NumberFormatException();
                if(c<0)
                {
                    throw new ude1();
                }
                if(c>100)
                {
                    throw new ude2();
                }
            }
            catch(ude1 u1)
            {
                System.out.println(u1.toString());c=0;
            }
            catch(ude2 u2)
            {
                System.out.println(u2.toString());c=0;
            }
            catch(NumberFormatException e)
            {
                System.out.println("NumberFormatException Exception");c=0;
            }
            System.out.println("The average of student "+std+" is "+(a+b+c)/3);
            l--;
        }
    }
}