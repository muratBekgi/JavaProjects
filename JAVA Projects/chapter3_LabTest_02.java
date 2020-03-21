import java.util.*;

public class chapter3_LabTest_02 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int number;
        int get_firstDigit, get_lastDigit;

        System.out.print("Enter a three-digit number: ");
        number=input.nextInt();

        get_firstDigit=number/100;  // 3 integers divided by 100 will give us the first number b/c it's an integer
        get_lastDigit=number%10;     //any 3 integers divided by 10 , and modulo of that number gives us last
                                    // digit b/c it's an integer

        if(get_firstDigit==get_lastDigit)
        {
            System.out.print(number+" is a palindrome");
        }
        else
            System.out.print(number+" is not a palindrome");

    }
}
