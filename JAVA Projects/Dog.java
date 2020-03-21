public class Dog {
    //variables
    private int age;
    private String name;

     //constructor 1
    public Dog(){
        name="lisa";
        age=0;
    }
    // constructor 2
    public Dog(String name){ this.name=name;this.age=0;}
    //constructor 3
    public Dog(String name, int age){this.name=name; this.age=age;}

    public String getName(){return name;}
    public void setName(String name){this.name=name;}

    public int getAge(){return age;}
    public void setAge(int age){this.age=age;}

    // override method:

    public String toString(){
        return "my name is "+this.getName()+" and I am "+getAge()+" years old";
    }

} // end class

// A subclass named DogWithSex of Dog class

class DogWithSex extends Dog {

    private char sex;

    public DogWithSex(){
        super(); // inherit a constructor from Dog class
        sex='m';
    }// end constructor 1

    public DogWithSex(String name){
        super(name);
        sex='m';
    }// end constructor 2

    public DogWithSex(String name, int age){
        super(name,age);
        sex='m';
    }// cend constructor 3

    public DogWithSex(String name, int age, char sex){
        super(name,age);
        this.sex=sex;
    }// end constructor 4

    //Getter and setter

    public char getSex(){return sex;}
    public void setSex(char sex){this.sex=sex;}

}//end class


// A driver class to test all these classes

class Driver{
    public Driver(){ }
    public static void main(String [] args){

        // create a new instance of the dog class:
        Dog dog1=new Dog();
        Dog dog2=new Dog("bob", 7);

        //create a new instance of the dog with sex class:
        DogWithSex dog3=new DogWithSex();
        DogWithSex dog4=new DogWithSex("lily", 6, 'f');

        //change the name of the dog1:

        dog1.setName("tom");
        dog1.setAge(2);

       // printout the dogs

        System.out.println("dog1 "+dog1+" "+dog1.getName()+" "+dog1.getAge());
        System.out.println("dog1 "+dog2+" "+dog2.getName()+" "+dog2.getAge());
        System.out.println("dog1 "+dog3+" "+dog3.getName()+
                " "+dog3.getAge()+" "+dog3.getSex());
        System.out.println("dog1 "+dog4+" "+dog4.getName()+
                " "+dog4.getAge()+" "+dog4.getSex());
    }

}
