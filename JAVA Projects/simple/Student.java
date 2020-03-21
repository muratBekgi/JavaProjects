import java.io.*;
import java.util.*;

public class Student{
    public static void main(String [] args)throws Exception{

        java.util.Scanner input=new java.util.Scanner((System.in));
        int choice;
        do {
            System.out.println("Welcome to University Enrollment\n" +
                    "1. Create Student\n" +
                    "2. Create Course\n" +
                    "3. Create Enrollment\n" +
                    "4. Edit Student\n" +
                    "5. Edit Course\n" +
                    "6. Edit Enrollment\n" +
                    "7. Display Student(s)\n" +
                    "8. Display Course(s)\n" +
                    "9. Display Enrollment(s)\n" +
                    "10. Grades Sub Menu\n" +
                    "0. --- Quit --- \n" +
                    "Please enter a valid choice (1-10, 0 to Quit):");
            choice = input.nextInt();

            String sId = "";
            if (choice == 1) {
                System.out.println("Enter Student's ID: ");
                sId = input.next();

                System.out.println("Enter Student's Name: ");
                String sName = input.next();

                System.out.println("Enter Student's Address: ");
                String sAddress = input.nextLine();
                sAddress = input.nextLine();


                System.out.println("Enter the City: ");
                String city = input.next();

                System.out.println("Enter the State: ");
                String state = input.next();


                StudentInfo studentInfo = new StudentInfo(sId, sName, sAddress, city, state);
              //  System.out.println(studentInfo);
                //studentInfo.getState();
               // System.out.println(studentInfo.toString());

                PrintWriter writer = new PrintWriter("/Users/MUratBekgi/Desktop/ClassCodes_2" +
                        "/stack overflow/src/StudentData.txt");

                writer.println(sId);
                writer.println(sName);
                writer.println(sAddress);
                writer.println(city);
                writer.println(state);

                writer.close();

            }
            String courseNumber = "";
            if (choice == 2) {
                System.out.println("Enter course id number: ");
                String courseIdNumber = input.next();

                System.out.println("Enter Course Name: ");
                String courseName = input.next();

                System.out.println("Enter Instructor Name: ");
                String instructorName = input.nextLine();
                input.nextLine();

                System.out.println("Enter Department: ");
                String department = input.next();

                System.out.println("Enter Course Number: ");
                courseNumber = input.next();

                PrintWriter writer = new PrintWriter("/Users/MUratBekgi/Desktop/ClassCodes_2" +
                        "/stack overflow/src/CourseData.txt");

                Course course = new Course(courseIdNumber, courseName, instructorName, department, courseNumber);


                System.out.println();

                writer.println(courseIdNumber);
                writer.println(courseName);
                writer.println(instructorName);
                writer.println(department);
                writer.println(courseNumber);

                writer.close();
            }

            if (choice == 3) {
                StudentInfo studentInfo = new StudentInfo();
                System.out.println("Please Enter your ID: ");
                String id = input.next();

                System.out.println("Please Enter the course Number: ");
                String cNumber = input.next();



                System.out.println("Enter the Year: ");
                int year = input.nextInt();

                System.out.println("Enter the Semester: ");
                String semester = input.next();

                Enrollment enrollment = new Enrollment(year, semester);
                System.out.println(enrollment);

                PrintWriter writer = new PrintWriter("/Users/MUratBekgi/Desktop/ClassCodes_2" +
                        "/stack overflow/src/EnrollmentData.txt");

                writer.println(id);
                writer.println(cNumber);
                writer.println(year);
                writer.println(semester);
                writer.close();
            }

            if (choice == 4) {
                StudentInfo studentInfo = new StudentInfo();
                System.out.println("Enter to Edit Student Id: ");
                String editId = input.next();
                studentInfo.setsId(editId);

                System.out.println("Enter to Edit Student Name: ");
                String editName = input.next();
                studentInfo.setsName(editName);

                System.out.println("Enter to edit address:  ");
                String editAddress = input.next();
                studentInfo.setsAddress(editAddress);

                System.out.println("Enter to edit City:  ");
                String city = input.next();
                studentInfo.setCity(city);

                System.out.println("Enter to edit state:  ");
                String state = input.next();
                studentInfo.setState(state);


            }
            if (choice == 5) {
                Course course = new Course();
                System.out.println("Enter to edit Course ID NUmber: ");
                String cid = input.next();
                course.setCourseID(cid);

                System.out.println("Enter to edit course Name:  ");
                String Cname = input.next();
                course.setCourseName(Cname);

                System.out.println("Enter to edit INstructor Name: ");
                String instr = input.next();
                course.setInstructor(instr);

                System.out.println("Enter to edit Department:  ");
                String department = input.next();
                course.setDepartment(department);

                System.out.println("Enter to edit Course Number: ");
                String cnum = input.next();
                course.setCourseNumber(cnum);

            }

            if (choice == 6) {
                Enrollment enrollment = new Enrollment();
                System.out.println("Enter to edit Student ID Number: ");
                String stid = input.next();
                enrollment.setsID(stid);

                System.out.println("Enter to edit Course NUmber: ");
                String cNum = input.next();
                enrollment.setCousreName(cNum);

                System.out.println("Enter to edit Year: ");
                int year = input.nextInt();
                enrollment.setYear(year);

                System.out.println("Enter to edit Semester: ");
                String semester = input.next();
                enrollment.setSemester(semester);

            }

            if (choice == 7){

                try {
                    Scanner sc = new Scanner(new File(
                            "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/StudentData.txt"));

                    if (sc.hasNextLine()) {
                        while (sc.hasNextLine()) {
                            String s = sc.next();
                            System.out.println(s);
                        }
                    } else {
                        System.out.println();
                        System.out.println("No input were taken for Student(option 1)");
                        System.out.println();
                    }


                } catch (Exception ex) {
                }

             }


            if(choice==8){
                try {
                    Scanner sc=new Scanner(new File(
                            "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/CourseData.txt"));

                    if(sc.hasNextLine()){
                        while(sc.hasNextLine()){
                            String s=sc.next();
                            System.out.println(s);
                        }}
                    else{
                        System.out.println();
                        System.out.println("No input were taken for Course(option 2)");
                        System.out.println();
                    }


                }catch (Exception ex){
                }
            }

            if(choice==9){
                try {
                    Scanner sc=new Scanner(new File(
                            "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/EnrollmentData.txt"));

                    if(sc.hasNextLine()){
                        while(sc.hasNextLine()){
                            String s=sc.next();
                            System.out.println(s);
                        }}
                    else{
                        System.out.println();
                        System.out.println("No input were taken for Enrollment(option 3)");
                        System.out.println();
                    }


                }catch (Exception ex){
                }

            }

            if(choice==10){
                int choice2=0;
                do{
                System.out.println("Grades Menu\n" +
                        "1. Add Grade\n" +
                        "2. View Grades \n"+
                        "3. Edit Grade\n"+
                        "0. -- Exit to Menu -- \n" +
                        "Please enter a valid choice (1-2, 0 to Exit):\n");
                        choice2=input.nextInt();

                    if(choice2==1){
                        GradeManagment gradeManagment1=new GradeManagment();


                        System.out.println("Enter Student ID: ");
                        String sID=input.next();
                        gradeManagment1.setId(sID);

                        System.out.println("Enter Year: ");
                        int year=input.nextInt();

                        System.out.println("Enter Semester: ");
                        String semester=input.nextLine();
                        semester=input.nextLine();

                        System.out.println("Enter course ID: ");
                        String courseNum=input.next();

                        System.out.println("Enter Grade: ");
                        String grade=input.next();

                        GradeManagment gradeManagment=new GradeManagment(sID,year,semester,courseNum,grade);


                        PrintWriter writer=new PrintWriter(
                                "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/GradeData.txt");

                        writer.println(sID);
                        writer.println(year);
                        writer.println(semester);
                        writer.println(courseNum);
                        writer.println(grade);
                        writer.close();

                    }

                    if(choice2==2){
                        try {
                            Scanner sc=new Scanner(new File(
                                    "/Users/MUratBekgi/Desktop/ClassCodes_2/stack overflow/src/" +
                                            "GradeData.txt"));

                            if(sc.hasNextLine()){
                                while(sc.hasNextLine()){
                                    String s=sc.next();
                                    System.out.println(s);
                                }}
                            else{
                                System.out.println();
                                System.out.println("No input were taken for Grade(option 10-->2)");
                                System.out.println();
                            }


                        }catch (Exception ex){
                        }
                    }

                    if(choice2==3){
                        GradeManagment gradeManagment=new GradeManagment();
                        System.out.println("Enter to ID : ");
                        String id=input.next();
                        gradeManagment.setId(id);

                        System.out.println("Enter to edit year: ");
                        int year=input.nextInt();
                        gradeManagment.setYear(year);

                        System.out.println("Enter to edit Semester course ID: ");
                        String sem=input.next();
                        gradeManagment.setCourseId(sem);

                        System.out.println("Enter to edit Student ID:  ");
                        String courseId=input.next();
                        gradeManagment.setCourseId(courseId);

                        System.out.println("Enter to edit Grade: ");
                        String grade=input.next();
                        gradeManagment.setCourseId(grade);


                    }
                }while (choice2!=0);
            }

        }while(choice!=0);

    }

    public static class StudentInfo{
        private String sId;
        String sName;
        String sAddress;
        String city, state;

        public StudentInfo(){ }

        StudentInfo(String sId){
            this.sId=sId;
        }

        StudentInfo(String sId, String sName, String sAddress, String city, String state){
            this.sId=sId;
            this.sName=sName;
            this.sAddress=sAddress;
            this.city=city;
            this.state=state;
        }

        public void setsId(String sId){this.sId=sId;}
        public void setsName(String sName){this.sName=sName;}
        public void setsAddress(String sAddress) {this.sAddress = sAddress; }
        public void setCity(String city){this.city=city;}
        public void setState(String state){this.state=state;}

        public String getsId() {
            return sId;
        }
        public String getsName() {
            return sName;
        }
        public String getsAddress() {
            return sAddress;
        }

        public String getCity() {
            return city;
        }

        public String getState() {
            return state;
        }

        public String toString(){
            System.out.println("============");
            return "ID: "+this.sId+"\nName: "+this.sName+"\nAddress: "+this.sAddress+"\nCity: "
                    +this.city+"\nState: "+this.state;

        }
    }

    public static class  Course extends StudentInfo{

        private String courseID;
        String courseName;
        String instructor;
        String department;
        String courseNumber;


        public Course(){}

        Course(String stid, String courseNumber){
            super(stid);
            this.courseNumber=courseNumber;
        }
        public Course(String courseID, String courseName, String instructor, String  department, String courseNumber){
            this.courseID=courseID;
            this.courseName=courseName;
            this.instructor=instructor;
            this.department=department;
            this.courseNumber=courseNumber;
        }

        public void setCourseID(String courseID) {
            this.courseID = courseID;
        }
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }
        public void setInstructor(String instructor) {
            this.instructor = instructor;
        }

        public void setDepartment(String department) {
            this.department = department;
        }

        public void setCourseNumber(String courseNumber) {
            this.courseNumber = courseNumber;
        }

        public String getCourseID() {
            return courseID;
        }

        public String getCourseName() {
            return courseName;
        }

        public String getInstructor() {
            return instructor;
        }

        public String getDepartment() {
            return department;
        }

        public String getCourseNumber() {
            return courseNumber;
        }




        public java.lang.String toString() {
            System.out.println("=============");
            return "Course ID: "+courseID+"\nCourse NAme: "+courseName+"\nInstructor: "+instructor+
                    "\nDepartment: "+department+"\nCourse Number: "+courseNumber;
        }
    }

    public static class Enrollment extends Course{
        int year;
        String semester;
        String sID;
        String courseName;

        Enrollment(){}

        Enrollment(String sID, String courseNumber, int year, String semester){
            super(sID, courseNumber);
            this.year=year;
            this.semester=semester;


        }
        public Enrollment(int year, String semester){
            this.year=year;
            this.semester=semester;
        }

        public void setsID(String sID){this.sID=sID;}
        public void setCousreName(String courseName){this.courseName=courseName;}
        public void setYear(int year) {
            this.year = year;
        }
        public void setSemester(String semester) {
            this.semester = semester;
        }


        public int getYear() {
            return year;
        }
        public String getSemester() {
            return semester;
        }

        public String toString(){
            StudentInfo studentInfo=new StudentInfo();
            Course course=new Course();
            System.out.println("==============");
            return "Student ID: "+studentInfo.getsId()+"\nCourse Number: "+course.getCourseNumber()+"\nYear: "
                    +year+"\nSemester: "+semester;
        }
    }

   public static class GradeManagment{
        String grade;
        String id;
        int year;
        String semester;
        String courseId;

        public GradeManagment(){}

        public GradeManagment(String id, int year, String semester, String courseId,String grade){
            this.grade=grade;
            this.id=id;
            this.year=year;
            this.semester=semester;
            this.courseId=courseId;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public void setCourseId(String courseId) {
            this.courseId = courseId;
        }

        public void setSemester(String semester) {
            this.semester = semester;
        }

        public String getGrade() {
            return grade;
        }

        public String getId() {
            return id;
        }

        public int getYear() {
            return year;
        }

        public String getCourseId() {
            return courseId;
        }

        public String getSemester() {
            return semester;
        }

        public String toString(){
            return "ID: "+this.getId()+"\nYear: "+this.getYear()+"\nSemester: "+this.getSemester()
                    +"\nCourse ID: "+this.getCourseId()+"\nGrade"+this.getGrade();
        }
    }

}