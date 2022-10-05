import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false;
         
         Stack<Character> stack= new Stack();
         for(char c:s.toCharArray()){
             if(c=='(' || c=='{' || c=='['){
                 stack.push(c);
             }else if(c==')' && !stack.isEmpty() && stack.peek()=='('){
                 stack.pop();
             }else if(c==']' && !stack.isEmpty() && stack.peek()=='['){
                 stack.pop();
             }else if(c=='}' && !stack.isEmpty() && stack.peek()=='{'){
                 stack.pop();
             }
         }
         return stack.isEmpty();
         
     }
    public static void main(String[] args) {
        ValidParenthesis v=new ValidParenthesis();
        System.out.println(v.isValid("([}}])"));
        
    }
}
