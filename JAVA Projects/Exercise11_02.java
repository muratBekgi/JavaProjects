import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

class Person{
    public String name;
    public String adress;
    public String phoneNumber;
    public String emailAddress;

    Person(){};

    Person(String name, String adress, String phoneNumber, String emailAddress){
        this.name=name;
        this.adress=adress;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
    }

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public String getAdress(){return adress;}
    public void setAdress(String adress){this.adress=adress;}

    public String getPhoneNumber(){return phoneNumber;}
    public void setPhoneNumber(String phoneNumber){this.phoneNumber=phoneNumber;}

    public String getEmailAddress(){return emailAddress;}
    public void setEmailAddress(String emailAddress){this.emailAddress=emailAddress;}

    //override
    /*public String toString(){
        return "Name: "+getName()+" Class: "+this.getClass().getName();
    }*/
    public String toString() {
        // DO NOT CHANGE BELOW STATEMENT
        return "Person" + " " + name; // DO NOT CHANGE THIS STATEMENT
    }
}
class Student extends Person {

    private final String STATUS;

    Student(String STATUS){
        super();
        this.STATUS = STATUS;
    }

    public Student(String name, String address, String phoneNumber, String emailAddress, String STATUS){
        super(name,address,phoneNumber,emailAddress);
        this.STATUS=STATUS;
    }

    public String getSTATUS(){return STATUS;}

   /* public String toString(){
        return "Name: "+getName()+" Class: "+this.getClass().getName();
    }*/
   public String toString() {
       return "Student" + " " + super.toString(); // DO NOT CHANGE THIS STATEMENT
   }
}


class Employee extends Person {
    String office,salary;
    MyDate dateHired;

    public Employee(String name, String address, String phoneNum, String email, String office, int salary){super();}
    public Employee(String name, String address, String phoneNumber, String emailAddress, String office, String salary)
    {
        super(name, address, phoneNumber, emailAddress);
        this.office=office;
        this.salary=salary;
    }

    public String getOffice(){return office;}
    public void setOffice(String office){this.office=office;}

    public String getSalary(){return salary;}
    public void setSalary(String salary){this.salary=salary;}

    public MyDate getDateHired(){return dateHired;}

   /* public String toString(){
        return "Name: "+getName()+" Class: "+this.getClass().getName();
    }*/
   public String toString() {
       return "Employee" + " " + super.toString(); // DO NOT CHANGE THIS STATEMENT
   }

}
class Faculty extends Employee {
    String officeHours, rank;

    /*Faculty(String name, String address, String phoneNum, String email, String office, int salary, Calendar calendar,
            String officeHours, String rank){super(name, address, phoneNum, email, office, salary);}
*/
    Faculty(String name, String address, String phoneNumber, String emailAddress, int i, Calendar calendar,
            String office, String salary) {
        super(name, address, phoneNumber, emailAddress,office,salary);
    }

    Faculty(String name, String address, String phoneNumber, String emailAddress, String office,
            String salary,Calendar calendar,String officeHours, String rank) {

        super(name, address, phoneNumber, emailAddress,office,salary);
        this.officeHours=officeHours;
        this.rank=rank;
    }

    public String getOfficeHours(){return officeHours;}
    public void setOfficeHours(String officeHours){this.officeHours=officeHours;}

    public String getRank(){return rank;}
    public void setRank(String rank){this.rank=rank;}

   /* public String toString(){
        return "Name: "+getName()+" Class: "+this.getClass().getName();
    }*/
   public String toString() {
       return "Faculty" + " " + super.toString(); // DO NOT CHANGE THIS STATEMENT
   }

}
class Staff extends Employee {
    String title;

    Staff(String name, String address, String phoneNum, String email, String office, String salary, Calendar calendar,
          String title) {
        super(name, address, phoneNum, email, office, salary);
    }

   /* Staff(String name, String address, String phoneNumber, String emailAddress, String office, String salary) {
        super(name, address, phoneNumber, emailAddress,office,salary);
    }*/

    Staff(String name, String address, String phoneNumber, String emailAddress, String office,
          String salary,String title) {
        super(name, address, phoneNumber, emailAddress,office,salary);
        this.title=title;
    }


    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

   /* public String toString(){
        return "Name: "+getName()+" Class: "+this.getClass().getName();
    }*/
   public String toString() {
       return "Staff" + " " + super.toString(); // DO NOT CHANGE THIS STATEMENT
   }

}



public class Exercise11_02 {
    public static void main(String [] args){

      /* Person p=new Person("Murat", "12 CSUN Street", "310983982", "murat@lala.com" );
       Student s=new Student("Jacob", "933 New York ave", "3109843452",
                                 "jacob@yahoo.com", "FRESHMAN");
       Employee e=new Employee("Lori","Long Beach avenye", "3106549786",
               "lori@google.com", "550", "120000");
       Faculty f=new Faculty("Jane", "1256 Los Angeles street", "310543920",
               "jane43@gmail.com","110","90000","9am to 5pm","Student" );
       Staff sf=new Staff("Tommy", "1239 San Fransisco blvd", "5059887654",
               "tommy@yahoo.com","15","60000","Assistant Manager");

        System.out.println(p.toString());
        System.out.println(s.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(sf.toString());
*/
        Scanner sc = new Scanner(System.in);

        //Accepr all inputs
        System.out.print("Enetr name: ");
        String name = sc.next();

        System.out.print("Enetr address: ");
        String address = sc.next();

        System.out.print("Enetr phone number: ");
        String phoneNum = sc.next();

        System.out.print("Enetr email: ");
        String email = sc.next();

        System.out.print("Enetr status: ");
        String status = sc.next();

        System.out.print("Enetr office: ");
        String office = sc.next();

        System.out.print("Enetr salary: ");
        String salary = sc.next();

        System.out.print("Enetr office hours: ");
        String officeHours = sc.next();

        System.out.print("Enetr rank: ");
        String rank = sc.next();

        System.out.print("Enetr title: ");
        String title = sc.next();

        Person p = new Person(name, address, phoneNum, email);
        System.out.println(p.toString());

        Student s = new Student(name, address, phoneNum, email, status);
        System.out.println(s.toString());

        Calendar calendar = new GregorianCalendar();

        Employee e = new Employee(name, address, phoneNum, email, office, salary);
        System.out.println(e.toString());

        Faculty f = new Faculty(name, address, phoneNum, email, office, salary, calendar, officeHours, rank);
        System.out.println(f.toString());

        Staff s1 = new Staff(name, address, phoneNum, email, office, salary, calendar, title);
        System.out.println(s1.toString());

        sc.close();
    }
}



