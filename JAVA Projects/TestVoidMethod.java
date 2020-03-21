import java.util.Scanner;

public class TestVoidMethod {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your first score: ");
        int firstGrade=input.nextInt();
        System.out.print("Enter your second score: ");
        int secondGrade=input.nextInt();

        System.out.print("Your grade for first score is ");
        gradeDecider(firstGrade);
        System.out.print("Your grade for second score is ");
        gradeDecider(secondGrade);

    }

    public static void gradeDecider(double score)
    {
        if(score>=90)
            System.out.println("A");
        else if(score>=80)
            System.out.println("B");
        else if(score>=70)
            System.out.println("C");
        else if(score>=60)
            System.out.println("D");
        else
            System.out.println("F");
    }

}
