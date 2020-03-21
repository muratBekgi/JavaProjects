import java.util.Scanner;
public class InitializeInputValue {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        double [] myList=new double[5];

        System.out.println("Enter "+myList.length+" values");
        for(int i=0; i<myList.length; i++){
            myList[i]=input.nextDouble();
        }

        for(int i =0; i<myList.length;i++){
            myList[i]=Math.random()*10;
        }
        System.out.println(myList[1]);

        for(int i=0; i<myList.length; i++){
            System.out.println(myList[i]+" ");
        }

        char [] cITY = {'M','A','R','Y'};
        System.out.println(cITY);

        double total=0;
        for(int i=0; i<myList.length; i++){
           total+=myList[i];
        }
        System.out.println(total);

        double max=myList[0];
        for(int i=0; i<myList.length; i++){
            if(myList[i]>max)
                max=myList[i];
        }
        System.out.println(max);
    }
}
