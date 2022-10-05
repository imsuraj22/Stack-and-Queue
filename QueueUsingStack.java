import java.util.Stack;



public class QueueUsingStack {
    Stack<Integer> input=new Stack();
    Stack<Integer> output=new Stack();

    public QueueUsingStack() {
        
    }
    
    public void push(int x) {
        input.push(x);
        
    }
    
    public int pop() {
       // int temp=0;
        if(!output.isEmpty()){
            
           return output.pop();

            //return temp;
        }else{
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        return output.pop();
     
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(!input.isEmpty()){
                output.push(input.peek());
                input.pop();
            }
        }
        if(!output.isEmpty()){
            return output.peek();
        }
        return -1;
        
    }
    
    public boolean empty() {
        if(output.isEmpty() && input.isEmpty()) return true;

        return false;
    }
    
    public static void main(String[] args) {
        QueueUsingStack q=new QueueUsingStack();
        q.push(1);
        q.push(2);
        q.push(34);
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.pop());
        
    }
}
