import java.util.*;

public class RepeatAdditionQuiz_WhileLoop {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        int num1, num2, answer;

        num1=(int)(Math.random()*10);
        num2=(int)(Math.random()*10);

        System.out.print("What is "+num1+" + "+num2+"?\t");
        answer=input.nextInt();

        while(answer!=num1+num2)
        {
            System.out.println("Wrong answer. Try again");
            System.out.print("What is "+num1+" + "+num2+"?\t ");
            answer=input.nextInt();
        }

        System.out.print("You're correct. The sum of "+num1+"+"+num2+" is:"+answer);




    }
}
