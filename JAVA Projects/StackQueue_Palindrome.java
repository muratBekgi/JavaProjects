/*
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

public class StackQueue_Palindrome {
    public static void main(String [] args){

        Scanner input=new Scanner(System.in);
        String s=input.nextLine();

        Stack st=new Stack();
        Queue q=new Queue();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
            q.enqueue(s.charAt(i));
        }
        boolean result=true;
        while ((!st.isEmpty() && result==true)){
            char ch1=st.pop();
            char ch2=q.dequeue();
            if(ch1!=ch2)
                result=false;

            return result;
        }

    }
}
*/
