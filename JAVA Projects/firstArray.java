public class firstArray {
    public static void main(String args []){

        double [] studentGrades=new double[5];
        studentGrades[0]=10;
        studentGrades[1]=20;
        studentGrades[2]=30;
        studentGrades[3]=40;
        studentGrades[4]=50;

        System.out.println(studentGrades[0]+studentGrades[1]);  //30
        System.out.println(studentGrades[0]+10);        //20

        //double [] myList1= {100,100.55,200};
        double [] myList=new double[3];
        myList[0]=1.9;
        myList[1]=2.9;
        myList[2]=3.4;

        System.out.println(myList[2]);

        for(int i=0; i<studentGrades.length; i++){
            System.out.println(studentGrades[i]);
        }

        int [] values=new int[5];
        for(int i=1; i<5;i++){
            values[i]=i+values[i-1];
        }
        values[0]=values[1]+values[4];
        System.out.println(values[0]);


        double temp=myList[0];
        for(int i=1; i<myList.length; i++){
            myList[i-1]=myList[i];
        }
        System.out.println( myList[myList.length-1]=temp);


    }
}
