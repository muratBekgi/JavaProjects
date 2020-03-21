import java.util.*;
public class SubtractionQuizLoop {
    public static void main(String [] args)
    {
        Scanner input=new Scanner(System.in);

        final int NUMBER_OF_QUESTIONS=5;
        String output=" ";
        int correctAnswersCount=0;
        int wrongAnswersCount=0;
        int totalQuestions=0;
        long startTime=System.currentTimeMillis();

        while(totalQuestions< NUMBER_OF_QUESTIONS)
        {

            int number1=(int)(Math.random()*10);
            int number2=(int)(Math.random()*10);

            if(number1<number2)
            {
                int temp=number1;
                number1=number2;
                number2=temp;
            }

            System.out.print
                    ("What is "+number1+" - "+number2+"?\t");
            int answer=input.nextInt();

            if(answer==number1-number2)
            {
                System.out.println("You're correct");
                correctAnswersCount++;
            }
            else if(answer!=number1-number2)
            {
            System.out.println("Your answer is wrong\n The answer " + number1
                    + " - " + number2 + " should be " + (number1 - number2));
                wrongAnswersCount++;
            }

            totalQuestions++;

            output += "\n" +number1+ "-" +number2+ "=" +answer+
                    ((number1 - number2 == answer) ? " correct":" wrong");

        }

        long endTime=System.currentTimeMillis();
        long testTime=endTime-startTime;

        System.out.println("\nCorrect count is "+correctAnswersCount+"\nWrong count is "+wrongAnswersCount
                + "\nTest time is "+testTime/1000+" second\n"+output);

    }
}
