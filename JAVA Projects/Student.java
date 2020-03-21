

public class Student extends Person implements Displayable{
   private int studentId;
    private int finalGrade;

    public Student(){}
    Student(String firstName, String lastName, int studentId, int finalGrade){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setStudentId(studentId);
        this.setFinalGrade(finalGrade);
    }

    private int getStudentId(){return studentId;}
    private void setStudentId(int studentId){this.studentId=studentId;}

    private int getFinalGrade(){return finalGrade;}
    public void setFinalGrade(int finalGrade){this.finalGrade=finalGrade;}

    public  String display(){
        return "Student ID:"+this.getStudentId()+"  "+getFullName()+
                " Final Grade: "+this.getFinalGrade();
    }
}
