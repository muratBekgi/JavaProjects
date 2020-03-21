

import java.util.ArrayList;
import java.util.*;

public class PrintReports {
    Scanner input=new Scanner(System.in);
    private ArrayList<Displayable> classroomList = new ArrayList<>();

    private PrintReports() {
        Displayable classroom;
        String addClassroom;

        System.out.println("Let's Create a classroom first ");
        do {
            classroom = enterClassroom();
            if (classroom != null) {
                classroomList.add(classroom);
            }

            boolean validInput = true;
            do {
                System.out.println("Add another Clasroom? (Y/N): ");
                addClassroom=input.nextLine();
                if ((!addClassroom.equalsIgnoreCase("Y")) && (!addClassroom.equalsIgnoreCase("N"))) {
                    validInput = false;
                }
            } while (!validInput);
        } while (addClassroom.equalsIgnoreCase("Y"));

    }

    private Displayable enterClassroom() {

        boolean validInput = true;
        int roomNumber = 0;
        Displayable teacher = null;
        ArrayList<Displayable> studentList = new ArrayList<>();


    System.out.print("Enter a Room Number: ");
    roomNumber = input.nextInt();
        while(roomNumber<100){
            System.out.print("Must be greater than 100. Try again: ");
            roomNumber=input.nextInt();
        }

        input.nextLine();

        System.out.println("\nLet's add a teacher for the Classroom ");
        teacher=enterTeacher();


        System.out.println("\nAnd now let's add student(s) to the class");
        Displayable student;
        validInput = true;
        String addStudent;
        do {
            student = enterStudent();
            if (student != null) {
                studentList.add(student);
            }
            do {
                System.out.println("Add another student? (Y/N): ");
                addStudent=input.nextLine();
                if ((!addStudent.equalsIgnoreCase("Y")) && (!addStudent.equalsIgnoreCase("N"))) {
                    validInput = false;
                }
            } while (!validInput);
        } while (addStudent.equalsIgnoreCase("Y"));


        Classroom classroom = new Classroom(roomNumber, teacher, studentList);
        return classroom;
    }

    private Displayable enterTeacher() {
        System.out.print("Enter teacher's first name: ");
        String firstName=input.nextLine();
        System.out.print("Enter teacher's last name: ");
        String lastName=input.nextLine();
        System.out.print("Enter the subject: ");
        String subject=input.nextLine();

        Teacher teacher = new Teacher(firstName,lastName,subject);
        return teacher;
    }

    private Displayable enterStudent() {
        System.out.print("Enter student's first name: ");
        String firstName=input.nextLine();
        System.out.print("Enter student's last name: ");
        String lastName=input.nextLine();

        int studentId = 0;
        boolean validInput = true;

            System.out.print("Enter Student ID: ");
            studentId=input.nextInt();
            while(studentId<0) {
                System.out.print("Must be greater than 0. Try again: ");
                studentId = input.nextInt();
            }
            input.nextLine();

        int studentGrade = 0;
        validInput = true;

            System.out.print("Enter Student's final Grade: ");
           studentGrade=input.nextInt();
           while(studentGrade<0 || studentGrade>100){
               System.out.println("Must be between 0 and 100. Try again: ");
               studentGrade=input.nextInt();
           }
           input.nextLine();


        Student student = new Student(firstName, lastName, studentId, studentGrade);
        return student;
    }

    private ArrayList<Displayable> getClassroomList() {
        return classroomList;
    }

    private void report(ArrayList<Displayable> classroomList) {

        for (Displayable aClassroomList : classroomList) {
            System.out.println("--------------------------------------------");
            Displayable classroom=aClassroomList;
            System.out.println(classroom.display());
            System.out.println("--------------------------------------------");
        }
    }

    public static void main (String[] args) {
        PrintReports printReports = new PrintReports();
        printReports.report(printReports.getClassroomList());
    }
}
