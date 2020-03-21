import java.util.Scanner;

public class Exercise06_31 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a credit card number as a long integer: ");
       long number=input.nextLong();

        step1_Step2(number);
        step3(number);


        if(sumOfResults(number)%10==0)
            System.out.println(number+" is Valid");
        else
            System.out.println(number+" is Invalid");


    }
    //adds up Step1 and Step2 and return the value
    public static long sumOfResults(long num){
        num=step1_Step2(num)+step3(num);
        return num;
    }

    // STEP1-2: doubles every second digit from right to left and if doubling result in a tw-digit number,
    // then adds up the two digits to get single-digit number
    public static long step1_Step2(long num) {

        long num2, num3, num4,num5,num6,num7=0, num8;
        while(num>0){
            num2=num%100;       // ex:1234 gets the last two digits :34
            num3=num2/10;       // divides 34/10 and gets 3 b/c its long data type
            num4=num3*2;        // multiplies 3 by 2
            if(num4>=10){       //if doubled number is 2 diits then adds them ex 13 = 1+3 >>> 4
                num5=num4%10;
                num6=num4/10;
                num4=num5+num6;
            }
           // System.out.println(num4);
            num8=num7+num4;        // adds single-digit numbers starting from 0(0 is initial)
            num7=num8;

            num=num/100;        // renews the value of the given number
        }
       // System.out.println("\nSingle digit numbers from step 1: "+num7);
       return num7;
    }

    //STEP3: adds all digits in the odd places from right to left in the card number
public static long step3(long num){
        long num2,num3=0,num4;

        while(num>0){
            num2=num%10;        //ex:1234 gets the last 1 digit : 4
            num4=num3+num2;     // adds single-digit numbers
            num3=num4;          // renews the value of num3 which was 0(initial )
            num=num/100;        // renews the value of the given number
        }
   // System.out.println("\nAdded odd place numbers: "+num3);
return num3;
}


}
