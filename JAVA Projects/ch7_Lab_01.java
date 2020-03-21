/*
(Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based
on the following scheme:
        Grade is A if score is >= best - 10;
        Grade is B if score is >= best - 20;
        Grade is C if score is >= best - 30;
        Grade is D if score is >= best -40;
        Grade is F otherwise.
        The program prompts the user to enter the total number of students, then prompts the user to enter
        all of the scores, and concludes by displaying the grades. Here is a sample run:

        Enter the number of students: 4
        Enter 4 scores: 40 55 70 58
        Student 0 score is 40 and grade is C
        Student 1 score is 55 and grade is B
        Student 2 score is 70 and grade is A
        Student 3 score is 58 and grade is B
        */

import java.util.*;
public class ch7_Lab_01 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int highest=0;

        System.out.print("Enter the number of students: ");
        int numStudents=input.nextInt();
        System.out.print("Enter "+numStudents+" scores: ");
        int [] studentScore=new int[numStudents];

        for(int i=0; i<studentScore.length; i++){
            studentScore[i]=input.nextInt();
            if(studentScore[i]>highest)
                highest=studentScore[i];
        }

        for(int i=0; i<studentScore.length; i++){
            System.out.print("Student "+i+" score is "+studentScore[i]+" and grade is "); //dont forget [i]
            if(studentScore[i]>=(highest-10))
                System.out.print("A\n");
            else if(studentScore[i]>=(highest-20))
                System.out.print("B\n");
            else if(studentScore[i]>=(highest-30))
                System.out.print("C\n");
            else if(studentScore[i]>=(highest-40))
                System.out.print("D\n");
            else
                System.out.print("F");
        }
    }
}
