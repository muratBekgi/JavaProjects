/*
@author Murat Bekgi
 */

import java.util.*;

public class Client {
    public static void main(String [] args){

        Rational[] randomNums=new Rational[10];
        for(int i=0;i<randomNums.length; i++){
            int numerator=1+(int)(Math.random()*50-1+1);
            int denominator=1+(int)(Math.random()*50-1+1);
            randomNums[i]=new Rational(numerator,denominator);
        }

        ArrayList<Rational> list=new ArrayList<Rational>(Arrays.asList(randomNums));
        System.out.println(list);
        System.out.println("Maximum Number: "+Collections.max(list));   //finds the max

        System.out.print("Sorted: ");
        Arrays.sort(randomNums);                                        //sorts from min to max
        for(int j=0; j<randomNums.length;j++){
            System.out.print(randomNums[j]+" ");
        }


    }
}
















