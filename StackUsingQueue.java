import java.util.PriorityQueue;
import java.util.Queue;

public class StackUsingQueue {
    Queue<Integer> q1=new PriorityQueue<>() ;
    Queue<Integer> q2=new PriorityQueue<>();

    public StackUsingQueue() {
        
    }
    
    public void push(int x) {
        
        q1.add(x);
        for(int i=0; i<q1.size()-1;i++){
            q1.add(q1.peek());
            q1.poll();
        }
    }
    
    public int pop() {
       
        return q1.poll();
        
    }
    
    public int top() {
        if(!q1.isEmpty()){
            return q1.peek();
        }
        return -1;
        
    }
    
    public boolean empty() {
        if(q1.isEmpty() && q2.isEmpty()) return true;

        return false;
        
    }
    public static void main(String[] args) {
        StackUsingQueue s=new StackUsingQueue();
        s.push(34);
        s.push(23);
        s.push(2);
        System.out.println(s.top());
        System.out.println(s.pop());
        System.out.println(s.pop());
        
    }
}
