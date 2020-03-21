
public  class Teacher extends Person implements Displayable {

    private String subject;

    Teacher(String first, String last, String subject){
        setFirstName(first);
        setLastName(last);
        this.subject=subject;
    }

    private String getSubject(){return subject;}
    public void setSubject(String subject){this.subject=subject;}

    public  String display(){
        return getFullName()+" teaches "+getSubject();
    }

}
