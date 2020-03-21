/*
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class TheQueue {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        Queue queue=new Queue();

        char ch;
        String line=input.nextLine();

        for (int i = 0; i < line.length(); i++) {
            queue.enqueue(line.charAt(i));
            int n=0;
            while(!queue.isEmpty()){
                do{
                    ch=queue.dequeue();
                }while(!character.isDigit(ch));
            }
            do{
                n=n*10+Integer.parseInt(character.toString(ch));
                if(queue.isEmpty())
                    break;
                ch=queue.dequeue();
            }while(character.isDigit(ch));
            System.out.println(n);
            n=0;
        }
    }
}
*/
