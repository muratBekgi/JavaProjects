

import java.util.ArrayList;

public class Classroom extends Person implements Displayable {
    private int roomNumber;
    private Displayable teacher;
    private ArrayList<Displayable> students;

    public Classroom(){

    }
    Classroom(int roomNumber, Displayable teacher, ArrayList<Displayable> students)
    {


    this.setRoomNumber(roomNumber);
    this.setTeacher(teacher);
    this.setStudents(students);
    }

    private int getRoomNumber(){return roomNumber;}
    private void setRoomNumber(int roomNumber){this.roomNumber=roomNumber;}

    private Displayable getTeacher() { return teacher; }
    private void setTeacher(Displayable teacher){this.teacher=teacher;}

    private ArrayList<Displayable> getStudents() { return students; }
    private void setStudents(ArrayList<Displayable> students){this.students=students;}


    @Override
    public String display() {
        StringBuilder output= new StringBuilder("Room Number: " + this.getRoomNumber() + "\n");
        output.append(this.getTeacher().display()).append("\n");

        ArrayList<Displayable>studentList=this.getStudents();
        for(int i=0; i<studentList.size();i++){
            output.append(studentList.get(i).display());
            if(i<(studentList.size()-1)){
    output.append("\n");
            }
        }
        return output.toString();
    }
}


/*


 */
