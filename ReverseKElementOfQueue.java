import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElementOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
       
        Stack<Integer> stack=new Stack<>();
        int size=q.size();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }
        for(int i=0;i<size-k;i++){
            q.add(q.poll());
        }
        return q;
    }
    public static void main(String[] args) {
        
    }
}
