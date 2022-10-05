import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    static public Queue<Integer> rev(Queue<Integer> q){
            Stack<Integer> stack=new Stack<>();
            while(!q.isEmpty()){
                stack.push(q.poll());
            }
            while(!stack.isEmpty()){
                q.add(stack.pop());
            }
            return q;
    }
    public static void main(String[] args) {
        Queue<Integer> rev=new LinkedList<>();
        rev.add(1);
        rev.add(2);
        rev.add(3);
        rev.add(4);
        rev.add(5);
        Queue<Integer> res=rev(rev);
        System.out.println(res);


    }
}
