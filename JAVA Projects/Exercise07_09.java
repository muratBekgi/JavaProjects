public class Exercise07_09 {
    public static void main(String [] args){
        java.util.Scanner input=new java.util.Scanner(System.in);

        // Get 10 numbers
        System.out.print("Enter ten double numbers: ");
        double [] array=new double[10]; // Array of 10 numbers

        //Accept the 10 numbers
        for(int i=0; i<array.length; i++){
            array[i]=input.nextDouble();
        }

        System.out.println("The min is " + min(array));
    }

        public static double min(double [] list ){
        double min=list[0];
        for(int i=0; i<list.length; i++){
            if(list[i]<min)
                min=list[i];
        }
        return min;
        }
    }

