import java.util.Stack;

public class TheStack {
    public static void main(String [] args){

        Stack<Integer> op=new Stack<>();
        op.push(2);
        op.push(3);
        op.push(5);

        System.out.println(op);


        System.out.println(op.peek());
        System.out.println(op.search(3));
        op.pop();
        System.out.println(op);





    }
}
