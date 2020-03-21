import java.util.Arrays;
import java.util.Random;

public class FindingHighest {
    public static void main(String[] args) {


    Random rand = new Random(1);  //create random object and sets seed to one

    int[] randArray = new int[51];
    int[] newArray = new int[51];

  for(int i = 0; i<randArray.length;i++)
    {
        randArray[i] = rand.nextInt(50) + 1; // returns a single random integer between 1 and 50
    }

  Arrays.sort(randArray);
  System.out.println(Arrays.toString(randArray));


        for (int i = randArray.length-1; i >=0 ; i--) {
            System.out.print(randArray[i]+" ");

        }

        int CheckingDublicate = 0, count =1;
        for(int i = 1; i <= randArray.length; i++){

            if(count<=10){
                if(CheckingDublicate!=randArray[randArray.length-i])
                {
                    //Ignoring if dublicate
                    System.out.print(randArray[randArray.length-i]+" ");
                    CheckingDublicate = randArray[randArray.length-i];
                    count++;
                }
            }
            else
                break;
        }
/*
  //int high_low=randArray.length-1;

  for(
    int j = 0;
    j<randArray.length;j++)

    {
        newArray[randArray[j]] += 1;
    }
  System.out.println(Arrays.toString(newArray));

  for(
    int k = 0;
    k<newArray.length;k++)

    {
        System.out.println("Number " + k + " occurred " + newArray[k] + " times");
    }*/
}

}
/*
-1


The project description is to create an array of 1000 randomized numbers from 1-50 and to display the 10 highest numbers by frequency. I cut down the numbers in my code for easier testing.

I have created the array with randomized numbers and displayed how many times each number occurred.

I am having trouble figuring out how to sort the numbers from highest highest to lowest.

Any help would be appreciated.

import java.util.*; //import random class and arrays

class MaxArray{ public static void main(String[]args){
 */