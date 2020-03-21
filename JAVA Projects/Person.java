

abstract class Person {
   private String firstName;
   private String lastName;


    void setFirstName(String firstName){this.firstName=firstName;}

    void setLastName(String lastName){this.lastName=lastName;}

    String getFullName(){return firstName+" "+lastName;}
}
