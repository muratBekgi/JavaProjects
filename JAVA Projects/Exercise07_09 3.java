public class Exercise07_09 {
    public static void main(String  [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        System.out.println("Enter ten numbers: ");
       double [] tenNumbers=new double[10];
        for(int i=0; i<tenNumbers.length;i++){
            tenNumbers[i]=input.nextDouble();
        }

        System.out.println("Min num is: "+min(tenNumbers));

    }
    public static double min(double[] array){
        java.util.Scanner input=new java.util.Scanner(System.in);

        double min=array[0];

        for(int i=0; i<array.length;i++){
            if(array[i]<min)
                min=array[i];
        }
        return min;
    }
}
