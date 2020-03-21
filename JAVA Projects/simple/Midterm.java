import java.io.Serializable;
import java.util.Scanner;

class StudentInformation implements Serializable{
    String studentName;
    int studentID;
    String studentAddress;
    String studentCity;
    String studentState;

    void ToString(){
        System.out.println("Name: "+studentName);
        System.out.println("ID: "+studentID);
        System.out.println("Address: "+studentAddress);
        System.out.println("City: "+studentCity);
        System.out.println("State: "+studentState);
    }

    StudentInformation(){
    }

    StudentInformation(String name,int id,String address,String city,String state){
        studentName = name;
        studentID = id;
        studentAddress = address;
        studentCity = city;
        studentState = state;
    }
    void setstudentName(String name){
        studentName = name;
    }

    String getstudentName(){
        return studentName;
    }
    void setstudentId (int id){
        studentID = id;
    }
    int getstudentID(){
        return studentID;
    }
    void setstudentAddress (String address){
        studentAddress = address;
    }
    String getstudentAddress(){
        return studentAddress;
    }
    void setstudentCity (String city){
        studentCity = city;
    }
    String studentCity(){
        return studentCity;
    }
    void setstudentState (String state){
        studentState = state;
    }
    String getstudentState(){
        return studentState;
    }
}


class CourseInformation{
    String courseID;
    String courseName;
    String courseInstructor;
    String courseDepartment;
    int courseNumber;

    void ToString(){
        System.out.println("ID: "+courseID);
        System.out.println("Name: "+courseName);
        System.out.println("Instructor: "+courseInstructor);
        System.out.println("Department: "+courseDepartment);
        System.out.println("Number: "+courseNumber);
    }


    CourseInformation(){
    }

    CourseInformation(String name,String id,String instructor,String department, int number){
        courseName = name;
        courseID = id;
        courseInstructor = instructor;
        courseDepartment = department;
        courseNumber = number;
    }


    void setcourseID(String id){
        courseID = id;
    }
    String getcourseID(){
        return courseID;
    }
    void setcourseName(String name){
        courseName = name;
    }
    String getcourseName(){
        return courseName;
    }
    void setcourseInstructor(String instructor){
        courseInstructor = instructor;
    }
    String getcourseInstructor(){
        return courseInstructor;
    }
    void setcourseDepartment(String department){
        courseDepartment =  department;
    }
    String getcourseDepartment(){
        return courseDepartment;
    }
    void setcourseNumber(int number){
        courseNumber = number;
    }
    int getcourseNumber(){
        return courseNumber;
    }
}

class EnrollmentInformation{

}


public class Midterm {//start of Midterm class

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//Start of public static void main(String[] args)
        Scanner in=new Scanner(System.in);
//STUDENT DECLARTION       
        int studentCount=0;
        StudentInformation[] student = new StudentInformation[3];
        int userInputChoice = -1;
        String userInputName = null;
        String userInputAddress = null;
        String userInputCity = null;
        String userInputState = null;
        int userInputID;
        // COURSE DECLARATION
        int courseCount=0;
        CourseInformation[] course = new CourseInformation[5];
        String userInputCID ;
        String userInputCName = null;
        String userInputCInstructor = null;
        String userInputCDepartment = null;
        int userInputCNumber = 0;
        //MAIN MENU
        while(userInputChoice!= 0){//Start
            System.out.println("Welcome to University Enrollment");
            System.out.println("1. Create Student");
            System.out.println("2. Create Course");
            System.out.println("3. Create Enrollment");
            System.out.println("4. Edit Student");
            System.out.println("5. Edit Course");
            System.out.println("6. Edit Enrollment");
            System.out.println("7. Display Student(s)");
            System.out.println("8. Display Course(s)");
            System.out.println("9. Display Enrollment(s)");
            System.out.println("10. Grades Sub Menu");
            System.out.println("0. --- Quit ---");
            System.out.println("Please enter a valid choice (1-10, 0 to Quit):");
            userInputChoice = in.nextInt();
            // STUDENT INPUT


            if (userInputChoice == 1){// Create Student Information
                studentCount +=1;
                if (studentCount < 4){
                    System.out.println("student Name:");
                   // userInputName= in.nextLine();
                    userInputName= in.nextLine();
                    System.out.println("student Address:");
                    userInputAddress= in.nextLine();
                    System.out.println("student City:");
                    userInputCity= in.nextLine();
                    System.out.println("student State:");
                    userInputState= in.nextLine();



                }else {
                    System.out.println("ARRAY IS FULL");

                }// End else
            }

            if(userInputChoice == 4){
                System.out.println("Student ID: ");
                userInputID = in.nextInt();
                for (int x = 1;x < 4;x++){
                    if (student[x].getstudentID()==userInputID)
                    {student[x].ToString();
                        x=4;
                        System.out.println("1.Name");
                        System.out.println("2.Address");
                        System.out.println("3.City");
                        System.out.println("4.State");
                        System.out.println("5.None");

                        if (userInputID ==1){
                            System.out.println("Enter NEW Name: ");
                            userInputName= in.nextLine();
                            student[x].setstudentName(userInputName);
                        }

                        if (userInputChoice ==2){
                            System.out.println("Enter NEW Address: ");
                            userInputAddress= in.nextLine();
                            student[x].setstudentAddress(userInputAddress);
                        }
                        if (userInputChoice ==3){
                            System.out.println("Enter NEW City: ");
                            userInputCity= in.nextLine();
                            student[x].setstudentCity(userInputCity);
                        }

                        if (userInputChoice ==4){
                            System.out.println("Enter NEW State: ");
                            userInputState= in.nextLine();
                            student[x].setstudentState(userInputState);
                        }

                        if (userInputChoice ==5){
                            System.exit(0);
                            return;
                        }
                    }

                }
            }
            if (userInputChoice ==7){

                student[studentCount] = new StudentInformation(userInputName,1,userInputAddress,userInputCity,userInputState);
                student[studentCount].ToString();
            }

// COURSE INPUT
            if (userInputChoice ==2){
                courseCount +=1;
                if (courseCount < 6){
                    System.out.println("Course Name: ");
                    userInputCName= in.nextLine();
                    userInputCName= in.nextLine();
                    System.out.println("Course Instructor: ");
                    userInputCInstructor= in.nextLine();
                    System.out.println("Course Department: ");
                    userInputCDepartment= in.nextLine();
                    System.out.println("Course Number: ");
                    userInputCNumber= in.nextInt();

                }
            }
            if (userInputChoice ==5){// Edit CourseInformation
                System.out.println("Course ID: ");
                userInputCID = in.nextLine();
                for (int x = 1;x < 4;x++){
                    if (course[x].getcourseID()==userInputCID)
                    {course[x].ToString();

                        x=4;
                        System.out.println("1.Name");
                        System.out.println("2.Instructor");
                        System.out.println("3.Department");
                        System.out.println("4.Number");
                        System.out.println("5.None");

                        if (userInputChoice ==1){
                            System.out.println("Enter NEW Name: ");
                            userInputCName= in.nextLine();
                            course[x].setcourseInstructor(userInputCName);
                        }

                        if (userInputChoice ==2){
                            System.out.println("Enter NEW Instructor: ");
                            userInputCInstructor= in.nextLine();
                            course[x].setcourseInstructor(userInputCInstructor);
                        }

                        if (userInputChoice ==3){
                            System.out.println("Enter NEW Department: ");
                            userInputCDepartment= in.nextLine();
                            course[x].setcourseDepartment(userInputCDepartment);
                        }
                        if (userInputChoice ==4){
                            System.out.println("Enter NEW Number: ");
                            userInputCNumber= in.nextInt();
                            course[x].setcourseNumber(userInputCNumber);
                        }

                        if (userInputChoice ==5){
                            System.exit(0);
                            return;
                        }
                    }
                }
            }

            if (userInputChoice ==8){
                course[courseCount] = new CourseInformation(userInputCName,"1",userInputCInstructor,userInputCDepartment,userInputCNumber);
                course[courseCount].ToString();
            }
        }
    }
}

// ENROLLMENT 