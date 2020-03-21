public class TowerOf_Hanoi {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.print("Enter Number of Disks:   ");
        int numDisk=input.nextInt();

        System.out.println("Moves are: ");
        steps(numDisk,'A','B','C');

    }

    public static void steps(int n, char fromTower, char toTower, char auxTower){

        //base case for Recursion
        if(n==1)        //if n=1 it will stop
            System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
        else{
            steps(n-1,fromTower,auxTower,toTower);      //recursion
            System.out.println("Move disk "+n+" from "+fromTower+" to "+toTower);
            steps(n-1,auxTower,toTower,fromTower);
        }
    }
}
