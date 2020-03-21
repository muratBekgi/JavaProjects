public class Dog_Class{
    int age;
    String name;

    Dog_Class(){}
    Dog_Class(String newName){
        newName=name;
    }
    public void setAge(int dogAge){
        age=dogAge;
    }
    public void setName(String newName){
        name=newName;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }


    public static void main(String [] args){

        Dog_Class dog1=new Dog_Class("Lucy");

        Dog_Class dog2=new Dog_Class();
        dog2.setName("Max");
        dog1.setAge(2);
        System.out.println("Dog 1 has name "+dog1.getName()+" and age is "+dog1.getAge());
    }
}

