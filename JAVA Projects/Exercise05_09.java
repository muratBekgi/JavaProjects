import java.util.*;

public class Exercise05_09 {
    static String studentNumberMsg="Enter the number of students(numberOfStudents>=2): ";
    static String studentNameMsg = "Enter a student name: ";
    static String studentScoreMsg = "Enter a student score: ";
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);


        System.out.print(studentNumberMsg);
        int numberOfStudents=input.nextInt();

        String student;
        double score;
        String student1="";     //Store the student name with highest score
        double score1=-1;       //Store the student score with highest score
        String student2="";     // Store the student name with second highest score
        double score2=-1 ;      // Store the student score with second highest score

        for(int x = 1; x<=numberOfStudents; x++) {
            System.out.print(studentNameMsg+"\n");      //Accept student name
           student=input.next();                        // Accept name of student
            System.out.print(studentScoreMsg+"\n");     //Accept student score
            score=input.nextDouble();                   //accept score for student

             if(score>score1) {
                 student2=student1;
                 score2=score1;
                student1=student;
                 score1 = score;
             }
             else if(score>score2) {
                 student2=student;
                 score2=score;
             }
        }
        System.out.println("Top two students:");
        System.out.println(student1 + "'s score is " + score1);
        System.out.println(student2 + "'s score is " + score2);
    }
}
