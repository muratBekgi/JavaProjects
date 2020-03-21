public class MyList {
    public static void main(String [] args){

        int [] myList=new int[4];
         myList[0]=100;
         myList[1]=97;
         myList[2]=28;
         myList[3]=62;

         /*int temp=myList[0];

         for(int i=1; i<myList.length;i++){
             myList[i-1]=myList[i];
         }
        myList[myList.length-1]=temp;
        System.out.println(myList[0]+"\n"+myList[1]+"\n"+myList[2]+"\n"+myList[3]);


        int temp2=myList[3];

        for(int i=1; i<myList.length;i++){
            myList[myList.length-i]=myList[(myList.length-1)-i];
            // 1step           4-1                      4-1 -1
            //              myList[2]=myList[3]
        }

        myList[0]=temp2;
        System.out.println(myList[0]+"\n"+myList[1]+"\n"+myList[2]+"\n"+myList[3]);
*/

         int temp3=myList[3];
         for(int i=myList.length-1; i>0; i--){
             myList[i]=myList[i-1];
         }

        myList[0]=temp3;
        System.out.println(myList[0]+"\n"+myList[1]+"\n"+myList[2]+"\n"+myList[3]);

    }
}
