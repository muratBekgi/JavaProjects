import java.util.*;

public class UpperCaseTOlowerCase{
   public static void main(String [] args){
      Scanner input=new Scanner(System.in);
   char letters;
   
   System.out.print("Enter letter Aa-Zz: ");
   letters=input.next().charAt(0);
   
      if(letters>='A' && letters<='Z'){
   System.out.print(letters+" is an uppercase letter");
   }
   else if(letters>='a' && letters<='z')
   {
   System.out.print(letters+" is a lowercase letter");
   }
   else
   System.out.print(letters+ "is a numeric character");
   
   
   
   }

}