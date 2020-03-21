/*
* 7.1 (Assign grades) Write a program that reads student scores, gets the best score, and then assigns grades based on
* the following scheme:
* Grade is A if score is >=  best - 10
* Grade is B if score is >=  best - 20;
* Grade is C if score is >=  best - 30;
* Grade is D if score is >=  best-40;
* Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts the user to enter all of the scores,
and concludes by displaying the grades. Here is a sample run:

Enter the number of students: 4
Enter 4 scores: 40 55 70 58
Student 0 score is 40 and grade is C
Student 1 score is 55 and grade is B
Student 2 score is 70 and grade is A
Student 3 score is 58 and grade is B

 */
public class Exercise07_01 {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents=input.nextInt();           //Accept total student number



        double[] scores = new double[numberOfStudents]; // Array scores
        double varBest=0; // The best score


        System.out.print("Enter " + numberOfStudents + " scores: ");

        // Read scores for each student and store in array scores such that score for student 1 is stored in scores[0] and find the best score and store in variable varBest
        for(int i=0; i<numberOfStudents; i++){
            scores[i]=input.nextInt();
            if(scores[i]>varBest)
                varBest=scores[i];
        }

        // Declare and initialize output string
        char grade='\u0000';        // The grade

        // Assign and display grades
        for (int i = 0; i < scores.length; i++) {
            // get Grade for each student in varibale grade and display the result using below print statement

            if(scores[i] >=(varBest-10))
                grade='A';
            else if(scores[i]>=(varBest-20))
                grade='B';
            else if(scores[i]>=(varBest-30))
                grade='C';
            else if(scores[i]>=(varBest-40))
                grade='D';
            else
                grade='F';


            System.out.println("Student " + i + " score is " +
                    scores[i] + " and grade is " + grade);
        }
    }
}
